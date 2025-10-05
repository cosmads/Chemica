package io.github.cosmads.chemica.registry;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.content.processing.sequenced.SequencedAssemblyItem;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import io.github.cosmads.chemica.Chemica;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
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
            for(RegistryEntry<Item> item : Chemica.registrate().getAll(Registries.ITEM)) {
                if (CreateRegistrate.isInCreativeTab(item, CHEMICA_MAIN) && !blacklist().contains(item) && !(item.get() instanceof SequencedAssemblyItem)) {
                    event.accept(item);
                }
            }
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
        List<ItemStack> list = new ArrayList();
        // High Octane Engine Cylinder
        CompoundTag highOctaneTag = new CompoundTag();
        highOctaneTag.putString("high_octane", "chemica:high_octane_gasoline");
        CompoundTag highOctaneTagName = new CompoundTag();
        highOctaneTagName.putString("high_octane", "High Octane Gasoline");
        ItemStack gasoline = CItems.HIGH_OCTANE_CYLINDER.asStack();
        gasoline.getOrCreateTag().put("Fuels", highOctaneTag);
        gasoline.getOrCreateTag().put("FuelNames", highOctaneTagName);
        list.add(gasoline);
        // Hydrogen Engine Cylinder
        CompoundTag hydrogenTag = new CompoundTag();
        hydrogenTag.putString("hydrogen", "tfmg:hydrogen");
        CompoundTag hydrogenTagName = new CompoundTag();
        hydrogenTagName.putString("hydrogen", "Hydrogen");
        ItemStack hydrogen = CItems.HYDROGEN_CYLINDER.asStack();
        hydrogen.getOrCreateTag().put("Fuels", hydrogenTag);
        hydrogen.getOrCreateTag().put("FuelNames", hydrogenTagName);
        list.add(hydrogen);
        // Ethanol Engine Cylinder
        CompoundTag ethanolTag = new CompoundTag();
        ethanolTag.putString("ethanol", "chemica:ethanol");
        CompoundTag ethanolTagName = new CompoundTag();
        ethanolTagName.putString("ethanol", "Ethanol");
        ItemStack ethanol = CItems.ETHANOL_CYLINDER.asStack();
        ethanol.getOrCreateTag().put("Fuels", ethanolTag);
        ethanol.getOrCreateTag().put("FuelNames", ethanolTagName);
        list.add(ethanol);
        // Biodiesel Engine Cylinder
        CompoundTag biodieselTag = new CompoundTag();
        biodieselTag.putString("biodiesel", "chemica:biodiesel");
        CompoundTag biodieselTagName = new CompoundTag();
        biodieselTagName.putString("biodiesel", "Biodiesel");
        ItemStack biodiesel = CItems.BIODIESEL_CYLINDER.asStack();
        biodiesel.getOrCreateTag().put("Fuels", biodieselTag);
        biodiesel.getOrCreateTag().put("FuelNames", biodieselTagName);
        list.add(biodiesel);

        // Gas buckets
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("ammonia_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("argon_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("butene_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("carbon_monoxide_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("chlorine_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("epichlorohydrin_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("ethane_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("fluorine_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("helium_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("light_hydrocarbons_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("methane_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("nitrogen_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("nitrogen_dioxide_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("nitrous_oxide_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("oxygen_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("propene_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("reformate_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("steam_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("tungsten_hexafluoride_bucket")), 1));
        list.add(new ItemStack(ForgeRegistries.ITEMS.getValue(Chemica.asResource("vinyl_chloride_monomer_bucket")), 1));

        return list;
    }

    static {
        CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Chemica.ID);
        CHEMICA_MAIN = CREATIVE_MODE_TABS.register("chemica_main", () -> CreativeModeTab.builder()
                .withTabsBefore(AllCreativeModeTabs.BASE_CREATIVE_TAB.getId())
                .title(Component.translatable("Chemica"))
                .icon(() -> ForgeRegistries.ITEMS.getValue(Chemica.asResource("chlorine_bucket")).getDefaultInstance())
                .build());
    }
}