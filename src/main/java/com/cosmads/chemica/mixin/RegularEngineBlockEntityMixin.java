package com.cosmads.chemica.mixin;

import com.cosmads.chemica.registry.ChemicaItems;
import com.drmangotea.tfmg.content.engines.types.regular_engine.RegularEngineBlockEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(RegularEngineBlockEntity.class)
public class RegularEngineBlockEntityMixin {

    @Inject(
            method = "isCorrectCylinder(Lnet/minecraft/world/item/ItemStack;)Z",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    public void chemica$isCorrectCylinder(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
        // Allow Chemica cylinders
        if (itemStack.is(ChemicaItems.BIODIESEL_CYLINDER.get()) ||
                itemStack.is(ChemicaItems.ETHANOL_CYLINDER.get()) ||
                itemStack.is(ChemicaItems.HIGH_OCTANE_CYLINDER.get())) {
            cir.setReturnValue(true);
        }
    }
}