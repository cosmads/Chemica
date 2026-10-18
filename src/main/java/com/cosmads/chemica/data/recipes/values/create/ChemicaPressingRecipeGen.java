package com.cosmads.chemica.data.recipes.values.create;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.ChemMaterial;
import com.cosmads.chemica.registry.ChemicaItems;
import com.simibubi.create.api.data.recipe.PressingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ChemicaPressingRecipeGen extends PressingRecipeGen {

    GeneratedRecipe

            GRAPHITE = create("graphite_ingot", b -> b.require(ChemMaterial.GRAPHITE.ingots).output(ChemicaItems.GRAPHITE_SHEET)),
            IRIDIUM = create("iridium_ingot", b -> b.require(ChemMaterial.IRIDIUM.ingots).output(ChemicaItems.IRIDIUM_SHEET)),
            MAGNESIUM = create("magnesium_ingot", b -> b.require(ChemMaterial.MAGNESIUM.ingots).output(ChemicaItems.MAGNESIUM_SHEET)),
            SILVER = create("silver_ingot", b -> b.require(ChemMaterial.SILVER.ingots).output(ChemicaItems.SILVER_SHEET)),
            TANTALUM = create("tantalum_ingot", b -> b.require(ChemMaterial.TANTALUM.ingots).output(ChemicaItems.TANTALUM_SHEET)),
            TIN = create("tin_ingot", b -> b.require(ChemMaterial.TIN.ingots).output(ChemicaItems.TIN_SHEET)),
            TITANIUM = create("titanium_ingot", b -> b.require(ChemMaterial.TITANIUM.ingots).output(ChemicaItems.TITANIUM_SHEET))

                    ;

    public ChemicaPressingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }

}
