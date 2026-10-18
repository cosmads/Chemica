package com.cosmads.chemica.data.recipes.values.create;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.registry.ChemicaItems;
import com.simibubi.create.api.data.recipe.DeployingRecipeGen;
import com.simibubi.create.foundation.data.recipe.CommonMetal;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ChemicaDeployingRecipeGen extends DeployingRecipeGen {

    GeneratedRecipe
    EPOXY_BOARD = create("coated_epoxy_circuit_board", b -> b
            .require(ChemicaItems.EMPTY_EPOXY_CIRCUIT_BOARD)
            .require(CommonMetal.GOLD.plates)
            .output(ChemicaItems.COATED_EPOXY_CIRCUIT_BOARD)),

    PVC_BOARD = create("coated_pvc_circuit_board", b -> b
            .require(ChemicaItems.EMPTY_PVC_CIRCUIT_BOARD)
            .require(CommonMetal.SILVER.plates)
            .output(ChemicaItems.COATED_PVC_CIRCUIT_BOARD));

    public ChemicaDeployingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }

}
