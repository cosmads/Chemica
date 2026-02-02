package com.cosmads.chemica.mixin;

import com.drmangotea.tfmg.recipes.jei.ChemicalVatCategory;
import com.drmangotea.tfmg.registry.TFMGGuiTextures;
import com.cosmads.chemica.registry.ChemicaGuiTextures;
import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(value = ChemicalVatCategory.class, remap = false)
public class ChemicalVatCategoryMixin {

    @Inject(method = "drawSprites", at = @At("TAIL"), remap = false)
    private void chemica$addPlatinumElectrode(List<String> machines, GuiGraphics graphics, CallbackInfo ci) {
        if (machines.contains("chemica:electrode")) {
            // Render the vat machine background slots
            TFMGGuiTextures.VAT_MACHINE.render(graphics, 55 - 12 - 32, 0);
            TFMGGuiTextures.VAT_MACHINE.render(graphics, 55 - 12 + 32, 0);

            // Render platinum electrode sprites at correct positions
            ChemicaGuiTextures.PLATINUM_ELECTRODE.render(graphics, 55 - 4 - 32, 32);
            ChemicaGuiTextures.PLATINUM_ELECTRODE.render(graphics, 55 - 4 + 32, 32);
        }
    }
}