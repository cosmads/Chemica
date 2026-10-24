package com.cosmads.chemica.data.recipes.values.create;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.ChemMaterial;
import com.cosmads.chemica.data.tags.ChemicaTags;
import com.cosmads.chemica.registry.ChemicaFluids;
import com.cosmads.chemica.registry.ChemicaItems;
import com.drmangotea.tfmg.TFMG;
import com.drmangotea.tfmg.registry.TFMGFluids;
import com.drmangotea.tfmg.registry.TFMGItems;
import com.drmangotea.tfmg.registry.TFMGTags;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import com.simibubi.create.foundation.data.recipe.CommonMetal;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.FalseCondition;
import net.neoforged.neoforge.fluids.crafting.SizedFluidIngredient;

import java.util.concurrent.CompletableFuture;

public class ChemicaMixingRecipeGen extends MixingRecipeGen {

    GeneratedRecipe

    ACT_ALLOY = create("advanced_composite_tough_alloy", b -> b
            .require(ChemMaterial.VANADIUM.ingots)
            .require(ChemMaterial.CARBON_FIBER.plates)
            .require(CommonMetal.ALUMINUM.ingots)
            .requiresHeat(HeatCondition.SUPERHEATED)
            .output(ChemicaItems.ADVANCED_COMPOSITE_TOUGH_ALLOY)),

    BRINE = create("brine", b -> b
            .require(ChemMaterial.SALT.dusts)
            .require(ChemMaterial.SALT.dusts)
            .require(Tags.Fluids.WATER, 250)
            .output(ChemicaFluids.BRINE.get().getSource(), 250)),

    CFC_SHEET = create("carbon_fiber_composite_sheet", b -> b
            .require(ChemicaItems.CARBON_FIBER_STRANDS)
            .require(ChemicaTags.Fluids.EPOXY_RESIN.tag, 250)
            .duration(300)
            .output(ChemicaItems.CARBON_FIBER_COMPOSITE_SHEET)),

