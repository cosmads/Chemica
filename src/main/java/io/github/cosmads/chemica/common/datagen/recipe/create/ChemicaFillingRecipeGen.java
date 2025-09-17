package io.github.cosmads.chemica.common.datagen.recipe.create;

import com.simibubi.create.AllRecipeTypes;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaProcessingRecipeGen;
import net.minecraft.data.PackOutput;

public class ChemicaFillingRecipeGen extends ChemicaProcessingRecipeGen {


    public ChemicaFillingRecipeGen(PackOutput output) {
        super(output);
    }

    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.FILLING;
    }
}
