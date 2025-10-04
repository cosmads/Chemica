package io.github.cosmads.chemica;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import io.github.cosmads.chemica.common.datagen.ChemicaDatagen;
import io.github.cosmads.chemica.common.registrate.ChemicaRegistrate;
import io.github.cosmads.chemica.registry.*;
import net.createmod.catnip.lang.LangBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;
import org.slf4j.Logger;

@Mod(Chemica.ID)
public class Chemica {

    public static final String ID = "chemica";
    public static final String DISPLAY_NAME = "Chemica";

    public static final Logger LOGGER = LogUtils.getLogger();

    private static final StackWalker STACK_WALKER = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);

    public static final ChemicaRegistrate registrate = ChemicaRegistrate.create();

    public Chemica() {
        ModLoadingContext modLoadingContext = ModLoadingContext.get();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
        var bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.register(this);
        registrate.registerEventListeners(bus);

        CBlocks.register();
        CItems.register();
        CFluids.register();

        CElectrodes.register();

        ChemicaCreativeTabs.register(bus);
        bus.addListener(ChemicaCreativeTabs::addCreative);

        bus.addListener(Chemica::init);
        bus.addListener(Chemica::onRegister);
        bus.addListener(EventPriority.LOWEST, ChemicaDatagen::gatherData);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> ChemicaClient.onCtorClient(bus, forgeEventBus));
    }


    public static void init(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            // Initialization work
        });
    }

    public static void onRegister(final RegisterEvent event) {

    }

    public static LangBuilder lang() {
        return new LangBuilder(ID);
    }

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(ID, path);
    }

    public static CreateRegistrate registrate() {
        if (!STACK_WALKER.getCallerClass().getPackageName().startsWith("io.github.cosmads.chemica"))
            throw new UnsupportedOperationException("Other mods are not permitted to use Chemica's registrate instance.");
        return registrate;
    }
}