package io.github.cosmads.chemica.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

import static net.minecraft.data.worldgen.placement.PlacementUtils.register;

public class ChemicaPlacedFeatures {
    public static final ResourceKey<PlacedFeature>
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

    private static ResourceKey<PlacedFeature> key(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath("chemica", name));
    }

    public static void bootstrap(BootstapContext<PlacedFeature> ctx) {
        System.out.println("=== CHEMICA: Starting placed features bootstrap ===");
        HolderGetter<ConfiguredFeature<?, ?>> featureLookup = ctx.lookup(Registries.CONFIGURED_FEATURE);

        // Get all configured features
        Holder<ConfiguredFeature<?, ?>> tinOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_TIN);
        Holder<ConfiguredFeature<?, ?>> phosphorusOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_PHOSPHORUS);
        Holder<ConfiguredFeature<?, ?>> antimonyOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_ANTIMONY);
        Holder<ConfiguredFeature<?, ?>> chromiteOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_CHROMITE);
        Holder<ConfiguredFeature<?, ?>> cobaltOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_COBALT);
        Holder<ConfiguredFeature<?, ?>> fluoriteOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_FLUORITE);
        Holder<ConfiguredFeature<?, ?>> graphiteOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_GRAPHITE);
        Holder<ConfiguredFeature<?, ?>> molybdenumOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_MOLYBDENUM);
        Holder<ConfiguredFeature<?, ?>> platinumOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_PLATINUM);
        Holder<ConfiguredFeature<?, ?>> rutileOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_RUTILE);
        Holder<ConfiguredFeature<?, ?>> silverOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_SILVER);
        Holder<ConfiguredFeature<?, ?>> vanadiumOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_VANADIUM);
        Holder<ConfiguredFeature<?, ?>> wolframiteOre = featureLookup.getOrThrow(ChemicaConfiguredFeatures.ORE_WOLFRAMITE);

        // Register placements
        register(ctx, ORE_TIN, tinOre, placement(CountPlacement.of(12), -33, 80));
        register(ctx, ORE_PHOSPHORUS, phosphorusOre, placement(CountPlacement.of(9), -39, 59));
        register(ctx, ORE_ANTIMONY, antimonyOre, placement(CountPlacement.of(5), -52, -4));
        register(ctx, ORE_CHROMITE, chromiteOre, placement(CountPlacement.of(5), -59, -12));
        register(ctx, ORE_COBALT, cobaltOre, placement(CountPlacement.of(8), -46, -3));
        register(ctx, ORE_FLUORITE, fluoriteOre, placement(CountPlacement.of(7), -53, 30));
        register(ctx, ORE_GRAPHITE, graphiteOre, placement(CountPlacement.of(4), -42, 7));
        register(ctx, ORE_MOLYBDENUM, molybdenumOre, placement(CountPlacement.of(3), -56, -8));
        register(ctx, ORE_PLATINUM, platinumOre, placement(CountPlacement.of(6), -60, 0));
        register(ctx, ORE_RUTILE, rutileOre, placement(CountPlacement.of(3), -44, -15));
        register(ctx, ORE_SILVER, silverOre, placement(CountPlacement.of(7), -51, 10));
        register(ctx, ORE_VANADIUM, vanadiumOre, placement(CountPlacement.of(5), -60, -15));
        register(ctx, ORE_WOLFRAMITE, wolframiteOre, placement(CountPlacement.of(5), -61, -10));

        System.out.println("=== CHEMICA: Finished placed features bootstrap ===");
    }

    private static List<PlacementModifier> placement(PlacementModifier frequency, int minHeight, int maxHeight) {
        return List.of(
                frequency,
                InSquarePlacement.spread(),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(minHeight), VerticalAnchor.absolute(maxHeight)),
                BiomeFilter.biome()
        );
    }
}