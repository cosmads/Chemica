package com.cosmads.chemica.worldgen;

import com.cosmads.chemica.Chemica;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

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
            ORE_WOLFRAMITE = key("ore_wolframite"),
            CHEMICA_STRIATED_ORES_OVERWORLD = key("chemica_striated_ores_overworld"),
            CHEMICA_STRIATED_ORES_NETHER = key("chemica_striated_ores_nether");

    private static ResourceKey<PlacedFeature> key(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Chemica.asResource(name));
    }

    public static void bootstrap(BootstrapContext<PlacedFeature> ctx) {
        HolderGetter<ConfiguredFeature<?, ?>> featureLookup = ctx.lookup(Registries.CONFIGURED_FEATURE);

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

        Holder<ConfiguredFeature<?, ?>> striatedOresOverworld = featureLookup.getOrThrow(ChemicaConfiguredFeatures.CHEMICA_STRIATED_ORES_OVERWORLD);
        Holder<ConfiguredFeature<?, ?>> striatedOresNether = featureLookup.getOrThrow(ChemicaConfiguredFeatures.CHEMICA_STRIATED_ORES_NETHER);

        PlacementUtils.register(ctx, ORE_TIN, tinOre, placement(CountPlacement.of(12), -33, 80));
        PlacementUtils.register(ctx, ORE_PHOSPHORUS, phosphorusOre, placement(CountPlacement.of(9), -39, 59));
        PlacementUtils.register(ctx, ORE_ANTIMONY, antimonyOre, placement(CountPlacement.of(5), -52, -4));
        PlacementUtils.register(ctx, ORE_CHROMITE, chromiteOre, placement(CountPlacement.of(5), -59, -12));
        PlacementUtils.register(ctx, ORE_COBALT, cobaltOre, placement(CountPlacement.of(8), -46, -3));
        PlacementUtils.register(ctx, ORE_FLUORITE, fluoriteOre, placement(CountPlacement.of(7), -53, 30));
        PlacementUtils.register(ctx, ORE_GRAPHITE, graphiteOre, placement(CountPlacement.of(4), -42, 7));
        PlacementUtils.register(ctx, ORE_MOLYBDENUM, molybdenumOre, placement(CountPlacement.of(3), -56, -8));
        PlacementUtils.register(ctx, ORE_PLATINUM, platinumOre, placement(CountPlacement.of(6), -60, 0));
        PlacementUtils.register(ctx, ORE_RUTILE, rutileOre, placement(CountPlacement.of(3), -44, -15));
        PlacementUtils.register(ctx, ORE_SILVER, silverOre, placement(CountPlacement.of(7), -51, 10));
        PlacementUtils.register(ctx, ORE_VANADIUM, vanadiumOre, placement(CountPlacement.of(5), -60, -15));
        PlacementUtils.register(ctx, ORE_WOLFRAMITE, wolframiteOre, placement(CountPlacement.of(5), -61, -10));

        PlacementUtils.register(ctx, CHEMICA_STRIATED_ORES_OVERWORLD, striatedOresOverworld, placement(RarityFilter.onAverageOnceEvery(18), -30, 70));
        PlacementUtils.register(ctx, CHEMICA_STRIATED_ORES_NETHER, striatedOresNether, placement(RarityFilter.onAverageOnceEvery(18), 40, 90));
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