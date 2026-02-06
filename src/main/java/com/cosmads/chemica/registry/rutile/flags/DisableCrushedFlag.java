package com.cosmads.chemica.registry.rutile.flags;

import dev.metallurgists.rutile.api.material.flags.FlagKey;
import dev.metallurgists.rutile.api.material.flags.MaterialFlags;
import dev.metallurgists.rutile.api.material.flags.StandaloneFlag;

public class DisableCrushedFlag extends StandaloneFlag {

    @Override
    public void verifyFlag(MaterialFlags flags) {
        flags.ensureSet(FlagKey.ORE);
    }
}
