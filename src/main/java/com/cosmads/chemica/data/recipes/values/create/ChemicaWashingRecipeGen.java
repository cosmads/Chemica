package com.cosmads.chemica.data.recipes.values.create;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.registry.ChemicaItems;
import com.simibubi.create.api.data.recipe.WashingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ChemicaWashingRecipeGen extends WashingRecipeGen {

    GeneratedRecipe

    PURIFIED_GRAPHITE_FLAKES = create("purified_graphite_flakes", b -> b
            .require(ChemicaItems.CRUSHED_GRAPHITE)
            .output(ChemicaItems.PURIFIED_GRAPHITE_FLAKES, 2)
            .output(0.15f, ChemicaItems.PURIFIED_GRAPHITE_FLAKES)
    );

    public ChemicaWashingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }
}
