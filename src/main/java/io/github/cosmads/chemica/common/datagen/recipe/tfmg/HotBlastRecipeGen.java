package io.github.cosmads.chemica.common.datagen.recipe.tfmg;

import com.drmangotea.tfmg.registry.TFMGRecipeTypes;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaProcessingRecipeGen;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaRecipeProvider;
import net.minecraft.data.PackOutput;

public class HotBlastRecipeGen extends ChemicaProcessingRecipeGen {

    public HotBlastRecipeGen(PackOutput output) {
        super(output);
    }

    protected TFMGRecipeTypes getRecipeType() {
        return TFMGRecipeTypes.HOT_BLAST;
    }
}
