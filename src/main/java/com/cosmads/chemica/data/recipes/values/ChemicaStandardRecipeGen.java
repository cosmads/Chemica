package com.cosmads.chemica.data.recipes.values;

import com.cosmads.chemica.data.recipes.ChemicaRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ChemicaStandardRecipeGen extends ChemicaRecipeProvider {
    public ChemicaStandardRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
}
