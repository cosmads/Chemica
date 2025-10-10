package io.github.cosmads.chemica.content.engines.fuels;

import com.drmangotea.tfmg.TFMG;
import com.drmangotea.tfmg.content.engines.fuels.FuelType;
import io.github.cosmads.chemica.registry.CFluidTags;

public class ChemicaFuelTypes {

    public static final FuelType
            HIGH_OCTANE = create("chemica_high_octane")
                .speed(1.6f)
                .efficiency(1.2f)
                .stress(2.3f)
                .registerAndAssign(CFluidTags.HIGH_OCTANE),

            HYDROGEN = create("chemica_hydrogen")
                .speed(1.6f)
                .efficiency(0.9f)
                .stress(0.7f)
                .registerAndAssign(CFluidTags.HYDROGEN),

            ETHANOL = create("chemica_ethanol")
                .speed(0.6f)
                .efficiency(0.8f)
                .stress(0.6f)
                .registerAndAssign(CFluidTags.ETHANOL),

            BIODIESEL = create("chemica_biodiesel")
                .speed(1f)
                .efficiency(0.9f)
                .stress(0.8f)
                .registerAndAssign(CFluidTags.BIODIESEL);


    private static FuelType.Builder create(String name) {
        return new FuelType.Builder(TFMG.asResource(name));
    }

    public static void register() {
    }
}