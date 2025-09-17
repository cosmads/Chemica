package io.github.cosmads.chemica.registry;

import com.drmangotea.tfmg.registry.TFMGItems;
import com.simibubi.create.AllCreativeModeTabs;
import com.tterrag.registrate.util.entry.RegistryEntry;
import io.github.cosmads.chemica.Chemica;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ChemicaCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS;
    public static final RegistryObject<CreativeModeTab> CHEMICA_MAIN;

    public static void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == CHEMICA_MAIN.get()) {
            event.acceptAll(customAdditions());
        }
    }

    public static void register(IEventBus modEventBus) {
        CREATIVE_MODE_TABS.register(modEventBus);
    }

    public static List<RegistryEntry<? extends Item>> blacklist() {
        List<RegistryEntry<? extends Item>> list = new ArrayList<>();
        return list;
    }

    public static List<ItemStack> customAdditions() {
        List<ItemStack> list = new ArrayList<>();
        list.add(CItems.ASH.get().getDefaultInstance());
        list.add(CItems.CAUSTIC_SODA_DUST.get().getDefaultInstance());
        list.add(CItems.COAL_DUST.get().getDefaultInstance());
        list.add(CItems.CURED_EPOXY_SHEET.get().getDefaultInstance());
        list.add(CItems.PLATINUM_DUST.get().getDefaultInstance());
        list.add(CItems.PLATINUM_INGOT.get().getDefaultInstance());
        list.add(CItems.PLATINUM_NUGGET.get().getDefaultInstance());
        list.add(CItems.RAW_PLATINUM.get().getDefaultInstance());
        list.add(CBlocks.CURED_EPOXY_BLOCK.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_PLATINUM_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.PLATINUM_BLOCK.get().asItem().getDefaultInstance());
        list.add(CBlocks.RAW_PLATINUM_BLOCK.get().asItem().getDefaultInstance());

        // Liquid buckets
        list.add(new ItemStack(CFluids.ACETONE_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.AMINE_CATALYST_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.AROMATIC_MIX_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.BENZENE_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.BRINE_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.CAUSTIC_SODA_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.CUMENE_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.EPOXY_PRECURSOR_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.EPOXY_RESIN_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.HIGH_OCTANE_GASOLINE_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.HYDROCHLORIC_ACID_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.PLATINUM_CATALYST_CARRIER_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.TOLUENE_BUCKET.get(), 1));
        list.add(new ItemStack(CFluids.XYLENE_BUCKET.get(), 1));

        // Gas buckets
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("ammonia_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("chlorine_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("light_hydrocarbons_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("nitrogen_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("reformate_bucket")), 1));

        return list;
    }

    static {
        CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Chemica.ID);
        CHEMICA_MAIN = CREATIVE_MODE_TABS.register("chemica_main", () -> CreativeModeTab.builder()
                .withTabsBefore(AllCreativeModeTabs.BASE_CREATIVE_TAB.getId())
                .title(Component.translatable("creative_tab.chemica_main"))
                .icon(() -> TFMGItems.CENTRIFUGE.get().asItem().getDefaultInstance()).build());
    }
}