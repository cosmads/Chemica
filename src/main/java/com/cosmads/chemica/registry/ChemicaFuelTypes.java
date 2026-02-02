package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import com.drmangotea.tfmg.content.engines.fuels.FuelType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class ChemicaFuelTypes {

    // Custom fuel types
    public static FuelType BIODIESEL_FUEL;
    public static FuelType ETHANOL_FUEL;
    public static FuelType HIGH_OCTANE_FUEL;
    public static FuelType HYDROGEN_FUEL;

    public static void registerFuelTypes() {
        Chemica.LOGGER.info("Registering Chemica fuel types for TFMG");

        // Get fluid tags
        TagKey<Fluid> biodieselTag = TagKey.create(
                BuiltInRegistries.FLUID.key(),
                ResourceLocation.fromNamespaceAndPath("c", "biodiesel")
        );
        TagKey<Fluid> ethanolTag = TagKey.create(
                BuiltInRegistries.FLUID.key(),
                ResourceLocation.fromNamespaceAndPath("c", "ethanol")
        );
        TagKey<Fluid> highOctaneTag = TagKey.create(
                BuiltInRegistries.FLUID.key(),
                ResourceLocation.fromNamespaceAndPath("c", "high_octane_gasoline")
        );
        TagKey<Fluid> hydrogenTag = TagKey.create(
                BuiltInRegistries.FLUID.key(),
                ResourceLocation.fromNamespaceAndPath("c", "hydrogen_fuel")
        );

        // Register fuel types with fluid tags
        BIODIESEL_FUEL = new FuelType.Builder(Chemica.asResource("biodiesel"))
                .speed(1.0f)
                .efficiency(0.9f)
                .stress(0.8f)
                .registerAndAssign(biodieselTag);

        ETHANOL_FUEL = new FuelType.Builder(Chemica.asResource("ethanol"))
                .speed(0.6f)
                .efficiency(0.8f)
                .stress(0.6f)
                .registerAndAssign(ethanolTag);

        HIGH_OCTANE_FUEL = new FuelType.Builder(Chemica.asResource("high_octane_gasoline"))
                .speed(1.6f)
                .efficiency(1.2f)
                .stress(2.3f)
                .registerAndAssign(highOctaneTag);

        HYDROGEN_FUEL = new FuelType.Builder(Chemica.asResource("hydrogen_fuel"))
                .speed(1.8f)
                .efficiency(1.3f)
                .stress(0.8f)
                .registerAndAssign(hydrogenTag);
    }

}