package com.cosmads.chemica.data.recipes.values.create;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.registry.ChemicaItems;
import com.drmangotea.tfmg.datagen.recipes.TFMGRecipeProvider;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.api.data.recipe.CompactingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.fluids.crafting.SizedFluidIngredient;

import java.util.concurrent.CompletableFuture;

import static com.cosmads.chemica.data.recipes.ChemicaRecipeProvider.F.*;


public class ChemicaCompactingRecipeGen extends CompactingRecipeGen {

    GeneratedRecipe

    CARBON_FIBER_STRANDS = create(Chemica.asResource("carbon_fiber_strands"), b -> b
            .require(SizedFluidIngredient.of(argon(),250))
            .require(ChemicaItems.STABILIZED_FIBERS)
            .require(ChemicaItems.STABILIZED_FIBERS)
            .output(ChemicaItems.CARBON_FIBER_STRANDS)
            .requiresHeat(HeatCondition.SUPERHEATED)
    ), CAUSTIC_SODA = create(Chemica.asResource("caustic_soda_dust"), b -> b
            .require(SizedFluidIngredient.of(causticSoda(),100))
            .output(ChemicaItems.CAUSTIC_SODA_DUST)
    ), CHROMIUM_DUST = create(Chemica.asResource("chromium_ingot"), b -> b
            .require(ChemicaItems.CHROMIUM_DUST)
            .output(ChemicaItems.CHROMIUM_INGOT)
            .requiresHeat(HeatCondition.HEATED)
    ), HYDROGEN_FUEL = create(Chemica.asResource("hydrogen_fuel"), b -> b
            .require(SizedFluidIngredient.of(syngas(),1000))
            .require(ChemicaItems.IRON_DUST)
            .output(hydrogenFuel(), 800)
            .output(Fluids.WATER, 200)
            .requiresHeat(HeatCondition.HEATED)
    ), LIQUID_HYDROGEN = create(Chemica.asResource("liquid_hydrogen"), b -> b
            .require(SizedFluidIngredient.of(TFMGRecipeProvider.F.hydrogen(),250))
            .output(liquidHydrogen(), 250)
            .requiresHeat(HeatCondition.SUPERHEATED)
    ), MOLTEN_NYLON = create(Chemica.asResource("molten_nylon"), b -> b
            .require(ChemicaItems.NYLON_SALT)
            .output(moltenNylon(), 100)
            .requiresHeat(HeatCondition.SUPERHEATED)
    ), PAN_FIBERS = create(Chemica.asResource("pan_fibers"), b -> b
            .require(SizedFluidIngredient.of(panPrecursor(),250))
            .output(ChemicaItems.PAN_FIBERS)
    ), SEED_OIL = create(Chemica.asResource("seed_oil"), b -> b
            .require(Tags.Items.SEEDS)
            .output(seedOil(), 150)
    ), STABILIZED_FIBERS = create(Chemica.asResource("stabilized_fibers"), b -> b
            .require(SizedFluidIngredient.of(oxygen(),250))
            .require(ChemicaItems.PAN_FIBERS)
            .require(ChemicaItems.PAN_FIBERS)
            .output(ChemicaItems.STABILIZED_FIBERS)
            .requiresHeat(HeatCondition.SUPERHEATED)
    ), TUNGSTEN_CARBIDE_DUST = create(Chemica.asResource("tungsten_carbide_dust"), b -> b
            .require(ChemicaItems.TUNGSTEN_DUST)
            .require(ChemicaItems.COAL_DUST)
            .output(ChemicaItems.TUNGSTEN_CARBIDE_DUST)
            .requiresHeat(HeatCondition.SUPERHEATED)
    )

            ;

    public ChemicaCompactingRecipeGen(PackOutput generator, CompletableFuture<HolderLookup.Provider> registries) {
        super(generator, registries, Chemica.MOD_ID);
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.COMPACTING;
    }
}
