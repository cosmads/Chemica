package com.cosmads.chemica.registry.rutile;

import com.cosmads.chemica.Chemica;
import dev.metallurgists.rutile.api.material.flags.FlagKey;
import dev.metallurgists.rutile.api.tag.TagPrefix;

import static dev.metallurgists.rutile.api.tag.TagPrefix.Conditions.*;

public class ChemicaTagPrefixes {

    public static TagPrefix CrushedRaw = new TagPrefix(Chemica.asResource("crushed_raw"))
            .defaultTagPath("crushed_raw_materials/%s")
            .unformattedTagPath("crushed_raw_materials")
            .idPattern("crushed_raw_%s").langValue("Crushed Raw %s")
            .materialAmount(TagPrefix.M)
            .unificationEnabled(true)
            .generateItem(true)
            .generationCondition(hasFlag(FlagKey.ORE).and(hasNoFlag(FlagKey.GEM, ChemicaFlags.DISABLE_CRUSHED)));

    public static void init() {}
}
