package com.cosmads.chemica.data.recipes.values.create;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.ChemMaterial;
import com.cosmads.chemica.data.tags.ChemicaTags;
import com.cosmads.chemica.registry.ChemicaFluids;
import com.cosmads.chemica.registry.ChemicaItems;
import com.drmangotea.tfmg.registry.TFMGBlocks;
import com.drmangotea.tfmg.registry.TFMGItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import com.simibubi.create.content.fluids.transfer.FillingRecipe;
import com.simibubi.create.content.kinetics.deployer.DeployerApplicationRecipe;
import com.simibubi.create.content.kinetics.press.PressingRecipe;
import com.simibubi.create.content.kinetics.saw.CuttingRecipe;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

public class ChemicaSequencedAssemblyRecipeGen extends SequencedAssemblyRecipeGen {

    GeneratedRecipe

    CONDUCTIVE_PASTE = create("conductive_paste", b -> b.require(ChemMaterial.POLYETHYLENE.plates)
            .transitionTo(ChemicaItems.UNFINISHED_CONDUCTIVE_PASTE)
            .addOutput(ChemicaItems.CONDUCTIVE_PASTE, 1)
            .loops(1)
            .addStep(CuttingRecipe::new, rb -> rb)
            .addStep(PressingRecipe::new, rb -> rb)
            .addStep(FillingRecipe::new, rb -> rb.require(ChemicaTags.Fluids.SOLDER_SOLUTION.tag, 1000))),

    ADVANCED_CIRCUIT_BOARD = create("advanced_circuit_board", b -> b.require(ChemicaItems.ETCHED_EPOXY_CIRCUIT_BOARD)
            .transitionTo(ChemicaItems.UNFINISHED_ADVANCED_CIRCUIT_BOARD)
            .addOutput(ChemicaItems.ADVANCED_CIRCUIT_BOARD, 1)
            .loops(4)
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(ChemicaItems.TANTALUM_CAPACITOR_ITEM))
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(TFMGBlocks.RESISTOR))
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(TFMGItems.TRANSISTOR))
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(TFMGBlocks.RESISTOR))),

    ELECTRONIC_CIRCUIT = create("electronic_circuit", b -> b.require(ChemicaItems.ETCHED_PVC_CIRCUIT_BOARD)
            .transitionTo(ChemicaItems.UNFINISHED_ELECTRONIC_CIRCUIT_BOARD)
            .addOutput(ChemicaItems.ELECTRONIC_CIRCUIT, 1)
            .loops(4)
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(ChemicaItems.TANTALUM_CAPACITOR_ITEM))
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(TFMGBlocks.RESISTOR))
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(TFMGItems.TRANSISTOR))
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(TFMGBlocks.RESISTOR))
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(AllItems.ELECTRON_TUBE))),

    REINFORCED_IRIDIUM_PLATE = create("reinforced_iridium_plate", b -> b.require(ChemMaterial.IRIDIUM.plates)
            .transitionTo(ChemicaItems.UNFINISHED_REINFORCED_IRIDIUM_PLATE)
            .addOutput(ChemicaItems.REINFORCED_IRIDIUM_PLATE, 1)
            .loops(1)
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(ChemMaterial.IRIDIUM.ingots))
            .addStep(PressingRecipe::new, rb -> rb)
            .addStep(PressingRecipe::new, rb -> rb)),

    TANTALUM_CAPACITOR = create("tantalum_capacitor", b -> b.require(ChemMaterial.TANTALUM.plates)
            .transitionTo(ChemicaItems.UNFINISHED_TANTALUM_CAPACITOR)
            .addOutput(ChemicaItems.TANTALUM_CAPACITOR_ITEM.asStack(4), 1)
            .loops(1)
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(ChemMaterial.COPPER.plates))
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(ChemicaItems.CONDUCTIVE_PASTE))
            .addStep(DeployerApplicationRecipe::new, rb -> rb.require(ChemMaterial.COPPER.plates)))

            ;

    public ChemicaSequencedAssemblyRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }

}
