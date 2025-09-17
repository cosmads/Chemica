package io.github.cosmads.chemica.common.datagen.recipe.create;

import com.simibubi.create.content.processing.sequenced.SequencedAssemblyRecipeBuilder;
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaRecipeProvider;
import net.minecraft.data.PackOutput;

import java.util.function.UnaryOperator;

public class ChemicaSequencedAssemblyRecipeGen extends ChemicaRecipeProvider {


    public ChemicaSequencedAssemblyRecipeGen(PackOutput p_i48262_1_) {
        super(p_i48262_1_);
    }

    protected ChemicaRecipeProvider.GeneratedRecipe create(String name, UnaryOperator<SequencedAssemblyRecipeBuilder> transform) {
        ChemicaRecipeProvider.GeneratedRecipe generatedRecipe = (c) -> transform.apply(new SequencedAssemblyRecipeBuilder(Chemica.asResource(name))).build(c);
        this.all.add(generatedRecipe);
        return generatedRecipe;
    }
}
