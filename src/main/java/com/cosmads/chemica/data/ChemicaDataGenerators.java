package com.cosmads.chemica.data;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.recipes.ChemicaRecipeProvider;
import com.cosmads.chemica.data.tags.ChemicaRegistrateTags;
import com.drmangotea.tfmg.datagen.integration.TFMGRutileProvider;
import com.drmangotea.tfmg.datagen.recipes.TFMGRecipeProvider;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.simibubi.create.foundation.utility.FilesHelper;
import com.tterrag.registrate.providers.ProviderType;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

public class ChemicaDataGenerators {

    public static void gatherDataHighPriority(GatherDataEvent event) {
        if (event.getMods().contains(Chemica.MOD_ID))
            addExtraRegistrateData();
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        Chemica.LOGGER.info("[Chemica] Starting data generation...");
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        var includeServer = event.includeServer();

        ChemicaGeneratedEntriesProvider generatedEntriesProvider = new ChemicaGeneratedEntriesProvider(output, lookupProvider);
        lookupProvider = generatedEntriesProvider.getRegistryProvider();
        generator.addProvider(includeServer, generatedEntriesProvider);



        generator.addProvider(includeServer, new ChemicaRutileProvider.Item(output, lookupProvider));
        generator.addProvider(includeServer, new ChemicaRutileProvider.Fluid(output, lookupProvider));

        if (event.includeServer()) {
            ChemicaRecipeProvider.registerAllProcessing(generator, output, lookupProvider);
        }

        Chemica.LOGGER.info("[Chemica] Data generator registered successfully");
    }

    private static void addExtraRegistrateData() {
        ChemicaRegistrateTags.addGenerators();

        Chemica.REGISTRATE.addDataGenerator(ProviderType.LANG, provider -> {
            BiConsumer<String, String> langConsumer = provider::add;
            provideDefaultLang("interface", langConsumer);
            provideDefaultLang("tooltips", langConsumer);
            providePonderLang(langConsumer);
        });
    }

    private static void providePonderLang(BiConsumer<String, String> consumer) {
        //PonderIndex.addPlugin(new TFMGPonderPlugin());
        //PonderIndex.getLangAccess().provideLang(TFMG.MOD_ID, consumer);
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
}
