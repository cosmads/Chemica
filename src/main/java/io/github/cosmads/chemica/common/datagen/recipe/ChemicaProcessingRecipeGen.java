package io.github.cosmads.chemica.common.datagen.recipe;


import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeSerializer;
import com.simibubi.create.foundation.recipe.IRecipeTypeInfo;
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.datagen.recipe.create.*;
import io.github.cosmads.chemica.common.datagen.recipe.tfmg.*;
import net.createmod.catnip.platform.CatnipServices;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public abstract class ChemicaProcessingRecipeGen extends ChemicaRecipeProvider {
    protected static final List<ChemicaProcessingRecipeGen> GENERATORS = new ArrayList<>();

    public static void registerAll(DataGenerator gen, PackOutput output) {
        // TFMG Recipes
        GENERATORS.add(new CokingRecipeGen(output));
        GENERATORS.add(new DistillationRecipeGen(output));
        GENERATORS.add(new WindingRecipeGen(output));
        GENERATORS.add(new PolarizingRecipeGen(output));
        GENERATORS.add(new HotBlastRecipeGen(output));

        // Create Recipes
        GENERATORS.add(new ChemicaCompactingRecipeGen(output));
        GENERATORS.add(new ChemicaCrushingRecipeGen(output));
        GENERATORS.add(new ChemicaDeployingRecipeGen(output));
        GENERATORS.add(new ChemicaFillingRecipeGen(output));
        GENERATORS.add(new ChemicaItemApplicationRecipeGen(output));
        GENERATORS.add(new ChemicaMixingRecipeGen(output));
        GENERATORS.add(new ChemicaPressingRecipeGen(output));

        gen.addProvider(true, new DataProvider() {
            public @NotNull String getName() {
                return "Chemica's Processing Recipes";
            }

            public @NotNull CompletableFuture<?> run(@NotNull CachedOutput dc) {
                return CompletableFuture.allOf(ChemicaProcessingRecipeGen.GENERATORS.stream().map((gen) -> gen.run(dc)).toArray(CompletableFuture[]::new));
            }
        });
    }

    public ChemicaProcessingRecipeGen(PackOutput generator) {
        super(generator);
    }

    public <T extends ProcessingRecipe<?>> ChemicaRecipeProvider.GeneratedRecipe create(String namespace, Supplier<ItemLike> singleIngredient, UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        ProcessingRecipeSerializer<T> serializer = this.getSerializer();
        ChemicaRecipeProvider.GeneratedRecipe generatedRecipe = (c) -> {
            ItemLike itemLike = singleIngredient.get();
            transform.apply((new ProcessingRecipeBuilder<>(serializer.getFactory(), new ResourceLocation(namespace, CatnipServices.REGISTRIES.getKeyOrThrow(itemLike.asItem()).getPath()))).withItemIngredients(Ingredient.of(itemLike))).build(c);
        };
        this.all.add(generatedRecipe);
        return generatedRecipe;
    }

    public <T extends ProcessingRecipe<?>> ChemicaRecipeProvider.GeneratedRecipe create(Supplier<ItemLike> singleIngredient, UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        return this.create(Chemica.ID, singleIngredient, transform);
    }

    protected <T extends ProcessingRecipe<?>> ChemicaRecipeProvider.GeneratedRecipe createWithDeferredId(Supplier<ResourceLocation> name, UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        ProcessingRecipeSerializer<T> serializer = this.getSerializer();
        ChemicaRecipeProvider.GeneratedRecipe generatedRecipe = (c) -> transform.apply(new ProcessingRecipeBuilder<>(serializer.getFactory(), name.get())).build(c);
        this.all.add(generatedRecipe);
        return generatedRecipe;
    }

    public <T extends ProcessingRecipe<?>> ChemicaRecipeProvider.GeneratedRecipe create(ResourceLocation name, UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        return this.createWithDeferredId(() -> name, transform);
    }

    public <T extends ProcessingRecipe<?>> ChemicaRecipeProvider.GeneratedRecipe create(String name, UnaryOperator<ProcessingRecipeBuilder<T>> transform) {
        return this.create(Chemica.asResource(name), transform);
    }

    protected abstract IRecipeTypeInfo getRecipeType();

    protected <T extends ProcessingRecipe<?>> ProcessingRecipeSerializer<T> getSerializer() {
        return this.getRecipeType().getSerializer();
    }

    protected Supplier<ResourceLocation> idWithSuffix(Supplier<ItemLike> item, String suffix) {
        return () -> {
            ResourceLocation registryName = CatnipServices.REGISTRIES.getKeyOrThrow(item.get().asItem());
            String var10000 = registryName.getPath();
            return Chemica.asResource(var10000 + suffix);
        };
    }
}
