package io.github.cosmads.chemica.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ForgeBiomeModifiers;
import net.minecraftforge.registries.ForgeRegistries;

public class ChemicaBiomeModifiers {
    public static final ResourceKey<BiomeModifier> ADD_ORES = key("add_ores");

    private static ResourceKey<BiomeModifier> key(String name) {
        return ResourceKey.create(ForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath("chemica", name));
    }

    public static void bootstrap(BootstapContext<BiomeModifier> context) {
        // Get all overworld biomes
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        // Create a holder set for all overworld biomes
        HolderSet<Biome> overworldBiomes = biomes.getOrThrow(BiomeTags.IS_OVERWORLD);

        // Add all ore features to overworld biomes
        context.register(ADD_ORES, new ForgeBiomeModifiers.AddFeaturesBiomeModifier(
                overworldBiomes,
                HolderSet.direct(
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_TIN),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_PHOSPHORUS),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_ANTIMONY),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_CHROMITE),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_COBALT),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_FLUORITE),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_GRAPHITE),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_MOLYBDENUM),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_PLATINUM),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_RUTILE),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_SILVER),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_VANADIUM),
                        placedFeatures.getOrThrow(ChemicaPlacedFeatures.ORE_WOLFRAMITE)
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }
}