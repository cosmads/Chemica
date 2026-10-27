package com.cosmads.chemica.data.recipes.values.tfmg;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.ChemMaterial;
import com.cosmads.chemica.data.tags.ChemicaTags;
import com.cosmads.chemica.registry.ChemicaFluids;
import com.cosmads.chemica.registry.ChemicaItems;
import com.cosmads.chemica.registry.ChemicaVatOperations;
import com.drmangotea.tfmg.datagen.recipes.builder.VatRecipeGen;
import com.drmangotea.tfmg.recipes.VatMachineRecipe;
import com.drmangotea.tfmg.registry.TFMGFluids;
import com.drmangotea.tfmg.registry.TFMGItems;
import com.drmangotea.tfmg.registry.TFMGTags;
import com.drmangotea.tfmg.registry.TFMGVatTypes;
import com.simibubi.create.AllTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.Tags;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;

public class ChemicaVatRecipeGen extends VatRecipeGen {

    //Centrifuge
    GeneratedRecipe
    CTRF_ASH = centrifuge("ash", b -> b
            .require(ChemMaterial.ASH.dusts)
            .output(0.2f, ChemicaItems.SODA_ASH)),

    CTRF_NYLON_SALT_CRYSTALS = centrifuge("nylon_salt_crystals", b -> b
            .require(ChemMaterial.NYLON_SALT.crystals)
            .output(ChemicaItems.NYLON_SALT, 2)
            .output(0.35f, ChemicaItems.NYLON_SALT)),

    CTRF_REFORMATE = centrifuge("reformate", b -> b
            .require(ChemicaTags.Fluids.REFORMATE.tag, 500)
            .heatLevel(2)
            .output(ChemicaFluids.AROMATIC_MIX.get().getSource(), 300)
            .output(ChemicaFluids.LIGHT_HYDROCARBONS.get(), 200))
            ;

    //Electrolysis
    GeneratedRecipe
    ELEC_BRINE = electrolysis("brine", b -> b
            .require(ChemicaTags.Fluids.BRINE.tag, 1000)
            .duration(100)
            .heatLevel(2)
            .output(TFMGFluids.HYDROGEN.get(), 180)
            .output(ChemicaFluids.BRINE.get().getSource(), 100)
            .output(ChemicaFluids.CHLORINE.get(), 360)
            .output(ChemicaFluids.CAUSTIC_SODA.get().getSource(), 360)),

    ELEC_CHARCOAL_DUST = electrolysis("charcoal_dust", b -> b
            .require(ChemMaterial.CHARCOAL.dusts)
            .duration(100)
            .heatLevel(2)
            .output(TFMGFluids.CARBON_DIOXIDE.get(), 150)
            .output(ChemicaItems.COAL_DUST)),

    ELEC_EXFOLIATED_GRAPHENE = electrolysis("electromagnetically_exfoliated_graphene", true, true, b -> b
            .require(ChemicaItems.PURIFIED_GRAPHITE_FLAKES)
            .require(Tags.Fluids.WATER, 250)
            .require(ChemicaTags.Fluids.OXYGEN.tag, 250)
            .duration(300)
            .minSize(3)
            .heatLevel(4)
            .output(ChemicaItems.ELECTROCHEMICALLY_EXFOLIATED_GRAPHENE)),

    ELEC_HDF_ACID = electrolysis("hydrofluoric_acid", b -> b
            .require(ChemicaTags.Fluids.HYDROFLUORIC_ACID.tag, 1000)
            .duration(100)
            .heatLevel(2)
            .output(TFMGFluids.HYDROGEN.get(), 500)
            .output(ChemicaFluids.FLUORINE.get(), 500)),

    ELEC_POWDERED_OBSIDIAN = electrolysis("powdered_obsidian", true, true, b -> b
            .require(AllTags.AllItemTags.OBSIDIAN_DUST.tag)
            .duration(400)
            .heatLevel(2)
            .output(ChemicaItems.IRON_DUST)
            .output(ChemicaItems.SILICON_DUST)
            .output(TFMGItems.NITRATE_DUST)
            .output(TFMGItems.SULFUR_DUST)),

    ELEC_SALT = electrolysis("salt", b -> b
            .require(Tags.Fluids.WATER, 1000)
            .require(ChemMaterial.SALT.dusts)
            .require(ChemMaterial.SALT.dusts)
            .require(ChemMaterial.SALT.dusts)
            .require(ChemMaterial.SALT.dusts)
            .duration(100)
            .heatLevel(2)
            .output(ChemicaItems.SODIUM_INGOT)
            .output(0.3f, ChemicaItems.SODIUM_DUST)
            .output(Fluids.WATER, 100)
            .output(ChemicaFluids.CHLORINE.get(), 350)),

