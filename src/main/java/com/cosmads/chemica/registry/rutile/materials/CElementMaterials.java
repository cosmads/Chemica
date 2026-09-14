package com.cosmads.chemica.registry.rutile.materials;

import com.cosmads.chemica.Chemica;
import dev.metallurgists.rutile.api.material.Material;
import dev.metallurgists.rutile.api.material.flags.FlagKey;
import dev.metallurgists.rutile.api.registry.flags.customisation.HarvestTierFlag;

import static com.cosmads.chemica.registry.rutile.ChemicaMaterials.*;

public class CElementMaterials {

    public static void register() {
        Antimony = new Material.Builder(Chemica.asResource("antimony"))
                .element("antimony")
                .flag(FlagKey.INGOT)
                .flag(FlagKey.ORE)
                .flag(FlagKey.HARVEST_TIER, new HarvestTierFlag(3))
                .build();

        Chromium = new Material.Builder(Chemica.asResource("chromium"))
                .element("chromium")
                .flag(FlagKey.INGOT)
                .flag(FlagKey.ORE)
                .flag(FlagKey.HARVEST_TIER, new HarvestTierFlag(3))
                .build();
    }

}
