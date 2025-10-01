package io.github.cosmads.chemica.registry;

import com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode.Electrode;
import com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode.ElectrodeEntry;
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.registrate.ChemicaRegistrate;

import static io.github.cosmads.chemica.registry.CItems.REGISTRATE;

public class CElectrodes {
    private static final ChemicaRegistrate registrate = (ChemicaRegistrate) Chemica.registrate().setCreativeTab(ChemicaCreativeTabs.CHEMICA_MAIN);

    // Load this class

    public static final ElectrodeEntry<Electrode> PLATINUM = REGISTRATE.electrode("platinum", Electrode::new)
            .properties((p) -> p
                    .resistance(10)
                    .item(CItems.PLATINUM_ELECTRODE)
                    .operationId("chemica:platinum_electrode")
            )
            .register();

    public static void register() {
    }
}
