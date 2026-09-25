package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.tags.ChemicaTags;
import com.drmangotea.tfmg.TFMGRegistries;
import com.drmangotea.tfmg.content.engines.fuels.EngineFuelType;
import com.drmangotea.tfmg.registry.TFMGTags;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;

public class ChemicaEngineFuelTypes {

    public static final ResourceKey<EngineFuelType> BIODIESEL = key("biodiesel");
    public static final ResourceKey<EngineFuelType> ETHANOL = key("ethanol");
    public static final ResourceKey<EngineFuelType> HIGH_CETANE_DIESEL = key("high_cetane_diesel");
    public static final ResourceKey<EngineFuelType> HIGH_OCTANE_GASOLINE = key("high_octane_gasoline");
    public static final ResourceKey<EngineFuelType> HYDROGEN_FUEL = key("hydrogen_fuel");

    private static ResourceKey<EngineFuelType> key(String name) {
        return ResourceKey.create(TFMGRegistries.ENGINE_FUEL_TYPE, Chemica.asResource(name));
    }

    public static void bootstrap(BootstrapContext<EngineFuelType> ctx) {
        register(ctx, BIODIESEL, new EngineFuelType.Builder(ChemicaTags.Fluids.BIODIESEL.tag)
                .speed(1.0f)
                .efficiency(0.9f)
                .torque(0.8f)
                .build());

        register(ctx, ETHANOL, new EngineFuelType.Builder(ChemicaTags.Fluids.ETHANOL.tag)
                .speed(0.6f)
                .efficiency(0.8f)
                .torque(0.6f)
                .build());

        register(ctx, HIGH_CETANE_DIESEL, new EngineFuelType.Builder(ChemicaTags.Fluids.HIGH_CETANE_DIESEL.tag)
                .speed(1.8f)
                .efficiency(1.0f)
                .torque(2.1f)
                .build());

        register(ctx, HIGH_OCTANE_GASOLINE, new EngineFuelType.Builder(ChemicaTags.Fluids.HIGH_OCTANE_GASOLINE.tag)
                .speed(1.6f)
                .efficiency(1.2f)
                .torque(2.3f)
                .build());

        register(ctx, HYDROGEN_FUEL, new EngineFuelType.Builder(ChemicaTags.Fluids.HYDROGEN_FUEL.tag)
                .speed(1.8f)
                .efficiency(1.3f)
                .torque(0.8f)
                .build());
    }

    private static void register(BootstrapContext<EngineFuelType> ctx, ResourceKey<EngineFuelType> name, EngineFuelType type) {
        ctx.register(name, type);
    }
}
