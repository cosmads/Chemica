package io.github.cosmads.chemica.registry;

import com.tterrag.registrate.util.entry.RegistryEntry;
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.registrate.ChemicaRegistrate;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;


public class CBlocks {
    private static final ChemicaRegistrate REGISTRATE = (ChemicaRegistrate) Chemica.registrate().setCreativeTab(ChemicaCreativeTabs.CHEMICA_MAIN);

    // Load this class

    public static final RegistryEntry<Block> CURED_EPOXY_BLOCK = REGISTRATE.block("cured_epoxy_block", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Cured Epoxy Block")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_ANTIMONY_ORE = REGISTRATE.block("deepslate_antimony_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Antimony Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_CHROMITE_ORE = REGISTRATE.block("deepslate_chromite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Chromite Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_COBALT_ORE = REGISTRATE.block("deepslate_cobalt_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Cobalt Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_FLUORITE_ORE = REGISTRATE.block("deepslate_fluorite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Fluorite Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_MOLYBDENUM_ORE = REGISTRATE.block("deepslate_molybdenum_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Molybdenum Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_PLATINUM_ORE = REGISTRATE.block("deepslate_platinum_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Platinum Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_VANADIUM_ORE = REGISTRATE.block("deepslate_vanadium_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Vanadium Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_GRAPHITE_ORE = REGISTRATE.block("deepslate_graphite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Graphite Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_SILVER_ORE = REGISTRATE.block("deepslate_silver_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Silver Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_TIN_ORE = REGISTRATE.block("deepslate_tin_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Tin Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> TIN_ORE = REGISTRATE.block("tin_ore", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Tin Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_PHOSPHORUS_ORE = REGISTRATE.block("deepslate_phosphorus_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Phosphorus Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> PHOSPHORUS_ORE = REGISTRATE.block("phosphorus_ore", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Phosphorus Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_WOLFRAMITE_ORE = REGISTRATE.block("deepslate_wolframite_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Wolframite Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> DEEPSLATE_RUTILE_ORE = REGISTRATE.block("deepslate_rutile_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Rutile Ore")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> PLATINUM_BLOCK = REGISTRATE.block("platinum_block", Block::new)
            .initialProperties(() -> Blocks.IRON_BLOCK)
            .lang("Platinum Block")
            .simpleItem()
            .register();

    public static final RegistryEntry<Block> RAW_PLATINUM_BLOCK = REGISTRATE.block("raw_platinum_block", Block::new)
            .initialProperties(() -> Blocks.STONE)
            .lang("Raw Platinum Block")
            .simpleItem()
            .register();

    public static void register() {
        Chemica.LOGGER.info("Registered blocks for Chemica");
    }
}
