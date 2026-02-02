package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import com.drmangotea.tfmg.content.engines.CylinderItem;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.neoforged.neoforge.common.Tags;

public class ChemicaItems {

    // Create a ResourceKey for the tab
    private static final ResourceKey<CreativeModeTab> MAIN_TAB_KEY =
            ResourceKey.create(Registries.CREATIVE_MODE_TAB, Chemica.asResource("main"));

    // Helper method for common item tags
    private static TagKey<Item> createCommonItemTag(String path) {
        return TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", path));
    }

    // Register items - Metals Section
    public static final ItemEntry<Item> ANTIMONY_INGOT = Chemica.REGISTRATE
            .item("antimony_ingot", Item::new)
            .lang("Antimony Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/antimony"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ANTIMONY_NUGGET = Chemica.REGISTRATE
            .item("antimony_nugget", Item::new)
            .lang("Antimony Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/antimony"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_ANTIMONY = Chemica.REGISTRATE
            .item("raw_antimony", Item::new)
            .lang("Raw Antimony")
            .tag(createCommonItemTag("raw_materials/antimony"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CRUSHED_RAW_ANTIMONY = Chemica.REGISTRATE.item("crushed_raw_antimony", Item::new)
            .lang("Crushed Raw Antimony")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ANTIMONY_DUST = Chemica.REGISTRATE
            .item("antimony_dust", Item::new)
            .lang("Antimony Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/antimony"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CHROMIUM_INGOT = Chemica.REGISTRATE
            .item("chromium_ingot", Item::new)
            .lang("Chromium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/chromium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CHROMIUM_NUGGET = Chemica.REGISTRATE
            .item("chromium_nugget", Item::new)
            .lang("Chromium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/chromium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_CHROMITE = Chemica.REGISTRATE
            .item("raw_chromite", Item::new)
            .lang("Raw Chromite")
            .tag(createCommonItemTag("raw_materials/chromium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CRUSHED_RAW_CHROMIUM = Chemica.REGISTRATE.item("crushed_raw_chromium", Item::new)
            .lang("Crushed Raw Chromium")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CHROMIUM_DUST = Chemica.REGISTRATE
            .item("chromium_dust", Item::new)
            .lang("Chromium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/chromium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COBALT_INGOT = Chemica.REGISTRATE
            .item("cobalt_ingot", Item::new)
            .lang("Cobalt Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/cobalt"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COBALT_NUGGET = Chemica.REGISTRATE
            .item("cobalt_nugget", Item::new)
            .lang("Cobalt Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/cobalt"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_COBALT = Chemica.REGISTRATE
            .item("raw_cobalt", Item::new)
            .lang("Raw Cobalt")
            .tag(createCommonItemTag("raw_materials/cobalt"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CRUSHED_RAW_COBALT = Chemica.REGISTRATE.item("crushed_raw_cobalt", Item::new)
            .lang("Crushed Raw Cobalt")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COBALT_DUST = Chemica.REGISTRATE
            .item("cobalt_dust", Item::new)
            .lang("Cobalt Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/cobalt"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COPPER_DUST = Chemica.REGISTRATE
            .item("copper_dust", Item::new)
            .lang("Copper Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/copper"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> GOLD_DUST = Chemica.REGISTRATE
            .item("gold_dust", Item::new)
            .lang("Gold Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/gold"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> GRAPHITE_INGOT = Chemica.REGISTRATE.item("graphite_ingot", Item::new)
            .lang("Graphite Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/graphite"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> GRAPHITE_SHEET = Chemica.REGISTRATE.item("graphite_sheet", Item::new)
            .lang("Graphite Sheet")
            .tag(createCommonItemTag("plates/graphite"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> GRAPHITE_NUGGET = Chemica.REGISTRATE.item("graphite_nugget", Item::new)
            .lang("Graphite Nugget")
            .tag(createCommonItemTag("nuggets/graphite"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CRUSHED_GRAPHITE = Chemica.REGISTRATE
            .item("crushed_graphite", Item::new)
            .lang("Crushed Graphite")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PURIFIED_GRAPHITE_FLAKES = Chemica.REGISTRATE
            .item("purified_graphite_flakes", Item::new)
            .lang("Purified Graphite Flakes")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> IRIDIUM_INGOT = Chemica.REGISTRATE.item("iridium_ingot", Item::new)
            .lang("Iridium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/iridium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> IRIDIUM_SHEET = Chemica.REGISTRATE.item("iridium_sheet", Item::new)
            .lang("Iridium Sheet")
            .tag(createCommonItemTag("plates/iridium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> REINFORCED_IRIDIUM_PLATE = Chemica.REGISTRATE.item("reinforced_iridium_plate", Item::new)
            .lang("Reinforced Iridium Plate")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> IRIDIUM_NUGGET = Chemica.REGISTRATE.item("iridium_nugget", Item::new)
            .lang("Iridium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/iridium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> IRIDIUM_DUST = Chemica.REGISTRATE
            .item("iridium_dust", Item::new)
            .lang("Iridium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/iridium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> IRON_DUST = Chemica.REGISTRATE
            .item("iron_dust", Item::new)
            .lang("Iron Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/iron"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MAGNESIUM_INGOT = Chemica.REGISTRATE.item("magnesium_ingot", Item::new)
            .lang("Magnesium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/magnesium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MAGNESIUM_SHEET = Chemica.REGISTRATE.item("magnesium_sheet", Item::new)
            .lang("Magnesium Sheet")
            .tag(createCommonItemTag("plates/magnesium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MAGNESIUM_NUGGET = Chemica.REGISTRATE.item("magnesium_nugget", Item::new)
            .lang("Magnesium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/magnesium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MAGNESIUM_DUST = Chemica.REGISTRATE
            .item("magnesium_dust", Item::new)
            .lang("Magnesium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/magnesium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MOLYBDENUM_INGOT = Chemica.REGISTRATE
            .item("molybdenum_ingot", Item::new)
            .lang("Molybdenum Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/molybdenum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MOLYBDENUM_NUGGET = Chemica.REGISTRATE
            .item("molybdenum_nugget", Item::new)
            .lang("Molybdenum Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/molybdenum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_MOLYBDENUM = Chemica.REGISTRATE
            .item("raw_molybdenum", Item::new)
            .lang("Raw Molybdenum")
            .tag(createCommonItemTag("raw_materials/molybdenum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> NICKEL_DUST = Chemica.REGISTRATE
            .item("nickel_dust", Item::new)
            .lang("Nickel Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/nickel"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PLATINUM_INGOT = Chemica.REGISTRATE
            .item("platinum_ingot", Item::new)
            .lang("Platinum Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/platinum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PLATINUM_NUGGET = Chemica.REGISTRATE
            .item("platinum_nugget", Item::new)
            .lang("Platinum Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/platinum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_PLATINUM = Chemica.REGISTRATE
            .item("raw_platinum", Item::new)
            .lang("Raw Platinum")
            .tag(createCommonItemTag("raw_materials/platinum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PLATINUM_DUST = Chemica.REGISTRATE
            .item("platinum_dust", Item::new)
            .lang("Platinum Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/platinum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SILICON_DUST = Chemica.REGISTRATE
            .item("silicon_dust", Item::new)
            .lang("Silicon Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/silicon"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SILVER_INGOT = Chemica.REGISTRATE.item("silver_ingot", Item::new)
            .lang("Silver Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/silver"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SILVER_SHEET = Chemica.REGISTRATE.item("silver_sheet", Item::new)
            .lang("Silver Sheet")
            .tag(createCommonItemTag("plates/silver"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SILVER_NUGGET = Chemica.REGISTRATE.item("silver_nugget", Item::new)
            .lang("Silver Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/silver"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_SILVER = Chemica.REGISTRATE.item("raw_silver", Item::new)
            .lang("Raw Silver")
            .tag(createCommonItemTag("raw_materials/silver"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SILVER_DUST = Chemica.REGISTRATE
            .item("silver_dust", Item::new)
            .lang("Silver Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/silver"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SODIUM_INGOT = Chemica.REGISTRATE
            .item("sodium_ingot", Item::new)
            .lang("Sodium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/sodium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SODIUM_DUST = Chemica.REGISTRATE
            .item("sodium_dust", Item::new)
            .lang("Sodium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/sodium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TANTALUM_INGOT = Chemica.REGISTRATE.item("tantalum_ingot", Item::new)
            .lang("Tantalum Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/tantalum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TANTALUM_SHEET = Chemica.REGISTRATE.item("tantalum_sheet", Item::new)
            .lang("Tantalum Sheet")
            .tag(createCommonItemTag("plates/tantalum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TANTALUM_NUGGET = Chemica.REGISTRATE.item("tantalum_nugget", Item::new)
            .lang("Tantalum Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/tantalum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TANTALUM_DUST = Chemica.REGISTRATE
            .item("tantalum_dust", Item::new)
            .lang("Tantalum Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/tantalum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TIN_INGOT = Chemica.REGISTRATE.item("tin_ingot", Item::new)
            .lang("Tin Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/tin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TIN_SHEET = Chemica.REGISTRATE.item("tin_sheet", Item::new)
            .lang("Tin Sheet")
            .tag(createCommonItemTag("plates/tin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TIN_NUGGET = Chemica.REGISTRATE.item("tin_nugget", Item::new)
            .lang("Tin Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/tin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_TIN = Chemica.REGISTRATE.item("raw_tin", Item::new)
            .lang("Raw Tin")
            .tag(createCommonItemTag("raw_materials/tin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TIN_DUST = Chemica.REGISTRATE
            .item("tin_dust", Item::new)
            .lang("Tin Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/tin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TITANIUM_INGOT = Chemica.REGISTRATE.item("titanium_ingot", Item::new)
            .lang("Titanium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/titanium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TITANIUM_SHEET = Chemica.REGISTRATE.item("titanium_sheet", Item::new)
            .lang("Titanium Sheet")
            .tag(createCommonItemTag("plates/titanium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TITANIUM_NUGGET = Chemica.REGISTRATE.item("titanium_nugget", Item::new)
            .lang("Titanium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/titanium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TITANIUM_DUST = Chemica.REGISTRATE
            .item("titanium_dust", Item::new)
            .lang("Titanium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/titanium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TUNGSTEN_INGOT = Chemica.REGISTRATE.item("tungsten_ingot", Item::new)
            .lang("Tungsten Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/tungsten"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TUNGSTEN_NUGGET = Chemica.REGISTRATE.item("tungsten_nugget", Item::new)
            .lang("Tungsten Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/tungsten"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_TUNGSTEN = Chemica.REGISTRATE.item("raw_tungsten", Item::new)
            .lang("Raw Tungsten")
            .tag(createCommonItemTag("raw_materials/tungsten"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TUNGSTEN_DUST = Chemica.REGISTRATE
            .item("tungsten_dust", Item::new)
            .lang("Tungsten Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/tungsten"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TUNGSTEN_CARBIDE_INGOT = Chemica.REGISTRATE.item("tungsten_carbide_ingot", Item::new)
            .lang("Tungsten Carbide Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/tungsten_carbide"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TUNGSTEN_CARBIDE_DUST = Chemica.REGISTRATE
            .item("tungsten_carbide_dust", Item::new)
            .lang("Tungsten Carbide Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/tungsten_carbide"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> VANADIUM_INGOT = Chemica.REGISTRATE
            .item("vanadium_ingot", Item::new)
            .lang("Vanadium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/vanadium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> VANADIUM_NUGGET = Chemica.REGISTRATE
            .item("vanadium_nugget", Item::new)
            .lang("Vanadium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/vanadium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_VANADIUM = Chemica.REGISTRATE
            .item("raw_vanadium", Item::new)
            .lang("Raw Vanadium")
            .tag(createCommonItemTag("raw_materials/vanadium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CRUSHED_RAW_VANADIUM = Chemica.REGISTRATE.item("crushed_raw_vanadium", Item::new)
            .lang("Crushed Raw Vanadium")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> VANADIUM_DUST = Chemica.REGISTRATE
            .item("vanadium_dust", Item::new)
            .lang("Vanadium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/vanadium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ZINC_DUST = Chemica.REGISTRATE
            .item("zinc_dust", Item::new)
            .lang("Zinc Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/zinc"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Alloys
    public static final ItemEntry<Item> ADVANCED_COMPOSITE_TOUGH_ALLOY = Chemica.REGISTRATE.item("advanced_composite_tough_alloy", Item::new)
            .lang("Advanced Composite Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/composite_alloy"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> HEAT_RESISTANT_TOUGH_ALLOY = Chemica.REGISTRATE.item("heat_resistant_tough_alloy", Item::new)
            .lang("Heat Resistant Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/heat_resistant_alloy"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> LIGHTWEIGHT_TOUGH_ALLOY = Chemica.REGISTRATE.item("lightweight_tough_alloy", Item::new)
            .lang("Lightweight Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/lightweight_alloy"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> STEEL_BASED_TOUGH_ALLOY = Chemica.REGISTRATE.item("steel_based_tough_alloy", Item::new)
            .lang("Steel Based Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/steel_alloy"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Chemical Dusts
    public static final ItemEntry<Item> AMMONIUM_PERSULFATE = Chemica.REGISTRATE
            .item("ammonium_persulfate", Item::new)
            .lang("Ammonium Persulfate")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/ammonium_persulfate"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ARSENIC_DUST = Chemica.REGISTRATE
            .item("arsenic_dust", Item::new)
            .lang("Arsenic Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/arsenic"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ASH = Chemica.REGISTRATE
            .item("ash", Item::new)
            .lang("Ash")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/ash"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CAUSTIC_SODA_DUST = Chemica.REGISTRATE
            .item("caustic_soda_dust", Item::new)
            .lang("Caustic Soda Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/caustic_soda"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CHARCOAL_DUST = Chemica.REGISTRATE
            .item("charcoal_dust", Item::new)
            .lang("Charcoal Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/charcoal"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COAL_DUST = Chemica.REGISTRATE
            .item("coal_dust", Item::new)
            .lang("Coal Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/coal"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CONSTANTAN_DUST = Chemica.REGISTRATE
            .item("constantan_dust", Item::new)
            .lang("Constantan Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/constantan"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ELECTRUM_GRIT = Chemica.REGISTRATE
            .item("electrum_grit", Item::new)
            .lang("Electrum Grit")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/electrum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> FLUORITE_DUST = Chemica.REGISTRATE
            .item("fluorite_dust", Item::new)
            .lang("Fluorite Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/fluorite"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PHOSPHORUS_DUST = Chemica.REGISTRATE
            .item("phosphorus_dust", Item::new)
            .lang("Phosphorus Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/phosphorus"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> QUARTZ_DUST = Chemica.REGISTRATE
            .item("quartz_dust", Item::new)
            .lang("Quartz Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/quartz"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RUTILE_DUST = Chemica.REGISTRATE
            .item("rutile_dust", Item::new)
            .lang("Rutile Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/rutile"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SALT = Chemica.REGISTRATE
            .item("salt", Item::new)
            .lang("Salt")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/salt"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SODA_ASH = Chemica.REGISTRATE
            .item("soda_ash", Item::new)
            .lang("Soda Ash")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/soda_ash"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SODIUM_BISULFATE_DUST = Chemica.REGISTRATE
            .item("sodium_bisulfate_dust", Item::new)
            .lang("Sodium Bisulfate Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/sodium_bisulfate"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SODIUM_PERSULFATE = Chemica.REGISTRATE
            .item("sodium_persulfate", Item::new)
            .lang("Sodium Persulfate")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/sodium_persulfate"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Catalysts
    public static final ItemEntry<Item> COBALT_CATALYST = Chemica.REGISTRATE
            .item("cobalt_catalyst", Item::new)
            .lang("Cobalt Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p .stacksTo(16))
            .register();

    public static final ItemEntry<Item> COPPER_CATALYST = Chemica.REGISTRATE
            .item("copper_catalyst", Item::new)
            .lang("Copper Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p .stacksTo(16))
            .register();

    public static final ItemEntry<Item> IRON_CATALYST = Chemica.REGISTRATE
            .item("iron_catalyst", Item::new)
            .lang("Iron Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p .stacksTo(16))
            .register();

    public static final ItemEntry<Item> NICKEL_CATALYST = Chemica.REGISTRATE
            .item("nickel_catalyst", Item::new)
            .lang("Nickel Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p .stacksTo(16))
            .register();

    public static final ItemEntry<Item> PLATINUM_CATALYST = Chemica.REGISTRATE
            .item("platinum_catalyst", Item::new)
            .lang("Platinum Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    public static final ItemEntry<Item> VANADIUM_CATALYST = Chemica.REGISTRATE
            .item("vanadium_catalyst", Item::new)
            .lang("Vanadium Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p .stacksTo(16))
            .register();

    // Rutile Crystals
    public static final ItemEntry<Item> HIGH_GRADE_RUTILE_CRYSTAL = Chemica.REGISTRATE.item("high_grade_rutile_crystal", Item::new)
            .lang("High Grade Rutile Crystal")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MEDIUM_GRADE_RUTILE_CRYSTAL = Chemica.REGISTRATE.item("medium_grade_rutile_crystal", Item::new)
            .lang("Medium Grade Rutile Crystal")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RUTILE_CRYSTAL = Chemica.REGISTRATE.item("rutile_crystal", Item::new)
            .lang("Rutile Crystal")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Sheets/Plates
    public static final ItemEntry<Item> CARBON_FIBER_COMPOSITE_SHEET = Chemica.REGISTRATE
            .item("carbon_fiber_composite_sheet", Item::new)
            .lang("Carbon Fiber Composite Sheet")
            .tag(createCommonItemTag("plates/carbon_fiber"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CURED_EPOXY_SHEET = Chemica.REGISTRATE
            .item("cured_epoxy_sheet", Item::new)
            .lang("Cured Epoxy Sheet")
            .tag(createCommonItemTag("plates/epoxy_resin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ELECTROCHEMICALLY_EXFOLIATED_GRAPHENE = Chemica.REGISTRATE.item("electrochemically_exfoliated_graphene", Item::new)
            .lang("Electrochemically-Exfoliated Graphene")
            .tag(createCommonItemTag("plates/graphene"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> POLYETHYLENE_SHEET = Chemica.REGISTRATE.item("polyethylene_sheet", Item::new)
            .lang("Polyethylene Sheet")
            .tag(createCommonItemTag("plates/polyethylene"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> POLYTETRAFLUOROETHYLENE_SHEET = Chemica.REGISTRATE
            .item("polytetrafluoroethylene_sheet", Item::new)
            .lang("Polytetrafluoroethylene (PTFE) Sheet")
            .tag(createCommonItemTag("plates/ptfe"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> POLYVINYL_CHLORIDE_SHEET = Chemica.REGISTRATE
            .item("polyvinyl_chloride_sheet", Item::new)
            .lang("Polyvinyl Chloride Sheet")
            .tag(createCommonItemTag("plates/pvc"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RUBBER_STRIP = Chemica.REGISTRATE.item("rubber_strip", Item::new)
            .lang("Rubber Strip")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Nylon/Fibers/Chemicals
    public static final ItemEntry<Item> NYLON_INGOT = Chemica.REGISTRATE
            .item("nylon_ingot", Item::new)
            .lang("Nylon Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/nylon"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> NYLON_SALT = Chemica.REGISTRATE
            .item("nylon_salt", Item::new)
            .lang("Nylon Salt")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> NYLON_SALT_CRYSTALS = Chemica.REGISTRATE
            .item("nylon_salt_crystals", Item::new)
            .lang("Nylon Salt Crystals")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CARBON_FIBER_STRANDS = Chemica.REGISTRATE
            .item("carbon_fiber_strands", Item::new)
            .lang("Carbon Fiber Strands")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PAN_FIBERS = Chemica.REGISTRATE
            .item("pan_fibers", Item::new)
            .lang("PAN Fibers")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> STABILIZED_FIBERS = Chemica.REGISTRATE
            .item("stabilized_fibers", Item::new)
            .lang("Stabilized Fibers")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> YEAST = Chemica.REGISTRATE
            .item("yeast", Item::new)
            .lang("Yeast")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Circuit Boards/Components
    public static final ItemEntry<Item> EMPTY_EPOXY_CIRCUIT_BOARD = Chemica.REGISTRATE.item("empty_epoxy_circuit_board", Item::new)
            .lang("Empty Epoxy Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COATED_EPOXY_CIRCUIT_BOARD = Chemica.REGISTRATE.item("coated_epoxy_circuit_board", Item::new)
            .lang("Coated Epoxy Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ETCHED_EPOXY_CIRCUIT_BOARD = Chemica.REGISTRATE.item("etched_epoxy_circuit_board", Item::new)
            .lang("Etched Epoxy Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ADVANCED_CIRCUIT_BOARD = Chemica.REGISTRATE.item("advanced_circuit_board", Item::new)
            .lang("Advanced Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> EMPTY_PVC_CIRCUIT_BOARD = Chemica.REGISTRATE.item("empty_pvc_circuit_board", Item::new)
            .lang("Empty PVC Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COATED_PVC_CIRCUIT_BOARD = Chemica.REGISTRATE.item("coated_pvc_circuit_board", Item::new)
            .lang("Coated PVC Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ETCHED_PVC_CIRCUIT_BOARD = Chemica.REGISTRATE.item("etched_pvc_circuit_board", Item::new)
            .lang("Etched PVC Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ELECTRONIC_CIRCUIT = Chemica.REGISTRATE.item("electronic_circuit", Item::new)
            .lang("Electronic Circuit")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COIL = Chemica.REGISTRATE.item("coil", Item::new)
            .lang("Coil")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    public static final ItemEntry<Item> CONDUCTIVE_PASTE = Chemica.REGISTRATE.item("conductive_paste", Item::new)
            .lang("Conductive Paste")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> HEAT_CONDUCTOR = Chemica.REGISTRATE.item("heat_conductor", Item::new)
            .lang("Heat Conductor")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    public static final ItemEntry<Item> TANTALUM_CAPACITOR_ITEM = Chemica.REGISTRATE.item("tantalum_capacitor_item", Item::new)
            .lang("Tantalum Capacitor")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Lab Equipment
    public static final ItemEntry<Item> GLASS_VIAL = Chemica.REGISTRATE.item("glass_vial", Item::new)
            .lang("Glass Vial")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    public static final ItemEntry<Item> GRADUATED_CYLINDER = Chemica.REGISTRATE.item("graduated_cylinder", Item::new)
            .lang("Graduated Cylinder")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    public static final ItemEntry<Item> PETRI_DISH = Chemica.REGISTRATE.item("petri_dish", Item::new)
            .lang("Petri Dish")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    // Special Components
    public static final ItemEntry<Item> PLATINUM_ELECTRODE = Chemica.REGISTRATE
            .item("platinum_electrode", Item::new)
            .lang("Platinum Electrode")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), "chemica:block/platinum_electrode_model"))
            .register();

    // Unfinished Items
    public static final ItemEntry<Item> UNFINISHED_ADVANCED_CIRCUIT_BOARD = Chemica.REGISTRATE.item("unfinished_advanced_circuit_board", Item::new)
            .lang("Unfinished Advanced Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_ELECTRONIC_CIRCUIT_BOARD = Chemica.REGISTRATE.item("unfinished_electronic_circuit_board", Item::new)
            .lang("Unfinished Electronic Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_TANTALUM_CAPACITOR = Chemica.REGISTRATE.item("unfinished_tantalum_capacitor", Item::new)
            .lang("Unfinished Tantalum Capacitor")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_REINFORCED_IRIDIUM_PLATE = Chemica.REGISTRATE.item("unfinished_reinforced_iridium_plate", Item::new)
            .lang("Unfinished Reinforced Iridium Plate")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_CONDUCTIVE_PASTE = Chemica.REGISTRATE.item("unfinished_conductive_paste", Item::new)
            .lang("Unfinished Conductive Paste")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    // Engine Cylinders
    public static final ItemEntry<CylinderItem> BIODIESEL_CYLINDER = Chemica.REGISTRATE
            .item("biodiesel_engine_cylinder", CylinderItem::new)
            .lang("Biodiesel Engine Cylinder")
            .properties(p -> p.stacksTo(64))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.mcLoc("item/generated"))
                .texture("layer0", prov.modLoc("item/biodiesel_engine_cylinder")))
            .register();

    public static final ItemEntry<CylinderItem> ETHANOL_CYLINDER = Chemica.REGISTRATE
            .item("ethanol_engine_cylinder", CylinderItem::new)
            .lang("Ethanol Engine Cylinder")
            .properties(p -> p.stacksTo(64))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.mcLoc("item/generated"))
                .texture("layer0", prov.modLoc("item/ethanol_engine_cylinder")))
            .register();

    public static final ItemEntry<CylinderItem> HIGH_OCTANE_CYLINDER = Chemica.REGISTRATE
            .item("high_octane_engine_cylinder", CylinderItem::new)
            .lang("High Octane Engine Cylinder")
            .properties(p -> p.stacksTo(64))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.mcLoc("item/generated"))
                .texture("layer0", prov.modLoc("item/high_octane_engine_cylinder")))
            .register();

    public static final ItemEntry<CylinderItem> HYDROGEN_TURBINE_BLADE = Chemica.REGISTRATE
            .item("hydrogen_turbine_blade", CylinderItem::new)
            .lang("Hydrogen Turbine Blade")
            .properties(p -> p.stacksTo(64))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.mcLoc("item/generated"))
                .texture("layer0", prov.modLoc("item/hydrogen_turbine_blade")))
            .register();


    // Helper method to create cylinders with TFMG data components
    public static ItemStack createCylinderWithData(ItemEntry<CylinderItem> cylinderEntry, String fuelKey, String fluidName) {
        ItemStack stack = new ItemStack(cylinderEntry.get());

        // Create fuel tags compound
        net.minecraft.nbt.CompoundTag fuelTags = new net.minecraft.nbt.CompoundTag();
        fuelTags.putString(fuelKey, "c:" + fuelKey);

        // Create fuels compound for tooltip
        net.minecraft.nbt.CompoundTag fuels = new net.minecraft.nbt.CompoundTag();
        fuels.putString(fuelKey, "fluid.chemica." + fluidName);

        // Set the components directly using the static fields
        stack.set(com.drmangotea.tfmg.registry.TFMGDataComponents.FUEL_TAGS, fuelTags);
        stack.set(com.drmangotea.tfmg.registry.TFMGDataComponents.FUELS, fuels);

        return stack;
    }

    // Specific methods for each cylinder
    public static ItemStack createBiodieselCylinder() {
        return createCylinderWithData(BIODIESEL_CYLINDER, "biodiesel", "biodiesel");
    }

    public static ItemStack createEthanolCylinder() {
        return createCylinderWithData(ETHANOL_CYLINDER, "ethanol", "ethanol");
    }

    public static ItemStack createHighOctaneCylinder() {
        return createCylinderWithData(HIGH_OCTANE_CYLINDER, "high_octane_gasoline", "high_octane_gasoline");
    }

    public static ItemStack createHydrogenTurbineBlade() {
        ItemStack stack = new ItemStack(HYDROGEN_TURBINE_BLADE.get());

        net.minecraft.nbt.CompoundTag fuelTags = new net.minecraft.nbt.CompoundTag();
        fuelTags.putString("hydrogen_fuel", "c:hydrogen_fuel");

        net.minecraft.nbt.CompoundTag fuels = new net.minecraft.nbt.CompoundTag();
        fuels.putString("hydrogen_fuel", "fluid.chemica.hydrogen_fuel");

        // Set the components directly
        stack.set(com.drmangotea.tfmg.registry.TFMGDataComponents.FUEL_TAGS, fuelTags);
        stack.set(com.drmangotea.tfmg.registry.TFMGDataComponents.FUELS, fuels);

        return stack;
    }


    public static void register() {
        Chemica.LOGGER.info("Registering items for {}", Chemica.MOD_NAME);
    }
}