package com.cosmads.chemica.data.recipes;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.recipes.values.create.ChemicaCompactingRecipeGen;
import com.cosmads.chemica.registry.ChemicaFluids;
import com.drmangotea.tfmg.datagen.recipes.values.create.TFMGCompactingRecipeGen;
import com.drmangotea.tfmg.registry.TFMGFluids;
import com.drmangotea.tfmg.registry.TFMGItems;
import com.simibubi.create.api.data.recipe.ProcessingRecipeGen;
import com.simibubi.create.foundation.data.recipe.CommonMetal;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.material.Fluid;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@ParametersAreNonnullByDefault
public class ChemicaRecipeProvider extends RecipeProvider {

    static final List<ProcessingRecipeGen<?, ?, ?>> GENERATORS = new ArrayList<>();

    protected final List<GeneratedRecipe> all = new ArrayList<>();

    public ChemicaRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        all.forEach(c -> c.register(pRecipeOutput));
        Chemica.LOGGER.info("{} registered {} recipe{}", getName(), all.size(), all.size() == 1 ? "" : "s");
    }

    public static void registerAllProcessing(DataGenerator gen, PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {

        GENERATORS.add(new ChemicaCompactingRecipeGen(output, registries));

        gen.addProvider(true, new DataProvider() {

            @Override
            public @NotNull String getName() {
                return "Chemica's Processing Recipes";
            }

            @Override
            public @NotNull CompletableFuture<?> run(CachedOutput dc) {
                List<CompletableFuture<?>> futures = new ArrayList<>();

                for (ProcessingRecipeGen<?, ?, ?> generator : GENERATORS) {
                    String generatorName = generator.getClass().getSimpleName();
                    try {
                        CompletableFuture<?> future = generator.run(dc);
                        future = future.exceptionally(ex -> {
                            Chemica.LOGGER.error("Processing recipe gen '{}' failed to write recipes", generatorName, ex);
                            throw new RuntimeException("Failed in generator: " + generatorName, ex);
                        });
                        futures.add(future);
                    } catch (Throwable t) {
                        Chemica.LOGGER.error("Processing recipe gen '{}' threw synchronously", generatorName, t);
                        throw new RuntimeException("Failed in generator: " + generatorName, t);
                    }
                }

                return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));
            }
        });
    }

    protected GeneratedRecipe register(GeneratedRecipe recipe) {
        all.add(recipe);
        return recipe;
    }

    @FunctionalInterface
    public interface GeneratedRecipe {
        void register(RecipeOutput output);
    }

    public static class Marker {
    }

    public static class I {
        public static TagKey<Item> steelIngot() {
            return CommonMetal.STEEL.ingots;
        }
        public static TagKey<Item> steelNugget() {
            return CommonMetal.STEEL.nuggets;
        }
        public static TagKey<Item> steelSheet() {
            return CommonMetal.STEEL.plates;
        }

        public static ItemLike magnet() {
            return TFMGItems.MAGNET.get();
        }
    }

    public static class F {
        //Regular
        public static Fluid acetone() {
            return ChemicaFluids.ACETONE.getSource();
        }
        public static Fluid acetonitrile() {
            return ChemicaFluids.ACETONITRILE.getSource();
        }
        public static Fluid adipicAcidSolution() {
            return ChemicaFluids.ADIPIC_ACID_SOLUTION.getSource();
        }
        public static Fluid amineCatalyst() {
            return ChemicaFluids.AMINE_CATALYST.getSource();
        }
        public static Fluid aromaticMix() {
            return ChemicaFluids.AROMATIC_MIX.getSource();
        }
        public static Fluid benzene() {
            return ChemicaFluids.BENZENE.getSource();
        }
        public static Fluid brine() {
            return ChemicaFluids.BRINE.getSource();
        }
        public static Fluid causticSoda() {
            return ChemicaFluids.CAUSTIC_SODA.getSource();
        }
        public static Fluid cumene() {
            return ChemicaFluids.CUMENE.getSource();
        }
        public static Fluid cyclohexane() {
            return ChemicaFluids.CYCLOHEXANE.getSource();
        }
        public static Fluid cyclohexanol() {
            return ChemicaFluids.CYCLOHEXANOL.getSource();
        }
        public static Fluid distilledWater() {
            return ChemicaFluids.DISTILLED_WATER.getSource();
        }
        public static Fluid epoxyPrecursor() {
            return ChemicaFluids.EPOXY_PRECURSOR.getSource();
        }
        public static Fluid epoxyResin() {
            return ChemicaFluids.EPOXY_RESIN.getSource();
        }
        public static Fluid ethylbenzene() {
            return ChemicaFluids.ETHYLBENZENE.getSource();
        }
        public static Fluid ethylTertButylEther() {
            return ChemicaFluids.ETHYL_TERT_BUTYL_ETHER.getSource();
        }
        public static Fluid gasolineAdditiveMix() {
            return ChemicaFluids.GASOLINE_ADDITIVE_MIX.getSource();
        }
        public static Fluid glycerin() {
            return ChemicaFluids.GLYCERIN.getSource();
        }
        public static Fluid hexamethylenediamineSolution() {
            return ChemicaFluids.HEXAMETHYLENEDIAMINE_SOLUTION.getSource();
        }
        public static Fluid liquidHydrogen() {
            return ChemicaFluids.LIQUID_HYDROGEN.getSource();
        }
        public static Fluid mercury() {
            return ChemicaFluids.MERCURY.getSource();
        }
        public static Fluid nitroglycerin() {
            return ChemicaFluids.NITROGLYCERIN.getSource();
        }
        public static Fluid panPrecursor() {
            return ChemicaFluids.PAN_PRECURSOR.getSource();
        }
        public static Fluid phenol() {
            return ChemicaFluids.PHENOL.getSource();
        }
        public static Fluid platinumCatalystCarrier() {
            return ChemicaFluids.PLATINUM_CATALYST_CARRIER.getSource();
        }
        public static Fluid polyethylene() {
            return ChemicaFluids.POLYETHYLENE.getSource();
        }
        public static Fluid polyvinylChloride() {
            return ChemicaFluids.POLYVINYL_CHLORIDE.getSource();
        }
        public static Fluid seedOil() {
            return ChemicaFluids.SEED_OIL.getSource();
        }
        public static Fluid sucroseSolution() {
            return ChemicaFluids.SUCROSE_SOLUTION.getSource();
        }
        public static Fluid solderSolution() {
            return ChemicaFluids.SOLDER_SOLUTION.getSource();
        }
        public static Fluid tetraethyllead() {
            return ChemicaFluids.TETRAETHYLLEAD.getSource();
        }
        public static Fluid titaniumTetrachloride() {
            return ChemicaFluids.TITANIUM_TETRACHLORIDE.getSource();
        }
        public static Fluid toluene() {
            return ChemicaFluids.TOLUENE.getSource();
        }
        public static Fluid wasteSlurry() {
            return ChemicaFluids.WASTE_SLURRY.getSource();
        }
        public static Fluid xylene() {
            return ChemicaFluids.XYLENE.getSource();
        }
        //Acid
        public static Fluid chromicAcid() {
            return ChemicaFluids.CHROMIC_ACID.getSource();
        }
        public static Fluid hydrochloricAcid() {
            return ChemicaFluids.HYDROCHLORIC_ACID.getSource();
        }
        public static Fluid hydrofluoricAcid() {
            return ChemicaFluids.HYDROFLUORIC_ACID.getSource();
        }
        public static Fluid nitricAcid() {
            return ChemicaFluids.NITRIC_ACID.getSource();
        }
        public static Fluid phosphoricAcid() {
            return ChemicaFluids.PHOSPHORIC_ACID.getSource();
        }
        public static Fluid sulfuricNickelSolution() {
            return ChemicaFluids.SULFURIC_NICKEL_SOLUTION.getSource();
        }
        //Molten
        public static Fluid moltenGlass() {
            return ChemicaFluids.MOLTEN_GLASS.getSource();
        }
        public static Fluid moltenNylon() {
            return ChemicaFluids.MOLTEN_NYLON.getSource();
        }
        public static Fluid moltenTitanium() {
            return ChemicaFluids.MOLTEN_TITANIUM.getSource();
        }
        public static Fluid moltenTungstenCarbide() {
            return ChemicaFluids.MOLTEN_TUNGSTEN_CARBIDE.getSource();
        }
        //Gasses
        public static Fluid ammonia() {
            return ChemicaFluids.AMMONIA.getSource();
        }
        public static Fluid argon() {
            return ChemicaFluids.ARGON.getSource();
        }
        public static Fluid butene() {
            return ChemicaFluids.BUTENE.getSource();
        }
        public static Fluid carbonMonoxide() {
            return ChemicaFluids.CARBON_MONOXIDE.getSource();
        }
        public static Fluid chlorine() {
            return ChemicaFluids.CHLORINE.getSource();
        }
        public static Fluid epichlorohydrin() {
            return ChemicaFluids.EPICHLOROHYDRIN.getSource();
        }
        public static Fluid ethane() {
            return ChemicaFluids.ETHANE.getSource();
        }
        public static Fluid fluorine() {
            return ChemicaFluids.FLUORINE.getSource();
        }
        public static Fluid helium() {
            return ChemicaFluids.HELIUM.getSource();
        }
        public static Fluid lightHydrocarbons() {
            return ChemicaFluids.LIGHT_HYDROCARBONS.getSource();
        }
        public static Fluid methane() {
            return ChemicaFluids.METHANE.getSource();
        }
        public static Fluid nitrogen() {
            return ChemicaFluids.NITROGEN.getSource();
        }
        public static Fluid nitrogenDioxide() {
            return ChemicaFluids.NITROGEN_DIOXIDE.getSource();
        }
        public static Fluid nitrousOxide() {
            return ChemicaFluids.NITROUS_OXIDE.getSource();
        }
        public static Fluid oxygen() {
            return ChemicaFluids.OXYGEN.getSource();
        }
        public static Fluid propene() {
            return ChemicaFluids.PROPENE.getSource();
        }
        public static Fluid reformate() {
            return ChemicaFluids.REFORMATE.getSource();
        }
        public static Fluid steam() {
            return ChemicaFluids.STEAM.getSource();
        }
        public static Fluid syngas() {
            return ChemicaFluids.SYNGAS.getSource();
        }
        public static Fluid tungstenHexafluoride() {
            return ChemicaFluids.TUNGSTEN_HEXAFLUORIDE.getSource();
        }
        public static Fluid vinylChlorideMonomer() {
            return ChemicaFluids.VINYL_CHLORIDE_MONOMER.getSource();
        }
        //Fuels
        public static Fluid biodiesel() {
            return ChemicaFluids.BIODIESEL.getSource();
        }
        public static Fluid ethanol() {
            return ChemicaFluids.ETHANOL.getSource();
        }
        public static Fluid highOctaneGasoline() {
            return ChemicaFluids.HIGH_OCTANE_GASOLINE.getSource();
        }
        public static Fluid highCetaneDiesel() {
            return ChemicaFluids.HIGH_CETANE_DIESEL.getSource();
        }
        public static Fluid hydrogenFuel() {
            return ChemicaFluids.HYDROGEN_FUEL.getSource();
        }
    }
}
