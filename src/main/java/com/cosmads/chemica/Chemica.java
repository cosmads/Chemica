package com.cosmads.chemica;

import com.cosmads.chemica.common.registrate.ChemicaRegistrate;
import com.cosmads.chemica.data.ChemicaDataGenerators;
import com.cosmads.chemica.registry.*;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.EventPriority;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import org.jetbrains.annotations.Contract;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;

@Mod(Chemica.MOD_ID)
public class Chemica {
    public static final String MOD_ID = "chemica";
    public static final String MOD_NAME = "Chemica";
    public static final Logger LOGGER = LogUtils.getLogger();

    // Use ChemicaRegistrate instead of CreateRegistrate
    public static final ChemicaRegistrate REGISTRATE = ChemicaRegistrate.create(MOD_ID);

    public static ChemicaRegistrate registrate() {
        return REGISTRATE;
    }

    public Chemica(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("Initializing {}...", MOD_NAME);

        // Register Registrate
        REGISTRATE.registerEventListeners(modEventBus);

        // Register content
        ChemicaCreativeTabs.register();
        ChemicaBlocks.register();
        ChemicaItems.register();
        ChemicaVatOperations.init();
        ChemicaElectrodes.register();
        ChemicaFluids.register();

        // Register datagen event
        modEventBus.addListener(EventPriority.HIGHEST, ChemicaDataGenerators::gatherDataHighPriority);
        modEventBus.addListener(EventPriority.LOWEST, ChemicaDataGenerators::gatherData);
        LOGGER.info("{} initialized successfully!", MOD_NAME);
    }

    // Helper method to create ResourceLocation
    @Contract("_ -> new")
    public static ResourceLocation asResource(String path) {
        return path.contains(":")
                ? ResourceLocation.tryParse(path)
                : ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    // Used for tags and allows an override of the common namespace
    @Contract("_ -> new")
    public static ResourceLocation asCommon(String path) {
        return path.contains(":")
                ? ResourceLocation.tryParse(path)
                : ResourceLocation.fromNamespaceAndPath("c", path);
    }
}
