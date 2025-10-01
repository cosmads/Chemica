package io.github.cosmads.chemica.registry;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.tterrag.registrate.util.entry.FluidEntry;
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.registrate.ChemicaRegistrate;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import java.util.Map;
import java.util.HashMap;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CFluids {
    private static final ChemicaRegistrate REGISTRATE = (ChemicaRegistrate) Chemica.registrate().setCreativeTab(ChemicaCreativeTabs.CHEMICA_MAIN);

    // Helper method for tinted placeable liquids with texture type
    private static FluidEntry<ForgeFlowingFluid.Flowing> fluid(String name, int color, int viscosity, int density, String textureType) {
        return REGISTRATE.tintedFluid(name, color, textureType)
                .lang(toHumanReadable(name))
                .properties(builder -> builder
                        .viscosity(viscosity)
                        .density(density))
                .source(ForgeFlowingFluid.Source::new)
                .bucket()
                .build()
                .register();
    }

    // Overload for default "base" texture
    private static FluidEntry<ForgeFlowingFluid.Flowing> fluid(String name, int color, int viscosity, int density) {
        return fluid(name, color, viscosity, density, "base");
    }

    // Manual texture special case
    private static FluidEntry<ForgeFlowingFluid.Flowing> manualFluid(String name, int viscosity, int density) {
        return REGISTRATE.fluid(name,
                        Chemica.asResource("block/fluid/" + name + "_still"),
                        Chemica.asResource("block/fluid/" + name + "_flow"))
                .lang(toHumanReadable(name))
                .properties(builder -> builder
                        .viscosity(viscosity)
                        .density(density))
                .source(ForgeFlowingFluid.Source::new)
                .bucket()
                .model((ctx, prov) -> prov.generated(ctx, prov.modLoc("item/" + name + "_bucket")))
                .build()
                .register();
    }

    // Helper method for gases
    @SafeVarargs
    private static FluidEntry<VirtualFluid> gas(String name, int color, TagKey<Fluid>... tags) {
        FluidEntry<VirtualFluid> fluid = REGISTRATE.gasFluid(name, color)
                .lang(toHumanReadable(name))
                .tag(tags)
                .register();

        // Automatic bucket registration
        REGISTRATE.item(name + "_bucket",
                        p -> new BucketItem(fluid.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
                .lang(toHumanReadable(name) + " Bucket")
                .tag(AllTags.forgeItemTag("buckets/" + name))
                .register();

        return fluid;
    }

    private static String toHumanReadable(String name) {
        Map<String, String> manualOverrides = Map.of(
                "pan_precursor", "PAN Precursor",
                "pan_precursor_bucket", "PAN Precursor Bucket",
                "pan_fibers", "PAN Fibers"
        );

        if (manualOverrides.containsKey(name)) {
            return manualOverrides.get(name);
        }

        // Default behavior for other names
        return Arrays.stream(name.split("_"))
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));
    }

    // Fluids
    public static final FluidEntry<ForgeFlowingFluid.Flowing>
            ACETONE = fluid("acetone", 0x80d0d0d0, 600, 790),
            ACETONITRILE = fluid("acrylonitrile", 0x80c8d7f0, 400, 810),
            ADIPIC_ACID_SOLUTION = fluid("adipic_acid_solution", 0x80e0e0c8, 1200, 1100),
            AMINE_CATALYST = fluid("amine_catalyst", 0x80716b61, 1200, 950),
            AROMATIC_MIX = fluid("aromatic_mix", 0x8055475f, 800, 870),
            BENZENE = fluid("benzene", 0x805a5164, 650, 876),
            BIODIESEL = manualFluid("biodiesel", 1200, 1140),
            BRINE = fluid("brine", 0xE6005aff, 1100, 1200),
            CAUSTIC_SODA = fluid("caustic_soda", 0x8071847b, 1500, 1500),
            CHROMIC_ACID = fluid("chromic_acid", 0x80c8d4e4, 900, 1170),
            CUMENE = fluid("cumene", 0x80a79d8d, 750, 860),
            CYCLOHEXANE = fluid("cyclohexane", 0xA6f0f0d7, 1000, 779),
            CYCLOHEXANOL = fluid("cyclohexanol", 0xA6d8f0d8, 800, 962),
            DISTILLED_WATER = fluid("distilled_water", 0xE6005aff, 1100, 1200),
            EPOXY_PRECURSOR = fluid("epoxy_precursor", 0xB3cbcbb8, 2000, 1100),
            EPOXY_RESIN = fluid("epoxy_resin", 0xFFc7c7b1, 3000, 1200),
            ETHANOL = fluid("ethanol", 0x26c8f0f0, 1200, 789),
            GLYCERIN = fluid("glycerin", 0xB3f0dcf0, 15000, 1260),
            HEXAMETHYLENEDIAMINE_SOLUTION = fluid("hexamethylenediamine_solution", 0x80a0c8e0, 1100, 1050),
            HIGH_OCTANE_GASOLINE = fluid("high_octane_gasoline", 0x80a98a6a, 500, 720),
            HYDROCHLORIC_ACID = fluid("hydrochloric_acid", 0x80F0FFF0, 900, 1190),
            HYDROFLUORIC_ACID = fluid("hydrofluoric_acid", 0x80f0f0ff, 900, 1150),
            MOLTEN_GLASS = manualFluid("molten_glass", 3500, 1440),
            MOLTEN_NYLON = manualFluid("molten_nylon", 5000, 1140),
            MOLTEN_TITANIUM = manualFluid("molten_titanium", 5000, 1140),
            MOLTEN_TUNGSTEN_CARBIDE = manualFluid("molten_tungsten_carbide", 5000, 1140),
            NITRIC_ACID = fluid("nitric_acid", 0x80f0f0a0, 850, 1510),
            NITROGLYCERIN = fluid("nitroglycerin", 0xFFe8d2d2, 350, 1600),
            PAN_PRECURSOR = fluid("pan_precursor", 0x80e8d2c8, 2500, 1000),
            PHENOL = fluid("phenol", 0x808a7c6b, 1800, 1070),
            PLATINUM_CATALYST_CARRIER = fluid("platinum_catalyst_carrier", 0x807a888c, 1500, 950),
            POLYVINYL_CHLORIDE = fluid("polyvinyl_chloride", 0x80e0f4f6, 1500, 950),
            SEED_OIL = fluid("seed_oil", 0xFFe6d8aa, 2000, 920),
            SUCROSE_SOLUTION = fluid("sucrose_solution", 0xE6005aff, 2000, 920),
            TOLUENE = fluid("toluene", 0x809f8b72, 590, 867),
            WASTE_SLURRY = fluid("waste_slurry", 0xCC8C7A6B, 1800, 1200),
            XYLENE = fluid("xylene", 0x807f9799, 620, 860),

            ETHYLBENZENE = fluid("ethylbenzene", 0x809B8C6B, 650, 870),
            ETHYL_TERT_BUTYL_ETHER = fluid("ethyl_tert_butyl_ether", 0xB3E6E6C9, 450, 740),
            MERCURY = fluid("mercury", 0xB3D5F2F2, 1500, 13500),
            PHOSPHORIC_ACID = fluid("phosphoric_acid", 0x80F2E6B3, 1200, 1690),
            POLYETHYLENE = fluid("polyethylene", 0x80F0F0F0, 5000, 920),
            SULFURIC_NICKEL_SOLUTION = fluid("sulfuric_nickel_solution", 0x807AA3A3, 1100, 1250),
            TETRAETHYLLEAD = fluid("tetraethyllead", 0xCCB35959, 850, 1650),
            TITANIUM_TETRACHLORIDE = fluid("titanium_tetrachloride", 0xE6B3B3CC, 800, 1730);

    // Gases
    public static final FluidEntry<VirtualFluid>
            AMMONIA = gas("ammonia", 0x33dcf1cb),
            ARGON = gas("argon", 0x33c66bce),
            CHLORINE = gas("chlorine", 0x33eff156),
            FLUORINE = gas("fluorine", 0x55ffd700),
            LIGHT_HYDROCARBONS = gas("light_hydrocarbons", 0x33d1f0fa),
            NITROGEN = gas("nitrogen", 0x33a6bfcf),
            NITROGEN_DIOXIDE = gas("nitrogen_dioxide", 0x33b2784d),
            OXYGEN = gas("oxygen", 0x33e0f0ff),
            REFORMATE = gas("reformate", 0x33b0b77f),
            STEAM = gas("steam", 0x33F0F0F0),
            VINYL_CHLORIDE_MONOMER = gas("vinyl_chloride_monomer", 0x33efe0a0),

            BUTENE = gas("butene", 0x22E6B380),
            CARBON_MONOXIDE = gas("carbon_monoxide", 0x11C4C4C4),
            EPICHLOROHYDRIN = gas("epichlorohydrin", 0x22B3D9B3),
            ETHANE = gas("ethane", 0x22E0D1B3),
            HELIUM = gas("helium", 0x15F0E6FF),
            METHANE = gas("methane", 0x22C2E0D1), NITROUS_OXIDE = gas("nitrous_oxide", 0x33FFE6B3),
            PROPENE = gas("propene", 0x22E6CC99),
            TUNGSTEN_HEXAFLUORIDE = gas("tungsten_hexafluoride", 0x33D1B3B3);

    public static void register() {
        Chemica.LOGGER.info("Registered fluids for Chemica");
    }
}