    ELEC_SODIUM_BISULFATE = electrolysis("sodium_bisulfate", false, true, b -> b
            .require(ChemMaterial.SODIUM_BISULFATE.dusts)
            .duration(100)
            .heatLevel(2)
            .output(TFMGFluids.HYDROGEN.get(), 500)
            .output(ChemicaItems.SODIUM_PERSULFATE)),

    ELEC_SODIUM_PERSULFATE = electrolysis("sodium_persulfate", false, true, b -> b
            .require(ChemMaterial.SODIUM_PERSULFATE.dusts)
            .duration(100)
            .heatLevel(2)
            .output(ChemicaFluids.OXYGEN.get(), 150)
            .output(ChemicaItems.SODIUM_DUST)
            .output(TFMGItems.SULFUR_DUST))
            ;

    //Mixing
    GeneratedRecipe
    MIX_ACRYLONITRILE = mixing("acrylonitrile", b -> b
            .require(TFMGFluids.ETHYLENE.get(), 1000)
            .require(ChemicaTags.Fluids.AMMONIA.tag, 500)
            .require(ChemMaterial.VANADIUM.catalysts)
            .duration(200)
            .output(ChemicaFluids.ACRYLONITRILE.get(), 500)
            .output(ChemicaItems.VANADIUM_CATALYST)),

    MIX_ADIPIC_ACID_SOLUTION = mixing("adipic_acid_solution", b -> b
            .require(ChemicaTags.Fluids.CYCLOHEXANOL.tag, 1000)
            .require(ChemicaTags.Fluids.NITRIC_ACID.tag, 1000)
            .duration(300)
            .output(ChemicaFluids.ADIPIC_ACID_SOLUTION.get(), 1000)),

    MIX_AMINE_CATALYST = mixing("amine_catalyst", b -> b
            .require(ChemMaterial.COAL.dusts)
            .require(ChemicaTags.Fluids.AMMONIA.tag, 250)
            .duration(350)
            .output(ChemicaFluids.AMINE_CATALYST.get().getSource(), 250)),

    MIX_BIODIESEL = mixing("biodiesel", b -> b
            .require(ChemicaTags.Fluids.SEED_OIL.tag, 1000)
            .require(ChemicaTags.Fluids.ETHANOL.tag, 500)
            .require(ChemMaterial.CAUSTIC_SODA.dusts)
            .duration(300)
            .output(ChemicaFluids.BIODIESEL.get().getSource(), 1000)
            .output(ChemicaFluids.GLYCERIN.get().getSource(), 100)),

    MIX_CFC_SHEET = mixing("carbon_fiber_composite_sheet", b -> b
            .require(ChemicaItems.CARBON_FIBER_STRANDS)
            .require(ChemicaTags.Fluids.EPOXY_RESIN.tag, 250)
            .duration(300)
            .output(ChemicaItems.CARBON_FIBER_COMPOSITE_SHEET)),

    MIX_CHROMIC_ACID = mixing("chromic_acid", b -> b
            .require(ChemicaTags.Fluids.NITRIC_ACID.tag, 500)
            .require(TFMGFluids.SULFURIC_ACID.getSource(), 500)
            .require(ChemMaterial.CHROMIUM.dusts)
            .duration(300)
            .output(ChemicaFluids.CHROMIC_ACID.get().getSource(), 1000)),

    MIX_EPOXY_PRECURSOR = create("mixing/epoxy_precursor", b -> b
            .allowTypes(List.of(TFMGVatTypes.FIREPROOF.get(), TFMGVatTypes.STEEL.get()))
            .mixing()
            .require(ChemicaTags.Fluids.AROMATIC_MIX.tag, 400)
            .require(ChemicaTags.Fluids.CHLORINE.tag, 100)
            .require(ChemMaterial.CHROMIUM.dusts)
            .minSize(3)
            .duration(300)
            .output(ChemicaFluids.EPOXY_PRECURSOR.get().getSource(), 500)),

