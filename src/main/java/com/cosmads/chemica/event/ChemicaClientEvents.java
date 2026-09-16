package com.cosmads.chemica.event;

import com.cosmads.chemica.registry.ChemicaGuiTextures;
import com.cosmads.chemica.registry.ChemicaVatOperations;
import com.drmangotea.tfmg.content.machinery.vat.base.registry.operations.VatCategoryEvent;
import com.drmangotea.tfmg.registry.TFMGGuiTextures;
import net.createmod.ponder.api.PonderPalette;
import net.minecraft.network.chat.Component;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(Dist.CLIENT)
public class ChemicaClientEvents {

    @SubscribeEvent
    public static void vatOperations(VatCategoryEvent event) {
        event.addDrawableOperation(ChemicaVatOperations.PLATINUM_ELECTRODE.get(), (recipe, graphics, mouseX, mouseY) -> {
            TFMGGuiTextures.VAT_MACHINE.render(graphics, 11, 0);
            TFMGGuiTextures.VAT_MACHINE.render(graphics, 75, 0);
            ChemicaGuiTextures.PLATINUM_ELECTRODE.render(graphics, 19, 32);
            ChemicaGuiTextures.PLATINUM_ELECTRODE.render(graphics, 83, 32);
        });
        event.addOperationTooltip(ChemicaVatOperations.PLATINUM_ELECTRODE.get(), (recipe, tooltip, mouseX, mouseY) -> {
            boolean xCheck = mouseX > 11 && mouseX < 35 || mouseX > 75 && mouseX < 99;
            if (mouseY > -3 && mouseY < 60 && xCheck) {
                tooltip.accept(Component.translatable("chemica.recipe.vat.platinum_electrode")
                        .withColor(PonderPalette.INPUT.getColor()));
            }
        });
    }
}
