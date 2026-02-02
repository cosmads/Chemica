package com.cosmads.chemica.worldgen;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.registry.ChemicaBlocks;
import com.simibubi.create.infrastructure.worldgen.AllFeatures;
import com.simibubi.create.infrastructure.worldgen.LayerPattern;
import com.simibubi.create.infrastructure.worldgen.LayeredOreConfiguration;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class ChemicaConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>>
            ORE_TIN = key("ore_tin"),
            ORE_PHOSPHORUS = key("ore_phosphorus"),
            ORE_ANTIMONY = key("ore_antimony"),
            ORE_CHROMITE = key("ore_chromite"),
            ORE_COBALT = key("ore_cobalt"),
            ORE_FLUORITE = key("ore_fluorite"),
            ORE_GRAPHITE = key("ore_graphite"),
            ORE_MOLYBDENUM = key("ore_molybdenum"),
            ORE_PLATINUM = key("ore_platinum"),
            ORE_RUTILE = key("ore_rutile"),
            ORE_SILVER = key("ore_silver"),
            ORE_VANADIUM = key("ore_vanadium"),
            ORE_WOLFRAMITE = key("ore_wolframite"),
            CHEMICA_STRIATED_ORES_OVERWORLD = key("chemica_striated_ores_overworld"),
            CHEMICA_STRIATED_ORES_NETHER = key("chemica_striated_ores_nether");

    private static ResourceKey<ConfiguredFeature<?, ?>> key(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Chemica.asResource(name));
    }

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> ctx) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        FeatureUtils.register(ctx, ORE_TIN, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, ChemicaBlocks.TIN_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())
        ), 9));

        FeatureUtils.register(ctx, ORE_PHOSPHORUS, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(stoneReplaceables, ChemicaBlocks.PHOSPHORUS_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_PHOSPHORUS_ORE.get().defaultBlockState())
        ), 7));

        FeatureUtils.register(ctx, ORE_ANTIMONY, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_ANTIMONY_ORE.get().defaultBlockState())
        ), 5));

        FeatureUtils.register(ctx, ORE_CHROMITE, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_CHROMITE_ORE.get().defaultBlockState())
        ), 4));

        FeatureUtils.register(ctx, ORE_COBALT, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState())
        ), 5));

        FeatureUtils.register(ctx, ORE_FLUORITE, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_FLUORITE_ORE.get().defaultBlockState())
        ), 6));

        FeatureUtils.register(ctx, ORE_GRAPHITE, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_GRAPHITE_ORE.get().defaultBlockState())
        ), 8));

        FeatureUtils.register(ctx, ORE_MOLYBDENUM, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_MOLYBDENUM_ORE.get().defaultBlockState())
        ), 4));

        FeatureUtils.register(ctx, ORE_PLATINUM, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState())
        ), 3));

        FeatureUtils.register(ctx, ORE_RUTILE, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_RUTILE_ORE.get().defaultBlockState())
        ), 5));

        FeatureUtils.register(ctx, ORE_SILVER, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())
        ), 6));

        FeatureUtils.register(ctx, ORE_VANADIUM, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_VANADIUM_ORE.get().defaultBlockState())
        ), 4));

        FeatureUtils.register(ctx, ORE_WOLFRAMITE, Feature.ORE, new OreConfiguration(List.of(
                OreConfiguration.target(deepslateReplaceables, ChemicaBlocks.DEEPSLATE_WOLFRAMITE_ORE.get().defaultBlockState())
        ), 5));

        // NEW: Layered ores (striated ores like TFMG)
        List<LayerPattern> overworldLayerPatterns = List.of(
                ChemicaLayeredPatterns.FERVORITE.get()
        );

        FeatureUtils.register(ctx, CHEMICA_STRIATED_ORES_OVERWORLD,
                AllFeatures.LAYERED_ORE.get(),
                new LayeredOreConfiguration(overworldLayerPatterns, 32, 0));

        List<LayerPattern> netherLayerPatterns = List.of(
                ChemicaLayeredPatterns.ZELOSITE.get()
        );

        FeatureUtils.register(ctx, CHEMICA_STRIATED_ORES_NETHER,
                AllFeatures.LAYERED_ORE.get(),
                new LayeredOreConfiguration(netherLayerPatterns, 32, 0));
    }
}