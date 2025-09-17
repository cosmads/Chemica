package io.github.cosmads.chemica.common.datagen.recipe;

import com.drmangotea.tfmg.TFMG;
import com.drmangotea.tfmg.datagen.recipes.TFMGRecipeProvider;
import com.drmangotea.tfmg.datagen.recipes.values.TFMGStandardRecipeGen;
import com.google.common.base.Supplier;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.tterrag.registrate.util.entry.ItemProviderEntry;
import net.createmod.catnip.platform.CatnipServices;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SimpleCraftingRecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.conditions.ICondition;
import net.minecraftforge.common.crafting.conditions.ModLoadedCondition;
import net.minecraftforge.common.crafting.conditions.NotCondition;

import java.util.*;
import java.util.function.UnaryOperator;

public class ChemicaStandardRecipeGen extends ChemicaRecipeProvider {
    private ChemicaRecipeProvider.Marker MATERIALS = this.enterFolder("kinetics");

    String currentFolder;

    Marker enterFolder(String folder) {
        this.currentFolder = folder;
        return new Marker();
    }

    GeneratedRecipeBuilder create(Supplier<ItemLike> result) {
        return new GeneratedRecipeBuilder(this.currentFolder, result);
    }

    GeneratedRecipeBuilder create(ResourceLocation result) {
        return new GeneratedRecipeBuilder(this.currentFolder, result);
    }

    GeneratedRecipeBuilder create(ItemProviderEntry<? extends ItemLike> result) {
        Objects.requireNonNull(result);
        return this.create(result::get);
    }

    ChemicaStandardRecipeGen.GeneratedRecipe createSpecial(Supplier<? extends SimpleCraftingRecipeSerializer<?>> serializer, String recipeType, String path) {
        ResourceLocation location = TFMG.asResource(recipeType + "/" + this.currentFolder + "/" + path);
        return this.register((consumer) -> {
            SpecialRecipeBuilder b = SpecialRecipeBuilder.special(serializer.get());
            b.save(consumer, location.toString());
        });
    }

    public ChemicaStandardRecipeGen(PackOutput packOutput) {
        super(packOutput);
    }



    class GeneratedRecipeBuilder {
        private String path;
        private String suffix;
        private Supplier<? extends ItemLike> result;
        private ResourceLocation compatDatagenOutput;
        List<ICondition> recipeConditions;
        private Supplier<ItemPredicate> unlockedBy;
        private int amount;

        private GeneratedRecipeBuilder(String path) {
            this.path = path;
            this.recipeConditions = new ArrayList();
            this.suffix = "";
            this.amount = 1;
        }

        public GeneratedRecipeBuilder(String path, Supplier<? extends ItemLike> result) {
            this(path);
            this.result = result;
        }

        public GeneratedRecipeBuilder(String path, ResourceLocation result) {
            this(path);
            this.compatDatagenOutput = result;
        }

        GeneratedRecipeBuilder returns(int amount) {
            this.amount = amount;
            return this;
        }

        GeneratedRecipeBuilder unlockedBy(Supplier<? extends ItemLike> item) {
            this.unlockedBy = () -> ItemPredicate.Builder.item().of(new ItemLike[]{item.get()}).build();
            return this;
        }

        GeneratedRecipeBuilder unlockedByTag(Supplier<TagKey<Item>> tag) {
            this.unlockedBy = () -> ItemPredicate.Builder.item().of(tag.get()).build();
            return this;
        }

        GeneratedRecipeBuilder whenModLoaded(String modid) {
            return this.withCondition(new ModLoadedCondition(modid));
        }

        GeneratedRecipeBuilder whenModMissing(String modid) {
            return this.withCondition(new NotCondition(new ModLoadedCondition(modid)));
        }

        GeneratedRecipeBuilder withCondition(ICondition condition) {
            this.recipeConditions.add(condition);
            return this;
        }

