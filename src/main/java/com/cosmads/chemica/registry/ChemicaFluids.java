package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.common.TransparentTintedFluidType;
import com.cosmads.chemica.data.tags.ChemicaTags;
import com.drmangotea.tfmg.base.fluid.AcidFluidType;
import com.drmangotea.tfmg.registry.TFMGTags;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.tterrag.registrate.util.entry.FluidEntry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ChemicaFluids {
    // Get the ChemicaRegistrate instance
    private static final com.cosmads.chemica.common.registrate.ChemicaRegistrate REGISTRATE = Chemica.REGISTRATE;

    // Helper method for tinted placeable liquids with texture type
    @SafeVarargs
    private static FluidEntry<BaseFlowingFluid.Flowing> fluid(String name, int color, int viscosity, int density, String textureType, TagKey<Fluid>... tags) {
        return REGISTRATE.fluid(name,
                        Chemica.asResource("block/fluid/" + textureType + "_still"),
                        Chemica.asResource("block/fluid/" + textureType + "_flow"),
                        TransparentTintedFluidType.create(color))
                .lang(toHumanReadable(name))
                .properties(b -> b.viscosity(viscosity).density(density))
                .tag(tags)
                .source(BaseFlowingFluid.Source::new)
                .bucket()
                .tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "buckets/" + name)))
                .build()
                .register();
    }

    // Overload for default "base" texture
    @SafeVarargs
    private static FluidEntry<BaseFlowingFluid.Flowing> fluid(String name, int color, int viscosity, int density, TagKey<Fluid>... tags) {
        return fluid(name, color, viscosity, density, "base", tags);
    }

    // Helper method for acid fluids using TFMG's AcidFluidType
    @SafeVarargs
    private static FluidEntry<BaseFlowingFluid.Flowing> acidFluid(String name, int fogColor, int viscosity, int density, TagKey<Fluid>... tags) {
        return REGISTRATE.fluid(name,
                        Chemica.asResource("block/fluid/base_still"),
                        Chemica.asResource("block/fluid/base_flow"),
                        AcidFluidType.create(fogColor, () -> 1f / 32f))
                .lang(toHumanReadable(name))
                .properties(b -> b.viscosity(viscosity).density(density))
                .tag(tags)
                .source(BaseFlowingFluid.Source::new)
                .bucket()
                .tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "buckets/" + name)))
                .build()
                .register();
    }

    // Manual texture special case
    @SafeVarargs
    private static FluidEntry<BaseFlowingFluid.Flowing> manualFluid(String name, int viscosity, int density, TagKey<Fluid>... tags) {
        return REGISTRATE.fluid(name,
                        Chemica.asResource("block/fluid/" + name + "_still"),
                        Chemica.asResource("block/fluid/" + name + "_flow"))
                .lang(toHumanReadable(name))
                .properties(builder -> builder
                        .viscosity(viscosity)
                        .density(density))
                .tag(tags)
                .source(BaseFlowingFluid.Source::new)
                .bucket()
                .model((ctx, prov) -> prov.generated(ctx, prov.modLoc("item/" + name + "_bucket")))
                .tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "buckets/" + name)))
                .build()
                .register();
    }

    // Helper method for gases (non-placeable, using VirtualFluid)
    @SafeVarargs
    private static FluidEntry<VirtualFluid> gas(String name, int color, TagKey<Fluid>... tags) {
        return REGISTRATE.gasFluid(name, color)  // Now using the method from ChemicaRegistrate
                .lang(toHumanReadable(name))
                .properties(b -> b.viscosity(50).density(-10))
                .tag(tags)
                .tag(TFMGTags.Fluids.GAS.tag)
                .bucket()
                .lang(toHumanReadable(name) + " Tank")
                .tag(createCommonItemTag("buckets/" + name))
                .build()
                .register();
    }

    // TFMG's gasFluid method
    @SafeVarargs
    private static FluidEntry<VirtualFluid> gasTFMG(String name, int color, TagKey<Fluid>... tags) {
        return REGISTRATE.gasFluidTFMG(name, color)  // If you added this method to ChemicaRegistrate
                .lang(toHumanReadable(name))
                .properties(b -> b.viscosity(50).density(-10))
                .tag(tags)
                .bucket()
                .lang(toHumanReadable(name) + " Tank")
                .tag(createCommonItemTag("buckets/" + name))
                .build()
                .register();
    }

    // Helper method to create common item tags
    private static TagKey<Item> createCommonItemTag(String path) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", path));
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

    // Regular Fluids
    public static final FluidEntry<BaseFlowingFluid.Flowing>
            ACETONE = fluid("acetone", 0x80d0d0d0, 600, 790, ChemicaTags.Fluids.ACETONE.tag),
            ACETONITRILE = fluid("acrylonitrile", 0x80c8d7f0, 400, 810, ChemicaTags.Fluids.ACETONITRILE.tag),
            ADIPIC_ACID_SOLUTION = fluid("adipic_acid_solution", 0x80e0e0c8, 1200, 1100, ChemicaTags.Fluids.ADIPIC_ACID_SOLUTION.tag),
            AMINE_CATALYST = fluid("amine_catalyst", 0x80716b61, 1200, 950, ChemicaTags.Fluids.AMINE_CATALYST.tag),
            AROMATIC_MIX = fluid("aromatic_mix", 0x8055475f, 800, 870, ChemicaTags.Fluids.AROMATIC_MIX.tag),
            BENZENE = fluid("benzene", 0x805a5164, 650, 876, ChemicaTags.Fluids.BENZENE.tag),
            BRINE = fluid("brine", 0xE6005aff, 1100, 1200, ChemicaTags.Fluids.BRINE.tag),
            CAUSTIC_SODA = fluid("caustic_soda", 0x8071847b, 1500, 1500, ChemicaTags.Fluids.CAUSTIC_SODA.tag),
            CUMENE = fluid("cumene", 0x80a79d8d, 750, 860, ChemicaTags.Fluids.CUMENE.tag),
            CYCLOHEXANE = fluid("cyclohexane", 0xA6f0f0d7, 1000, 779, ChemicaTags.Fluids.CYCLOHEXANE.tag),
            CYCLOHEXANOL = fluid("cyclohexanol", 0xA6d8f0d8, 800, 962, ChemicaTags.Fluids.CYCLOHEXANOL.tag),
            DISTILLED_WATER = fluid("distilled_water", 0xE6005aff, 1100, 1200, ChemicaTags.Fluids.DISTILLED_WATER.tag),
            EPOXY_PRECURSOR = fluid("epoxy_precursor", 0xB3cbcbb8, 2000, 1100, ChemicaTags.Fluids.EPOXY_PRECURSOR.tag),
            EPOXY_RESIN = fluid("epoxy_resin", 0xFFc7c7b1, 3000, 1200, ChemicaTags.Fluids.EPOXY_RESIN.tag),
            ETHYLBENZENE = fluid("ethylbenzene", 0x809B8C6B, 650, 870, ChemicaTags.Fluids.ETHYLBENZENE.tag),
            ETHYL_TERT_BUTYL_ETHER = fluid("ethyl_tert_butyl_ether", 0xB3E6E6C9, 450, 740, ChemicaTags.Fluids.ETHYL_TERT_BUTYL_ETHER.tag),
            GASOLINE_ADDITIVE_MIX = fluid("gasoline_additive_mix", 0xBFE6E6C9, 490, 860, ChemicaTags.Fluids.GASOLINE_ADDITIVE_MIX.tag),
            GLYCERIN = fluid("glycerin", 0xB3f0dcf0, 15000, 1260, ChemicaTags.Fluids.GLYCERIN.tag),
            HEXAMETHYLENEDIAMINE_SOLUTION = fluid("hexamethylenediamine_solution", 0x80a0c8e0, 1100, 1050, ChemicaTags.Fluids.HEXAMETHYLENEDIAMINE_SOLUTION.tag),
            LIQUID_HYDROGEN = fluid("liquid_hydrogen", 0x807a888c, 1100, 1050, ChemicaTags.Fluids.LIQUID_HYDROGEN.tag),
            MERCURY = fluid("mercury", 0xB3D5F2F2, 1500, 13500, ChemicaTags.Fluids.MERCURY.tag),
            NITROGLYCERIN = fluid("nitroglycerin", 0xFFe8d2d2, 350, 1600, ChemicaTags.Fluids.NITROGLYCERIN.tag),
            PAN_PRECURSOR = fluid("pan_precursor", 0x80e8d2c8, 2500, 1000, ChemicaTags.Fluids.PAN_PRECURSOR.tag),
            PHENOL = fluid("phenol", 0x808a7c6b, 1800, 1070, ChemicaTags.Fluids.PHENOL.tag),
            PLATINUM_CATALYST_CARRIER = fluid("platinum_catalyst_carrier", 0x807a888c, 1500, 950, ChemicaTags.Fluids.PLATINUM_CATALYST_CARRIER.tag),
            POLYETHYLENE = fluid("polyethylene", 0x80F0F0F0, 5000, 920, ChemicaTags.Fluids.POLYETHYLENE.tag),
            POLYVINYL_CHLORIDE = fluid("polyvinyl_chloride", 0x80e0f4f6, 1500, 950, ChemicaTags.Fluids.POLYVINYL_CHLORIDE.tag),
            SEED_OIL = fluid("seed_oil", 0xFFe6d8aa, 2000, 920, ChemicaTags.Fluids.SEED_OIL.tag),
            SUCROSE_SOLUTION = fluid("sucrose_solution", 0xE6005aff, 2000, 920, ChemicaTags.Fluids.SUCROSE_SOLUTION.tag),
            SOLDER_SOLUTION = fluid("solder_solution", 0xE6B3B3EE, 1700, 920, ChemicaTags.Fluids.SOLDER_SOLUTION.tag),
            TETRAETHYLLEAD = fluid("tetraethyllead", 0xCCB35959, 850, 1650, ChemicaTags.Fluids.TETRAETHYLLEAD.tag),
            TITANIUM_TETRACHLORIDE = fluid("titanium_tetrachloride", 0xE6B3B3CC, 800, 1730, ChemicaTags.Fluids.TITANIUM_TETRACHLORIDE.tag),
            TOLUENE = fluid("toluene", 0x809f8b72, 590, 867, ChemicaTags.Fluids.TOLUENE.tag),
            WASTE_SLURRY = fluid("waste_slurry", 0xCC8C7A6B, 1800, 1200, ChemicaTags.Fluids.WASTE_SLURRY.tag),
            XYLENE = fluid("xylene", 0x807f9799, 620, 860, ChemicaTags.Fluids.XYLENE.tag);

    // Acid Fluids
    public static final FluidEntry<BaseFlowingFluid.Flowing>
    CHROMIC_ACID = acidFluid("chromic_acid", 0xc8d4e4, 900, 1170, ChemicaTags.Fluids.ACIDS.tag, ChemicaTags.Fluids.ACIDS_CHROMIC.tag, ChemicaTags.Fluids.CHROMIC_ACID.tag),

    HYDROCHLORIC_ACID = acidFluid("hydrochloric_acid", 0xF0FFF0, 900, 1190,
            ChemicaTags.Fluids.ACIDS.tag, ChemicaTags.Fluids.ACIDS_HYDROCHLORIC.tag, ChemicaTags.Fluids.HYDROCHLORIC_ACID.tag),

    HYDROFLUORIC_ACID = acidFluid("hydrofluoric_acid", 0xf0f0ff, 900, 1150,
            ChemicaTags.Fluids.ACIDS.tag, ChemicaTags.Fluids.ACIDS_HYDROFLUORIC.tag, ChemicaTags.Fluids.HYDROFLUORIC_ACID.tag),

    NITRIC_ACID = acidFluid("nitric_acid", 0xf0f0a0, 850, 1510,
            ChemicaTags.Fluids.ACIDS.tag, ChemicaTags.Fluids.ACIDS_NITRIC.tag, ChemicaTags.Fluids.NITRIC_ACID.tag),

    PHOSPHORIC_ACID = acidFluid("phosphoric_acid", 0xF2E6B3, 1200, 1690,
            ChemicaTags.Fluids.ACIDS.tag, ChemicaTags.Fluids.ACIDS_PHOSPHORIC.tag, ChemicaTags.Fluids.PHOSPHORIC_ACID.tag),

    SULFURIC_NICKEL_SOLUTION = acidFluid("sulfuric_nickel_solution", 0x7AA3A3, 1100, 1250,
            ChemicaTags.Fluids.ACIDS.tag, ChemicaTags.Fluids.ACIDS_SULFURIC_NICKEL.tag, ChemicaTags.Fluids.SULFURIC_NICKEL_SOLUTION.tag);

    // Molten texture fluids
    public static final FluidEntry<BaseFlowingFluid.Flowing>
            MOLTEN_GLASS = manualFluid("molten_glass", 3500, 1440, ChemicaTags.Fluids.MOLTEN_GLASS.tag),
            MOLTEN_NYLON = manualFluid("molten_nylon", 5000, 1140, ChemicaTags.Fluids.MOLTEN_NYLON.tag),
            MOLTEN_TITANIUM = manualFluid("molten_titanium", 5000, 1140, ChemicaTags.Fluids.MOLTEN_TITANIUM.tag),
            MOLTEN_TUNGSTEN_CARBIDE = manualFluid("molten_tungsten_carbide", 5000, 1140, ChemicaTags.Fluids.MOLTEN_TUNGSTEN_CARBIDE.tag);

    // Gases
    public static final FluidEntry<VirtualFluid>
            AMMONIA = gas("ammonia", 0x33dcf1cb, ChemicaTags.Fluids.AMMONIA.tag),
            ARGON = gas("argon", 0x33c66bce, ChemicaTags.Fluids.ARGON.tag),
            BUTENE = gas("butene", 0x22E6B380, ChemicaTags.Fluids.BUTENE.tag),
            CARBON_MONOXIDE = gas("carbon_monoxide", 0x11C4C4C4, ChemicaTags.Fluids.CARBON_MONOXIDE.tag),
            CHLORINE = gas("chlorine", 0x66eff156, ChemicaTags.Fluids.CHLORINE.tag),
            EPICHLOROHYDRIN = gas("epichlorohydrin", 0x22B3D9B3, ChemicaTags.Fluids.EPICHLOROHYDRIN.tag),
            ETHANE = gas("ethane", 0x22E0D1B3, ChemicaTags.Fluids.ETHANE.tag),
            FLUORINE = gas("fluorine", 0x55ffd700, ChemicaTags.Fluids.FLUORINE.tag),
            HELIUM = gas("helium", 0x15F0E6FF, ChemicaTags.Fluids.HELIUM.tag),
            LIGHT_HYDROCARBONS = gas("light_hydrocarbons", 0x33d1f0fa, ChemicaTags.Fluids.LIGHT_HYDROCARBONS.tag),
            METHANE = gas("methane", 0x22C2E0D1, ChemicaTags.Fluids.METHANE.tag),
            NITROGEN = gas("nitrogen", 0x33a6bfcf, ChemicaTags.Fluids.NITROGEN.tag),
            NITROGEN_DIOXIDE = gas("nitrogen_dioxide", 0x33b2784d, ChemicaTags.Fluids.NITROGEN_DIOXIDE.tag),
            NITROUS_OXIDE = gas("nitrous_oxide", 0x33FFE6B3, ChemicaTags.Fluids.NITROUS_OXIDE.tag),
            OXYGEN = gas("oxygen", 0x33e0f0ff, ChemicaTags.Fluids.OXYGEN.tag),
            PROPENE = gas("propene", 0x22E6CC99, ChemicaTags.Fluids.PROPENE.tag),
            REFORMATE = gas("reformate", 0x33b0b77f, ChemicaTags.Fluids.REFORMATE.tag),
            STEAM = gas("steam", 0x33F0F0F0, ChemicaTags.Fluids.STEAM.tag),
            SYNGAS = gas("syngas", 0x66efe0a0, ChemicaTags.Fluids.SYNGAS.tag),
            TUNGSTEN_HEXAFLUORIDE = gas("tungsten_hexafluoride", 0x66D1B3B3, ChemicaTags.Fluids.TUNGSTEN_HEXAFLUORIDE.tag),
            VINYL_CHLORIDE_MONOMER = gas("vinyl_chloride_monomer", 0x66efe0a0, ChemicaTags.Fluids.VINYL_CHLORIDE_MONOMER.tag);

    // Fuel fluids
    public static final FluidEntry<BaseFlowingFluid.Flowing>
            BIODIESEL = REGISTRATE.fluid("biodiesel",
                    Chemica.asResource("block/fluid/biodiesel_still"),
                    Chemica.asResource("block/fluid/biodiesel_flow"))
            .lang("Biodiesel")
            .properties(builder -> builder
                    .viscosity(1200)
                    .density(1140))
            .source(BaseFlowingFluid.Source::new)
            .tag(ChemicaTags.Fluids.BIODIESEL.tag, TFMGTags.Fluids.FIREBOX_FUEL.tag)
            .bucket()
            .model((ctx, prov) -> prov.generated(ctx, prov.modLoc("item/biodiesel_bucket")))
            .tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "buckets/biodiesel")))
            .build()
            .register(),

    ETHANOL = REGISTRATE.fluid("ethanol",
                    Chemica.asResource("block/fluid/ethanol_still"),
                    Chemica.asResource("block/fluid/ethanol_flow"))
            .lang("Ethanol")
            .properties(builder -> builder
                    .viscosity(600)
                    .density(1140))
            .source(BaseFlowingFluid.Source::new)
            .tag(ChemicaTags.Fluids.ETHANOL.tag, TFMGTags.Fluids.FIREBOX_FUEL.tag)
            .bucket()
            .model((ctx, prov) -> prov.generated(ctx, prov.modLoc("item/ethanol_bucket")))
            .tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "buckets/ethanol")))
            .build()
            .register(),

    HIGH_OCTANE_GASOLINE = REGISTRATE.fluid("high_octane_gasoline",
                    Chemica.asResource("block/fluid/high_octane_gasoline_still"),
                    Chemica.asResource("block/fluid/high_octane_gasoline_flow"))
            .lang("High Octane Gasoline")
            .properties(builder -> builder
                    .viscosity(600)
                    .density(1140))
            .source(BaseFlowingFluid.Source::new)
            .tag(ChemicaTags.Fluids.HIGH_OCTANE_GASOLINE.tag, TFMGTags.Fluids.FIREBOX_FUEL.tag, TFMGTags.Fluids.FLAMMABLE.tag)
            .bucket()
            .model((ctx, prov) -> prov.generated(ctx, prov.modLoc("item/high_octane_gasoline_bucket")))
            .tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "buckets/high_octane_gasoline")))
            .build()
            .register(),

    HIGH_CETANE_DIESEL = REGISTRATE.fluid("high_cetane_diesel",
                    Chemica.asResource("block/fluid/high_cetane_diesel_still"),
                    Chemica.asResource("block/fluid/high_cetane_diesel_flow"))
            .lang("High Cetane Diesel")
            .properties(builder -> builder
                    .viscosity(680)
                    .density(1310))
            .source(BaseFlowingFluid.Source::new)
            .tag(ChemicaTags.Fluids.HIGH_CETANE_DIESEL.tag, TFMGTags.Fluids.FIREBOX_FUEL.tag, TFMGTags.Fluids.FLAMMABLE.tag)
            .bucket()
            .model((ctx, prov) -> prov.generated(ctx, prov.modLoc("item/high_cetane_diesel_bucket")))
            .tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "buckets/high_cetane_diesel")))
            .build()
            .register(),

    HYDROGEN_FUEL = REGISTRATE.fluid("hydrogen_fuel",
                    Chemica.asResource("block/fluid/hydrogen_fuel_still"),
                    Chemica.asResource("block/fluid/hydrogen_fuel_flow"))
            .lang("Hydrogen Fuel")
            .properties(builder -> builder
                    .viscosity(600)
                    .density(1140))
            .source(BaseFlowingFluid.Source::new)
            .tag(ChemicaTags.Fluids.HYDROGEN_FUEL.tag)
            .bucket()
            .model((ctx, prov) -> prov.generated(ctx, prov.modLoc("item/hydrogen_fuel_bucket")))
            .tag(ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "buckets/hydrogen_fuel")))
            .build()
            .register();

    public static void register() {
        Chemica.LOGGER.info("Registered fluids for Chemica");
    }
}
