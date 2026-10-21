package com.cosmads.chemica.data.recipes.values.create;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.registry.ChemicaBlocks;
import com.cosmads.chemica.registry.ChemicaItems;
import com.drmangotea.tfmg.registry.TFMGItems;
import com.drmangotea.tfmg.registry.TFMGTags;
import com.simibubi.create.api.data.recipe.CuttingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class ChemicaCuttingRecipeGen extends CuttingRecipeGen {


    GeneratedRecipe
    CURED_EPOXY_SHEETS = create(Chemica.asResource("cured_epoxy_sheets"), b -> b
            .require(ChemicaBlocks.CURED_EPOXY_BLOCK)
            .duration(200)
            .output(ChemicaItems.CURED_EPOXY_SHEET, 9)),

    PLATINUM_ELECTRODE = create(Chemica.asResource("platinum_electrode"), b -> b
            .require(ChemicaBlocks.PLATINUM_BLOCK)
            .duration(200)
            .output(ChemicaItems.PLATINUM_ELECTRODE, 9)),

    RUBBER_STRIP = create(Chemica.asResource("rubber_strip"), b -> b
            .require(TFMGTags.Items.INGOTS_RUBBER.tag)
            .duration(200)
            .output(ChemicaItems.RUBBER_STRIP, 2)),

    GLASS_VIAL = create(Chemica.asResource("glass_vial"), b -> b
            .require(Tags.Items.GLASS_BLOCKS_COLORLESS)
            .duration(300)
            .output(ChemicaItems.GLASS_VIAL, 2)),

    GRADUATED_CYLINDER = create(Chemica.asResource("graduated_cylinder"), b -> b
            .require(Tags.Items.GLASS_BLOCKS_COLORLESS)
            .duration(300)
            .output(ChemicaItems.GRADUATED_CYLINDER)),

    PETRI_DISH = create(Chemica.asResource("petri_dish"), b -> b
            .require(Tags.Items.GLASS_BLOCKS_COLORLESS)
            .duration(300)
            .output(ChemicaItems.PETRI_DISH, 4))

            ;


    public ChemicaCuttingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }
}
