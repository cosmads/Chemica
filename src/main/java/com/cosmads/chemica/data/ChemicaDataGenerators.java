package com.cosmads.chemica.data;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.tags.ChemicaRegistrateTags;
import com.cosmads.chemica.worldgen.ChemicaBiomeModifiers;
import com.cosmads.chemica.worldgen.ChemicaConfiguredFeatures;
import com.cosmads.chemica.worldgen.ChemicaPlacedFeatures;
import com.drmangotea.tfmg.TFMG;
import com.drmangotea.tfmg.datagen.TFMGGeneratedEntriesProvider;
import com.drmangotea.tfmg.datagen.tags.TFMGRegistrateTags;
import com.drmangotea.tfmg.ponder.TFMGPonderPlugin;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.simibubi.create.foundation.utility.FilesHelper;
import com.tterrag.registrate.providers.ProviderType;
import net.createmod.ponder.foundation.PonderIndex;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiConsumer;

import static com.drmangotea.tfmg.TFMG.REGISTRATE;

public class ChemicaDataGenerators {

    public static void gatherDataHighPriority(GatherDataEvent event) {
        if (event.getMods().contains(TFMG.MOD_ID))
            addExtraRegistrateData();
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        Chemica.LOGGER.info("[Chemica] Starting data generation...");
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        ChemicaGeneratedEntriesProvider generatedEntriesProvider = new ChemicaGeneratedEntriesProvider(output, lookupProvider);
        lookupProvider = generatedEntriesProvider.getRegistryProvider();
        generator.addProvider(event.includeServer(), generatedEntriesProvider);

        var includeServer = event.includeServer();

        Chemica.LOGGER.info("[Chemica] Data generator registered successfully");
    }

    private static void addExtraRegistrateData() {
        ChemicaRegistrateTags.addGenerators();

        REGISTRATE.addDataGenerator(ProviderType.LANG, provider -> {
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
