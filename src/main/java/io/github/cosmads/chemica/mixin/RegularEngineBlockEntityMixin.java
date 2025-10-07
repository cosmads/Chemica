package io.github.cosmads.chemica.mixin;

import com.drmangotea.tfmg.content.engines.types.regular_engine.RegularEngineBlockEntity;
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
                    target = "Lnet/minecraft/world/item/ItemStack;is(Lnet/minecraft/world/item/Item;)Z"
            ),
            require = 0 // Make it optional - won't crash if it fails
    )
    private boolean chemica$addChemicaCylinders(ItemStack stack, net.minecraft.world.item.Item item) {
        try {
            // First perform the original check
            boolean originalResult = stack.is(item);

            // If original check passes, or if it's one of our Chemica cylinders, return true
            return originalResult ||
                    stack.is(CItems.HIGH_OCTANE_CYLINDER.get()) ||
                    stack.is(CItems.HYDROGEN_CYLINDER.get()) ||
                    stack.is(CItems.ETHANOL_CYLINDER.get()) ||
                    stack.is(CItems.BIODIESEL_CYLINDER.get());
        } catch (Exception e) {
            // If anything goes wrong, fall back to original behavior
            return stack.is(item);
        }
    }
}