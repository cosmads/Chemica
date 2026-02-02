package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.common.Tags;

public class ChemicaBlocks {

    private static final ResourceKey<CreativeModeTab> MAIN_TAB_KEY =
            ResourceKey.create(Registries.CREATIVE_MODE_TAB, Chemica.asResource("main"));

    // Helper method for common block tags
    private static TagKey<Block> createCommonBlockTag(String path) {
        return TagKey.create(Registries.BLOCK,
                ResourceLocation.fromNamespaceAndPath("c", path));
    }

    // Helper method for common item tags
    private static TagKey<Item> createCommonItemTag(String path) {
        return TagKey.create(Registries.ITEM,
                ResourceLocation.fromNamespaceAndPath("c", path));
    }

    // Register blocks
    public static final BlockEntry<Block> DEEPSLATE_ANTIMONY_ORE = Chemica.REGISTRATE
            .block("deepslate_antimony_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Antimony Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/antimony"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_CHROMITE_ORE = Chemica.REGISTRATE
            .block("deepslate_chromite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Chromite")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/chromium"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_COBALT_ORE = Chemica.REGISTRATE
            .block("deepslate_cobalt_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Cobalt Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/cobalt"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_FLUORITE_ORE = Chemica.REGISTRATE
            .block("deepslate_fluorite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Fluorite Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/fluorite"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_GRAPHITE_ORE = Chemica.REGISTRATE
            .block("deepslate_graphite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Graphite")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/graphite"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_MOLYBDENUM_ORE = Chemica.REGISTRATE
            .block("deepslate_molybdenum_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Molybdenum Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/molybdenum"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PHOSPHORUS_ORE = Chemica.REGISTRATE
            .block("phosphorus_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.STONE))
            .lang("Phosphorus Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_STONE)
            .tag(createCommonBlockTag("ores/phosphorus"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_PHOSPHORUS_ORE = Chemica.REGISTRATE
            .block("deepslate_phosphorus_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Phosphorus Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/phosphorus"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_PLATINUM_ORE = Chemica.REGISTRATE
            .block("deepslate_platinum_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Platinum Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/platinum"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_RUTILE_ORE = Chemica.REGISTRATE
            .block("deepslate_rutile_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Rutile")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/rutile"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_SILVER_ORE = Chemica.REGISTRATE
            .block("deepslate_silver_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Silver Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/silver"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> TIN_ORE = Chemica.REGISTRATE
            .block("tin_ore", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .properties(p -> p.mapColor(MapColor.STONE))
            .lang("Tin Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_STONE)
            .tag(createCommonBlockTag("ores/tin"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_TIN_ORE = Chemica.REGISTRATE
            .block("deepslate_tin_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Tin Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/tin"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_VANADIUM_ORE = Chemica.REGISTRATE
            .block("deepslate_vanadium_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Vanadium Ore")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/vanadium"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> DEEPSLATE_WOLFRAMITE_ORE = Chemica.REGISTRATE
            .block("deepslate_wolframite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .properties(p -> p.mapColor(MapColor.DEEPSLATE))
            .lang("Deepslate Wolframite")
            .tag(Tags.Blocks.ORES)
            .tag(Tags.Blocks.ORES_IN_GROUND_DEEPSLATE)
            .tag(createCommonBlockTag("ores/tungsten"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> RAW_PLATINUM_BLOCK = Chemica.REGISTRATE
            .block("raw_platinum_block", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Raw Platinum Block")
            .tag(Tags.Blocks.STORAGE_BLOCKS)
            .tag(createCommonBlockTag("storage_blocks"))
            .tag(createCommonBlockTag("storage_blocks/raw_platinum"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> PLATINUM_BLOCK = Chemica.REGISTRATE
            .block("platinum_block", Block::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .lang("Platinum Block")
            .tag(Tags.Blocks.STORAGE_BLOCKS)
            .tag(createCommonBlockTag("storage_blocks"))
            .tag(createCommonBlockTag("storage_blocks/platinum"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> CURED_EPOXY_BLOCK = Chemica.REGISTRATE
            .block("cured_epoxy_block", Block::new)
            .initialProperties(SharedProperties::stone)
            .properties(p -> p.mapColor(MapColor.COLOR_LIGHT_GRAY))
            .lang("Cured Epoxy Block")
            .simpleItem()
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .register();

    public static final BlockEntry<Block> FERVORITE = Chemica.REGISTRATE
            .block("fervorite", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Fervorite")
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ZELOSITE = Chemica.REGISTRATE
            .block("zelosite", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Zelosite")
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static void register() {
        Chemica.LOGGER.info("Registering blocks for {}", Chemica.MOD_NAME);
    }
}