    MIX_EPOXY_RESIN = create("mixing/epoxy_resin", b -> b
            .allowTypes(List.of(TFMGVatTypes.FIREPROOF.get(), TFMGVatTypes.STEEL.get()))
            .mixing()
            .require(ChemicaTags.Fluids.EPICHLOROHYDRIN.tag, 1000)
            .require(ChemicaTags.Fluids.CAUSTIC_SODA.tag, 250)
            .require(ChemicaTags.Fluids.PHENOL.tag, 250)
            .require(ChemicaTags.Fluids.ACETONE.tag, 250)
            .minSize(3)
            .duration(300)
            .output(ChemicaFluids.EPOXY_RESIN.get().getSource(), 1000)
            .output(ChemicaFluids.BRINE.get().getSource(), 150)),

    MIX_GASOLINE_AM = mixing("gasoline_additive_mix", b -> b
            .require(ChemicaTags.Fluids.ETHYL_TERT_BUTYL_ETHER.tag, 250)
            .require(ChemicaTags.Fluids.TOLUENE.tag, 250)
            .duration(120)
            .output(ChemicaFluids.GASOLINE_ADDITIVE_MIX.get().getSource(), 500)),

    MIX_HMD_SOLUTION = mixing("hexamethylenediamine_solution", b -> b
            .require(TFMGFluids.HYDROGEN.getSource(), 1000)
            .require(TFMGFluids.ETHYLENE.getSource(), 1000)
            .require(ChemicaTags.Fluids.AMMONIA.tag, 500)
            .require(ChemMaterial.NICKEL.catalysts)
            .heatLevel(2)
            .duration(600)
            .output(ChemicaFluids.HEXAMETHYLENEDIAMINE_SOLUTION.get().getSource(), 1000)
            .output(ChemicaItems.NICKEL_CATALYST)),

    MIX_HC_DIESEL = create("mixing/high_cetane_diesel", b -> b
            .allowTypes(List.of(TFMGVatTypes.FIREPROOF.get(), TFMGVatTypes.STEEL.get()))
            .mixing()
            .require(TFMGTags.Fluids.DIESEL.tag, 250)
            .require(TFMGTags.Fluids.KEROSENE.tag, 250)
            .require(TFMGTags.Items.DUSTS_SALTPETER.tag)
            .require(TFMGTags.Items.DUSTS_SALTPETER.tag)
            .minSize(2)
            .duration(200)
            .output(ChemicaFluids.HIGH_CETANE_DIESEL.get().getSource(), 1000)),

    MIX_HO_GASOLINE_CAST = create("mixing/high_octane_gasoline_cast_iron_vat", b -> b
            .allowType(TFMGVatTypes.CAST_IRON.get())
            .mixing()
            .require(TFMGTags.Fluids.GASOLINE.tag, 800)
            .require(ChemicaTags.Fluids.GASOLINE_ADDITIVE_MIX.tag, 200)
            .require(ChemicaTags.Fluids.NITROUS_OXIDE.tag, 50)
            .duration(120)
            .output(ChemicaFluids.HIGH_OCTANE_GASOLINE.get().getSource(), 1000)),

    MIX_HO_GASOLINE_STEEL = create("mixing/high_octane_gasoline_steel_vat", b -> b
            .allowTypes(List.of(TFMGVatTypes.FIREPROOF.get(), TFMGVatTypes.STEEL.get()))
            .mixing()
            .require(TFMGTags.Fluids.GASOLINE.tag, 2000)
            .require(ChemicaTags.Fluids.GASOLINE_ADDITIVE_MIX.tag, 500)
            .require(ChemicaTags.Fluids.NITROUS_OXIDE.tag, 150)
            .minSize(2)
            .duration(120)
            .output(ChemicaFluids.HIGH_OCTANE_GASOLINE.get().getSource(), 2500)),

    MIX_HYDROCHLORIC_ACID = mixing("hydrochloric_acid", b -> b
            .require(TFMGFluids.HYDROGEN.getSource(), 500)
            .require(ChemicaTags.Fluids.CHLORINE.tag, 500)
            .heatLevel(2)
            .output(ChemicaFluids.HYDROCHLORIC_ACID.get().getSource(), 1000)),

    MIX_NITRIC_ACID = mixing("nitric_acid", b -> b
            .require(Tags.Fluids.WATER, 1000)
            .require(ChemicaTags.Fluids.NITROGEN_DIOXIDE.tag, 1000)
            .output(ChemicaFluids.NITRIC_ACID.get().getSource(), 1000)),

    MIX_NITROGEN_DIOXIDE = mixing("nitrogen_dioxide", b -> b
            .require(ChemicaTags.Fluids.AMMONIA.tag, 1000)
            .require(ChemicaTags.Fluids.PLATINUM_CATALYST_CARRIER.tag, 500)
            .duration(300)
            .output(ChemicaFluids.NITROGEN_DIOXIDE.get().getSource(), 750)),

