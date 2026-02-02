package com.cosmads.chemica.data;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.worldgen.ChemicaBiomeModifiers;
import com.cosmads.chemica.worldgen.ChemicaConfiguredFeatures;
import com.cosmads.chemica.worldgen.ChemicaPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ChemicaDataGenerators {

    @net.neoforged.bus.api.SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        Chemica.LOGGER.info("[Chemica] Starting data generation...");

        var generator = event.getGenerator();
        var packOutput = generator.getPackOutput();
        var lookupProvider = event.getLookupProvider();
        var includeServer = event.includeServer();

        generator.addProvider(includeServer, new RegistryDataGenerator(packOutput, lookupProvider));

        // Loot table provider
        generator.addProvider(includeServer,
                new LootTableProvider(
                        packOutput,
                        Set.of(),
                        List.of(
                                new LootTableProvider.SubProviderEntry(
                                        BlockLootTableProvider::new,
                                        LootContextParamSets.BLOCK
                                )
                        ),
                        lookupProvider
                )
        );

        Chemica.LOGGER.info("[Chemica] Data generator registered successfully");
    }

    private static class RegistryDataGenerator extends DatapackBuiltinEntriesProvider {
        private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
                .add(Registries.CONFIGURED_FEATURE, ChemicaConfiguredFeatures::bootstrap)
                .add(Registries.PLACED_FEATURE, ChemicaPlacedFeatures::bootstrap)
                .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ChemicaBiomeModifiers::bootstrap);

        public RegistryDataGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(output, registries, BUILDER, Set.of(Chemica.MOD_ID));
        }
    }
}