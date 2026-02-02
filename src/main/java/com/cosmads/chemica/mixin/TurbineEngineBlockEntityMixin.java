package com.cosmads.chemica.mixin;

import com.cosmads.chemica.registry.ChemicaItems;
import com.drmangotea.tfmg.content.engines.types.turbine_engine.TurbineEngineBlockEntity;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(TurbineEngineBlockEntity.class)
public class TurbineEngineBlockEntityMixin {

    @Inject(
            method = "isCorrectCylinder(Lnet/minecraft/world/item/ItemStack;)Z",
            at = @At("HEAD"),
            cancellable = true,
            remap = false
    )
    public void chemica$isCorrectCylinder(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
        // Allow Hydrogen Turbine Blade from Chemica
        if (itemStack.is(ChemicaItems.HYDROGEN_TURBINE_BLADE.get())) {
            cir.setReturnValue(true);
        }
    }
}