    MIX_NITROGLYCERIN = mixing("nitroglycerin", b -> b
            .require(ChemicaTags.Fluids.NITRIC_ACID.tag, 500)
            .require(ChemicaTags.Fluids.GLYCERIN.tag, 250)
            .require(TFMGFluids.SULFURIC_ACID.getSource(), 250)
            .duration(300)
            .output(ChemicaFluids.NITROGLYCERIN.get().getSource(), 900)
            .output(TFMGFluids.SULFURIC_ACID.get().getSource(), 100)),

    MIX_NYLON_SALT_CRYSTALS = mixing("nylon_salt_crystals", b -> b
            .require(ChemicaTags.Fluids.HEXAMETHYLENEDIAMINE_SOLUTION.tag, 500)
            .require(ChemicaTags.Fluids.ADIPIC_ACID_SOLUTION.tag, 500)
            .duration(300)
            .output(ChemicaItems.NYLON_SALT_CRYSTALS, 4)),

    MIX_PAN_PRECURSOR = mixing("pan_precursor", b -> b
            .require(ChemMaterial.COBALT.catalysts)
            .require(ChemicaTags.Fluids.ACRYLONITRILE.tag, 1000)
            .duration(400)
            .output(ChemicaFluids.PAN_PRECURSOR.get().getSource(), 1000)),

    MIX_PHOSPHORIC_ACID = mixing("phosphoric_acid", b -> b
            .require(Tags.Fluids.WATER, 600)
            .require(ChemicaTags.Fluids.OXYGEN.tag, 1000)
            .require(ChemMaterial.PHOSPHORUS.dusts)
            .duration(300)
            .output(ChemicaFluids.PHOSPHORIC_ACID.get().getSource(), 1000)),

    MIX_TUNGSTEN_HEXAFLUORIDE = create("mixing/tungsten_hexafluoride", b -> b
            .allowTypes(List.of(TFMGVatTypes.FIREPROOF.get(), TFMGVatTypes.STEEL.get()))
            .mixing()
            .require(ChemicaTags.Fluids.FLUORINE.tag, 1000)
            .require(ChemicaTags.Fluids.HYDROFLUORIC_ACID.tag, 500)
            .require(ChemMaterial.TUNGSTEN.dusts)
            .minSize(2)
            .duration(300)
            .output(ChemicaFluids.TUNGSTEN_HEXAFLUORIDE.get().getSource(), 1000)
            .output(TFMGFluids.HOT_AIR.get(), 250)),

    MIX_VINYL_CHLORIDE_MONOMER = mixing("vinyl_chloride_monomer", b -> b
            .require(TFMGFluids.ETHYLENE.get(), 500)
            .require(ChemicaTags.Fluids.CHLORINE.tag, 750)
            .duration(300)
            .output(ChemicaFluids.VINYL_CHLORIDE_MONOMER.get().getSource(), 1000))

            ;


    public GeneratedRecipe centrifuge(String name, UnaryOperator<VatMachineRecipe.Builder<VatMachineRecipe>> builder) {
        return create("centrifuge/" + name, b -> builder.apply(b).allowAllVatTypes().centrifuge());
    }

    public GeneratedRecipe electrolysis(String name, UnaryOperator<VatMachineRecipe.Builder<VatMachineRecipe>> builder) {
        return create("electrolysis/" + name, b -> builder.apply(b).allowAllVatTypes().electrolysis());
    }

    public GeneratedRecipe electrolysis(String name, boolean platinum, boolean noCast, UnaryOperator<VatMachineRecipe.Builder<VatMachineRecipe>> builder) {
        return create("electrolysis/" + name, b -> {
            var toRet = builder.apply(b);
            if (noCast) {
                toRet.allowType(TFMGVatTypes.FIREPROOF.get());
                toRet.allowType(TFMGVatTypes.STEEL.get());
            } else toRet.allowAllVatTypes();
            if (platinum) {
                toRet.operation(ChemicaVatOperations.PLATINUM_ELECTRODE.get());
                toRet.operation(ChemicaVatOperations.PLATINUM_ELECTRODE.get());
            } else toRet.electrolysis();
            return toRet;
        });
    }

    public GeneratedRecipe mixing(String name, UnaryOperator<VatMachineRecipe.Builder<VatMachineRecipe>> builder) {
        return create("mixing/" + name, b -> builder.apply(b).allowAllVatTypes().mixing());
    }

    public ChemicaVatRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }
}
