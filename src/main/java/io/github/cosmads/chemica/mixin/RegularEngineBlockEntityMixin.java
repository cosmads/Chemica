package io.github.cosmads.chemica.mixin;

import com.drmangotea.tfmg.content.engines.types.regular_engine.RegularEngineBlockEntity;
import com.drmangotea.tfmg.registry.TFMGItems;
import io.github.cosmads.chemica.registry.CItems;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(RegularEngineBlockEntity.class)
public class RegularEngineBlockEntityMixin {

    @Redirect(
            method = "isCorrectCylinder",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z",
                    ordinal = 0  // Target the first call to ItemStack.is()
            )
    )
    private boolean chemica$addChemicaCylinders(ItemStack stack, net.minecraft.world.item.Item targetItem) {
        // Check if it's the original TFMG item OR one of our Chemica cylinders
        boolean isOriginal = stack.is(targetItem);

        if (!isOriginal) {
            // Check if it's one of our Chemica cylinders
            isOriginal = stack.is(CItems.HIGH_OCTANE_CYLINDER.get()) ||
                    stack.is(CItems.HYDROGEN_CYLINDER.get()) ||
                    stack.is(CItems.ETHANOL_CYLINDER.get()) ||
                    stack.is(CItems.BIODIESEL_CYLINDER.get());
        }

        return isOriginal;
    }
}