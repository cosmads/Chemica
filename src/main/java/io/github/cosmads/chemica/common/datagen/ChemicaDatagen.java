package io.github.cosmads.chemica.common.datagen;

import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaProcessingRecipeGen;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaRecipeProvider;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaStandardRecipeGen;
import io.github.cosmads.chemica.common.datagen.recipe.create.ChemicaMechanicalCraftingRecipeGen;
import io.github.cosmads.chemica.common.datagen.recipe.create.ChemicaSequencedAssemblyRecipeGen;
import io.github.cosmads.chemica.common.datagen.recipe.tfmg.CastingRecipeGen;
import io.github.cosmads.chemica.common.datagen.recipe.tfmg.IndustrialBlastingRecipeGen;
import io.github.cosmads.chemica.common.datagen.recipe.tfmg.VatRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ChemicaDatagen {
    protected static final List<ChemicaRecipeProvider> RECIPE_GENERATORS = new ArrayList<>();

    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        if (event.includeServer()) {
            // Worldgen Data Generation
            generator.addProvider(true, new ChemicaGeneratedEntriesProvider(output, lookupProvider));

            // Loot Tables
            generator.addProvider(true, new LootTableProvider(output, Set.of(),
                    List.of(new LootTableProvider.SubProviderEntry(ChemicaBlockLootTables::new,
                            LootContextParamSets.BLOCK))));

            // Recipe Providers
            RECIPE_GENERATORS.add(new IndustrialBlastingRecipeGen(output));
            RECIPE_GENERATORS.add(new CastingRecipeGen(output));
            RECIPE_GENERATORS.add(new VatRecipeGen(output));
            RECIPE_GENERATORS.add(new ChemicaStandardRecipeGen(output));
            RECIPE_GENERATORS.add(new ChemicaMechanicalCraftingRecipeGen(output));
            generator.addProvider(true, new ChemicaSequencedAssemblyRecipeGen(output));

            generator.addProvider(true, new DataProvider() {
                public @NotNull String getName() {
                    return "Chemica's Recipes";
                }

                public @NotNull CompletableFuture<?> run(@NotNull CachedOutput dc) {
                    return CompletableFuture.allOf(ChemicaDatagen.RECIPE_GENERATORS.stream().map((gen) -> gen.run(dc)).toArray(CompletableFuture[]::new));
                }
            });

            ChemicaProcessingRecipeGen.registerAll(generator, output);
        }
    }
}