package com.cosmads.chemica.data.recipes;

import com.cosmads.chemica.Chemica;
import com.simibubi.create.api.data.recipe.ProcessingRecipeGen;
import com.simibubi.create.foundation.data.recipe.CommonMetal;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
public class ChemicaRecipeProvider extends RecipeProvider {

    static final List<ProcessingRecipeGen<?, ?, ?>> GENERATORS = new ArrayList<>();

    protected final List<GeneratedRecipe> all = new ArrayList<>();

    public ChemicaRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        all.forEach(c -> c.register(pRecipeOutput));
        Chemica.LOGGER.info("{} registered {} recipe{}", getName(), all.size(), all.size() == 1 ? "" : "s");
    }

    public static void registerAllProcessing(DataGenerator gen, PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {

        gen.addProvider(true, new DataProvider() {

            @Override
            public @NotNull String getName() {
                return "Chemica's Processing Recipes";
            }

            @Override
            public @NotNull CompletableFuture<?> run(CachedOutput dc) {
                List<CompletableFuture<?>> futures = new ArrayList<>();

                for (ProcessingRecipeGen<?, ?, ?> generator : GENERATORS) {
                    String generatorName = generator.getClass().getSimpleName();
                    try {
                        CompletableFuture<?> future = generator.run(dc);
                        future = future.exceptionally(ex -> {
                            Chemica.LOGGER.error("Processing recipe gen '{}' failed to write recipes", generatorName, ex);
                            throw new RuntimeException("Failed in generator: " + generatorName, ex);
                        });
                        futures.add(future);
                    } catch (Throwable t) {
                        Chemica.LOGGER.error("Processing recipe gen '{}' threw synchronously", generatorName, t);
                        throw new RuntimeException("Failed in generator: " + generatorName, t);
                    }
                }

                return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
            }
        });
    }

    protected GeneratedRecipe register(GeneratedRecipe recipe) {
        all.add(recipe);
        return recipe;
    }

    @FunctionalInterface
    public interface GeneratedRecipe {
        void register(RecipeOutput output);
    }

    public static class Marker {
    }

    public static class I {
        public static TagKey<Item> steelIngot() {
            return CommonMetal.STEEL.ingots;
        }
        public static TagKey<Item> steelNugget() {
            return CommonMetal.STEEL.nuggets;
        }
        public static TagKey<Item> steelSheet() {
            return CommonMetal.STEEL.plates;
        }
    }
}
