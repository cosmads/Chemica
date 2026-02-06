package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.registry.rutile.ChemicaMaterials;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ChemicaCreativeTabs {

    public static void register() {
        // Create a creative tab
        Chemica.REGISTRATE
            .defaultCreativeTab("main",
             builder -> builder
             .title(Component.literal("Chemica"))
             .icon(() -> new ItemStack(ChemicaItems.SODIUM_DUST.get()))
             .displayItems((params, output) -> {
                 ChemicaMaterials.toTab(output::acceptAll);
                 output.accept(ChemicaItems.createBiodieselCylinder());
                 output.accept(ChemicaItems.createEthanolCylinder());
                 output.accept(ChemicaItems.createHighOctaneCylinder());
                 output.accept(ChemicaItems.createHydrogenTurbineBlade());
             }))
        .register();

        Chemica.LOGGER.info("Registered creative tab for {}", Chemica.MOD_NAME);
    }
}
