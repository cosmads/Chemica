package com.cosmads.chemica;

import com.cosmads.chemica.common.registrate.ChemicaRegistrate;
import com.cosmads.chemica.data.ChemicaDataGenerators;
import com.cosmads.chemica.registry.*;
import com.cosmads.chemica.registry.rutile.ChemicaMaterials;
import com.cosmads.chemica.registry.rutile.ChemicaTagPrefixes;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.RegisterEvent;
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
        ChemicaElectrodes.register();
        ChemicaFluids.register();

        // Register TFMG integration setup
        modEventBus.addListener(this::commonSetup);
        modEventBus.register(CommonInit.class);
        // Register datagen event
        modEventBus.addListener(ChemicaDataGenerators::gatherData);

        LOGGER.info("{} initialized successfully!", MOD_NAME);
    }

    // Helper method to create ResourceLocation
    public static ResourceLocation asResource(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    // Helper method to create ResourceKey for creative tab
    public static ResourceKey<CreativeModeTab> creativeTabKey(String name) {
        return ResourceKey.create(Registries.CREATIVE_MODE_TAB, asResource(name));
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            // Register TFMG fuel types
            ChemicaFuelTypes.registerFuelTypes();

            LOGGER.info("Chemica TFMG integration initialized");
        });
    }

    public static class CommonInit {
        private static boolean didRunRegistration = false;

        @SubscribeEvent
        public static void onRegister(RegisterEvent event) {
            if (didRunRegistration) {
                return;
            }
            ChemicaMaterials.init();
            ChemicaTagPrefixes.init();
            didRunRegistration = true;
        }
    }
}
