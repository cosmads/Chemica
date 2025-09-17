package io.github.cosmads.chemica.common.datagen;

import io.github.cosmads.chemica.Chemica;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ChemicaGeneratedEntriesProvider extends DatapackBuiltinEntriesProvider {
    private static final RegistrySetBuilder BUILDER;

    public ChemicaGeneratedEntriesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Chemica.ID));
    }

    public String getName() {
        return "Chemica's Generated Registry Entries";
    }

    static {
        BUILDER = (new RegistrySetBuilder());
                //.add(Registries.CONFIGURED_FEATURE, TFMGConfiguredFeatures::bootstrap)
                //.add(Registries.PLACED_FEATURE, TFMGPlacedFeatures::bootstrap)
                //.add(ForgeRegistries.Keys.BIOME_MODIFIERS, TFMGBiomeModifiers::bootstrap)
                //.add(Registries.DAMAGE_TYPE, TFMGDamageTypes::bootstrap);
    }
}