    CAUSTIC_SODA = create("caustic_soda", b -> b
            .require(ChemicaTags.Fluids.CAUSTIC_SODA.tag, 250)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaItems.CAUSTIC_SODA_DUST)),

    COBALT_CATALYST = create("cobalt_catalyst", b -> b
            .require(SizedFluidIngredient.of(TFMGFluids.SULFURIC_ACID.get().getSource(), 500))
            .require(ChemMaterial.COBALT.dusts)
            .require(ChemMaterial.CAUSTIC_SODA.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaItems.COBALT_CATALYST)),

    CONSTANTAN_INGOT = create("constantan_ingot", b -> b
            .require(ChemMaterial.COPPER.dusts)
            .require(ChemMaterial.NICKEL.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(TFMGItems.CONSTANTAN_INGOT)),

    COPPER_CATALYST = create("copper_catalyst", b -> b
            .require(ChemMaterial.COPPER.dusts)
            .require(ChemMaterial.SULFUR.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaItems.COPPER_CATALYST)),

    ELECTRUM_GRIT = create("electrum_grit", b -> b
            .require(ChemMaterial.SILVER.dusts)
            .require(ChemMaterial.GOLD.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaItems.ELECTRUM_GRIT, 2)),

    EPOXY_RESIN = create("epoxy_resin", b -> b
            .require(ChemicaTags.Fluids.EPOXY_PRECURSOR.tag, 750)
            .require(ChemicaTags.Fluids.AMINE_CATALYST.tag, 250)
            .output(ChemicaFluids.EPOXY_RESIN.get().getSource(), 1000)),

    GAS_MIX = create("gasoline_additive_mix", b -> b
            .require(ChemicaTags.Fluids.ETHYL_TERT_BUTYL_ETHER.tag, 250)
            .require(ChemicaTags.Fluids.TOLUENE.tag, 250)
            .output(ChemicaFluids.GASOLINE_ADDITIVE_MIX.get().getSource(), 500)),

    GRAPHITE_FLAKE = create("graphite_flake", b -> b
            .require(ChemicaTags.Fluids.SUCROSE_SOLUTION.tag, 250)
            .require(ChemicaItems.PURIFIED_GRAPHITE_FLAKES)
            .output(ChemicaItems.GRAPHITE_INGOT)
            .output(0.15f, ChemicaItems.GRAPHITE_INGOT)),

    HRT_ALLOY = create("heat_resistant_tough_alloy", b -> b
            .require(ChemMaterial.NETHERITE.ingots)
            .require(ChemMaterial.TUNGSTEN.ingots)
            .require(ChemMaterial.IRIDIUM.ingots)
            .requiresHeat(HeatCondition.SUPERHEATED)
            .output(ChemicaItems.HEAT_RESISTANT_TOUGH_ALLOY)),

    HC_DIESEL = create("high_cetane_diesel", b -> b
            .require(TFMGTags.Fluids.DIESEL.tag, 750)
            .require(TFMGTags.Fluids.KEROSENE.tag, 250)
            .require(TFMGItems.NITRATE_DUST)
            .require(TFMGItems.NITRATE_DUST)
            .output(ChemicaFluids.HIGH_CETANE_DIESEL.get().getSource(), 1000)),

    IRON_CATALYST = create("iron_catalyst", b -> b
            .require(ChemMaterial.IRON.dusts)
            .require(ChemMaterial.SILVER.nuggets)
            .require(ChemMaterial.SODIUM.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaItems.IRON_CATALYST)),

    LT_ALLOY = create("lightweight_tough_alloy", b -> b
            .require(CommonMetal.ALUMINUM.ingots)
            .require(ChemMaterial.TITANIUM.ingots)
            .require(ChemMaterial.MAGNESIUM.ingots)
            .requiresHeat(HeatCondition.SUPERHEATED)
            .output(ChemicaItems.LIGHTWEIGHT_TOUGH_ALLOY)),

    MOLTEN_GLASS = create("molten_glass", b -> b
            .require(Tags.Items.SANDS_COLORLESS)
            .require(ChemMaterial.SODA_ASH.dusts)
            .requiresHeat(HeatCondition.SUPERHEATED)
            .output(ChemicaFluids.MOLTEN_GLASS.get().getSource(), 100)),

    NICKEL_CATALYST = create("nickel_catalyst", b -> b
            .require(ChemMaterial.NICKEL.dusts)
            .require(CommonMetal.ALUMINUM.nuggets)
            .require(ChemMaterial.CAUSTIC_SODA.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaItems.NICKEL_CATALYST)),

    NITRIC_ACID = create("nitric_acid", b -> b
            .require(ChemicaTags.Fluids.NITROGEN_DIOXIDE.tag, 1000)
            .require(Tags.Fluids.WATER, 1000)
            .output(ChemicaFluids.NITRIC_ACID.get().getSource(), 1000)),

    NITROGEN_DIOXIDE = create("nitrogen_dioxide", b -> b
            .require(ChemicaTags.Fluids.AMMONIA.tag, 1000)
            .require(ChemicaTags.Fluids.PLATINUM_CATALYST_CARRIER.tag, 500)
            .output(ChemicaFluids.NITROGEN_DIOXIDE.get().getSource(), 500)),

    PAN_PRECURSOR = create("pan_precursor", b -> b
            .require(ChemicaTags.Fluids.ACRYLONITRILE.tag, 1000)
            .require(ChemMaterial.COBALT.catalysts)
            .output(ChemicaFluids.PAN_PRECURSOR.get().getSource(), 1000)
            .output(ChemicaItems.COBALT_CATALYST)),

    PLATINUM_CATALYST = create("platinum_catalyst", b -> b
            .require(ChemMaterial.PLATINUM.dusts)
            .require(ChemMaterial.IRON.nuggets)
            .require(ChemMaterial.COAL.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaItems.PLATINUM_CATALYST)),

    PLATINUM_CATALYST_CARRIER = create("platinum_catalyst_carrier", b -> b
            .require(ChemicaTags.Fluids.HYDROCHLORIC_ACID.tag, 100)
            .require(ChemMaterial.PLATINUM.catalysts)
            .output(ChemicaFluids.PLATINUM_CATALYST_CARRIER.get().getSource(), 100)),

    PLATINUM_CATALYST_CARRIER_ETHANOL = create("platinum_catalyst_carrier_from_ethanol", b -> b
            .require(ChemicaTags.Fluids.ETHANOL.tag, 100)
            .require(ChemMaterial.PLATINUM.catalysts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaFluids.PLATINUM_CATALYST_CARRIER.get().getSource(), 100)),

    PURIFIED_GRAPHITE_FLAKES = create("purified_graphite_flakes", b -> b
            .require(Tags.Fluids.WATER, 1000)
            .require(ChemicaItems.CRUSHED_GRAPHITE)
            .output(Fluids.WATER.getSource(), 1000)
            .output(ChemicaItems.PURIFIED_GRAPHITE_FLAKES)
            .output(0.2f, ChemicaItems.PURIFIED_GRAPHITE_FLAKES)),

    SALT = create("salt", b -> b
            .require(Tags.Fluids.WATER, 1000)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaItems.SALT, 2)
            .output(0.3f, ChemicaItems.SALT)),

    SOLDER_SOLUTION = create("solder_solution", b -> b
            .require(ChemicaTags.Fluids.EPOXY_RESIN.tag, 500)
            .require(ChemMaterial.SILVER.dusts)
            .require(ChemMaterial.SILVER.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaFluids.SOLDER_SOLUTION.get().getSource(), 500)),

    SBT_ALLOY = create("steel_based_tough_alloy", b -> b
            .require(CommonMetal.STEEL.ingots)
            .require(ChemMaterial.MOLYBDENUM.ingots)
            .require(ChemMaterial.CHROMIUM.ingots)
            .requiresHeat(HeatCondition.SUPERHEATED)
            .output(ChemicaItems.STEEL_BASED_TOUGH_ALLOY)),

    SUCROSE_SOLUTION = create("sucrose_solution", b -> b
            .require(Tags.Fluids.WATER, 500)
            .require(Items.SUGAR)
            .require(Items.SUGAR)
            .require(Items.SUGAR)
            .output(ChemicaFluids.SUCROSE_SOLUTION.get().getSource(), 500)),

    SYNGAS = create("syngas", b -> b
            .require(TFMGFluids.CARBON_DIOXIDE.getSource(), 200)
            .require(TFMGFluids.HYDROGEN.getSource(), 300)
            .require(ChemMaterial.COAL.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaFluids.SYNGAS.get().getSource(), 500)),

    VANADIUM_CATALYST = create("vanadium_catalyst", b -> b
            .require(Tags.Fluids.WATER, 500)
            .require(ChemMaterial.SALT.dusts)
            .require(ChemMaterial.SALT.dusts)
            .require(ChemMaterial.SALT.dusts)
            .require(ChemMaterial.SALT.dusts)
            .require(ChemMaterial.VANADIUM.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaItems.VANADIUM_CATALYST)),

    VANADIUM_CATALYST_BRINE = create("vanadium_catalyst_with_brine", b -> b
            .require(ChemicaTags.Fluids.BRINE.tag, 500)
            .require(ChemMaterial.VANADIUM.dusts)
            .requiresHeat(HeatCondition.HEATED)
            .output(ChemicaItems.VANADIUM_CATALYST)),

    YEAST = create("yeast", b -> b
            .require(Tags.Fluids.WATER, 1000)
            .require(Items.SUGAR)
            .require(Tags.Items.FOODS_DOUGH)
            .output(ChemicaItems.YEAST, 4)
            .output(0.4f, ChemicaItems.YEAST)),

    N_SEMICONDUCTOR = create("n_semiconductor", b -> b
            .require(ChemMaterial.SILICON.ingots)
            .require(ChemMaterial.ANTIMONY.dusts)
            .output(TFMGItems.N_SEMICONDUCTOR)),

    P_SEMICONDUCTOR = create("p_semiconductor", b -> b
            .require(ChemMaterial.SILICON.ingots)
            .require(ChemMaterial.IRIDIUM.dusts)
            .output(TFMGItems.P_SEMICONDUCTOR))

            ;

    //Overriding recipes
    GeneratedRecipe
        TFMG_P_SEMI = overrideOther(TFMG.asResource("p_semiconductor")),
        TFMG_N_SEMI = overrideOther(TFMG.asResource("n_semiconductor"));

    public ChemicaMixingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }

    private GeneratedRecipe overrideOther(ResourceLocation name) {
        return create(name, b -> b.withCondition(FalseCondition.INSTANCE));
    }
}
