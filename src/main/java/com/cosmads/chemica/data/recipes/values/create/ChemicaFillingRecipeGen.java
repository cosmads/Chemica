package com.cosmads.chemica.data.recipes.values.create;

import com.cosmads.chemica.Chemica;
import com.simibubi.create.api.data.recipe.FillingRecipeGen;
import com.simibubi.create.content.fluids.VirtualFluid;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.fluids.crafting.SizedFluidIngredient;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.concurrent.CompletableFuture;

public class ChemicaFillingRecipeGen extends FillingRecipeGen {

    //Easier than multiple entries for each fluid
    GeneratedRecipe[] VIRTUAL_FILLING = Chemica.REGISTRATE.getAll(Registries.FLUID).stream()
            .filter((fl) -> fl.get() instanceof VirtualFluid)
            .filter((fl) -> !fl.getId().getPath().startsWith("flowing_"))
            .filter((fl) -> Chemica.REGISTRATE.getAll(Registries.ITEM).stream().map(DeferredHolder::get).toList().contains(BuiltInRegistries.ITEM.get(fl.getId().withSuffix("_bucket"))))
            .map(fl -> {
                var bucket = BuiltInRegistries.ITEM.get(fl.getId().withSuffix("_bucket"));
                return create(fl.getId().withSuffix("_bucket"), b -> b
                        .require(SizedFluidIngredient.of(fl.get(), 1000))
                        .require(Items.BUCKET)
                        .output(bucket)
                );
            }).toArray(GeneratedRecipe[]::new);

    public ChemicaFillingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }
}
