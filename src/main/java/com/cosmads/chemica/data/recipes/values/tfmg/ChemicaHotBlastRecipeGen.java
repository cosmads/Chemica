package com.cosmads.chemica.data.recipes.values.tfmg;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.tags.ChemicaTags;
import com.cosmads.chemica.registry.ChemicaFluids;
import com.drmangotea.tfmg.datagen.recipes.builder.HotBlastRecipeGen;
import com.drmangotea.tfmg.registry.TFMGFluids;
import com.drmangotea.tfmg.registry.TFMGTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ChemicaHotBlastRecipeGen extends HotBlastRecipeGen {

    GeneratedRecipe
    NAPHTHA = create("naphtha", b -> b
            .require(TFMGTags.Fluids.NAPHTHA.tag, 100)
            .require(ChemicaTags.Fluids.PLATINUM_CATALYST_CARRIER.tag, 5)
            .duration(200)
            .output(ChemicaFluids.REFORMATE.get(), 70)
            .output(TFMGFluids.HYDROGEN.get(), 30)),

    NITROGEN = create("nitrogen", b -> b
            .require(ChemicaTags.Fluids.NITROGEN.tag, 100)
            .require(TFMGFluids.HYDROGEN.getSource(), 100)
            .duration(200)
            .output(ChemicaFluids.AMMONIA.get(), 180)
            .output(TFMGFluids.HOT_AIR.get(), 20))
    ;

    public ChemicaHotBlastRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }
}
