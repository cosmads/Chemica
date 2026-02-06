package com.cosmads.chemica.registry.rutile;

import com.cosmads.chemica.registry.rutile.flags.DisableCrushedFlag;
import dev.metallurgists.rutile.api.material.flags.FlagKey;

public class ChemicaFlags {

    public static final FlagKey<DisableCrushedFlag> DISABLE_CRUSHED = new FlagKey<>("chemica:disable_crushed", DisableCrushedFlag.class);
}
