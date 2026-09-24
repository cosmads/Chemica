package com.cosmads.chemica.data;

import com.cosmads.chemica.Chemica;
import com.drmangotea.tfmg.registry.TFMGFluids;
import com.simibubi.create.AllItems;
import dev.metallurgists.rutile.api.data.provider.composition.FluidCompositionProvider;
import dev.metallurgists.rutile.api.data.provider.composition.ItemCompositionProvider;
import dev.metallurgists.rutile.registry.RutileElements;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.cosmads.chemica.registry.ChemicaBlocks.*;
import static com.cosmads.chemica.registry.ChemicaFluids.*;
import static com.cosmads.chemica.registry.ChemicaItems.*;

public class ChemicaRutileProvider {

    public static class Item extends ItemCompositionProvider {

        public Item(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(Chemica.MOD_ID, output, registries);
        }

        @Override
        public void generate(HolderLookup.Provider registries) {
            //Standalone Dusts
            addData("copper", List.of(COPPER_DUST.asItem()), c -> c.element(RutileElements.Cu));
            addData("gold", List.of(GOLD_DUST.asItem()), c -> c.element(RutileElements.Au));
            addData("iron", List.of(IRON_DUST.asItem()), c -> c.element(RutileElements.Fe));
            addData("nickel", List.of(NICKEL_DUST.asItem()), c -> c.element(RutileElements.Ni));
            addData("silicon", List.of(SILICON_DUST.asItem()), c -> c.element(RutileElements.Si));
            addData("zinc", List.of(ZINC_DUST.asItem()), c -> c.element(RutileElements.Zn));
            addData("arsenic", List.of(ARSENIC_DUST.asItem()), c -> c.element(RutileElements.As));
            addData("carbon", List.of(COAL_DUST.asItem()), c -> c.element(RutileElements.C));
            addData("constantan", List.of(CONSTANTAN_DUST.asItem()), c -> c.element(RutileElements.Cu).element(RutileElements.Ni));
            addData("electrum", List.of(ELECTRUM_GRIT.asItem()), c -> c.element(RutileElements.Ag).element(RutileElements.Au));
            addData("fluorite", List.of(FLUORITE_DUST.asItem()), c -> c.element(RutileElements.Ca).element(RutileElements.F, 2));
            addData("phosphorous", List.of(PHOSPHORUS_DUST.asItem(), DEEPSLATE_PHOSPHORUS_ORE.asItem()), c -> c.element(RutileElements.P));
            addData("quartz", List.of(QUARTZ_DUST.asItem()), c -> c.element(RutileElements.Si).element(RutileElements.O, 2));
            addData("sodium_chloride", List.of(SALT.asItem()), c -> c.element(RutileElements.Na).element(RutileElements.Cl));
            addData("sodium_carbonate", List.of(SODA_ASH.asItem()), c -> c.element(RutileElements.Na, 2).element(RutileElements.C).element(RutileElements.O, 3));
            addData("sodium_bisulfate", List.of(SODIUM_BISULFATE_DUST.asItem()), c -> c.element(RutileElements.Na).element(RutileElements.H).element(RutileElements.S).element(RutileElements.O, 4));
            addData("sodium_persulfate", List.of(SODIUM_PERSULFATE.asItem()), c -> c.element(RutileElements.Na, 2).element(RutileElements.S, 2).element(RutileElements.O, 8));

            // Metals (Ores have impurities)
            addData("antimony", List.of(ANTIMONY_DUST.asItem(), CRUSHED_RAW_ANTIMONY.asItem(), ANTIMONY_INGOT.asItem(), ANTIMONY_NUGGET.asItem()), c -> c.element(RutileElements.Sb));
            addData("chromium", List.of(CHROMIUM_DUST.asItem(), CRUSHED_RAW_CHROMIUM.asItem(), CHROMIUM_INGOT.asItem(), CHROMIUM_NUGGET.asItem()), c -> c.element(RutileElements.Cr));
            addData("cobalt", List.of(COBALT_DUST.asItem(), CRUSHED_RAW_COBALT.asItem(), COBALT_INGOT.asItem(), COBALT_NUGGET.asItem()), c -> c.element(RutileElements.Co));
            addData("iridium", List.of(IRIDIUM_DUST.asItem(), IRIDIUM_INGOT.asItem(), IRIDIUM_NUGGET.asItem(), IRIDIUM_SHEET.asItem(), UNFINISHED_REINFORCED_IRIDIUM_PLATE.asItem(), REINFORCED_IRIDIUM_PLATE.asItem()), c -> c.element(RutileElements.Ir));
            addData("magnesium", List.of(MAGNESIUM_DUST.asItem(), MAGNESIUM_INGOT.asItem(), MAGNESIUM_NUGGET.asItem(), MAGNESIUM_SHEET.asItem()), c -> c.element(RutileElements.Mg));
            addData("molybdenum", List.of(MOLYBDENUM_INGOT.asItem(), MOLYBDENUM_NUGGET.asItem()), c -> c.element(RutileElements.Mo));
            addData("platinum", List.of(PLATINUM_DUST.asItem(), AllItems.CRUSHED_PLATINUM.asItem(), PLATINUM_INGOT.asItem(), PLATINUM_NUGGET.asItem(), PLATINUM_ELECTRODE.asItem(), PLATINUM_BLOCK.asItem(), RAW_PLATINUM_BLOCK.asItem()), c -> c.element(RutileElements.Pt));
            addData("silver", List.of(SILVER_DUST.asItem(), AllItems.CRUSHED_SILVER.asItem(), SILVER_INGOT.asItem(), SILVER_NUGGET.asItem(), SILVER_SHEET.asItem(), RAW_SILVER.asItem(), DEEPSLATE_SILVER_ORE.asItem()), c -> c.element(RutileElements.Ag));
            addData("sodium", List.of(SODIUM_DUST.asItem(), SODIUM_INGOT.asItem()), c -> c.element(RutileElements.Na));
            addData("tantalum", List.of(TANTALUM_DUST.asItem(), TANTALUM_INGOT.asItem(), TANTALUM_NUGGET.asItem(), TANTALUM_SHEET.asItem()), c -> c.element(RutileElements.Ta));
            addData("tin", List.of(TIN_DUST.asItem(), AllItems.CRUSHED_TIN.asItem(), TIN_INGOT.asItem(), TIN_NUGGET.asItem(), TIN_SHEET.asItem(), RAW_TIN.asItem(), TIN_ORE.asItem(), DEEPSLATE_TIN_ORE.asItem()), c -> c.element(RutileElements.Sn));
            addData("titanium", List.of(TITANIUM_DUST.asItem(), TITANIUM_INGOT.asItem(), TITANIUM_NUGGET.asItem(), TITANIUM_SHEET.asItem()), c -> c.element(RutileElements.Ti));
            addData("tungsten", List.of(TUNGSTEN_DUST.asItem(), TUNGSTEN_INGOT.asItem(), TUNGSTEN_NUGGET.asItem(), RAW_TUNGSTEN.asItem(), DEEPSLATE_WOLFRAMITE_ORE.asItem()), c -> c.element(RutileElements.W));
            addData("tungsten_carbide", List.of(TUNGSTEN_CARBIDE_DUST.asItem(), TUNGSTEN_CARBIDE_INGOT.asItem()), c -> c.element(RutileElements.W).element(RutileElements.C));
            addData("vanadium", List.of(VANADIUM_DUST.asItem(), CRUSHED_RAW_VANADIUM.asItem(), VANADIUM_INGOT.asItem(), VANADIUM_NUGGET.asItem()), c -> c.element(RutileElements.V));

            //Alloys
            addData("advanced_composite_tough_alloy", List.of(ADVANCED_COMPOSITE_TOUGH_ALLOY.asItem()), c -> c.element(RutileElements.V).element(RutileElements.C).element(RutileElements.Al));
            addData("heat_resistant_tough_alloy", List.of(HEAT_RESISTANT_TOUGH_ALLOY.asItem()), c -> c.element(RutileElements.NULL).element(RutileElements.W).element(RutileElements.Ir));
            addData("lightweight_tough_alloy", List.of(LIGHTWEIGHT_TOUGH_ALLOY.asItem()), c -> c.element(RutileElements.Al).element(RutileElements.Ti).element(RutileElements.Mg));
            addData("steel_based_tough_alloy", List.of(STEEL_BASED_TOUGH_ALLOY.asItem()), c -> c.element(RutileElements.Fe).element(RutileElements.Mo).element(RutileElements.Cr));

            //Catalysts
            addData("copper_catalyst", List.of(COPPER_CATALYST.asItem()), c -> c.element(RutileElements.Cu).element(RutileElements.S));
            addData("iron_catalyst", List.of(IRON_CATALYST.asItem()), c -> c.element(RutileElements.Fe).element(RutileElements.Ag).element(RutileElements.Na));
            addData("nickel_catalyst", List.of(NICKEL_CATALYST.asItem()), c -> c.element(RutileElements.Ni).element(RutileElements.Al).element(RutileElements.Na).element(RutileElements.O).element(RutileElements.H));
            addData("platinum_catalyst", List.of(PLATINUM_CATALYST.asItem()), c -> c.element(RutileElements.Pt).element(RutileElements.Fe).element(RutileElements.C));

            //Ores
            addData("fervorite", List.of(FERVORITE.asItem()), c -> c.element(RutileElements.Mg, 2).element(RutileElements.S));
            addData("zelosite", List.of(ZELOSITE.asItem()), c -> c.element(RutileElements.Ta).element(RutileElements.Ir).element(RutileElements.NULL));
            addData("antimony_ore", List.of(RAW_ANTIMONY.asItem(), DEEPSLATE_ANTIMONY_ORE.asItem()), c -> c.element(RutileElements.Sb));
            addData("chromite", List.of(RAW_CHROMITE.asItem(), DEEPSLATE_CHROMITE_ORE.asItem()), c -> c.element(RutileElements.Fe).element(RutileElements.Cr, 2).element(RutileElements.O, 4));
            addData("cobalt_ore", List.of(RAW_COBALT.asItem(), DEEPSLATE_COBALT_ORE.asItem()), c -> c.element(RutileElements.Co).element(RutileElements.Ni));
            addData("fluorite_ore", List.of(DEEPSLATE_FLUORITE_ORE.asItem()), c -> c.element(RutileElements.Ca).element(RutileElements.F, 2).element(RutileElements.Pb));
            addData("molybdenum_ore", List.of(RAW_MOLYBDENUM.asItem(), DEEPSLATE_MOLYBDENUM_ORE.asItem()), c -> c.element(RutileElements.Mo).element(RutileElements.Re));
            addData("platinum_ore", List.of(RAW_PLATINUM.asItem(), DEEPSLATE_PLATINUM_ORE.asItem()), c -> c.element(RutileElements.Pt, 2).element(RutileElements.Ir));
            addData("rutile_ore", List.of(DEEPSLATE_RUTILE_ORE.asItem(), MEDIUM_GRADE_RUTILE_CRYSTAL.asItem(), HIGH_GRADE_RUTILE_CRYSTAL.asItem()), c -> c.element(RutileElements.Ti).element(RutileElements.O, 2).element(RutileElements.Fe));
            addData("vanadium_ore", List.of(RAW_VANADIUM.asItem(), DEEPSLATE_VANADIUM_ORE.asItem()), c -> c.element(RutileElements.V).element(RutileElements.Fe));

            //Misc
            addData("graphite", List.of(GRAPHITE_INGOT.asItem(), GRAPHITE_SHEET.asItem(), GRAPHITE_NUGGET.asItem(), CRUSHED_GRAPHITE.asItem(), PURIFIED_GRAPHITE_FLAKES.asItem(), ELECTROCHEMICALLY_EXFOLIATED_GRAPHENE.asItem(), DEEPSLATE_GRAPHITE_ORE.asItem()), c -> c.element(RutileElements.C));
            addData("rutile", List.of(RUTILE_DUST.asItem(), RUTILE_CRYSTAL.asItem()), c -> c.element(RutileElements.Ti).element(RutileElements.O, 2));
            addData("carbon_fiber", List.of(CARBON_FIBER_COMPOSITE_SHEET.asItem(), CARBON_FIBER_STRANDS.asItem(), STABILIZED_FIBERS.asItem(), PAN_FIBERS.asItem()), c -> c.element(RutileElements.C));

            addData("ammonium_persulfate", List.of(AMMONIUM_PERSULFATE.asItem()), c -> c
                    .element(RutileElements.N).element(RutileElements.H, 4).setAmount(2).next()
                    .element(RutileElements.S, 2).element(RutileElements.O, 8));
            addData("sodium_hydroxide", List.of(CAUSTIC_SODA_DUST.asItem()), c -> c
                    .element(RutileElements.Na).element(RutileElements.O).element(RutileElements.H));
        }
    }

