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

    public static final RegistryEntry<Block> DEEPSLATE_PLATINUM_ORE = REGISTRATE.block("deepslate_platinum_ore", Block::new)
            .initialProperties(() -> Blocks.DEEPSLATE)
            .lang("Deepslate Platinum Ore")
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
