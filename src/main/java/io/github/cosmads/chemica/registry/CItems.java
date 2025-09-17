package io.github.cosmads.chemica.registry;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.registrate.ChemicaRegistrate;
import net.minecraft.world.item.Item;

public class CItems {
    public static final ChemicaRegistrate REGISTRATE = (ChemicaRegistrate) Chemica.registrate().setCreativeTab(ChemicaCreativeTabs.CHEMICA_MAIN);

    // Load this class

    public static final RegistryEntry<Item> ASH = REGISTRATE.item("ash", Item::new)
            .lang("Ash")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CAUSTIC_SODA_DUST = REGISTRATE.item("caustic_soda_dust", Item::new)
            .lang("Caustic Soda Dust")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COAL_DUST = REGISTRATE.item("coal_dust", Item::new)
            .lang("Coal Dust")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CURED_EPOXY_SHEET = REGISTRATE.item("cured_epoxy_sheet", Item::new)
            .lang("Cured Epoxy Sheet")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> PLATINUM_DUST = REGISTRATE.item("platinum_dust", Item::new)
            .lang("Platinum Dust")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> PLATINUM_INGOT = REGISTRATE.item("platinum_ingot", Item::new)
            .lang("Platinum Ingot")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> PLATINUM_NUGGET = REGISTRATE.item("platinum_nugget", Item::new)
            .lang("Platinum Nugget")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RAW_PLATINUM = REGISTRATE.item("raw_platinum", Item::new)
            .lang("Raw Platinum")
            .properties(p -> p.stacksTo(64))
            .register();

    // Loaded

    public static void register() {
        Chemica.LOGGER.info("Registered items for Chemica");
    }
}