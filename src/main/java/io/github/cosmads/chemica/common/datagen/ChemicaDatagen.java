package io.github.cosmads.chemica.common.datagen;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.simibubi.create.foundation.utility.FilesHelper;
import com.simibubi.create.infrastructure.data.CreateDatagen;
import com.tterrag.registrate.providers.ProviderType;
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
import net.minecraftforge.data.event.GatherDataEvent;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ChemicaDatagen {
    protected static final List<ChemicaRecipeProvider> RECIPE_GENERATORS = new ArrayList<>();

    public static void gatherData(GatherDataEvent event) {
        addExtraRegistrateData();
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        if (event.includeServer()) {
            ChemicaGeneratedEntriesProvider generatedEntriesProvider = new ChemicaGeneratedEntriesProvider(output, lookupProvider);
            generator.addProvider(true, generatedEntriesProvider);
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

    private static void addExtraRegistrateData() {
        ChemicaRegistrateTags.addGenerators();
        Chemica.registrate.addDataGenerator(ProviderType.LANG, (provider) -> {
            Objects.requireNonNull(provider);
            BiConsumer<String, String> langConsumer = provider::add;
            provideDefaultLang("interface", langConsumer);
            provideDefaultLang("tooltips", langConsumer);
            providePonderLang(langConsumer);
        });
    }

    private static void provideDefaultLang(String fileName, BiConsumer<String, String> consumer) {
        String path = "assets/chemica/lang/default/" + fileName + ".json";
        JsonElement jsonElement = FilesHelper.loadJsonResource(path);
        if (jsonElement == null) {
            throw new IllegalStateException(String.format("Could not find default lang file: %s", path));
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue().getAsString();
            consumer.accept(key, value);
        }
    }

    private static void providePonderLang(BiConsumer<String, String> consumer) {

    }
}
