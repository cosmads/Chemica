package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import com.mojang.blaze3d.systems.RenderSystem;
import net.createmod.catnip.gui.UIRenderHelper;
import net.createmod.catnip.gui.element.ScreenElement;
import net.createmod.catnip.theme.Color;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

public enum ChemicaGuiTextures implements ScreenElement {

    PLATINUM_ELECTRODE("chemical_vat", 202, 0, 8, 29);

    public final ResourceLocation location;
    public final int width, height;
    public final int startX, startY;

    private ChemicaGuiTextures(String location, int width, int height) {
        this(location, 0, 0, width, height);
    }

    private ChemicaGuiTextures(int startX, int startY) {
        this("icons", startX * 16, startY * 16, 16, 16);
    }

    private ChemicaGuiTextures(String location, int startX, int startY, int width, int height) {
        this(Chemica.MOD_ID, location, startX, startY, width, height);
    }

    private ChemicaGuiTextures(String namespace, String location, int startX, int startY, int width, int height) {
        this.location = ResourceLocation.fromNamespaceAndPath(namespace, "textures/gui/" + location + ".png");
        this.width = width;
        this.height = height;
        this.startX = startX;
        this.startY = startY;
    }

    @OnlyIn(Dist.CLIENT)
    public void bind() {
        RenderSystem.setShaderTexture(0, location);
    }

    @OnlyIn(Dist.CLIENT)
    public void render(GuiGraphics graphics, int x, int y) {
        graphics.blit(location, x, y, startX, startY, width, height);
    }

    @OnlyIn(Dist.CLIENT)
    public void render(GuiGraphics graphics, int x, int y, Color c) {
        bind();
        UIRenderHelper.drawColoredTexture(graphics, c, x, y, startX, startY, width, height);
    }
}