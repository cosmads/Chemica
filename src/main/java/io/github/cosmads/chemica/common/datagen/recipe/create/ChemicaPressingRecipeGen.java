package io.github.cosmads.chemica.common.datagen.recipe.create;

import com.simibubi.create.AllRecipeTypes;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaProcessingRecipeGen;
import net.minecraft.data.PackOutput;

public class ChemicaPressingRecipeGen extends ChemicaProcessingRecipeGen {

    public ChemicaPressingRecipeGen(PackOutput output) {
        super(output);
    }

    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.PRESSING;
    }
}
