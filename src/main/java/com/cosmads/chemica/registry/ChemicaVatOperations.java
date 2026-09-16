package com.cosmads.chemica.registry;

import com.cosmads.chemica.Chemica;
import com.drmangotea.tfmg.content.machinery.vat.base.registry.operations.VatOperation;
import com.drmangotea.tfmg.content.machinery.vat.base.registry.operations.VatOperationEntry;


public class ChemicaVatOperations {

    public static final VatOperationEntry PLATINUM_ELECTRODE = register("platinum_electrode");

    private static VatOperationEntry register(String name) {
        return Chemica.REGISTRATE.vatOperation(name, VatOperation::new).register();
    }

    public static void init() {}
}
