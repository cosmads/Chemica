package com.cosmads.chemica.data.recipes.values.tfmg;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.ChemMaterial;
import com.cosmads.chemica.registry.ChemicaFluids;
import com.drmangotea.tfmg.datagen.recipes.builder.IndustrialBlastingRecipeGen;
import com.drmangotea.tfmg.registry.TFMGFluids;
import com.drmangotea.tfmg.registry.TFMGTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.common.conditions.FalseCondition;

import java.util.concurrent.CompletableFuture;

public class ChemicaIndustrialBlastingRecipeGen extends IndustrialBlastingRecipeGen {

    GeneratedRecipe

    NITRATE_DUST = create("nitrate_dust", b -> b
            .require(TFMGTags.Items.DUSTS_SALTPETER.tag)
            .require(ChemMaterial.COAL.dusts)
            .output(ChemicaFluids.NITROGEN.get(),100)
            .output(TFMGFluids.CARBON_DIOXIDE.get(),80)
            .output(TFMGFluids.FURNACE_GAS.get(),20)
            .duration(20));

    public ChemicaIndustrialBlastingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }

    private GeneratedRecipe overrideOther(ResourceLocation name) {
        return create(name, b -> b.withCondition(FalseCondition.INSTANCE));
    }
}
