package io.github.cosmads.chemica;

import com.simibubi.create.CreateClient;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ChemicaClient {


    public static void onCtorClient(IEventBus modEventBus, IEventBus forgeEventBus) {
        modEventBus.addListener(ChemicaClient::clientInit);

    }

    public static void clientInit(final FMLClientSetupEvent event) {

    }
}
