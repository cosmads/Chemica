package io.github.cosmads.chemica.registry;

import com.drmangotea.tfmg.content.engines.CylinderItem;
import com.simibubi.create.AllTags;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.entry.RegistryEntry;
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.registrate.ChemicaRegistrate;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

public class CItems {
    public static final ChemicaRegistrate REGISTRATE = (ChemicaRegistrate) Chemica.registrate().setCreativeTab(ChemicaCreativeTabs.CHEMICA_MAIN);

    // Load this class

    public static final RegistryEntry<Item> ASH = REGISTRATE.item("ash", Item::new)
            .lang("Ash")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/ash"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CAUSTIC_SODA_DUST = REGISTRATE.item("caustic_soda_dust", Item::new)
            .lang("Caustic Soda Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/caustic_soda"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COAL_DUST = REGISTRATE.item("coal_dust", Item::new)
            .lang("Coal Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/coal"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CURED_EPOXY_SHEET = REGISTRATE.item("cured_epoxy_sheet", Item::new)
            .lang("Cured Epoxy Sheet")
            .tag(AllTags.forgeItemTag("plates/epoxy_resin"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> PLATINUM_DUST = REGISTRATE.item("platinum_dust", Item::new)
            .lang("Platinum Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/platinum"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> PLATINUM_INGOT = REGISTRATE.item("platinum_ingot", Item::new)
            .lang("Platinum Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/platinum"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> PLATINUM_NUGGET = REGISTRATE.item("platinum_nugget", Item::new)
            .lang("Platinum Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/platinum"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RAW_PLATINUM = REGISTRATE.item("raw_platinum", Item::new)
            .lang("Raw Platinum")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> PLATINUM_CATALYST = REGISTRATE.item("platinum_catalyst", Item::new)
            .lang("Platinum Catalyst")
            .properties(p -> p.stacksTo(16))
            .register();

    public static final RegistryEntry<Item> NYLON_SALT = REGISTRATE.item("nylon_salt", Item::new)
            .lang("Nylon Salt")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> NYLON_SALT_CRYSTALS = REGISTRATE.item("nylon_salt_crystals", Item::new)
            .lang("Nylon Salt Crystals")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> NYLON_INGOT = REGISTRATE.item("nylon_ingot", Item::new)
            .lang("Nylon Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/nylon"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> PAN_FIBERS = REGISTRATE.item("pan_fibers", Item::new)
            .lang("PAN Fibers")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> SALT = REGISTRATE.item("salt", Item::new)
            .lang("Salt")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/salt"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> POLYVINYL_CHLORIDE_SHEET = REGISTRATE.item("polyvinyl_chloride_sheet", Item::new)
            .lang("Polyvinyl Chloride Sheet")
            .tag(AllTags.forgeItemTag("plates/pvc"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> FLUORITE_DUST = REGISTRATE.item("fluorite_dust", Item::new)
            .lang("Fluorite Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/fluorite"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> POLYTETRAFLUOROETHYLENE_SHEET = REGISTRATE.item("polytetrafluoroethylene_sheet", Item::new)
            .lang("Polytetrafluoroethylene (PTFE) Sheet")
            .tag(AllTags.forgeItemTag("plates/pfte"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> STABILIZED_FIBERS = REGISTRATE.item("stabilized_fibers", Item::new)
            .lang("Stabilized Fibers")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CARBON_FIBER_STRANDS = REGISTRATE.item("carbon_fiber_strands", Item::new)
            .lang("Carbon Fiber Strands")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CARBON_FIBER_COMPOSITE_SHEET = REGISTRATE.item("carbon_fiber_composite_sheet", Item::new)
            .lang("Carbon Fiber Composite Sheet")
            .tag(AllTags.forgeItemTag("plates/carbon_fiber"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> YEAST = REGISTRATE.item("yeast", Item::new)
            .lang("Yeast")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COPPER_CATALYST = REGISTRATE.item("copper_catalyst", Item::new)
            .lang("Copper Catalyst")
            .properties(p -> p .stacksTo(16))
            .register();

    public static final RegistryEntry<Item> IRON_CATALYST = REGISTRATE.item("iron_catalyst", Item::new)
            .lang("Iron Catalyst")
            .properties(p -> p .stacksTo(16))
            .register();

    public static final RegistryEntry<Item> VANADIUM_CATALYST = REGISTRATE.item("vanadium_catalyst", Item::new)
            .lang("Vanadium Catalyst")
            .properties(p -> p .stacksTo(16))
            .register();

    public static final RegistryEntry<Item> NICKEL_CATALYST = REGISTRATE.item("nickel_catalyst", Item::new)
            .lang("Nickel Catalyst")
            .properties(p -> p .stacksTo(16))
            .register();

    public static final RegistryEntry<Item> NICKEL_DUST = REGISTRATE.item("nickel_dust", Item::new)
            .lang("Nickel Dust").tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/nickel"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COBALT_CATALYST = REGISTRATE.item("cobalt_catalyst", Item::new)
            .lang("Cobalt Catalyst")
            .properties(p -> p .stacksTo(16))
            .register();

    public static final RegistryEntry<Item> VANADIUM_DUST = REGISTRATE.item("vanadium_dust", Item::new)
            .lang("Vanadium Dust").tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/vanadium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> VANADIUM_INGOT = REGISTRATE.item("vanadium_ingot", Item::new)
            .lang("Vanadium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/vanadium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> VANADIUM_NUGGET = REGISTRATE.item("vanadium_nugget", Item::new)
            .lang("Vanadium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/vanadium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RAW_VANADIUM = REGISTRATE.item("raw_vanadium", Item::new)
            .lang("Raw Vanadium")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COBALT_INGOT = REGISTRATE.item("cobalt_ingot", Item::new)
            .lang("Cobalt Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/cobalt"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COBALT_NUGGET = REGISTRATE.item("cobalt_nugget", Item::new)
            .lang("Cobalt Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/cobalt"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COBALT_DUST = REGISTRATE.item("cobalt_dust", Item::new)
            .lang("Cobalt Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/cobalt"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RAW_COBALT = REGISTRATE.item("raw_cobalt", Item::new)
            .lang("Raw Cobalt")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CHROMIUM_INGOT = REGISTRATE.item("chromium_ingot", Item::new)
            .lang("Chromium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/chromium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CHROMIUM_NUGGET = REGISTRATE.item("chromium_nugget", Item::new)
            .lang("Chromium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/chromium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CHROMIUM_DUST = REGISTRATE.item("chromium_dust", Item::new)
            .lang("Chromium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/chromium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RAW_CHROMITE = REGISTRATE.item("raw_chromite", Item::new)
            .lang("Raw Chromite")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ARSENIC_DUST = REGISTRATE.item("arsenic_dust", Item::new)
            .lang("Arsenic Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/arsenic"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> MOLYBDENUM_INGOT = REGISTRATE.item("molybdenum_ingot", Item::new)
            .lang("Molybdenum Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/molybdenum"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> MOLYBDENUM_NUGGET = REGISTRATE.item("molybdenum_nugget", Item::new)
            .lang("Molybdenum Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/molybdenum"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RAW_MOLYBDENUM = REGISTRATE.item("raw_molybdenum", Item::new)
            .lang("Raw Molybdenum")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ANTIMONY_DUST = REGISTRATE.item("antimony_dust", Item::new)
            .lang("Antimony Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/antimony"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ANTIMONY_INGOT = REGISTRATE.item("antimony_ingot", Item::new)
            .lang("Antimony Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/antimony"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ANTIMONY_NUGGET = REGISTRATE.item("antimony_nugget", Item::new)
            .lang("Antimony Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/antimony"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RAW_ANTIMONY = REGISTRATE.item("raw_antimony", Item::new)
            .lang("Raw Antimony")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ZINC_DUST = REGISTRATE.item("zinc_dust", Item::new)
            .lang("Zinc Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/zinc"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> IRON_DUST = REGISTRATE.item("iron_dust", Item::new)
            .lang("Iron Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/iron"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> GOLD_DUST = REGISTRATE.item("gold_dust", Item::new)
            .lang("Gold Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/gold"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COPPER_DUST = REGISTRATE.item("copper_dust", Item::new)
            .lang("Copper Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/copper"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> AMMONIUM_PERSULFATE = REGISTRATE.item("ammonium_persulfate", Item::new)
            .lang("Ammonium Persulfate")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CRUSHED_GRAPHITE = REGISTRATE.item("crushed_graphite", Item::new)
            .lang("Crushed Graphite")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> PURIFIED_GRAPHITE_FLAKES = REGISTRATE.item("purified_graphite_flakes", Item::new)
            .lang("Purified Graphite Flakes")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CRUSHED_RAW_VANADIUM = REGISTRATE.item("crushed_raw_vanadium", Item::new)
            .lang("Crushed Raw Vanadium")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CRUSHED_RAW_ANTIMONY = REGISTRATE.item("crushed_raw_antimony", Item::new)
            .lang("Crushed Raw Antimony")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CRUSHED_RAW_CHROMIUM = REGISTRATE.item("crushed_raw_chromium", Item::new)
            .lang("Crushed Raw Chromium")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CRUSHED_RAW_COBALT = REGISTRATE.item("crushed_raw_cobalt", Item::new)
            .lang("Crushed Raw Cobalt")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> GRAPHITE_SHEET = REGISTRATE.item("graphite_sheet", Item::new)
            .lang("Graphite Sheet")
            .tag(AllTags.forgeItemTag("plates/graphite"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> GRAPHITE_INGOT = REGISTRATE.item("graphite_ingot", Item::new)
            .lang("Graphite Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/graphite"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> QUARTZ_DUST = REGISTRATE.item("quartz_dust", Item::new)
            .lang("Quartz Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/quartz"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RAW_SILVER = REGISTRATE.item("raw_silver", Item::new)
            .lang("Raw Silver")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RAW_TIN = REGISTRATE.item("raw_tin", Item::new)
            .lang("Raw Tin")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RAW_TUNGSTEN = REGISTRATE.item("raw_tungsten", Item::new)
            .lang("Raw Tungsten")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RUTILE_CRYSTAL = REGISTRATE.item("rutile_crystal", Item::new)
            .lang("Rutile Crystal")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RUTILE_DUST = REGISTRATE.item("rutile_dust", Item::new)
            .lang("Rutile Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/rutile"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> SILVER_DUST = REGISTRATE.item("silver_dust", Item::new)
            .lang("Silver Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/silver"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> SILVER_INGOT = REGISTRATE.item("silver_ingot", Item::new)
            .lang("Silver Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/silver"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> SILVER_NUGGET = REGISTRATE.item("silver_nugget", Item::new)
            .lang("Silver Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/silver"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> SILVER_SHEET = REGISTRATE.item("silver_sheet", Item::new)
            .lang("Silver Sheet")
            .tag(AllTags.forgeItemTag("plates/silver"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TIN_DUST = REGISTRATE.item("tin_dust", Item::new)
            .lang("Tin Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/tin"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TIN_INGOT = REGISTRATE.item("tin_ingot", Item::new)
            .lang("Tin Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/tin"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TIN_NUGGET = REGISTRATE.item("tin_nugget", Item::new)
            .lang("Tin Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/tin"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TIN_SHEET = REGISTRATE.item("tin_sheet", Item::new)
            .lang("Tin Sheet")
            .tag(AllTags.forgeItemTag("plates/tin"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TITANIUM_DUST = REGISTRATE.item("titanium_dust", Item::new)
            .lang("Titanium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/titanium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TITANIUM_INGOT = REGISTRATE.item("titanium_ingot", Item::new)
            .lang("Titanium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/titanium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TITANIUM_NUGGET = REGISTRATE.item("titanium_nugget", Item::new)
            .lang("Titanium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/titanium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TITANIUM_SHEET = REGISTRATE.item("titanium_sheet", Item::new)
            .lang("Titanium Sheet")
            .tag(AllTags.forgeItemTag("plates/titanium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TUNGSTEN_DUST = REGISTRATE.item("tungsten_dust", Item::new)
            .lang("Tungsten Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/tungsten"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TUNGSTEN_INGOT = REGISTRATE.item("tungsten_ingot", Item::new)
            .lang("Tungsten Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/tungsten"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TUNGSTEN_NUGGET = REGISTRATE.item("tungsten_nugget", Item::new)
            .lang("Tungsten Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/tungsten"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> IRIDIUM_DUST = REGISTRATE.item("iridium_dust", Item::new)
            .lang("Iridium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/iridium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> IRIDIUM_INGOT = REGISTRATE.item("iridium_ingot", Item::new)
            .lang("Iridium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/iridium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> IRIDIUM_NUGGET = REGISTRATE.item("iridium_nugget", Item::new)
            .lang("Iridium Nugget")
            .tag(Tags.Items.NUGGETS)
            .tag(AllTags.forgeItemTag("nuggets/iridium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> IRIDIUM_SHEET = REGISTRATE.item("iridium_sheet", Item::new)
            .lang("Iridium Sheet")
            .tag(AllTags.forgeItemTag("plates/iridium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ELECTROCHEMICALLY_EXFOLIATED_GRAPHENE = REGISTRATE.item("electrochemically_exfoliated_graphene", Item::new)
            .lang("Electrochemically-Exfoliated Graphene")
            .tag(AllTags.forgeItemTag("plates/graphene"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> SODIUM_DUST = REGISTRATE.item("sodium_dust", Item::new)
            .lang("Sodium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/sodium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ADVANCED_CIRCUIT_BOARD = REGISTRATE.item("advanced_circuit_board", Item::new)
            .lang("Advanced Circuit Board")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CHARCOAL_DUST = REGISTRATE.item("charcoal_dust", Item::new)
            .lang("Charcoal Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/charcoal"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COIL = REGISTRATE.item("coil", Item::new)
            .lang("Coil")
            .properties(p -> p.stacksTo(16))
            .register();

    public static final RegistryEntry<Item> CONSTANTAN_DUST = REGISTRATE.item("constantan_dust", Item::new)
            .lang("Constantan Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/constantan"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COPPER_BOILER = REGISTRATE.item("copper_boiler", Item::new)
            .lang("Copper Boiler")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ELECTRUM_GRIT = REGISTRATE.item("electrum_grit", Item::new)
            .lang("Electrum Grit")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/electrum"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ELECTRONIC_CIRCUIT = REGISTRATE.item("electronic_circuit", Item::new)
            .lang("Electronic Circuit")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> EMPTY_PVC_CIRCUIT_BOARD = REGISTRATE.item("empty_pvc_circuit_board", Item::new)
            .lang("Empty PVC Circuit Board")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COATED_PVC_CIRCUIT_BOARD = REGISTRATE.item("coated_pvc_circuit_board", Item::new)
            .lang("Coated PVC Circuit Board")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ETCHED_PVC_CIRCUIT_BOARD = REGISTRATE.item("etched_pvc_circuit_board", Item::new)
            .lang("Etched PVC Circuit Board")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> EMPTY_EPOXY_CIRCUIT_BOARD = REGISTRATE.item("empty_epoxy_circuit_board", Item::new)
            .lang("Empty Epoxy Circuit Board")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> COATED_EPOXY_CIRCUIT_BOARD = REGISTRATE.item("coated_epoxy_circuit_board", Item::new)
            .lang("Coated Epoxy Circuit Board")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ETCHED_EPOXY_CIRCUIT_BOARD = REGISTRATE.item("etched_epoxy_circuit_board", Item::new)
            .lang("Etched Epoxy Circuit Board")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> GLASS_VIAL = REGISTRATE.item("glass_vial", Item::new)
            .lang("Glass Vial")
            .properties(p -> p.stacksTo(16))
            .register();

    public static final RegistryEntry<Item> GRADUATED_CYLINDER = REGISTRATE.item("graduated_cylinder", Item::new)
            .lang("Graduated Cylinder")
            .properties(p -> p.stacksTo(16))
            .register();

    public static final RegistryEntry<Item> HEAT_CONDUCTOR = REGISTRATE.item("heat_conductor", Item::new)
            .lang("Heat Conductor")
            .properties(p -> p.stacksTo(16))
            .register();

    public static final RegistryEntry<Item> HIGH_GRADE_RUTILE_CRYSTAL = REGISTRATE.item("high_grade_rutile_crystal", Item::new)
            .lang("High Grade Rutile Crystal")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> MAGNESIUM_DUST = REGISTRATE.item("magnesium_dust", Item::new)
            .lang("Magnesium Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/magnesium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> MAGNESIUM_INGOT = REGISTRATE.item("magnesium_ingot", Item::new)
            .lang("Magnesium Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/magnesium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> MAGNESIUM_NUGGET = REGISTRATE.item("magnesium_nugget", Item::new)
            .lang("Magnesium Nugget")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> MAGNESIUM_SHEET = REGISTRATE.item("magnesium_sheet", Item::new)
            .lang("Magnesium Sheet")
            .tag(AllTags.forgeItemTag("plates/magnesium"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> MEDIUM_GRADE_RUTILE_CRYSTAL = REGISTRATE.item("medium_grade_rutile_crystal", Item::new)
            .lang("Medium Grade Rutile Crystal")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> PETRI_DISH = REGISTRATE.item("petri_dish", Item::new)
            .lang("Petri Dish")
            .properties(p -> p.stacksTo(16))
            .register();

    public static final RegistryEntry<Item> PHOSPHORUS_DUST = REGISTRATE.item("phosphorus_dust", Item::new)
            .lang("Phosphorus Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/phosphorus"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> POLYETHYLENE_SHEET = REGISTRATE.item("polyethylene_sheet", Item::new)
            .lang("Polyethylene Sheet")
            .tag(AllTags.forgeItemTag("plates/polyethylene"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> REINFORCED_IRIDIUM_PLATE = REGISTRATE.item("reinforced_iridium_plate", Item::new)
            .lang("Reinforced Iridium Plate")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> RUBBER_STRIP = REGISTRATE.item("rubber_strip", Item::new)
            .lang("Rubber Strip")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> SILICON_DUST = REGISTRATE.item("silicon_dust", Item::new)
            .lang("Silicon Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/silicon"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> SODA_ASH = REGISTRATE.item("soda_ash", Item::new)
            .lang("Soda Ash")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/soda_ash"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> SODIUM_BISULFATE_DUST = REGISTRATE.item("sodium_bisulfate_dust", Item::new)
            .lang("Sodium Bisulfate Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/sodium_bisulfate"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> SODIUM_PERSULFATE = REGISTRATE.item("sodium_persulfate", Item::new)
            .lang("Sodium Persulfate")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/sodium_persulfate"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> STEEL_BASED_TOUGH_ALLOY = REGISTRATE.item("steel_based_tough_alloy", Item::new)
            .lang("Steel Based Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> HEAT_RESISTANT_TOUGH_ALLOY = REGISTRATE.item("heat_resistant_tough_alloy", Item::new)
            .lang("Heat Resistant Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> ADVANCED_COMPOSITE_ALLOY = REGISTRATE.item("advanced_composite_alloy", Item::new)
            .lang("Advanced Composite Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> LIGHTWEIGHT_TOUGH_ALLOY = REGISTRATE.item("lightweight_tough_alloy", Item::new)
            .lang("Lightweight Tough Alloy")
            .tag(Tags.Items.INGOTS)
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TUNGSTEN_CARBIDE_DUST = REGISTRATE.item("tungsten_carbide_dust", Item::new)
            .lang("Tungsten Carbide Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/tungsten_carbide"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TUNGSTEN_CARBIDE_INGOT = REGISTRATE.item("tungsten_carbide_ingot", Item::new)
            .lang("Tungsten Carbide Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/tungsten_carbide"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TANTALUM_INGOT = REGISTRATE.item("tantalum_ingot", Item::new)
            .lang("Tantalum Ingot")
            .tag(Tags.Items.INGOTS)
            .tag(AllTags.forgeItemTag("ingots/tantalum"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TANTALUM_DUST = REGISTRATE.item("tantalum_dust", Item::new)
            .lang("Tantalum Dust")
            .tag(Tags.Items.DUSTS)
            .tag(AllTags.forgeItemTag("dusts/tantalum"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TANTALUM_NUGGET = REGISTRATE.item("tantalum_nugget", Item::new)
            .lang("Tantalum Nugget")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TANTALUM_SHEET = REGISTRATE.item("tantalum_sheet", Item::new)
            .lang("Tantalum Sheet")
            .tag(AllTags.forgeItemTag("plates/tantalum"))
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> TANTALUM_CAPACITOR_ITEM = REGISTRATE.item("tantalum_capacitor_item", Item::new)
            .lang("Tantalum Capacitor")
            .properties(p -> p.stacksTo(64))
            .register();

    public static final RegistryEntry<Item> CONDUCTIVE_PASTE = REGISTRATE.item("conductive_paste", Item::new)
            .lang("Conductive Paste")
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_ELECTRONIC_CIRCUIT_BOARD = REGISTRATE.item("unfinished_electronic_circuit_board", Item::new)
            .lang("Unfinished Electronic Circuit Board")
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_ADVANCED_CIRCUIT_BOARD = REGISTRATE.item("unfinished_advanced_circuit_board", Item::new)
            .lang("Unfinished Advanced Circuit Board")
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> UNFINISHED_TANTALUM_CAPACITOR = REGISTRATE.item("unfinished_tantalum_capacitor", Item::new)
            .lang("Unfinished Tantalum Capacitor")
            .properties(p -> p.stacksTo(1))
            .register();

    public static final ItemEntry<Item> PLATINUM_ELECTRODE = REGISTRATE.item("platinum_electrode", Item::new)
            .lang("Platinum Electrode")
            .properties(p -> p.stacksTo(1))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), "chemica:block/platinum_electrode_model"))
            .register();



    public static final ItemEntry<CylinderItem> HIGH_OCTANE_CYLINDER = Chemica.registrate()
            .item("high_octane_engine_cylinder", CylinderItem::new)
            .lang("High Octane Engine Cylinder")
            .properties(p -> p.stacksTo(1))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.mcLoc("item/generated"))
                    .texture("layer0", prov.modLoc("item/high_octane_engine_cylinder")))
            .register();

    public static final ItemEntry<CylinderItem> HYDROGEN_CYLINDER = Chemica.registrate()
            .item("hydrogen_engine_cylinder", CylinderItem::new)
            .lang("Hydrogen Engine Cylinder")
            .properties(p -> p.stacksTo(1))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.mcLoc("item/generated"))
                    .texture("layer0", prov.modLoc("item/hydrogen_engine_cylinder")))
            .register();

    public static final ItemEntry<CylinderItem> ETHANOL_CYLINDER = Chemica.registrate()
            .item("ethanol_engine_cylinder", CylinderItem::new)
            .lang("Ethanol Engine Cylinder")
            .properties(p -> p.stacksTo(1))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.mcLoc("item/generated"))
                    .texture("layer0", prov.modLoc("item/ethanol_engine_cylinder")))
            .register();

    public static final ItemEntry<CylinderItem> BIODIESEL_CYLINDER = Chemica.registrate()
            .item("biodiesel_engine_cylinder", CylinderItem::new)
            .lang("Biodiesel Engine Cylinder")
            .properties(p -> p.stacksTo(1))
            .model((ctx, prov) -> prov.withExistingParent(ctx.getName(), prov.mcLoc("item/generated"))
                    .texture("layer0", prov.modLoc("item/biodiesel_engine_cylinder")))
            .register();

    // Loaded

    public static void register() {
        Chemica.LOGGER.info("Registered items for Chemica");
    }
}