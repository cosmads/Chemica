package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;

public class ChemicaCreativeTabs {

    public static void register() {
        // Create a creative tab
        Chemica.REGISTRATE
                .defaultCreativeTab("main", builder -> builder
                        .title(Component.literal("Chemica"))
                        .icon(() -> new ItemStack(ChemicaItems.SODIUM_DUST.get()))
                ).register();

        Chemica.LOGGER.info("Registered creative tab for {}", Chemica.MOD_NAME);
    }
}
