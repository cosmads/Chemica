package com.cosmads.chemica.remap;

import com.cosmads.chemica.Chemica;
import com.drmangotea.tfmg.TFMG;
import net.minecraft.core.registries.Registries;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.registries.RegisterEvent;

@EventBusSubscriber
public class ChemicaRemapper {

    @SubscribeEvent
    public static void remap(RegisterEvent event) {
        var registry = event.getRegistry();
        if (registry.key() == Registries.FLUID) {
            registry.addAlias(Chemica.asResource("propene"), TFMG.asResource("propylene"));
            registry.addAlias(Chemica.asResource("flowing_propene"), TFMG.asResource("flowing_propylene"));
        }
        if (registry.key() == Registries.ITEM) {
            registry.addAlias(Chemica.asResource("propene_bucket"), TFMG.asResource("propylene_bucket"));
        }
    }
}
