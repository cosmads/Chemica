package io.github.cosmads.chemica.common.datagen;

import io.github.cosmads.chemica.registry.CBlocks;
import io.github.cosmads.chemica.registry.CItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ChemicaBlockLootTables extends BlockLootSubProvider {
    public ChemicaBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // Drops more than 1 item
        add(CBlocks.DEEPSLATE_TIN_ORE.get(),
                block -> createOreDrop(block, CItems.RAW_TIN.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 3))));
        add(CBlocks.TIN_ORE.get(),
                block -> createOreDrop(block, CItems.RAW_TIN.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1, 2))));

        add(CBlocks.DEEPSLATE_FLUORITE_ORE.get(),
                block -> createOreDrop(block, CItems.FLUORITE_DUST.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4))));

        add(CBlocks.DEEPSLATE_PHOSPHORUS_ORE.get(),
                block -> createOreDrop(block, CItems.PHOSPHORUS_DUST.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 4))));
        add(CBlocks.PHOSPHORUS_ORE.get(),
                block -> createOreDrop(block, CItems.PHOSPHORUS_DUST.get())
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(2, 3))));

        // Drops 1 item
        add(CBlocks.DEEPSLATE_WOLFRAMITE_ORE.get(),
                block -> createOreDrop(block, CItems.RAW_TUNGSTEN.get()));
        add(CBlocks.DEEPSLATE_ANTIMONY_ORE.get(),
                block -> createOreDrop(block, CItems.RAW_ANTIMONY.get()));
        add(CBlocks.DEEPSLATE_SILVER_ORE.get(),
                block -> createOreDrop(block, CItems.RAW_SILVER.get()));
        add(CBlocks.DEEPSLATE_CHROMITE_ORE.get(),
                block -> createOreDrop(block, CItems.RAW_CHROMITE.get()));
        add(CBlocks.DEEPSLATE_COBALT_ORE.get(),
                block -> createOreDrop(block, CItems.RAW_COBALT.get()));
        add(CBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                block -> createOreDrop(block, CItems.RAW_PLATINUM.get()));
        add(CBlocks.DEEPSLATE_VANADIUM_ORE.get(),
                block -> createOreDrop(block, CItems.RAW_VANADIUM.get()));
        add(CBlocks.DEEPSLATE_MOLYBDENUM_ORE.get(),
                block -> createOreDrop(block, CItems.RAW_MOLYBDENUM.get()));

        // Blocks that drop themselves
        dropSelf(CBlocks.CURED_EPOXY_BLOCK.get());
        dropSelf(CBlocks.PLATINUM_BLOCK.get());
        dropSelf(CBlocks.RAW_PLATINUM_BLOCK.get());
        dropSelf(CBlocks.DEEPSLATE_RUTILE_ORE.get());
        dropSelf(CBlocks.DEEPSLATE_GRAPHITE_ORE.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Set.of(
                CBlocks.DEEPSLATE_WOLFRAMITE_ORE.get(),
                CBlocks.DEEPSLATE_ANTIMONY_ORE.get(),
                CBlocks.DEEPSLATE_SILVER_ORE.get(),
                CBlocks.DEEPSLATE_CHROMITE_ORE.get(),
                CBlocks.DEEPSLATE_COBALT_ORE.get(),
                CBlocks.DEEPSLATE_PLATINUM_ORE.get(),
                CBlocks.DEEPSLATE_FLUORITE_ORE.get(),
                CBlocks.DEEPSLATE_PHOSPHORUS_ORE.get(),
                CBlocks.PHOSPHORUS_ORE.get(),
                CBlocks.DEEPSLATE_VANADIUM_ORE.get(),
                CBlocks.DEEPSLATE_MOLYBDENUM_ORE.get(),
                CBlocks.DEEPSLATE_TIN_ORE.get(),
                CBlocks.TIN_ORE.get(),
                CBlocks.CURED_EPOXY_BLOCK.get(),
                CBlocks.PLATINUM_BLOCK.get(),
                CBlocks.RAW_PLATINUM_BLOCK.get(),
                CBlocks.DEEPSLATE_RUTILE_ORE.get(),
                CBlocks.DEEPSLATE_GRAPHITE_ORE.get()
        );
    }
}