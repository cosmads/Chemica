package com.cosmads.chemica.registry.rutile.runtime;

import com.cosmads.chemica.Chemica;
import dev.metallurgists.rutile.api.material.Material;
import dev.metallurgists.rutile.api.material.MaterialHelper;
import dev.metallurgists.rutile.api.material.flags.FlagKey;
import dev.metallurgists.rutile.api.runtime.data.recipe.handler.IRutileMaterialRecipeHandler;
import dev.metallurgists.rutile.registry.RutileTagPrefixes;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class ChemicaMaterialRecipes implements IRutileMaterialRecipeHandler {
    @Override
    public void run(@NotNull RecipeOutput recipeOutput, @NotNull Material material) {
        if (!Objects.equals(material.getModId(), Chemica.MOD_ID)) return;
        processNugget(recipeOutput, material);
    }

    private static void processNugget(@NotNull RecipeOutput recipeOutput, @NotNull Material material) {
        if (material.hasFlag(FlagKey.INGOT)) {
            ItemStack nugget = MaterialHelper.get(RutileTagPrefixes.Ingot, material);
            ItemStack ingot = MaterialHelper.get(RutileTagPrefixes.Nugget, material);
            if (nugget.isEmpty() || ingot.isEmpty()) return;
            craftCompact9(recipeOutput, nugget.getItem(), ingot.getItem(), 9, material, "%s_ingot_from_nuggets");
            craftDecompact9(recipeOutput, ingot.getItem(), nugget.getItem(), 9, material, "%s_nuggets_from_ingot");
        }
    }

    private static void craftCompact9(@NotNull RecipeOutput recipeOutput, ItemLike input, ItemLike output, int amountIn, Material material, String recipeId) {
        if (amountIn == 9) {
            ShapedRecipeBuilder builder = new ShapedRecipeBuilder(RecipeCategory.MISC, output, 1);
            for (int i = 0; i < 3; i++) {
                builder.pattern("###");
            }
            builder.define('#', input)
                    .unlockedBy("has_input", InventoryChangeTrigger.TriggerInstance.hasItems(input))
                    .save(recipeOutput, Chemica.asResource("runtime_generated/" + material.getModId() + "/" + recipeId.formatted(material.getName())));
        } else {
            ShapelessRecipeBuilder builder = new ShapelessRecipeBuilder(RecipeCategory.MISC, output, amountIn);
            for (int i = 0; i < amountIn; i++) {
                builder.requires(input);
            }
            builder.unlockedBy("has_input", InventoryChangeTrigger.TriggerInstance.hasItems(input))
                    .save(recipeOutput, Chemica.asResource("runtime_generated/" + material.getModId() + "/" + recipeId.formatted(material.getName())));
        }
    }

    private static void craftDecompact9(@NotNull RecipeOutput recipeOutput, ItemLike input, ItemLike output, int amountOut, Material material, String recipeId) {
        ShapelessRecipeBuilder builder = new ShapelessRecipeBuilder(RecipeCategory.MISC, output, amountOut);
        builder.requires(input)
                .unlockedBy("has_input", InventoryChangeTrigger.TriggerInstance.hasItems(input))
                .save(recipeOutput, Chemica.asResource("runtime_generated/" + material.getModId() + "/" + recipeId.formatted(material.getName())));
    }
}
