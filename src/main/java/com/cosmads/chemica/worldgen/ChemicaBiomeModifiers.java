package com.cosmads.chemica.worldgen;

import com.cosmads.chemica.Chemica;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class ChemicaBiomeModifiers {
    public static final ResourceKey<BiomeModifier>
            ADD_ORES = key("add_ores"),
            ADD_STRIATED_ORES_OVERWORLD = key("add_striated_ores_overworld"),
            ADD_STRIATED_ORES_NETHER = key("add_striated_ores_nether");

    private static ResourceKey<BiomeModifier> key(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, Chemica.asResource(name));
    }

    public static void bootstrap(BootstrapContext<BiomeModifier> ctx) {
        HolderGetter<Biome> biomeLookup = ctx.lookup(Registries.BIOME);
        HolderSet<Biome> isOverworld = biomeLookup.getOrThrow(BiomeTags.IS_OVERWORLD);
        HolderSet<Biome> isNether = biomeLookup.getOrThrow(BiomeTags.IS_NETHER);

        HolderGetter<PlacedFeature> featureLookup = ctx.lookup(Registries.PLACED_FEATURE);

        Holder<PlacedFeature> tinOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_TIN);
        Holder<PlacedFeature> phosphorusOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_PHOSPHORUS);
        Holder<PlacedFeature> antimonyOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_ANTIMONY);
        Holder<PlacedFeature> chromiteOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_CHROMITE);
        Holder<PlacedFeature> cobaltOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_COBALT);
        Holder<PlacedFeature> fluoriteOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_FLUORITE);
        Holder<PlacedFeature> graphiteOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_GRAPHITE);
        Holder<PlacedFeature> molybdenumOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_MOLYBDENUM);
        Holder<PlacedFeature> platinumOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_PLATINUM);
        Holder<PlacedFeature> rutileOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_RUTILE);
        Holder<PlacedFeature> silverOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_SILVER);
        Holder<PlacedFeature> vanadiumOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_VANADIUM);
        Holder<PlacedFeature> wolframiteOre = featureLookup.getOrThrow(ChemicaPlacedFeatures.ORE_WOLFRAMITE);

        Holder<PlacedFeature> striatedOresOverworld = featureLookup.getOrThrow(ChemicaPlacedFeatures.CHEMICA_STRIATED_ORES_OVERWORLD);
        Holder<PlacedFeature> striatedOresNether = featureLookup.getOrThrow(ChemicaPlacedFeatures.CHEMICA_STRIATED_ORES_NETHER);

        ctx.register(ADD_ORES, new BiomeModifiers.AddFeaturesBiomeModifier(
                isOverworld,
                HolderSet.direct(
                        tinOre,
                        phosphorusOre,
                        antimonyOre,
                        chromiteOre,
                        cobaltOre,
                        fluoriteOre,
                        graphiteOre,
                        molybdenumOre,
                        platinumOre,
                        rutileOre,
                        silverOre,
                        vanadiumOre,
                        wolframiteOre
                ),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        ctx.register(ADD_STRIATED_ORES_OVERWORLD, new BiomeModifiers.AddFeaturesBiomeModifier(
                isOverworld,
                HolderSet.direct(striatedOresOverworld),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));

        ctx.register(ADD_STRIATED_ORES_NETHER, new BiomeModifiers.AddFeaturesBiomeModifier(
                isNether,
                HolderSet.direct(striatedOresNether),
                GenerationStep.Decoration.UNDERGROUND_ORES
        ));
    }
}