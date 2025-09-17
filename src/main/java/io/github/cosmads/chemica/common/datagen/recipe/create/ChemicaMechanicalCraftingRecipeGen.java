package io.github.cosmads.chemica.common.datagen.recipe.create;

import com.google.common.base.Supplier;
import com.simibubi.create.api.data.recipe.MechanicalCraftingRecipeBuilder;
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaRecipeProvider;
import net.createmod.catnip.platform.CatnipServices;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.ItemLike;

import java.util.function.UnaryOperator;

public class ChemicaMechanicalCraftingRecipeGen extends ChemicaRecipeProvider {



    public ChemicaMechanicalCraftingRecipeGen(PackOutput output) {
        super(output);
    }

    GeneratedRecipeBuilder create(Supplier<ItemLike> result) {
        return new GeneratedRecipeBuilder(result);
    }

    class GeneratedRecipeBuilder {
        private String suffix = "";
        private Supplier<ItemLike> result;
        private int amount;

        public GeneratedRecipeBuilder(Supplier<ItemLike> result) {
            this.result = result;
            this.amount = 1;
        }

        GeneratedRecipeBuilder returns(int amount) {
            this.amount = amount;
            return this;
        }

        GeneratedRecipeBuilder withSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        ChemicaRecipeProvider.GeneratedRecipe recipe(UnaryOperator<MechanicalCraftingRecipeBuilder> builder) {
            return ChemicaMechanicalCraftingRecipeGen.this.register((consumer) -> {
                MechanicalCraftingRecipeBuilder b = builder.apply(MechanicalCraftingRecipeBuilder.shapedRecipe(this.result.get(), this.amount));
                String var10000 = CatnipServices.REGISTRIES.getKeyOrThrow(this.result.get().asItem()).getPath();
                ResourceLocation location = Chemica.asResource("mechanical_crafting/" + var10000 + this.suffix);
                b.build(consumer, location);
            });
        }
    }
}
