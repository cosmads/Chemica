package com.cosmads.chemica.data.recipes.values.tfmg;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.tags.ChemicaTags;
import com.cosmads.chemica.registry.ChemicaFluids;
import com.cosmads.chemica.registry.ChemicaItems;
import com.drmangotea.tfmg.datagen.recipes.builder.CastingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ChemicaCastingRecipeGen extends CastingRecipeGen {

    GeneratedRecipe
    EPOXY_RESIN = create("epoxy_resin", b ->b
            .require(ChemicaTags.Fluids.EPOXY_RESIN.tag, 90)
            .output(ChemicaItems.CURED_EPOXY_SHEET)
            .duration(100)),

    POLYETHYLENE = create("polyethylene", b ->b
            .require(ChemicaTags.Fluids.POLYETHYLENE.tag, 90)
            .output(ChemicaItems.POLYETHYLENE_SHEET)
            .duration(100)),

    POLYVINYL_CHLORIDE = create("polyvinyl_chloride", b ->b
            .require(ChemicaTags.Fluids.POLYVINYL_CHLORIDE.tag, 90)
            .output(ChemicaItems.POLYVINYL_CHLORIDE_SHEET)
            .duration(100)),

    MOLTEN_NYLON = create("molten_nylon", b ->b
            .require(ChemicaTags.Fluids.MOLTEN_NYLON.tag, 90)
            .output(ChemicaItems.NYLON_INGOT)
            .duration(100)),

    MOLTEN_TITANIUM = create("molten_titanium", b ->b
            .require(ChemicaTags.Fluids.MOLTEN_TITANIUM.tag, 90)
            .output(ChemicaItems.TITANIUM_INGOT)
            .duration(100)),

    MOLTEN_TUNGSTEN_CARBIDE = create("molten_tungsten_carbide", b ->b
            .require(ChemicaTags.Fluids.MOLTEN_TUNGSTEN_CARBIDE.tag, 90)
            .output(ChemicaItems.TUNGSTEN_CARBIDE_INGOT)
            .duration(100))

            ;


    public ChemicaCastingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }

}
