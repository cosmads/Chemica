package io.github.cosmads.chemica.common.datagen.recipe.create;

import com.simibubi.create.AllRecipeTypes;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaProcessingRecipeGen;
import net.minecraft.data.PackOutput;

public class ChemicaCrushingRecipeGen extends ChemicaProcessingRecipeGen {

    public ChemicaCrushingRecipeGen(PackOutput generator) {
        super(generator);
    }

    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.CRUSHING;
    }
}
