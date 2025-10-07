package io.github.cosmads.chemica.common.datagen;

import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.worldgen.ChemicaBiomeModifiers;
import io.github.cosmads.chemica.worldgen.ChemicaConfiguredFeatures;
import io.github.cosmads.chemica.worldgen.ChemicaPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ChemicaGeneratedEntriesProvider extends DatapackBuiltinEntriesProvider {
    private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, (BootstapContext<ConfiguredFeature<?, ?>> context) -> {
                ChemicaConfiguredFeatures.bootstrap(context);
            })
            .add(Registries.PLACED_FEATURE, (BootstapContext<PlacedFeature> context) -> {
                ChemicaPlacedFeatures.bootstrap(context);
            })
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, (BootstapContext<BiomeModifier> context) -> {
                ChemicaBiomeModifiers.bootstrap(context);
            });

    public ChemicaGeneratedEntriesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Chemica.ID));
    }

    public String getName() {
        return "Chemica's Generated Registry Entries";
    }
}