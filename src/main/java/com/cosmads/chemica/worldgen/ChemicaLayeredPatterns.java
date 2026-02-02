package com.cosmads.chemica.worldgen;

import com.cosmads.chemica.registry.ChemicaBlocks;
import com.simibubi.create.infrastructure.worldgen.LayerPattern;
import com.tterrag.registrate.util.nullness.NonNullSupplier;
import net.minecraft.world.level.block.Blocks;

public class ChemicaLayeredPatterns {

    public static final NonNullSupplier<LayerPattern>
            FERVORITE = () -> LayerPattern.builder()
            .layer(l -> l.weight(2)
                    .passiveBlock())
            .layer(l -> l.weight(4)
                    .block(ChemicaBlocks.FERVORITE.get())
                    .size(1, 2))
            .layer(l -> l.weight(3)
                    .block(Blocks.TUFF)
                    .block(Blocks.CALCITE)
                    .size(1, 3))
            .layer(l -> l.weight(1)
                    .block(Blocks.DRIPSTONE_BLOCK))
            .layer(l -> l.weight(2)
                    .block(Blocks.DEEPSLATE)
                    .block(Blocks.SMOOTH_BASALT))
            .build();

    public static final NonNullSupplier<LayerPattern>
            ZELOSITE = () -> LayerPattern.builder()
            .inNether()
            .layer(l -> l.weight(2)
                    .passiveBlock())
            .layer(l -> l.weight(4)
                    .block(ChemicaBlocks.ZELOSITE.get())
                    .size(1, 2))
            .layer(l -> l.weight(3)
                    .block(Blocks.BLACKSTONE)
                    .block(Blocks.NETHERRACK)
                    .size(1, 3))
            .layer(l -> l.weight(1)
                    .block(Blocks.MAGMA_BLOCK))
            .layer(l -> l.weight(2)
                    .block(Blocks.BASALT)
                    .block(Blocks.SMOOTH_BASALT))
            .build();
}