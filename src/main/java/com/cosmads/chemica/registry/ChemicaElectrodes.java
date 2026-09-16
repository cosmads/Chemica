package com.cosmads.chemica.registry;

import com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode.ElectrodeEntry;
import com.cosmads.chemica.Chemica;
import com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode.SparkingElectrode;

import static com.cosmads.chemica.Chemica.REGISTRATE;


public class ChemicaElectrodes {

    public static final ElectrodeEntry<SparkingElectrode> PLATINUM = REGISTRATE.electrode("platinum", SparkingElectrode::new)
            .properties((p) -> p.resistance(8).operationId(ChemicaVatOperations.PLATINUM_ELECTRODE))
            .register();

    public static void register() {
        Chemica.LOGGER.info("Registered Chemica electrodes");
    }
}
