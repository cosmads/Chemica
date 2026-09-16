package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import com.drmangotea.tfmg.base.data_storage.CylinderFuels;
import com.drmangotea.tfmg.content.engines.fuels.EngineFuelType;
import com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode.Electrode;
import com.drmangotea.tfmg.registry.TFMGDataComponents;
import com.drmangotea.tfmg.registry.TFMGItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.foundation.data.recipe.CommonMetal;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateRecipeProvider;
import com.tterrag.registrate.util.DataIngredient;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.Tags;

import java.util.Arrays;

import static com.cosmads.chemica.Chemica.REGISTRATE;

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

    public static final ItemEntry<Item> COBALT_INGOT = REGISTRATE
            .item("cobalt_ingot", Item::new)
            .lang("Cobalt Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/cobalt"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COBALT_NUGGET = REGISTRATE
            .item("cobalt_nugget", Item::new)
            .lang("Cobalt Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/cobalt"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_COBALT = REGISTRATE
            .item("raw_cobalt", Item::new)
            .lang("Raw Cobalt")
            .tag(createCommonItemTag("raw_materials/cobalt"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CRUSHED_RAW_COBALT = REGISTRATE.item("crushed_raw_cobalt", Item::new)
            .lang("Crushed Raw Cobalt")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COBALT_DUST = REGISTRATE
            .item("cobalt_dust", Item::new)
            .lang("Cobalt Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/cobalt"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COPPER_DUST = REGISTRATE
            .item("copper_dust", Item::new)
            .lang("Copper Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/copper"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> GOLD_DUST = REGISTRATE
            .item("gold_dust", Item::new)
            .lang("Gold Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/gold"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> GRAPHITE_INGOT = REGISTRATE.item("graphite_ingot", Item::new)
            .lang("Graphite Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/graphite"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> GRAPHITE_SHEET = REGISTRATE.item("graphite_sheet", Item::new)
            .lang("Graphite Sheet")
            .tag(createCommonItemTag("plates/graphite"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> GRAPHITE_NUGGET = REGISTRATE.item("graphite_nugget", Item::new)
            .lang("Graphite Nugget")
            .tag(createCommonItemTag("nuggets/graphite"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CRUSHED_GRAPHITE = REGISTRATE
            .item("crushed_graphite", Item::new)
            .lang("Crushed Graphite")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PURIFIED_GRAPHITE_FLAKES = REGISTRATE
            .item("purified_graphite_flakes", Item::new)
            .lang("Purified Graphite Flakes")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> IRIDIUM_INGOT = REGISTRATE.item("iridium_ingot", Item::new)
            .lang("Iridium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/iridium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> IRIDIUM_SHEET = REGISTRATE.item("iridium_sheet", Item::new)
            .lang("Iridium Sheet")
            .tag(createCommonItemTag("plates/iridium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> REINFORCED_IRIDIUM_PLATE = REGISTRATE.item("reinforced_iridium_plate", Item::new)
            .lang("Reinforced Iridium Plate")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> IRIDIUM_NUGGET = REGISTRATE.item("iridium_nugget", Item::new)
            .lang("Iridium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/iridium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> IRIDIUM_DUST = REGISTRATE
            .item("iridium_dust", Item::new)
            .lang("Iridium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/iridium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> IRON_DUST = REGISTRATE
            .item("iron_dust", Item::new)
            .lang("Iron Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/iron"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MAGNESIUM_INGOT = REGISTRATE.item("magnesium_ingot", Item::new)
            .lang("Magnesium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/magnesium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MAGNESIUM_SHEET = REGISTRATE.item("magnesium_sheet", Item::new)
            .lang("Magnesium Sheet")
            .tag(createCommonItemTag("plates/magnesium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MAGNESIUM_NUGGET = REGISTRATE.item("magnesium_nugget", Item::new)
            .lang("Magnesium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/magnesium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MAGNESIUM_DUST = REGISTRATE
            .item("magnesium_dust", Item::new)
            .lang("Magnesium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/magnesium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MOLYBDENUM_INGOT = REGISTRATE
            .item("molybdenum_ingot", Item::new)
            .lang("Molybdenum Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/molybdenum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MOLYBDENUM_NUGGET = REGISTRATE
            .item("molybdenum_nugget", Item::new)
            .lang("Molybdenum Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/molybdenum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_MOLYBDENUM = REGISTRATE
            .item("raw_molybdenum", Item::new)
            .lang("Raw Molybdenum")
            .tag(createCommonItemTag("raw_materials/molybdenum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> NICKEL_DUST = REGISTRATE
            .item("nickel_dust", Item::new)
            .lang("Nickel Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/nickel"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PLATINUM_INGOT = REGISTRATE
            .item("platinum_ingot", Item::new)
            .lang("Platinum Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/platinum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PLATINUM_NUGGET = REGISTRATE
            .item("platinum_nugget", Item::new)
            .lang("Platinum Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/platinum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_PLATINUM = REGISTRATE
            .item("raw_platinum", Item::new)
            .lang("Raw Platinum")
            .tag(createCommonItemTag("raw_materials/platinum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PLATINUM_DUST = REGISTRATE
            .item("platinum_dust", Item::new)
            .lang("Platinum Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/platinum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SILICON_DUST = REGISTRATE
            .item("silicon_dust", Item::new)
            .lang("Silicon Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/silicon"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SILVER_INGOT = REGISTRATE.item("silver_ingot", Item::new)
            .lang("Silver Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/silver"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SILVER_SHEET = REGISTRATE.item("silver_sheet", Item::new)
            .lang("Silver Sheet")
            .tag(createCommonItemTag("plates/silver"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SILVER_NUGGET = REGISTRATE.item("silver_nugget", Item::new)
            .lang("Silver Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/silver"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_SILVER = REGISTRATE.item("raw_silver", Item::new)
            .lang("Raw Silver")
            .tag(createCommonItemTag("raw_materials/silver"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SILVER_DUST = REGISTRATE
            .item("silver_dust", Item::new)
            .lang("Silver Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/silver"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SODIUM_INGOT = REGISTRATE
            .item("sodium_ingot", Item::new)
            .lang("Sodium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/sodium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SODIUM_DUST = REGISTRATE
            .item("sodium_dust", Item::new)
            .lang("Sodium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/sodium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TANTALUM_INGOT = REGISTRATE.item("tantalum_ingot", Item::new)
            .lang("Tantalum Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/tantalum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TANTALUM_SHEET = REGISTRATE.item("tantalum_sheet", Item::new)
            .lang("Tantalum Sheet")
            .tag(createCommonItemTag("plates/tantalum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TANTALUM_NUGGET = REGISTRATE.item("tantalum_nugget", Item::new)
            .lang("Tantalum Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/tantalum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TANTALUM_DUST = REGISTRATE
            .item("tantalum_dust", Item::new)
            .lang("Tantalum Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/tantalum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TIN_INGOT = REGISTRATE.item("tin_ingot", Item::new)
            .lang("Tin Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/tin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TIN_SHEET = REGISTRATE.item("tin_sheet", Item::new)
            .lang("Tin Sheet")
            .tag(createCommonItemTag("plates/tin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TIN_NUGGET = REGISTRATE.item("tin_nugget", Item::new)
            .lang("Tin Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/tin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_TIN = REGISTRATE.item("raw_tin", Item::new)
            .lang("Raw Tin")
            .tag(createCommonItemTag("raw_materials/tin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TIN_DUST = REGISTRATE
            .item("tin_dust", Item::new)
            .lang("Tin Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/tin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TITANIUM_INGOT = REGISTRATE.item("titanium_ingot", Item::new)
            .lang("Titanium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/titanium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TITANIUM_SHEET = REGISTRATE.item("titanium_sheet", Item::new)
            .lang("Titanium Sheet")
            .tag(createCommonItemTag("plates/titanium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TITANIUM_NUGGET = REGISTRATE.item("titanium_nugget", Item::new)
            .lang("Titanium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/titanium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TITANIUM_DUST = REGISTRATE
            .item("titanium_dust", Item::new)
            .lang("Titanium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/titanium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TUNGSTEN_INGOT = REGISTRATE.item("tungsten_ingot", Item::new)
            .lang("Tungsten Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/tungsten"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TUNGSTEN_NUGGET = REGISTRATE.item("tungsten_nugget", Item::new)
            .lang("Tungsten Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/tungsten"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_TUNGSTEN = REGISTRATE.item("raw_tungsten", Item::new)
            .lang("Raw Tungsten")
            .tag(createCommonItemTag("raw_materials/tungsten"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TUNGSTEN_DUST = REGISTRATE
            .item("tungsten_dust", Item::new)
            .lang("Tungsten Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/tungsten"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TUNGSTEN_CARBIDE_INGOT = REGISTRATE.item("tungsten_carbide_ingot", Item::new)
            .lang("Tungsten Carbide Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/tungsten_carbide"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> TUNGSTEN_CARBIDE_DUST = REGISTRATE
            .item("tungsten_carbide_dust", Item::new)
            .lang("Tungsten Carbide Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/tungsten_carbide"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> VANADIUM_INGOT = REGISTRATE
            .item("vanadium_ingot", Item::new)
            .lang("Vanadium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/vanadium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> VANADIUM_NUGGET = REGISTRATE
            .item("vanadium_nugget", Item::new)
            .lang("Vanadium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(createCommonItemTag("nuggets/vanadium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RAW_VANADIUM = REGISTRATE
            .item("raw_vanadium", Item::new)
            .lang("Raw Vanadium")
            .tag(createCommonItemTag("raw_materials/vanadium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CRUSHED_RAW_VANADIUM = REGISTRATE.item("crushed_raw_vanadium", Item::new)
            .lang("Crushed Raw Vanadium")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> VANADIUM_DUST = REGISTRATE
            .item("vanadium_dust", Item::new)
            .lang("Vanadium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/vanadium"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ZINC_DUST = REGISTRATE
            .item("zinc_dust", Item::new)
            .lang("Zinc Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/zinc"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Alloys
    public static final ItemEntry<Item> ADVANCED_COMPOSITE_TOUGH_ALLOY = REGISTRATE.item("advanced_composite_tough_alloy", Item::new)
            .lang("Advanced Composite Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/composite_alloy"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> HEAT_RESISTANT_TOUGH_ALLOY = REGISTRATE.item("heat_resistant_tough_alloy", Item::new)
            .lang("Heat Resistant Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/heat_resistant_alloy"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> LIGHTWEIGHT_TOUGH_ALLOY = REGISTRATE.item("lightweight_tough_alloy", Item::new)
            .lang("Lightweight Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/lightweight_alloy"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> STEEL_BASED_TOUGH_ALLOY = REGISTRATE.item("steel_based_tough_alloy", Item::new)
            .lang("Steel Based Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/steel_alloy"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Chemical Dusts
    public static final ItemEntry<Item> AMMONIUM_PERSULFATE = REGISTRATE
            .item("ammonium_persulfate", Item::new)
            .lang("Ammonium Persulfate")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/ammonium_persulfate"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ARSENIC_DUST = REGISTRATE
            .item("arsenic_dust", Item::new)
            .lang("Arsenic Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/arsenic"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ASH = REGISTRATE
            .item("ash", Item::new)
            .lang("Ash")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/ash"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CAUSTIC_SODA_DUST = REGISTRATE
            .item("caustic_soda_dust", Item::new)
            .lang("Caustic Soda Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/caustic_soda"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CHARCOAL_DUST = REGISTRATE
            .item("charcoal_dust", Item::new)
            .lang("Charcoal Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/charcoal"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COAL_DUST = REGISTRATE
            .item("coal_dust", Item::new)
            .lang("Coal Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/coal"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CONSTANTAN_DUST = REGISTRATE
            .item("constantan_dust", Item::new)
            .lang("Constantan Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/constantan"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ELECTRUM_GRIT = REGISTRATE
            .item("electrum_grit", Item::new)
            .lang("Electrum Grit")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/electrum"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> FLUORITE_DUST = REGISTRATE
            .item("fluorite_dust", Item::new)
            .lang("Fluorite Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/fluorite"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PHOSPHORUS_DUST = REGISTRATE
            .item("phosphorus_dust", Item::new)
            .lang("Phosphorus Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/phosphorus"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> QUARTZ_DUST = REGISTRATE
            .item("quartz_dust", Item::new)
            .lang("Quartz Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/quartz"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RUTILE_DUST = REGISTRATE
            .item("rutile_dust", Item::new)
            .lang("Rutile Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/rutile"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SALT = REGISTRATE
            .item("salt", Item::new)
            .lang("Salt")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/salt"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SODA_ASH = REGISTRATE
            .item("soda_ash", Item::new)
            .lang("Soda Ash")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/soda_ash"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SODIUM_BISULFATE_DUST = REGISTRATE
            .item("sodium_bisulfate_dust", Item::new)
            .lang("Sodium Bisulfate Dust")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/sodium_bisulfate"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> SODIUM_PERSULFATE = REGISTRATE
            .item("sodium_persulfate", Item::new)
            .lang("Sodium Persulfate")
            .tag(Tags.Items.DUSTS)
            .tag(createCommonItemTag("dusts/sodium_persulfate"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Catalysts
    public static final ItemEntry<Item> COBALT_CATALYST = REGISTRATE
            .item("cobalt_catalyst", Item::new)
            .lang("Cobalt Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p .stacksTo(16))
            .register();

    public static final ItemEntry<Item> COPPER_CATALYST = REGISTRATE
            .item("copper_catalyst", Item::new)
            .lang("Copper Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p .stacksTo(16))
            .register();

    public static final ItemEntry<Item> IRON_CATALYST = REGISTRATE
            .item("iron_catalyst", Item::new)
            .lang("Iron Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p .stacksTo(16))
            .register();

    public static final ItemEntry<Item> NICKEL_CATALYST = REGISTRATE
            .item("nickel_catalyst", Item::new)
            .lang("Nickel Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p .stacksTo(16))
            .register();

    public static final ItemEntry<Item> PLATINUM_CATALYST = REGISTRATE
            .item("platinum_catalyst", Item::new)
            .lang("Platinum Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    public static final ItemEntry<Item> VANADIUM_CATALYST = REGISTRATE
            .item("vanadium_catalyst", Item::new)
            .lang("Vanadium Catalyst")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p .stacksTo(16))
            .register();

    // Rutile Crystals
    public static final ItemEntry<Item> HIGH_GRADE_RUTILE_CRYSTAL = REGISTRATE.item("high_grade_rutile_crystal", Item::new)
            .lang("High Grade Rutile Crystal")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> MEDIUM_GRADE_RUTILE_CRYSTAL = REGISTRATE.item("medium_grade_rutile_crystal", Item::new)
            .lang("Medium Grade Rutile Crystal")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RUTILE_CRYSTAL = REGISTRATE.item("rutile_crystal", Item::new)
            .lang("Rutile Crystal")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Sheets/Plates
    public static final ItemEntry<Item> CARBON_FIBER_COMPOSITE_SHEET = REGISTRATE
            .item("carbon_fiber_composite_sheet", Item::new)
            .lang("Carbon Fiber Composite Sheet")
            .tag(createCommonItemTag("plates/carbon_fiber"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CURED_EPOXY_SHEET = REGISTRATE
            .item("cured_epoxy_sheet", Item::new)
            .lang("Cured Epoxy Sheet")
            .tag(createCommonItemTag("plates/epoxy_resin"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ELECTROCHEMICALLY_EXFOLIATED_GRAPHENE = REGISTRATE.item("electrochemically_exfoliated_graphene", Item::new)
            .lang("Electrochemically-Exfoliated Graphene")
            .tag(createCommonItemTag("plates/graphene"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> POLYETHYLENE_SHEET = REGISTRATE.item("polyethylene_sheet", Item::new)
            .lang("Polyethylene Sheet")
            .tag(createCommonItemTag("plates/polyethylene"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> POLYTETRAFLUOROETHYLENE_SHEET = REGISTRATE
            .item("polytetrafluoroethylene_sheet", Item::new)
            .lang("Polytetrafluoroethylene (PTFE) Sheet")
            .tag(createCommonItemTag("plates/ptfe"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> POLYVINYL_CHLORIDE_SHEET = REGISTRATE
            .item("polyvinyl_chloride_sheet", Item::new)
            .lang("Polyvinyl Chloride Sheet")
            .tag(createCommonItemTag("plates/pvc"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> RUBBER_STRIP = REGISTRATE.item("rubber_strip", Item::new)
            .lang("Rubber Strip")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Nylon/Fibers/Chemicals
    public static final ItemEntry<Item> NYLON_INGOT = REGISTRATE
            .item("nylon_ingot", Item::new)
            .lang("Nylon Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(createCommonItemTag("ingots/nylon"))
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> NYLON_SALT = REGISTRATE
            .item("nylon_salt", Item::new)
            .lang("Nylon Salt")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> NYLON_SALT_CRYSTALS = REGISTRATE
            .item("nylon_salt_crystals", Item::new)
            .lang("Nylon Salt Crystals")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> CARBON_FIBER_STRANDS = REGISTRATE
            .item("carbon_fiber_strands", Item::new)
            .lang("Carbon Fiber Strands")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> PAN_FIBERS = REGISTRATE
            .item("pan_fibers", Item::new)
            .lang("PAN Fibers")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> STABILIZED_FIBERS = REGISTRATE
            .item("stabilized_fibers", Item::new)
            .lang("Stabilized Fibers")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> YEAST = REGISTRATE
            .item("yeast", Item::new)
            .lang("Yeast")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Circuit Boards/Components
    public static final ItemEntry<Item> EMPTY_EPOXY_CIRCUIT_BOARD = REGISTRATE.item("empty_epoxy_circuit_board", Item::new)
            .lang("Empty Epoxy Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COATED_EPOXY_CIRCUIT_BOARD = REGISTRATE.item("coated_epoxy_circuit_board", Item::new)
            .lang("Coated Epoxy Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ETCHED_EPOXY_CIRCUIT_BOARD = REGISTRATE.item("etched_epoxy_circuit_board", Item::new)
            .lang("Etched Epoxy Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ADVANCED_CIRCUIT_BOARD = REGISTRATE.item("advanced_circuit_board", Item::new)
            .lang("Advanced Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> EMPTY_PVC_CIRCUIT_BOARD = REGISTRATE.item("empty_pvc_circuit_board", Item::new)
            .lang("Empty PVC Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COATED_PVC_CIRCUIT_BOARD = REGISTRATE.item("coated_pvc_circuit_board", Item::new)
            .lang("Coated PVC Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ETCHED_PVC_CIRCUIT_BOARD = REGISTRATE.item("etched_pvc_circuit_board", Item::new)
            .lang("Etched PVC Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> ELECTRONIC_CIRCUIT = REGISTRATE.item("electronic_circuit", Item::new)
            .lang("Electronic Circuit")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final ItemEntry<Item> COIL = REGISTRATE.item("coil", Item::new)
            .lang("Coil")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    public static final ItemEntry<Item> CONDUCTIVE_PASTE = REGISTRATE.item("conductive_paste", Item::new)
            .lang("Conductive Paste")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> HEAT_CONDUCTOR = REGISTRATE.item("heat_conductor", Item::new)
            .lang("Heat Conductor")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    public static final ItemEntry<Item> TANTALUM_CAPACITOR_ITEM = REGISTRATE.item("tantalum_capacitor_item", Item::new)
            .lang("Tantalum Capacitor")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(64))
            .register();

    // Lab Equipment
    public static final ItemEntry<Item> GLASS_VIAL = REGISTRATE.item("glass_vial", Item::new)
            .lang("Glass Vial")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    public static final ItemEntry<Item> GRADUATED_CYLINDER = REGISTRATE.item("graduated_cylinder", Item::new)
            .lang("Graduated Cylinder")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    public static final ItemEntry<Item> PETRI_DISH = REGISTRATE.item("petri_dish", Item::new)
            .lang("Petri Dish")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(16))
            .register();

    // Special Components
    public static final ItemEntry<Item> PLATINUM_ELECTRODE = REGISTRATE
            .item("platinum_electrode", Item::new)
            .lang("Platinum Electrode")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.component(TFMGDataComponents.ELECTRODE, new Electrode.Stored(ChemicaElectrodes.PLATINUM)).stacksTo(1))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), "chemica:block/platinum_electrode_model"))
            .register();

    // Unfinished Items
    public static final ItemEntry<Item> UNFINISHED_ADVANCED_CIRCUIT_BOARD = REGISTRATE.item("unfinished_advanced_circuit_board", Item::new)
            .lang("Unfinished Advanced Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_ELECTRONIC_CIRCUIT_BOARD = REGISTRATE.item("unfinished_electronic_circuit_board", Item::new)
            .lang("Unfinished Electronic Circuit Board")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_TANTALUM_CAPACITOR = REGISTRATE.item("unfinished_tantalum_capacitor", Item::new)
            .lang("Unfinished Tantalum Capacitor")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_REINFORCED_IRIDIUM_PLATE = REGISTRATE.item("unfinished_reinforced_iridium_plate", Item::new)
            .lang("Unfinished Reinforced Iridium Plate")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_CONDUCTIVE_PASTE = REGISTRATE.item("unfinished_conductive_paste", Item::new)
            .lang("Unfinished Conductive Paste")
            .tab(MAIN_TAB_KEY)
            .properties(p -> p.stacksTo(1))
            .register();

    // Engine Cylinders
    public static final ItemEntry<Item>
       BIODIESEL_CYLINDER = cylinder("biodiesel_engine_cylinder", (ctx, prov) ->
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ctx.get())
                    .pattern(" S ").pattern(" C ").pattern(" P ")
                    .define('S', TFMGItems.REBAR)
                    .define('C', TFMGItems.DIESEL_ENGINE_CYLINDER)
                    .define('P', Items.FLINT_AND_STEEL)
                    .unlockedBy("has_cylinder", DataIngredient.items(TFMGItems.DIESEL_ENGINE_CYLINDER.asItem()).getCriterion(prov))
                    .save(prov, ctx.getId().withPrefix("crafting/")), ChemicaEngineFuelTypes.BIODIESEL),
       ETHANOL_CYLINDER = cylinder("ethanol_engine_cylinder", (ctx, prov) ->
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ctx.get())
                    .pattern(" S ").pattern("C C").pattern("CCC")
                    .define('S', Items.FLINT_AND_STEEL)
                    .define('C', CommonMetal.IRON.plates)
                    .unlockedBy("has_plate", DataIngredient.tag(CommonMetal.IRON.plates).getCriterion(prov))
                    .save(prov, ctx.getId().withPrefix("crafting/")), ChemicaEngineFuelTypes.ETHANOL),
       HIGH_CETANE_CYLINDER = cylinder("high_cetane_engine_cylinder", (ctx, prov) ->
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ctx.get())
                    .pattern(" S ").pattern(" C ").pattern(" P ")
                    .define('S', Items.FIRE_CHARGE)
                    .define('C', TFMGItems.DIESEL_ENGINE_CYLINDER)
                    .define('P', AllItems.PRECISION_MECHANISM)
                    .unlockedBy("has_cylinder", DataIngredient.items(TFMGItems.DIESEL_ENGINE_CYLINDER.asItem()).getCriterion(prov))
                    .save(prov, ctx.getId().withPrefix("crafting/")), ChemicaEngineFuelTypes.HIGH_CETANE_DIESEL),
       HIGH_OCTANE_CYLINDER = cylinder("high_octane_engine_cylinder", (ctx, prov) ->
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ctx.get())
                    .pattern(" S ").pattern(" C ").pattern(" P ")
                    .define('S', TFMGItems.SPARK_PLUG)
                    .define('C', TFMGItems.DIESEL_ENGINE_CYLINDER)
                    .define('P', AllItems.PRECISION_MECHANISM)
                    .unlockedBy("has_cylinder", DataIngredient.items(TFMGItems.DIESEL_ENGINE_CYLINDER.asItem()).getCriterion(prov))
                    .save(prov, ctx.getId().withPrefix("crafting/")), ChemicaEngineFuelTypes.HIGH_OCTANE_GASOLINE),
       HYDROGEN_TURBINE_BLADE = cylinder("hydrogen_turbine_blade", (ctx, prov) ->
            ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ctx.get())
                    .pattern("XCX").pattern("OTO").pattern("XCX")
                    .define('T', TFMGItems.TURBINE_BLADE)
                    .define('O', TFMGItems.HEAVY_PLATE)
                    .define('X', TFMGItems.SCREW)
                    .define('C', CARBON_FIBER_COMPOSITE_SHEET)
                    .unlockedBy("has_turbine", DataIngredient.items(TFMGItems.TURBINE_BLADE.asItem()).getCriterion(prov))
                    .save(prov, ctx.getId().withPrefix("crafting/")), ChemicaEngineFuelTypes.HYDROGEN_FUEL);

    @SafeVarargs
    public static ItemEntry<Item> cylinder(String name, NonNullBiConsumer<DataGenContext<Item, Item>, RegistrateRecipeProvider> recipe, ResourceKey<EngineFuelType>... fuelTypes) {
        return REGISTRATE.item(name, Item::new)
                .properties(p -> p.component(TFMGDataComponents.ENGINE_CYLINDER, new CylinderFuels(Arrays.asList(fuelTypes))))
                .recipe(recipe)
                .register();
    }

    public static void register() {
        Chemica.LOGGER.info("Registering items for {}", Chemica.MOD_NAME);
    }
}
