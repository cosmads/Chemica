package com.cosmads.chemica.common;

import com.simibubi.create.AllFluids;
import com.tterrag.registrate.builders.FluidBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.FluidType;

public class TransparentTintedFluidType extends AllFluids.TintedFluidType {
    private final int tintColor;

    public TransparentTintedFluidType(FluidType.Properties properties, ResourceLocation stillTexture,
                                      ResourceLocation flowingTexture, int tintColor) {
        super(properties, stillTexture, flowingTexture);
        this.tintColor = tintColor;
    }

    @Override
    protected int getTintColor(FluidStack stack) {
        return tintColor;
    }

    @Override
    public int getTintColor(FluidState state, BlockAndTintGetter world, BlockPos pos) {
        return tintColor;
    }

    public static FluidBuilder.FluidTypeFactory create(int tintColor) {
        return (properties, stillTexture, flowingTexture) ->
                new TransparentTintedFluidType(properties, stillTexture, flowingTexture, tintColor);
    }
}