package com.cosmads.chemica.data.recipes.values.tfmg;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.tags.ChemicaTags;
import com.drmangotea.tfmg.datagen.recipes.builder.DistillationRecipeGen;
import com.drmangotea.tfmg.registry.TFMGTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.FluidTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.crafting.SizedFluidIngredient;

import java.util.concurrent.CompletableFuture;

import static com.cosmads.chemica.data.recipes.ChemicaRecipeProvider.F.*;
import static com.drmangotea.tfmg.datagen.recipes.TFMGRecipeProvider.F.*;

public class ChemicaDistillationRecipeGen extends DistillationRecipeGen {

    GeneratedRecipe
    AIR = create(Chemica.asResource("air"), b -> b
            .duration(800)
            .require(TFMGTags.Fluids.AIR.tag, 1000)
            .output(helium(), 10)
            .output(nitrogen(), 760)
            .output(argon(), 20)
            .output(oxygen(), 210)
    ), AROMATIC_MIX = create(Chemica.asResource("aromatic_mix"), b -> b
            .duration(600)
            .require(ChemicaTags.Fluids.AROMATIC_MIX.tag, 500)
            .output(xylene(), 150)
            .output(toluene(), 200)
            .output(benzene(), 150)
    ), ETHYLBENZENE = create(Chemica.asResource("ethylenzene"), b -> b
            .duration(800)
            .require(ChemicaTags.Fluids.AROMATIC_MIX.tag, 500)
            .output(xylene(), 100)
            .output(toluene(), 150)
            .output(ethylbenzene(), 100)
            .output(benzene(), 150)
    ), LIGHT_HYDROCARBONS = create(Chemica.asResource("light_hydrocarbons"), b -> b
            .duration(400)
            .require(ChemicaTags.Fluids.LIGHT_HYDROCARBONS.tag, 500)
            .output(butane(), 250)
            .output(propane(), 250)
    ), LIGHT_HYDROCARBONS_ALT = create(Chemica.asResource("light_hydrocarbons_alt"), b -> b
            .duration(1200)
            .require(ChemicaTags.Fluids.LIGHT_HYDROCARBONS.tag, 1000)
            .output(toluene(), 200)
            .output(benzene(), 100)
            .output(butene(), 100)
            .output(propene(), 150)
            .output(ethane(), 200)
            .output(methane(), 250)
    ), REFORMATE = create(Chemica.asResource("reformate"), b -> b
            .duration(400)
            .require(ChemicaTags.Fluids.REFORMATE.tag, 500)
            .output(aromaticMix(), 300)
            .output(lightHydrocarbons(), 200)
    ), WATER = create(Chemica.asResource("water"), b -> b
            .duration(200)
            .require(Tags.Fluids.WATER, 1000)
            .output(distilledWater(), 1000)
    );

    public ChemicaDistillationRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }
}
