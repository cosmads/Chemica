package com.cosmads.chemica.common;

import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import com.simibubi.create.AllFluids;
import com.tterrag.registrate.builders.FluidBuilder;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.material.FluidState;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.fluids.FluidStack;
import net.neoforged.neoforge.fluids.FluidType;
import org.jetbrains.annotations.NotNull;
import org.joml.Vector3f;

import java.util.function.Consumer;

public class TransparentTintedFluidType extends AllFluids.TintedFluidType {
    private final int tintColor;
    private final ResourceLocation stillTexture;
    private final ResourceLocation flowingTexture;

    public TransparentTintedFluidType(FluidType.Properties properties, ResourceLocation stillTexture, ResourceLocation flowingTexture, int tintColor) {
        super(properties, stillTexture, flowingTexture);
        this.tintColor = tintColor;
        this.stillTexture = stillTexture;
        this.flowingTexture = flowingTexture;
    }

    public static FluidBuilder.FluidTypeFactory create(int tintColor) {
        return (p, s, f) -> new TransparentTintedFluidType(p, s, f, tintColor);
    }

    @Override
    public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
        consumer.accept(new IClientFluidTypeExtensions() {

            @Override
            public ResourceLocation getStillTexture() {
                return stillTexture;
            }

            @Override
            public ResourceLocation getFlowingTexture() {
                return flowingTexture;
            }

            @Override
            public int getTintColor(FluidStack stack) {
                return TransparentTintedFluidType.this.getTintColor(stack);
            }

            @Override
            public int getTintColor(FluidState state, BlockAndTintGetter getter, BlockPos pos) {
                return TransparentTintedFluidType.this.getTintColor(state, getter, pos);
            }

            @Override
            public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                Vector3f customFogColor = TransparentTintedFluidType.this.getCustomFogColor();
                return customFogColor == null ? fluidFogColor : customFogColor;
            }

            @Override
            public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
                float modifier = TransparentTintedFluidType.this.getFogDistanceModifier();
                float baseWaterFog = 96.0f;
                if (modifier != 1f) {
                    RenderSystem.setShaderFogShape(FogShape.CYLINDER);
                    RenderSystem.setShaderFogStart(-8);
                    RenderSystem.setShaderFogEnd(baseWaterFog * modifier);
                }
            }

        });

    }

    protected int getTintColor(FluidStack stack) {
        return tintColor;
    }

    protected int getTintColor(FluidState state, BlockAndTintGetter getter, BlockPos pos) {
        return tintColor;
    }

    protected Vector3f getCustomFogColor() {
        return null;
    }

    protected float getFogDistanceModifier() {
        return 1f;
    }
}
