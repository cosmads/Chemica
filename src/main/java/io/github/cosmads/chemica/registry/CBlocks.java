package io.github.cosmads.chemica.registry;

import com.simibubi.create.AllTags;
import com.tterrag.registrate.util.entry.RegistryEntry;
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.registrate.ChemicaRegistrate;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;


public class CBlocks {
    private static final ChemicaRegistrate REGISTRATE = (ChemicaRegistrate) Chemica.registrate().setCreativeTab(ChemicaCreativeTabs.CHEMICA_MAIN);

    // Load this class

    public static final RegistryEntry<Block> CURED_EPOXY_BLOCK = REGISTRATE.block("cured_epoxy_block", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Cured Epoxy Block")
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_ANTIMONY_ORE = REGISTRATE.block("deepslate_antimony_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Antimony Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/antimony"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_CHROMITE_ORE = REGISTRATE.block("deepslate_chromite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Chromite Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/chromite"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_COBALT_ORE = REGISTRATE.block("deepslate_cobalt_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Cobalt Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/cobalt"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_FLUORITE_ORE = REGISTRATE.block("deepslate_fluorite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Fluorite Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/fluorite"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_MOLYBDENUM_ORE = REGISTRATE.block("deepslate_molybdenum_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Molybdenum Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/molybdenum"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_PLATINUM_ORE = REGISTRATE.block("deepslate_platinum_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Platinum Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/platinum"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_VANADIUM_ORE = REGISTRATE.block("deepslate_vanadium_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Vanadium Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/vanadium"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_GRAPHITE_ORE = REGISTRATE.block("deepslate_graphite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Graphite Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/graphite"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_SILVER_ORE = REGISTRATE.block("deepslate_silver_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Silver Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/silver"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_TIN_ORE = REGISTRATE.block("deepslate_tin_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Tin Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/tin"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> TIN_ORE = REGISTRATE.block("tin_ore", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Tin Ore").tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/tin"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/stone"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_PHOSPHORUS_ORE = REGISTRATE.block("deepslate_phosphorus_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Phosphorus Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/phosphorus"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> PHOSPHORUS_ORE = REGISTRATE.block("phosphorus_ore", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Phosphorus Ore").tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/phosphorus"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/stone"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_WOLFRAMITE_ORE = REGISTRATE.block("deepslate_wolframite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Wolframite Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/tungsten"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_RUTILE_ORE = REGISTRATE.block("deepslate_rutile_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Rutile Ore")
            .tag(Tags.Blocks.ORES)
            .tag(AllTags.forgeBlockTag("ores/rutile"))
            .tag(AllTags.forgeBlockTag("ores_in_ground/deepslate"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_DIAMOND_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> PLATINUM_BLOCK = REGISTRATE.block("platinum_block", Block::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .lang("Platinum Block")
            // BLOCK TAGS
            .tag(Tags.Blocks.STORAGE_BLOCKS)
            .tag(AllTags.forgeBlockTag("storage_blocks/platinum"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_IRON_TOOL)
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> RAW_PLATINUM_BLOCK = REGISTRATE.block("raw_platinum_block", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Raw Platinum Block")
            // BLOCK TAGS
            .tag(Tags.Blocks.STORAGE_BLOCKS)
            .tag(AllTags.forgeBlockTag("storage_blocks/raw_platinum"))
            .tag(BlockTags.MINEABLE_WITH_PICKAXE)
            .tag(BlockTags.NEEDS_STONE_TOOL)
            .simpleItem()
            .register();

    public static void register() {
        Chemica.LOGGER.info("Registered blocks for Chemica");
    }
}