        GeneratedRecipeBuilder withSuffix(String suffix) {
            this.suffix = suffix;
            return this;
        }

        GeneratedRecipe viaShaped(UnaryOperator<ShapedRecipeBuilder> builder) {
            return ChemicaStandardRecipeGen.this.register((consumer) -> {
                ShapedRecipeBuilder b = builder.apply(ShapedRecipeBuilder.shaped(RecipeCategory.MISC, this.result.get(), this.amount));
                if (this.unlockedBy != null) {
                    b.unlockedBy("has_item", inventoryTrigger(this.unlockedBy.get()));
                }

                b.save(consumer, this.createLocation("crafting"));
            });
        }

        GeneratedRecipe viaShapeless(UnaryOperator<ShapelessRecipeBuilder> builder) {
            return ChemicaStandardRecipeGen.this.register((consumer) -> {
                ShapelessRecipeBuilder b = builder.apply(ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, this.result.get(), this.amount));
                if (this.unlockedBy != null) {
                    b.unlockedBy("has_item", inventoryTrigger(this.unlockedBy.get()));
                }

                b.save(consumer, this.createLocation("crafting"));
            });
        }

        GeneratedRecipe viaNetheriteSmithing(Supplier<? extends Item> base, Supplier<Ingredient> upgradeMaterial) {
            return ChemicaStandardRecipeGen.this.register((consumer) -> {
                SmithingTransformRecipeBuilder b = SmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(base.get()), upgradeMaterial.get(), RecipeCategory.COMBAT, this.result.get().asItem());
                b.unlocks("has_item", inventoryTrigger(ItemPredicate.Builder.item().of(new ItemLike[]{base.get()}).build()));
                b.save(consumer, this.createLocation("crafting"));
            });
        }

        private ResourceLocation createSimpleLocation(String recipeType) {
            return TFMG.asResource(recipeType + "/" + this.getRegistryName().getPath() + this.suffix);
        }

        private ResourceLocation createLocation(String recipeType) {
            return TFMG.asResource(recipeType + "/" + this.path + "/" + this.getRegistryName().getPath() + this.suffix);
        }

        private ResourceLocation getRegistryName() {
            return this.compatDatagenOutput == null ? CatnipServices.REGISTRIES.getKeyOrThrow(((ItemLike)this.result.get()).asItem()) : this.compatDatagenOutput;
        }

        GeneratedRecipeBuilder.GeneratedCookingRecipeBuilder viaCooking(Supplier<? extends ItemLike> item) {
            return this.unlockedBy(item).viaCookingIngredient(() -> Ingredient.of(new ItemLike[]{(ItemLike)item.get()}));
        }

        GeneratedRecipeBuilder.GeneratedCookingRecipeBuilder viaCookingTag(Supplier<TagKey<Item>> tag) {
            return this.unlockedByTag(tag).viaCookingIngredient(() -> Ingredient.of((TagKey)tag.get()));
        }

        GeneratedRecipeBuilder.GeneratedCookingRecipeBuilder viaCookingIngredient(Supplier<Ingredient> ingredient) {
            return new GeneratedRecipeBuilder.GeneratedCookingRecipeBuilder(ingredient);
        }

        class GeneratedCookingRecipeBuilder {
            private Supplier<Ingredient> ingredient;
            private float exp;
            private int cookingTime;
            private final RecipeSerializer<? extends AbstractCookingRecipe> FURNACE;
            private final RecipeSerializer<? extends AbstractCookingRecipe> SMOKER;
            private final RecipeSerializer<? extends AbstractCookingRecipe> BLAST;
            private final RecipeSerializer<? extends AbstractCookingRecipe> CAMPFIRE;

            GeneratedCookingRecipeBuilder(Supplier<Ingredient> ingredient) {
                this.FURNACE = RecipeSerializer.SMELTING_RECIPE;
                this.SMOKER = RecipeSerializer.SMOKING_RECIPE;
                this.BLAST = RecipeSerializer.BLASTING_RECIPE;
                this.CAMPFIRE = RecipeSerializer.CAMPFIRE_COOKING_RECIPE;
                this.ingredient = ingredient;
                this.cookingTime = 200;
                this.exp = 0.0F;
            }

            GeneratedRecipeBuilder.GeneratedCookingRecipeBuilder forDuration(int duration) {
                this.cookingTime = duration;
                return this;
            }

            GeneratedRecipeBuilder.GeneratedCookingRecipeBuilder rewardXP(float xp) {
                this.exp = xp;
                return this;
            }

            GeneratedRecipe inFurnace() {
                return this.inFurnace((b) -> b);
            }

            GeneratedRecipe inFurnace(UnaryOperator<SimpleCookingRecipeBuilder> builder) {
                return this.create(this.FURNACE, builder, 1.0F);
            }

            GeneratedRecipe inSmoker() {
                return this.inSmoker((b) -> b);
            }

            GeneratedRecipe inSmoker(UnaryOperator<SimpleCookingRecipeBuilder> builder) {
                this.create(this.FURNACE, builder, 1.0F);
                this.create(this.CAMPFIRE, builder, 3.0F);
                return this.create(this.SMOKER, builder, 0.5F);
            }

            GeneratedRecipe inBlastFurnace() {
                return this.inBlastFurnace((b) -> b);
            }

            GeneratedRecipe inBlastFurnace(UnaryOperator<SimpleCookingRecipeBuilder> builder) {
                this.create(this.FURNACE, builder, 1.0F);
                return this.create(this.BLAST, builder, 0.5F);
            }

            private GeneratedRecipe create(RecipeSerializer<? extends AbstractCookingRecipe> serializer, UnaryOperator<SimpleCookingRecipeBuilder> builder, float cookingTimeModifier) {
                return ChemicaStandardRecipeGen.this.register((consumer) -> {
                    boolean isOtherMod = GeneratedRecipeBuilder.this.compatDatagenOutput != null;
                    SimpleCookingRecipeBuilder b = builder.apply(SimpleCookingRecipeBuilder.generic(this.ingredient.get(), RecipeCategory.MISC, isOtherMod ? Items.DIRT : GeneratedRecipeBuilder.this.result.get(), this.exp, (int)((float)this.cookingTime * cookingTimeModifier), serializer));
                    if (GeneratedRecipeBuilder.this.unlockedBy != null) {
                        b.unlockedBy("has_item", inventoryTrigger(GeneratedRecipeBuilder.this.unlockedBy.get()));
                    }

                    Objects.requireNonNull(consumer);
                    b.save(consumer, GeneratedRecipeBuilder.this.createSimpleLocation(CatnipServices.REGISTRIES.getKeyOrThrow(serializer).getPath()));
                });
            }
        }
    }

    private static class ModdedCookingRecipeResult implements FinishedRecipe {
        private FinishedRecipe wrapped;
        private ResourceLocation outputOverride;
        private List<ICondition> conditions;

        public ModdedCookingRecipeResult(FinishedRecipe wrapped, ResourceLocation outputOverride, List<ICondition> conditions) {
            this.wrapped = wrapped;
            this.outputOverride = outputOverride;
            this.conditions = conditions;
        }

        public ResourceLocation getId() {
            return this.wrapped.getId();
        }

        public RecipeSerializer<?> getType() {
            return this.wrapped.getType();
        }

        public JsonObject serializeAdvancement() {
            return this.wrapped.serializeAdvancement();
        }

        public ResourceLocation getAdvancementId() {
            return this.wrapped.getAdvancementId();
        }

        public void serializeRecipeData(JsonObject object) {
            this.wrapped.serializeRecipeData(object);
            object.addProperty("result", this.outputOverride.toString());
            JsonArray conds = new JsonArray();
            this.conditions.forEach((c) -> conds.add(CraftingHelper.serialize(c)));
            object.add("conditions", conds);
        }
    }
    
}
