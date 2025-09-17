package io.github.cosmads.chemica.common.datagen.recipe.tfmg;

import com.drmangotea.tfmg.datagen.recipes.builder.VatMachineRecipeBuilder;
import io.github.cosmads.chemica.common.datagen.recipe.ChemicaRecipeProvider;
import net.minecraft.data.PackOutput;

import java.util.ArrayList;

public class VatRecipeGen extends ChemicaRecipeProvider {


    public VatRecipeGen(PackOutput output) {
        super(output);
    }

    public VatMachineRecipeBuilder.VatRecipeParams electrolysis() {
        VatMachineRecipeBuilder.VatRecipeParams params = new VatMachineRecipeBuilder.VatRecipeParams();
        params.machines.add("tfmg:electrode");
        params.machines.add("tfmg:electrode");
        params.allowedVatTypes = new ArrayList<>();
        params.allowedVatTypes.add("tfmg:steel_vat");
        params.allowedVatTypes.add("tfmg:firebrick_lined_vat");
        return params;
    }

    public VatMachineRecipeBuilder.VatRecipeParams mixing() {
        VatMachineRecipeBuilder.VatRecipeParams params = new VatMachineRecipeBuilder.VatRecipeParams();
        params.machines.add("tfmg:mixing");
        params.allowedVatTypes = new ArrayList<>();
        params.allowedVatTypes.add("tfmg:steel_vat");
        params.allowedVatTypes.add("tfmg:firebrick_lined_vat");
        return params;
    }

    public VatMachineRecipeBuilder.VatRecipeParams centrifuge() {
        VatMachineRecipeBuilder.VatRecipeParams params = new VatMachineRecipeBuilder.VatRecipeParams();
        params.machines.add("tfmg:centrifuge");
        return params;
    }

    public VatMachineRecipeBuilder.VatRecipeParams freezing() {
        VatMachineRecipeBuilder.VatRecipeParams params = new VatMachineRecipeBuilder.VatRecipeParams();
        params.machines.add("tfmg:freezing");
        return params;
    }

    public VatMachineRecipeBuilder.VatRecipeParams intenseFreezing() {
        VatMachineRecipeBuilder.VatRecipeParams params = new VatMachineRecipeBuilder.VatRecipeParams();
        params.machines.add("tfmg:freezing");
        params.machines.add("tfmg:freezing");
        params.machines.add("tfmg:freezing");
        return params;
    }

    public VatMachineRecipeBuilder.VatRecipeParams arcBlasting() {
        VatMachineRecipeBuilder.VatRecipeParams params = new VatMachineRecipeBuilder.VatRecipeParams();
        params.machines.add("tfmg:graphite_electrode");
        params.machines.add("tfmg:graphite_electrode");
        params.machines.add("tfmg:graphite_electrode");
        params.minSize = 9;
        params.allowedVatTypes = new ArrayList<>();
        params.allowedVatTypes.add("tfmg:firebrick_lined_vat");
        return params;
    }
}
