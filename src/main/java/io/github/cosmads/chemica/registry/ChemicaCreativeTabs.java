package io.github.cosmads.chemica.registry;

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
        // Items and blocks
        list.add(CItems.ADVANCED_CIRCUIT_BOARD.get().getDefaultInstance());
        list.add(CItems.AMMONIUM_PERSULFATE.get().getDefaultInstance());
        list.add(CItems.ANTIMONY_DUST.get().getDefaultInstance());
        list.add(CItems.ANTIMONY_INGOT.get().getDefaultInstance());
        list.add(CItems.ANTIMONY_NUGGET.get().getDefaultInstance());
        list.add(CItems.ARSENIC_DUST.get().getDefaultInstance());
        list.add(CItems.ASH.get().getDefaultInstance());
        list.add(CItems.CARBON_FIBER_COMPOSITE_SHEET.get().getDefaultInstance());
        list.add(CItems.CARBON_FIBER_STRANDS.get().getDefaultInstance());
        list.add(CItems.CAUSTIC_SODA_DUST.get().getDefaultInstance());
        list.add(CItems.CHROMIUM_DUST.get().getDefaultInstance());
        list.add(CItems.CHROMIUM_INGOT.get().getDefaultInstance());
        list.add(CItems.CHROMIUM_NUGGET.get().getDefaultInstance());
        list.add(CItems.CHARCOAL_DUST.get().getDefaultInstance());
        list.add(CItems.COAL_DUST.get().getDefaultInstance());
        list.add(CItems.COIL.get().getDefaultInstance());
        list.add(CItems.CONDUCTIVE_PASTE.get().getDefaultInstance());
        list.add(CItems.CONSTANTAN_DUST.get().getDefaultInstance());
        list.add(CItems.COPPER_BOILER.get().getDefaultInstance());
        list.add(CItems.COPPER_CATALYST.get().getDefaultInstance());
        list.add(CItems.COPPER_DUST.get().getDefaultInstance());
        list.add(CItems.COBALT_CATALYST.get().getDefaultInstance());
        list.add(CItems.COBALT_DUST.get().getDefaultInstance());
        list.add(CItems.COBALT_INGOT.get().getDefaultInstance());
        list.add(CItems.COBALT_NUGGET.get().getDefaultInstance());
        list.add(CItems.CRUSHED_RAW_ANTIMONY.get().getDefaultInstance());
        list.add(CItems.CRUSHED_RAW_CHROMIUM.get().getDefaultInstance());
        list.add(CItems.CRUSHED_RAW_COBALT.get().getDefaultInstance());
        list.add(CItems.CRUSHED_GRAPHITE.get().getDefaultInstance());
        list.add(CItems.CRUSHED_RAW_VANADIUM.get().getDefaultInstance());
        list.add(CBlocks.CURED_EPOXY_BLOCK.get().asItem().getDefaultInstance());
        list.add(CItems.CURED_EPOXY_SHEET.get().getDefaultInstance());
        list.add(CBlocks.TIN_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_ANTIMONY_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_CHROMITE_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_COBALT_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_FLUORITE_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_GRAPHITE_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_MOLYBDENUM_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.PHOSPHORUS_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_PHOSPHORUS_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_PLATINUM_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_RUTILE_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_SILVER_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_TIN_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_VANADIUM_ORE.get().asItem().getDefaultInstance());
        list.add(CBlocks.DEEPSLATE_WOLFRAMITE_ORE.get().asItem().getDefaultInstance());
        list.add(CItems.EMPTY_EPOXY_CIRCUIT_BOARD.get().getDefaultInstance());
        list.add(CItems.EMPTY_PVC_CIRCUIT_BOARD.get().getDefaultInstance());
        list.add(CItems.COATED_EPOXY_CIRCUIT_BOARD.get().getDefaultInstance());
        list.add(CItems.COATED_PVC_CIRCUIT_BOARD.get().getDefaultInstance());
        list.add(CItems.ETCHED_EPOXY_CIRCUIT_BOARD.get().getDefaultInstance());
        list.add(CItems.ETCHED_PVC_CIRCUIT_BOARD.get().getDefaultInstance());
        list.add(CItems.ELECTRONIC_CIRCUIT.get().getDefaultInstance());
        list.add(CItems.ELECTROCHEMICALLY_EXFOLIATED_GRAPHENE.get().getDefaultInstance());
        list.add(CItems.ELECTRUM_GRIT.get().getDefaultInstance());
        list.add(CItems.FLUORITE_DUST.get().getDefaultInstance());
        list.add(CItems.GLASS_VIAL.get().getDefaultInstance());
        list.add(CItems.GRADUATED_CYLINDER.get().getDefaultInstance());
        list.add(CItems.GOLD_DUST.get().getDefaultInstance());
        list.add(CItems.GRAPHITE_INGOT.get().getDefaultInstance());
        list.add(CItems.GRAPHITE_SHEET.get().getDefaultInstance());
        list.add(CItems.HEAT_CONDUCTOR.get().getDefaultInstance());
        list.add(CItems.IRIDIUM_DUST.get().getDefaultInstance());
        list.add(CItems.IRIDIUM_INGOT.get().getDefaultInstance());
        list.add(CItems.IRIDIUM_NUGGET.get().getDefaultInstance());
        list.add(CItems.IRIDIUM_SHEET.get().getDefaultInstance());
        list.add(CItems.IRON_CATALYST.get().getDefaultInstance());
        list.add(CItems.IRON_DUST.get().getDefaultInstance());
        list.add(CItems.MAGNESIUM_DUST.get().getDefaultInstance());
        list.add(CItems.MAGNESIUM_INGOT.get().getDefaultInstance());
        list.add(CItems.MAGNESIUM_NUGGET.get().getDefaultInstance());
        list.add(CItems.MAGNESIUM_SHEET.get().getDefaultInstance());
        list.add(CItems.MOLYBDENUM_INGOT.get().getDefaultInstance());
        list.add(CItems.MOLYBDENUM_NUGGET.get().getDefaultInstance());
        list.add(CItems.NICKEL_CATALYST.get().getDefaultInstance());
        list.add(CItems.NICKEL_DUST.get().getDefaultInstance());
        list.add(CItems.NYLON_INGOT.get().getDefaultInstance());
        list.add(CItems.NYLON_SALT.get().getDefaultInstance());
        list.add(CItems.NYLON_SALT_CRYSTALS.get().getDefaultInstance());
        list.add(CItems.PAN_FIBERS.get().getDefaultInstance());
        list.add(CItems.PHOSPHORUS_DUST.get().getDefaultInstance());
        list.add(CItems.PETRI_DISH.get().getDefaultInstance());
        list.add(CItems.PLATINUM_ELECTRODE.get().getDefaultInstance());
        list.add(CBlocks.PLATINUM_BLOCK.get().asItem().getDefaultInstance());
        list.add(CItems.PLATINUM_DUST.get().getDefaultInstance());
        list.add(CItems.PLATINUM_INGOT.get().getDefaultInstance());
        list.add(CItems.PLATINUM_NUGGET.get().getDefaultInstance());
        list.add(CItems.POLYETHYLENE_SHEET.get().getDefaultInstance());
        list.add(CItems.POLYTETRAFLUOROETHYLENE_SHEET.get().getDefaultInstance());
        list.add(CItems.POLYVINYL_CHLORIDE_SHEET.get().getDefaultInstance());
        list.add(CItems.QUARTZ_DUST.get().getDefaultInstance());
        list.add(CItems.RAW_ANTIMONY.get().getDefaultInstance());
        list.add(CItems.RAW_CHROMITE.get().getDefaultInstance());
        list.add(CItems.RAW_COBALT.get().getDefaultInstance());
        list.add(CItems.RAW_MOLYBDENUM.get().getDefaultInstance());
        list.add(CItems.RAW_PLATINUM.get().getDefaultInstance());
        list.add(CBlocks.RAW_PLATINUM_BLOCK.get().asItem().getDefaultInstance());
        list.add(CItems.RAW_SILVER.get().getDefaultInstance());
        list.add(CItems.RAW_TIN.get().getDefaultInstance());
        list.add(CItems.RAW_TUNGSTEN.get().getDefaultInstance());
        list.add(CItems.RAW_VANADIUM.get().getDefaultInstance());
        list.add(CItems.REINFORCED_IRIDIUM_PLATE.get().getDefaultInstance());
        list.add(CItems.RUBBER_STRIP.get().getDefaultInstance());
        list.add(CItems.HIGH_GRADE_RUTILE_CRYSTAL.get().getDefaultInstance());
        list.add(CItems.MEDIUM_GRADE_RUTILE_CRYSTAL.get().getDefaultInstance());
        list.add(CItems.RUTILE_CRYSTAL.get().getDefaultInstance());
        list.add(CItems.RUTILE_DUST.get().getDefaultInstance());
        list.add(CItems.SALT.get().getDefaultInstance());
        list.add(CItems.SILICON_DUST.get().getDefaultInstance());
        list.add(CItems.SILVER_DUST.get().getDefaultInstance());
        list.add(CItems.SILVER_INGOT.get().getDefaultInstance());
        list.add(CItems.SILVER_NUGGET.get().getDefaultInstance());
        list.add(CItems.SILVER_SHEET.get().getDefaultInstance());
        list.add(CItems.SODA_ASH.get().getDefaultInstance());
        list.add(CItems.SODIUM_BISULFATE_DUST.get().getDefaultInstance());
        list.add(CItems.SODIUM_DUST.get().getDefaultInstance());
        list.add(CItems.SODIUM_PERSULFATE.get().getDefaultInstance());
        list.add(CItems.STABILIZED_FIBERS.get().getDefaultInstance());
        list.add(CItems.STEEL_BASED_TOUGH_ALLOY.get().getDefaultInstance());
        list.add(CItems.HEAT_RESISTANT_TOUGH_ALLOY.get().getDefaultInstance());
        list.add(CItems.ADVANCED_COMPOSITE_ALLOY.get().getDefaultInstance());
        list.add(CItems.LIGHTWEIGHT_TOUGH_ALLOY.get().getDefaultInstance());
        list.add(CItems.TANTALUM_DUST.get().getDefaultInstance());
        list.add(CItems.TANTALUM_INGOT.get().getDefaultInstance());
        list.add(CItems.TANTALUM_NUGGET.get().getDefaultInstance());
        list.add(CItems.TANTALUM_SHEET.get().getDefaultInstance());
        list.add(CItems.TANTALUM_CAPACITOR_ITEM.get().getDefaultInstance());
        list.add(CItems.TIN_DUST.get().getDefaultInstance());
        list.add(CItems.TIN_INGOT.get().getDefaultInstance());
        list.add(CItems.TIN_NUGGET.get().getDefaultInstance());
        list.add(CItems.TIN_SHEET.get().getDefaultInstance());
        list.add(CItems.TITANIUM_DUST.get().getDefaultInstance());
        list.add(CItems.TITANIUM_INGOT.get().getDefaultInstance());
        list.add(CItems.TITANIUM_NUGGET.get().getDefaultInstance());
        list.add(CItems.TITANIUM_SHEET.get().getDefaultInstance());
        list.add(CItems.TUNGSTEN_DUST.get().getDefaultInstance());
        list.add(CItems.TUNGSTEN_INGOT.get().getDefaultInstance());
        list.add(CItems.TUNGSTEN_NUGGET.get().getDefaultInstance());
        list.add(CItems.TUNGSTEN_CARBIDE_DUST.get().getDefaultInstance());
        list.add(CItems.TUNGSTEN_CARBIDE_INGOT.get().getDefaultInstance());
        list.add(CItems.VANADIUM_CATALYST.get().getDefaultInstance());
        list.add(CItems.VANADIUM_DUST.get().getDefaultInstance());
        list.add(CItems.VANADIUM_INGOT.get().getDefaultInstance());
        list.add(CItems.VANADIUM_NUGGET.get().getDefaultInstance());
        list.add(CItems.YEAST.get().getDefaultInstance());
        list.add(CItems.ZINC_DUST.get().getDefaultInstance());

        // Liquid buckets
        list.add(CFluids.ACETONE.get().getBucket().getDefaultInstance());
        list.add(CFluids.ACETONITRILE.get().getBucket().getDefaultInstance());
        list.add(CFluids.ADIPIC_ACID_SOLUTION.get().getBucket().getDefaultInstance());
        list.add(CFluids.AMINE_CATALYST.get().getBucket().getDefaultInstance());
        list.add(CFluids.AROMATIC_MIX.get().getBucket().getDefaultInstance());
        list.add(CFluids.BENZENE.get().getBucket().getDefaultInstance());
        list.add(CFluids.BIODIESEL.get().getBucket().getDefaultInstance());
        list.add(CFluids.BRINE.get().getBucket().getDefaultInstance());
        list.add(CFluids.CAUSTIC_SODA.get().getBucket().getDefaultInstance());
        list.add(CFluids.CHROMIC_ACID.get().getBucket().getDefaultInstance());
        list.add(CFluids.CUMENE.get().getBucket().getDefaultInstance());
        list.add(CFluids.CYCLOHEXANE.get().getBucket().getDefaultInstance());
        list.add(CFluids.CYCLOHEXANOL.get().getBucket().getDefaultInstance());
        list.add(CFluids.DISTILLED_WATER.get().getBucket().getDefaultInstance());
        list.add(CFluids.ETHYLBENZENE.get().getBucket().getDefaultInstance());
        list.add(CFluids.ETHYL_TERT_BUTYL_ETHER.get().getBucket().getDefaultInstance());
        list.add(CFluids.EPOXY_PRECURSOR.get().getBucket().getDefaultInstance());
        list.add(CFluids.EPOXY_RESIN.get().getBucket().getDefaultInstance());
        list.add(CFluids.ETHANOL.get().getBucket().getDefaultInstance());
        list.add(CFluids.GLYCERIN.get().getBucket().getDefaultInstance());
        list.add(CFluids.HEXAMETHYLENEDIAMINE_SOLUTION.get().getBucket().getDefaultInstance());
        list.add(CFluids.HIGH_OCTANE_GASOLINE.get().getBucket().getDefaultInstance());
        list.add(CFluids.HYDROCHLORIC_ACID.get().getBucket().getDefaultInstance());
        list.add(CFluids.HYDROFLUORIC_ACID.get().getBucket().getDefaultInstance());
        list.add(CFluids.MERCURY.get().getBucket().getDefaultInstance());
        list.add(CFluids.MOLTEN_GLASS.get().getBucket().getDefaultInstance());
        list.add(CFluids.MOLTEN_NYLON.get().getBucket().getDefaultInstance());
        list.add(CFluids.MOLTEN_TITANIUM.get().getBucket().getDefaultInstance());
        list.add(CFluids.MOLTEN_TUNGSTEN_CARBIDE.get().getBucket().getDefaultInstance());
        list.add(CFluids.NITRIC_ACID.get().getBucket().getDefaultInstance());
        list.add(CFluids.NITROGLYCERIN.get().getBucket().getDefaultInstance());
        list.add(CFluids.PAN_PRECURSOR.get().getBucket().getDefaultInstance());
        list.add(CFluids.PHENOL.get().getBucket().getDefaultInstance());
        list.add(CFluids.PHOSPHORIC_ACID.get().getBucket().getDefaultInstance());
        list.add(CFluids.PLATINUM_CATALYST_CARRIER.get().getBucket().getDefaultInstance());
        list.add(CFluids.POLYVINYL_CHLORIDE.get().getBucket().getDefaultInstance());
        list.add(CFluids.POLYETHYLENE.get().getBucket().getDefaultInstance());
        list.add(CFluids.SUCROSE_SOLUTION.get().getBucket().getDefaultInstance());
        list.add(CFluids.SULFURIC_NICKEL_SOLUTION.get().getBucket().getDefaultInstance());
        list.add(CFluids.SEED_OIL.get().getBucket().getDefaultInstance());
        list.add(CFluids.TETRAETHYLLEAD.get().getBucket().getDefaultInstance());
        list.add(CFluids.TITANIUM_TETRACHLORIDE.get().getBucket().getDefaultInstance());
        list.add(CFluids.TOLUENE.get().getBucket().getDefaultInstance());
        list.add(CFluids.WASTE_SLURRY.get().getBucket().getDefaultInstance());
        list.add(CFluids.XYLENE.get().getBucket().getDefaultInstance());

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