package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.ChemMaterial;
import com.drmangotea.tfmg.base.data_storage.CylinderFuels;
import com.drmangotea.tfmg.content.engines.fuels.EngineFuelType;
import com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode.Electrode;
import com.drmangotea.tfmg.registry.TFMGDataComponents;
import com.drmangotea.tfmg.registry.TFMGItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.AllTags;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.recipe.CommonMetal;
import com.tterrag.registrate.builders.ItemBuilder;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateRecipeProvider;
import com.tterrag.registrate.util.DataIngredient;
import com.tterrag.registrate.util.entry.ItemEntry;
import com.tterrag.registrate.util.nullness.NonNullBiConsumer;
import com.tterrag.registrate.util.nullness.NonNullFunction;
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

    // Misc Dusts
    public static final ItemEntry<Item> COPPER_DUST = dust("copper_dust", ChemMaterial.COPPER);
    public static final ItemEntry<Item> GOLD_DUST = dust("gold_dust", ChemMaterial.GOLD);
    public static final ItemEntry<Item> IRON_DUST = dust("iron_dust", ChemMaterial.IRON);
    public static final ItemEntry<Item> NICKEL_DUST = dust("nickel_dust", ChemMaterial.NICKEL);
    public static final ItemEntry<Item> SILICON_DUST = dust("silicon_dust", ChemMaterial.SILICON);
    public static final ItemEntry<Item> ZINC_DUST = dust("zinc_dust", ChemMaterial.ZINC);

    // Metals
    //  Antimony
    public static final ItemEntry<Item> ANTIMONY_INGOT = ingot("antimony_ingot", ChemMaterial.ANTIMONY);
    public static final ItemEntry<Item> ANTIMONY_NUGGET = nugget("antimony_nugget", ChemMaterial.ANTIMONY);
    public static final ItemEntry<Item> RAW_ANTIMONY = raw("raw_antimony", ChemMaterial.ANTIMONY);
    public static final ItemEntry<Item> CRUSHED_RAW_ANTIMONY = crushedRaw("crushed_raw_antimony", ChemMaterial.ANTIMONY);
    public static final ItemEntry<Item> ANTIMONY_DUST = dust("antimony_dust", ChemMaterial.ANTIMONY);
    //  Chromium
    public static final ItemEntry<Item> CHROMIUM_INGOT = ingot("chromium_ingot", ChemMaterial.CHROMIUM);
    public static final ItemEntry<Item> CHROMIUM_NUGGET = nugget("chromium_nugget", ChemMaterial.CHROMIUM);
    public static final ItemEntry<Item> RAW_CHROMITE = raw("raw_chromite", ChemMaterial.CHROMIUM);
    public static final ItemEntry<Item> CRUSHED_RAW_CHROMIUM = crushedRaw("crushed_raw_chromium", ChemMaterial.CHROMIUM);
    public static final ItemEntry<Item> CHROMIUM_DUST = dust("chromium_dust", ChemMaterial.CHROMIUM);
    //  Cobalt
    public static final ItemEntry<Item> COBALT_INGOT = ingot("cobalt_ingot", ChemMaterial.COBALT);
    public static final ItemEntry<Item> COBALT_NUGGET = nugget("cobalt_nugget", ChemMaterial.COBALT);
    public static final ItemEntry<Item> RAW_COBALT = raw("raw_cobalt", ChemMaterial.COBALT);
    public static final ItemEntry<Item> CRUSHED_RAW_COBALT = crushedRaw("crushed_raw_cobalt", ChemMaterial.COBALT);
    public static final ItemEntry<Item> COBALT_DUST = dust("cobalt_dust", ChemMaterial.COBALT);
    //  Graphite
    public static final ItemEntry<Item> GRAPHITE_INGOT = ingot("graphite_ingot", ChemMaterial.GRAPHITE);
    public static final ItemEntry<Item> GRAPHITE_SHEET = sheet("graphite_sheet", ChemMaterial.GRAPHITE);
    public static final ItemEntry<Item> GRAPHITE_NUGGET = nugget("graphite_nugget", ChemMaterial.GRAPHITE);
    public static final ItemEntry<Item> CRUSHED_GRAPHITE = crushedRaw("crushed_graphite", ChemMaterial.GRAPHITE);
    public static final ItemEntry<Item> PURIFIED_GRAPHITE_FLAKES = item("purified_graphite_flakes", Item::new).register();
    //  Iridium
    public static final ItemEntry<Item> IRIDIUM_INGOT = ingot("iridium_ingot", ChemMaterial.IRIDIUM);
    public static final ItemEntry<Item> IRIDIUM_SHEET = sheet("iridium_sheet", ChemMaterial.IRIDIUM);
    public static final ItemEntry<Item> REINFORCED_IRIDIUM_PLATE = sheet("reinforced_iridium_plate", ChemMaterial.REINFORCED_IRIDIUM);
    public static final ItemEntry<Item> IRIDIUM_NUGGET = nugget("iridium_nugget", ChemMaterial.IRIDIUM);
    public static final ItemEntry<Item> IRIDIUM_DUST = dust("iridium_dust", ChemMaterial.IRIDIUM);
    //  Magnesium
    public static final ItemEntry<Item> MAGNESIUM_INGOT = ingot("magnesium_ingot", ChemMaterial.MAGNESIUM);
    public static final ItemEntry<Item> MAGNESIUM_SHEET = sheet("magnesium_sheet", ChemMaterial.MAGNESIUM);
    public static final ItemEntry<Item> MAGNESIUM_NUGGET = nugget("magnesium_nugget", ChemMaterial.MAGNESIUM);
    public static final ItemEntry<Item> MAGNESIUM_DUST = dust("magnesium_dust", ChemMaterial.MAGNESIUM);
    //  Molybdenum
    public static final ItemEntry<Item> MOLYBDENUM_INGOT = ingot("molybdenum_ingot", ChemMaterial.MOLYBDENUM);
    public static final ItemEntry<Item> MOLYBDENUM_NUGGET = nugget("molybdenum_nugget", ChemMaterial.MOLYBDENUM);
    public static final ItemEntry<Item> RAW_MOLYBDENUM = raw("raw_molybdenum", ChemMaterial.MOLYBDENUM);
    //  Platinum
    public static final ItemEntry<Item> PLATINUM_INGOT = ingot("platinum_ingot", ChemMaterial.PLATINUM);
    public static final ItemEntry<Item> PLATINUM_NUGGET = nugget("platinum_nugget", ChemMaterial.PLATINUM);
    public static final ItemEntry<Item> RAW_PLATINUM = raw("raw_platinum", ChemMaterial.PLATINUM);
    public static final ItemEntry<Item> PLATINUM_DUST = dust("platinum_dust", ChemMaterial.PLATINUM);
    //  Silver
    public static final ItemEntry<Item> SILVER_INGOT = ingot("silver_ingot", ChemMaterial.SILVER);
    public static final ItemEntry<Item> SILVER_SHEET = sheet("silver_sheet", ChemMaterial.SILVER);
    public static final ItemEntry<Item> SILVER_NUGGET = nugget("silver_nugget", ChemMaterial.SILVER);
    public static final ItemEntry<Item> RAW_SILVER = raw("raw_silver", ChemMaterial.SILVER);
    public static final ItemEntry<Item> SILVER_DUST = dust("silver_dust", ChemMaterial.SILVER);
    //  Sodium
    public static final ItemEntry<Item> SODIUM_INGOT = ingot("sodium_ingot", ChemMaterial.SODIUM);
    public static final ItemEntry<Item> SODIUM_DUST = dust("sodium_dust", ChemMaterial.SODIUM);
    //  Tantalum
    public static final ItemEntry<Item> TANTALUM_INGOT = ingot("tantalum_ingot", ChemMaterial.TANTALUM);
    public static final ItemEntry<Item> TANTALUM_SHEET = sheet("tantalum_sheet", ChemMaterial.TANTALUM);
    public static final ItemEntry<Item> TANTALUM_NUGGET = nugget("tantalum_nugget", ChemMaterial.TANTALUM);
    public static final ItemEntry<Item> TANTALUM_DUST = dust("tantalum_dust", ChemMaterial.TANTALUM);
    //  Tin
    public static final ItemEntry<Item> TIN_INGOT = ingot("tin_ingot", ChemMaterial.TIN);
    public static final ItemEntry<Item> TIN_SHEET = sheet("tin_sheet", ChemMaterial.TIN);
    public static final ItemEntry<Item> TIN_NUGGET = nugget("tin_nugget", ChemMaterial.TIN);
    public static final ItemEntry<Item> RAW_TIN = raw("raw_tin", ChemMaterial.TIN);
    public static final ItemEntry<Item> TIN_DUST = dust("tin_dust", ChemMaterial.TIN);
    //  Titanium
    public static final ItemEntry<Item> TITANIUM_INGOT = ingot("titanium_ingot", ChemMaterial.TITANIUM);
    public static final ItemEntry<Item> TITANIUM_SHEET = sheet("titanium_sheet", ChemMaterial.TITANIUM);
    public static final ItemEntry<Item> TITANIUM_NUGGET = nugget("titanium_nugget", ChemMaterial.TITANIUM);
    public static final ItemEntry<Item> TITANIUM_DUST = dust("titanium_dust", ChemMaterial.TITANIUM);
    //  Tungsten
    public static final ItemEntry<Item> TUNGSTEN_INGOT = ingot("tungsten_ingot", ChemMaterial.TUNGSTEN);
    public static final ItemEntry<Item> TUNGSTEN_NUGGET = nugget("tungsten_nugget", ChemMaterial.TUNGSTEN);
    public static final ItemEntry<Item> RAW_TUNGSTEN = raw("raw_tungsten", ChemMaterial.TUNGSTEN);
    public static final ItemEntry<Item> TUNGSTEN_DUST = dust("tungsten_dust", ChemMaterial.TUNGSTEN);
    //  Tungsten Carbide
    public static final ItemEntry<Item> TUNGSTEN_CARBIDE_INGOT = ingot("tungsten_carbide_ingot", ChemMaterial.TUNGSTEN_CARBIDE);
    public static final ItemEntry<Item> TUNGSTEN_CARBIDE_DUST = dust("tungsten_carbide_dust", ChemMaterial.TUNGSTEN_CARBIDE);
    //  Vanadium
    public static final ItemEntry<Item> VANADIUM_INGOT = ingot("vanadium_ingot", ChemMaterial.VANADIUM);
    public static final ItemEntry<Item> VANADIUM_NUGGET = nugget("vanadium_nugget", ChemMaterial.VANADIUM);
    public static final ItemEntry<Item> RAW_VANADIUM = raw("raw_vanadium", ChemMaterial.VANADIUM);
    public static final ItemEntry<Item> CRUSHED_RAW_VANADIUM = crushedRaw("crushed_raw_vanadium", ChemMaterial.VANADIUM);
    public static final ItemEntry<Item> VANADIUM_DUST = dust("vanadium_dust", ChemMaterial.VANADIUM);
    //  Tough Alloy
    public static final ItemEntry<Item> ADVANCED_COMPOSITE_TOUGH_ALLOY = ingot("advanced_composite_tough_alloy", ChemMaterial.COMPOSITE_ALLOY);
    public static final ItemEntry<Item> HEAT_RESISTANT_TOUGH_ALLOY = ingot("heat_resistant_tough_alloy", ChemMaterial.HEAT_RESISTANT_ALLOY);
    public static final ItemEntry<Item> LIGHTWEIGHT_TOUGH_ALLOY = ingot("lightweight_tough_alloy", ChemMaterial.LIGHTWEIGHT_ALLOY);
    public static final ItemEntry<Item> STEEL_BASED_TOUGH_ALLOY = ingot("steel_based_tough_alloy", ChemMaterial.STEEL_BASED_ALLOY);

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
        return item(name, Item::new)
                .properties(p -> p.component(TFMGDataComponents.ENGINE_CYLINDER, new CylinderFuels(Arrays.asList(fuelTypes))))
                .recipe(recipe)
                .register();
    }

    public static ItemEntry<Item> ingot(String name, ChemMaterial metal) {
        return item(name, Item::new)
                .tag(Tags.Items.INGOTS)
                .tag(metal.ingots)
                .register();
    }

    public static ItemEntry<Item> nugget(String name, ChemMaterial metal) {
        return item(name, Item::new)
                .tag(Tags.Items.NUGGETS)
                .tag(metal.nuggets)
                .register();
    }

    public static ItemEntry<Item> raw(String name, ChemMaterial metal) {
        return item(name, Item::new)
                .tag(Tags.Items.RAW_MATERIALS)
                .tag(metal.rawOres)
                .register();
    }

    public static ItemEntry<Item> crushedRaw(String name, ChemMaterial metal) {
        return item(name, Item::new)
                .tag(AllTags.AllItemTags.CRUSHED_RAW_MATERIALS.tag)
                .register();
    }

    public static ItemEntry<Item> dust(String name, ChemMaterial metal) {
        return item(name, Item::new)
                .tag(Tags.Items.DUSTS)
                .tag(metal.dusts)
                .register();
    }

    public static ItemEntry<Item> sheet(String name, ChemMaterial metal) {
        return item(name, Item::new)
                .tag(AllTags.AllItemTags.PLATES.tag)
                .tag(metal.plates)
                .register();
    }

    public static <T extends Item> ItemBuilder<T, CreateRegistrate> item(String name, NonNullFunction<Item.Properties, T> supplier) {
        return Chemica.REGISTRATE.item(name, supplier).tab(MAIN_TAB_KEY);
    }

    public static void register() {
        Chemica.LOGGER.info("Registering items for {}", Chemica.MOD_NAME);
    }
}
