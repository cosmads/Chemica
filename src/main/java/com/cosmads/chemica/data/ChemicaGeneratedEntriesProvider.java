package com.cosmads.chemica.data;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.registry.ChemicaEngineFuelTypes;
import com.cosmads.chemica.worldgen.ChemicaBiomeModifiers;
import com.cosmads.chemica.worldgen.ChemicaConfiguredFeatures;
import com.cosmads.chemica.worldgen.ChemicaPlacedFeatures;
import com.drmangotea.tfmg.TFMGRegistries;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ChemicaGeneratedEntriesProvider extends DatapackBuiltinEntriesProvider {
    private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(TFMGRegistries.ENGINE_FUEL_TYPE, ChemicaEngineFuelTypes::bootstrap)
            .add(Registries.CONFIGURED_FEATURE, ChemicaConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ChemicaPlacedFeatures::bootstrap)
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ChemicaBiomeModifiers::bootstrap);


    public ChemicaGeneratedEntriesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Chemica.MOD_ID));
    }

    @Override
    public String getName() {
        return "Chemica's Generated Registry Entries";
    }
}
