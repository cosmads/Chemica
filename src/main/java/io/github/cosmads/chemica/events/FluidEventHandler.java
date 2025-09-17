package io.github.cosmads.chemica.events;

import io.github.cosmads.chemica.Chemica;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = "chemica", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class FluidEventHandler {

    @SubscribeEvent
    public static void onBucketUse(PlayerInteractEvent.RightClickItem event) {
        ItemStack stack = event.getItemStack();

        // Check if holding any of your gas buckets
        if (isGasBucket(stack)) {
            // Only allow bucket use in creative mode
            boolean isCreativeMode = event.getEntity().isCreative();

            if (!isCreativeMode) {
                event.setCanceled(true);
                event.setCancellationResult(InteractionResult.FAIL);
            }
        }
    }

    private static boolean isGasBucket(ItemStack stack) {
        return stack.getItem() == ForgeRegistries.ITEMS.getValue(Chemica.asResource("ammonia_bucket")) ||
                stack.getItem() == ForgeRegistries.ITEMS.getValue(Chemica.asResource("chlorine_bucket")) ||
                stack.getItem() == ForgeRegistries.ITEMS.getValue(Chemica.asResource("light_hydrocarbons_bucket")) ||
                stack.getItem() == ForgeRegistries.ITEMS.getValue(Chemica.asResource("nitrogen_bucket")) ||
                stack.getItem() == ForgeRegistries.ITEMS.getValue(Chemica.asResource("reformate_bucket"));
    }
}