    public static class Fluid extends FluidCompositionProvider {

        public Fluid(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
            super(Chemica.MOD_ID, output, registries);
        }

        @Override
        public void generate(HolderLookup.Provider registries) {
            addData("acetone", ACETONE.get().getSource(), c -> c
                    .element(RutileElements.C).element(RutileElements.H, 3)
                    .setAmount(2).next()
                    .element(RutileElements.C).element(RutileElements.O));
            addData("acrylonitrile", ACETONITRILE.get().getSource(), c -> c
                    .element(RutileElements.C, 3).element(RutileElements.H, 3).element(RutileElements.N));
            addData("adipic_acid_solution", ADIPIC_ACID_SOLUTION.get().getSource(), c -> c
                    .element(RutileElements.C, 6).element(RutileElements.H, 10).element(RutileElements.O, 4));
            addData("benzene", BENZENE.get().getSource(), c -> c
                    .element(RutileElements.C, 6).element(RutileElements.H, 6));
            addData("sodium_hydroxide", CAUSTIC_SODA.get().getSource(), c -> c
                    .element(RutileElements.Na).element(RutileElements.O).element(RutileElements.H));
            addData("cumene", CUMENE.get().getSource(), c -> c
                    .element(RutileElements.C, 9).element(RutileElements.H, 12));
            addData("cyclohexane", CYCLOHEXANE.get().getSource(), c -> c
                    .element(RutileElements.C, 6).element(RutileElements.H, 12));
            addData("cyclohexanol", CYCLOHEXANOL.get().getSource(), c -> c
                    .element(RutileElements.C, 6).element(RutileElements.H, 12).element(RutileElements.O));
            addData("distilled_water", DISTILLED_WATER.get().getSource(), c -> c
                    .element(RutileElements.H, 2).element(RutileElements.O));
            addData("ethylbenzene", ETHYLBENZENE.get().getSource(), c -> c
                    .element(RutileElements.C, 8).element(RutileElements.H, 10));
            addData("glycerin", GLYCERIN.get().getSource(), c -> c
                    .element(RutileElements.C, 3).element(RutileElements.H, 8).element(RutileElements.O, 3));
        }
    }
}
