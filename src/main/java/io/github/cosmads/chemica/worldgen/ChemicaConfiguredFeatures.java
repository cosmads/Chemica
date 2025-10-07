package io.github.cosmads.chemica.worldgen;

import io.github.cosmads.chemica.registry.CBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
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
            ORE_WOLFRAMITE = key("ore_wolframite");

    private static ResourceKey<ConfiguredFeature<?, ?>> key(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath("chemica", name));
    }

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {

        System.out.println("=== CHEMICA: Starting configured features bootstrap ===");

        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        // Tin Ore - stone and deepslate variants
        context.register(ORE_TIN, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(stoneReplaceables, CBlocks.TIN_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_TIN_ORE.get().defaultBlockState())
                ), 9)
        ));

        // Phosphorus Ore - stone and deepslate variants
        context.register(ORE_PHOSPHORUS, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(stoneReplaceables, CBlocks.PHOSPHORUS_ORE.get().defaultBlockState()),
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_PHOSPHORUS_ORE.get().defaultBlockState())
                ), 7)
        ));

        // Deepslate-only ores
        context.register(ORE_ANTIMONY, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_ANTIMONY_ORE.get().defaultBlockState())
                ), 5)
        ));

        context.register(ORE_CHROMITE, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_CHROMITE_ORE.get().defaultBlockState())
                ), 4)
        ));

        context.register(ORE_COBALT, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_COBALT_ORE.get().defaultBlockState())
                ), 5)
        ));

        context.register(ORE_FLUORITE, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_FLUORITE_ORE.get().defaultBlockState())
                ), 6)
        ));

        context.register(ORE_GRAPHITE, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_GRAPHITE_ORE.get().defaultBlockState())
                ), 8)
        ));

        context.register(ORE_MOLYBDENUM, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_MOLYBDENUM_ORE.get().defaultBlockState())
                ), 4)
        ));

        context.register(ORE_PLATINUM, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_PLATINUM_ORE.get().defaultBlockState())
                ), 3)
        ));

        context.register(ORE_RUTILE, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_RUTILE_ORE.get().defaultBlockState())
                ), 5)
        ));

        context.register(ORE_SILVER, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_SILVER_ORE.get().defaultBlockState())
                ), 6)
        ));

        context.register(ORE_VANADIUM, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_VANADIUM_ORE.get().defaultBlockState())
                ), 4)
        ));

        context.register(ORE_WOLFRAMITE, new ConfiguredFeature<>(
                net.minecraft.world.level.levelgen.feature.Feature.ORE,
                new OreConfiguration(List.of(
                        OreConfiguration.target(deepslateReplaceables, CBlocks.DEEPSLATE_WOLFRAMITE_ORE.get().defaultBlockState())
                ), 5)
        ));
        System.out.println("=== CHEMICA: Finished configured features bootstrap ===");
    }
}