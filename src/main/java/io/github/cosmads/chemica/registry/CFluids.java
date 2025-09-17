package io.github.cosmads.chemica.registry;

import com.simibubi.create.AllTags;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.tterrag.registrate.util.entry.FluidEntry;
import com.tterrag.registrate.util.entry.ItemEntry;
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.registrate.ChemicaRegistrate;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.fluids.ForgeFlowingFluid;

public class CFluids {
    private static final ChemicaRegistrate REGISTRATE = (ChemicaRegistrate) Chemica.registrate().setCreativeTab(ChemicaCreativeTabs.CHEMICA_MAIN);

    // LIQUIDS

    public static final FluidEntry<ForgeFlowingFluid.Flowing> ACETONE = REGISTRATE.fluid("acetone",
                    Chemica.asResource("block/fluid/acetone_still"),
                    Chemica.asResource("block/fluid/acetone_flowing")
            )
            .lang("Acetone")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> ACETONE_BUCKET = REGISTRATE.item("acetone_bucket",
                    p -> new BucketItem(ACETONE.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Acetone Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> AMINE_CATALYST = REGISTRATE.fluid("amine_catalyst",
                    Chemica.asResource("block/fluid/amine_catalyst_still"),
                    Chemica.asResource("block/fluid/amine_catalyst_flowing")
            )
            .lang("Amine Catalyst")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> AMINE_CATALYST_BUCKET = REGISTRATE.item("amine_catalyst_bucket",
                    p -> new BucketItem(AMINE_CATALYST.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Amine Catalyst Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> AROMATIC_MIX = REGISTRATE.fluid("aromatic_mix",
                    Chemica.asResource("block/fluid/aromatic_mix_still"),
                    Chemica.asResource("block/fluid/aromatic_mix_flowing")
            )
            .lang("Aromatic Mix")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> AROMATIC_MIX_BUCKET = REGISTRATE.item("aromatic_mix_bucket",
                    p -> new BucketItem(AMINE_CATALYST.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Aromatic Mix Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> BENZENE = REGISTRATE.fluid("benzene",
                    Chemica.asResource("block/fluid/benzene_still"),
                    Chemica.asResource("block/fluid/benzene_flowing")
            )
            .lang("Benzene")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> BENZENE_BUCKET = REGISTRATE.item("benzene_bucket",
                    p -> new BucketItem(BENZENE.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Benzene Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> BRINE = REGISTRATE.fluid("brine",
                    Chemica.asResource("block/fluid/brine_still"),
                    Chemica.asResource("block/fluid/brine_flowing")
            )
            .lang("Brine")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> BRINE_BUCKET = REGISTRATE.item("brine_bucket",
                    p -> new BucketItem(BRINE.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Brine Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> CAUSTIC_SODA = REGISTRATE.fluid("caustic_soda",
                    Chemica.asResource("block/fluid/caustic_soda_still"),
                    Chemica.asResource("block/fluid/caustic_soda_flowing")
            )
            .lang("Caustic Soda")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> CAUSTIC_SODA_BUCKET = REGISTRATE.item("caustic_soda_bucket",
                    p -> new BucketItem(CAUSTIC_SODA.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Caustic Soda Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> CUMENE = REGISTRATE.fluid("cumene",
                    Chemica.asResource("block/fluid/cumene_still"),
                    Chemica.asResource("block/fluid/cumene_flowing")
            )
            .lang("Cumene")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> CUMENE_BUCKET = REGISTRATE.item("cumene_bucket",
                    p -> new BucketItem(CUMENE.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Cumene Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> EPOXY_PRECURSOR = REGISTRATE.fluid("epoxy_precursor",
                    Chemica.asResource("block/fluid/epoxy_precursor_still"),
                    Chemica.asResource("block/fluid/epoxy_precursor_flowing")
            )
            .lang("Epoxy Precursor")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> EPOXY_PRECURSOR_BUCKET = REGISTRATE.item("epoxy_precursor_bucket",
                    p -> new BucketItem(EPOXY_PRECURSOR.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Epoxy Precursor Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> EPOXY_RESIN = REGISTRATE.fluid("epoxy_resin",
                    Chemica.asResource("block/fluid/epoxy_resin_still"),
                    Chemica.asResource("block/fluid/epoxy_resin_flowing")
            )
            .lang("Epoxy Resin")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> EPOXY_RESIN_BUCKET = REGISTRATE.item("epoxy_resin_bucket",
                    p -> new BucketItem(EPOXY_RESIN.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Epoxy Resin Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> HIGH_OCTANE_GASOLINE = REGISTRATE.fluid("high_octane_gasoline",
                    Chemica.asResource("block/fluid/high_octane_gasoline_still"),
                    Chemica.asResource("block/fluid/high_octane_gasoline_flowing")
            )
            .lang("High Octane Gasoline")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> HIGH_OCTANE_GASOLINE_BUCKET = REGISTRATE.item("high_octane_gasoline_bucket",
                    p -> new BucketItem(HIGH_OCTANE_GASOLINE.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("High Octane Gasoline Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> HYDROCHLORIC_ACID = REGISTRATE.fluid("hydrochloric_acid",
                    Chemica.asResource("block/fluid/hydrochloric_acid_still"),
                    Chemica.asResource("block/fluid/hydrochloric_acid_flowing")
            )
            .lang("Hydrochloric Acid")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> HYDROCHLORIC_ACID_BUCKET = REGISTRATE.item("hydrochloric_acid_bucket",
                    p -> new BucketItem(HYDROCHLORIC_ACID.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Hydrochloric Acid")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> PHENOL = REGISTRATE.fluid("phenol",
                    Chemica.asResource("block/fluid/phenol_still"),
                    Chemica.asResource("block/fluid/phenol_flowing")
            )
            .lang("Phenol")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> PHENOL_BUCKET = REGISTRATE.item("phenol_bucket",
                    p -> new BucketItem(PHENOL.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Phenol Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> PLATINUM_CATALYST_CARRIER = REGISTRATE.fluid("platinum_catalyst_carrier",
                    Chemica.asResource("block/fluid/platinum_catalyst_carrier_still"),
                    Chemica.asResource("block/fluid/platinum_catalyst_carrier_flowing")
            )
            .lang("Platinum Catalyst Carrier")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> PLATINUM_CATALYST_CARRIER_BUCKET = REGISTRATE.item("platinum_catalyst_carrier_bucket",
                    p -> new BucketItem(PLATINUM_CATALYST_CARRIER.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Platinum Catalyst Carrier Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> TOLUENE = REGISTRATE.fluid("toluene",
                    Chemica.asResource("block/fluid/toluene_still"),
                    Chemica.asResource("block/fluid/toluene_flowing")
            )
            .lang("Toluene")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> TOLUENE_BUCKET = REGISTRATE.item("toluene_bucket",
                    p -> new BucketItem(TOLUENE.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Toluene Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    public static final FluidEntry<ForgeFlowingFluid.Flowing> XYLENE = REGISTRATE.fluid("xylene",
                    Chemica.asResource("block/fluid/xylene_still"),
                    Chemica.asResource("block/fluid/xylene_flowing")
            )
            .lang("Xylene")
            .properties(builder -> builder
                    .viscosity(1500)
                    .density(1400)
                    .canConvertToSource(false)
                    .temperature(300)
            )
            .source(ForgeFlowingFluid.Source::new)
            .block()
            .build()
            .register();

    public static final ItemEntry<BucketItem> XYLENE_BUCKET = REGISTRATE.item("xylene_bucket",
                    p -> new BucketItem(XYLENE.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
            .lang("Xylene Bucket")
            .model((ctx, prov) -> prov.generated(ctx))
            .register();


    // GASES
    public static final FluidEntry<VirtualFluid>
            AMMONIA = gas("ammonia", 0xffdcf1cb),
            CHLORINE = gas("chlorine", 0xffeff156),
            LIGHT_HYDROCARBONS = gas("light_hydrocarbons", 0xffd1f0fa),
            NITROGEN = gas("nitrogen", 0xffa6bfcf),
            REFORMATE = gas("reformate", 0xffb0b77f);

    @SafeVarargs
    public static FluidEntry<VirtualFluid> gas(String name, int color, TagKey<Fluid>... tags) {
        FluidEntry<VirtualFluid> fluid = REGISTRATE.gasFluid(name, color)
                .lang(toHumanReadable(name))
                .tag(tags)
                .register();

        // Automatic bucket registration with proper stack size
        REGISTRATE.item(name + "_bucket",
                        p -> new BucketItem(fluid.get()::getSource, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1)))
                .lang(toHumanReadable(name) + " Bucket")
                .tag(AllTags.forgeItemTag("buckets/" + name))
                .register();

        return fluid;
    }

    private static String toHumanReadable(String name) {
        return name.replace('_', ' ')
                .substring(0, 1).toUpperCase() + name.substring(1);
    }

    public static void register() {
        Chemica.LOGGER.info("Registered fluids for Chemica");
    }
}