package com.cosmads.chemica.registry;

import com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode.Electrode;
import com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode.ElectrodeEntry;
import com.cosmads.chemica.Chemica;

public class ChemicaElectrodes {
    private static final com.cosmads.chemica.common.registrate.ChemicaRegistrate REGISTRATE = Chemica.REGISTRATE;

    public static final ElectrodeEntry<Electrode> PLATINUM = REGISTRATE
            .electrode("electrode", Electrode::new)
            .properties(p -> p
                    .resistance(8)
                    .item(ChemicaItems.PLATINUM_ELECTRODE)
                    .operationId("chemica:electrode"))
            .register();

    public static void register() {
        Chemica.LOGGER.info("Registered Chemica electrodes");
    }
}