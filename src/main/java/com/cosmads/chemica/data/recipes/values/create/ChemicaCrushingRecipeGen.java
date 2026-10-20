package com.cosmads.chemica.data.recipes.values.create;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.ChemMaterial;
import com.cosmads.chemica.registry.ChemicaBlocks;
import com.cosmads.chemica.registry.ChemicaItems;
import com.drmangotea.tfmg.TFMG;
import com.drmangotea.tfmg.registry.TFMGBlocks;
import com.drmangotea.tfmg.registry.TFMGItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.AllRecipeTypes;
import com.simibubi.create.Create;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import com.simibubi.create.content.kinetics.crusher.CrushingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipe;
import com.simibubi.create.content.processing.recipe.ProcessingRecipeBuilder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.FalseCondition;

import java.util.concurrent.CompletableFuture;
import java.util.function.UnaryOperator;

import static com.drmangotea.tfmg.datagen.recipes.TFMGRecipeProvider.I.experienceNugget;

public class ChemicaCrushingRecipeGen extends CrushingRecipeGen {

    GeneratedRecipe

            ANTIMONY_INGOT = crushIngot(ChemicaItems.ANTIMONY_DUST, ChemMaterial.ANTIMONY),
            CHROMIUM_INGOT = crushIngot(ChemicaItems.CHROMIUM_DUST, ChemMaterial.CHROMIUM),
            COBALT_INGOT = crushIngot(ChemicaItems.COBALT_DUST, ChemMaterial.COBALT),
            CONSTANTAN_INGOT = crushIngot(ChemicaItems.CONSTANTAN_DUST, ChemMaterial.CONSTANTAN),
            COPPER_INGOT = crushIngot(ChemicaItems.COPPER_DUST, ChemMaterial.COPPER),
            GOLD_INGOT = crushIngot(ChemicaItems.GOLD_DUST, ChemMaterial.GOLD),
            IRIDIUM_INGOT = crushIngot(ChemicaItems.IRIDIUM_DUST, ChemMaterial.IRIDIUM),
            IRON_INGOT = crushIngot(ChemicaItems.IRON_DUST, ChemMaterial.IRON),
            MAGNESIUM_INGOT = crushIngot(ChemicaItems.MAGNESIUM_DUST, ChemMaterial.MAGNESIUM),
            NICKEL_INGOT = crushIngot(ChemicaItems.NICKEL_DUST, ChemMaterial.NICKEL),
            PLATINUM_INGOT = crushIngot(ChemicaItems.PLATINUM_DUST, ChemMaterial.PLATINUM),
            SILICON_INGOT = crushIngot(ChemicaItems.SILICON_DUST, ChemMaterial.SILICON),
            SILVER_INGOT = crushIngot(ChemicaItems.SILVER_DUST, ChemMaterial.SILVER),
            SODIUM_INGOT = crushIngot(ChemicaItems.SODIUM_DUST, ChemMaterial.SODIUM),
            TANTALUM_INGOT = crushIngot(ChemicaItems.TANTALUM_DUST, ChemMaterial.TANTALUM),
            TIN_INGOT = crushIngot(ChemicaItems.TIN_DUST, ChemMaterial.TIN),
            TITANIUM_INGOT = crushIngot(ChemicaItems.TITANIUM_DUST, ChemMaterial.TITANIUM),
            VANADIUM_INGOT = crushIngot(ChemicaItems.VANADIUM_DUST, ChemMaterial.VANADIUM),
            ZINC_INGOT = crushIngot(ChemicaItems.ZINC_DUST, ChemMaterial.ZINC),

    CHARCOAL = create(Chemica.asResource("charcoal"), b -> b
            .require(Items.CHARCOAL)
            .output(ChemicaItems.CHARCOAL_DUST)
            .output(.25f, ChemicaItems.CHARCOAL_DUST)
            .output(.25f, ChemicaItems.CHARCOAL_DUST)),

    QUARTZ = create(Chemica.asResource("quartz"), b -> b
            .require(Items.QUARTZ)
            .output(ChemicaItems.QUARTZ_DUST)
            .output(.25f, ChemicaItems.QUARTZ_DUST)),

    DEEPSLATE_ANTIMONY = create(Chemica.asResource("deepslate_antimony_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_ANTIMONY_ORE)
            .output(ChemicaItems.CRUSHED_RAW_ANTIMONY)
            .output(.03f, ChemicaItems.ARSENIC_DUST)
            .output(.75f, experienceNugget())
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    DEEPSLATE_CHROMITE = create(Chemica.asResource("deepslate_chromite_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_CHROMITE_ORE)
            .output(ChemicaItems.CRUSHED_RAW_CHROMIUM, 2)
            .output(.2f, AllItems.CRUSHED_IRON)
            .output(.75f, experienceNugget())
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    DEEPSLATE_COBALT = create(Chemica.asResource("deepslate_cobalt_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_COBALT_ORE)
            .output(ChemicaItems.CRUSHED_RAW_COBALT, 2)
            .output(.11f, ChemicaItems.NICKEL_DUST)
            .output(.75f, experienceNugget())
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    DEEPSLATE_FLUORITE = create(Chemica.asResource("deepslate_fluorite_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_FLUORITE_ORE)
            .output(ChemicaItems.FLUORITE_DUST, 4)
            .output(.25f, ChemicaItems.FLUORITE_DUST)
            .output(.1f, AllItems.CRUSHED_LEAD)
            .output(.5f, experienceNugget(), 1)
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    DEEPSLATE_GRAPHITE = create(Chemica.asResource("deepslate_graphite_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_GRAPHITE_ORE)
            .output(ChemicaItems.CRUSHED_GRAPHITE, 2)
            .output(.75f, experienceNugget())
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    //DEEPSLATE_MOLYBDENUM = create(Chemica.asResource("deepslate_molybdenum_ore"), b -> b
    //        .require(ChemicaBlocks.DEEPSLATE_MOLYBDENUM_ORE)
    //        .output(ChemicaItems.CRUSHED_RAW_MOLYBDENUM, 2)
    //        .output(.04f, ChemicaItems.RHENIUM_DUST)
    //        .output(.75f, experienceNugget())
    //        .output(.12f, Items.COBBLED_DEEPSLATE)
    //        .duration(350)),

    DEEPSLATE_PHOSPHORUS = create(Chemica.asResource("deepslate_phosphorus_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_PHOSPHORUS_ORE)
            .output(ChemicaItems.PHOSPHORUS_DUST, 3)
            .output(.1f, ChemicaItems.PHOSPHORUS_DUST)
            .output(.03f, ChemicaItems.ARSENIC_DUST)
            .output(.5f, experienceNugget())
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    STONE_PHOSPHORUS = create(Chemica.asResource("phosphorus_ore"), b -> b
            .require(ChemicaBlocks.PHOSPHORUS_ORE)
            .output(ChemicaItems.PHOSPHORUS_DUST, 2)
            .output(.1f, ChemicaItems.PHOSPHORUS_DUST)
            .output(.03f, ChemicaItems.ARSENIC_DUST)
            .output(.5f, experienceNugget())
            .output(.12f, Items.COBBLESTONE)
            .duration(350)),

    DEEPSLATE_PLATINUM = create(Chemica.asResource("deepslate_platinum_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_PLATINUM_ORE)
            .output(AllItems.CRUSHED_PLATINUM, 2)
            .output(.08f, ChemicaItems.PLATINUM_DUST)
            .output(.02f, ChemicaItems.IRIDIUM_DUST)
            .output(.75f, experienceNugget())
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    DEEPSLATE_RUTILE = create(Chemica.asResource("deepslate_rutile_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_RUTILE_ORE)
            .output(.5f, ChemicaItems.RUTILE_CRYSTAL, 2)
            .output(.3f, ChemicaItems.MEDIUM_GRADE_RUTILE_CRYSTAL)
            .output(.2f, ChemicaItems.HIGH_GRADE_RUTILE_CRYSTAL)
            .output(.1f, ChemicaItems.RUTILE_DUST)
            .output(.05f, ChemicaItems.IRON_DUST)
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    DEEPSLATE_SILVER = create(Chemica.asResource("deepslate_silver_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_SILVER_ORE)
            .output(AllItems.CRUSHED_SILVER, 3)
            .output(.03f, ChemicaItems.ARSENIC_DUST)
            .output(.75f, experienceNugget())
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    DEEPSLATE_TIN = create(Chemica.asResource("deepslate_tin_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_TIN_ORE)
            .output(AllItems.CRUSHED_TIN, 2)
            .output(.25f, AllItems.CRUSHED_TIN)
            .output(.02f, ChemicaItems.ARSENIC_DUST)
            .output(.75f, experienceNugget())
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    STONE_TIN = create(Chemica.asResource("tin_ore"), b -> b
            .require(ChemicaBlocks.TIN_ORE)
            .output(AllItems.CRUSHED_TIN, 2)
            .output(.02f, ChemicaItems.ARSENIC_DUST)
            .output(.75f, experienceNugget())
            .output(.12f, Items.COBBLESTONE)
            .duration(350)),

    DEEPSLATE_VANADIUM = create(Chemica.asResource("deepslate_vanadium_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_VANADIUM_ORE)
            .output(ChemicaItems.CRUSHED_RAW_VANADIUM)
            .output(.2f, AllItems.CRUSHED_IRON)
            .output(.75f, experienceNugget())
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(350)),

    DEEPSLATE_WOLFRAMITE = create(Chemica.asResource("deepslate_wolframite_ore"), b -> b
            .require(ChemicaBlocks.DEEPSLATE_WOLFRAMITE_ORE)
            .output(ChemicaItems.RAW_TUNGSTEN)
            .output(.02f, ChemicaItems.ARSENIC_DUST)
            .output(.75f, experienceNugget())
            .output(.12f, Items.COBBLED_DEEPSLATE)
            .duration(450)),

    FERVORITE = create(Chemica.asResource("fervorite"), b -> b
            .require(ChemicaBlocks.FERVORITE)
            .output(.3f, ChemicaItems.MAGNESIUM_DUST, 2)
            .output(.2f, TFMGItems.SULFUR_DUST)
            .duration(250)),

    ZELOSITE = create(Chemica.asResource("zelosite"), b -> b
            .require(ChemicaBlocks.ZELOSITE)
            .output(.21f, ChemicaItems.TANTALUM_NUGGET, 3)
            .output(.17f, ChemicaItems.IRIDIUM_DUST)
            .output(.02f, Items.NETHERITE_SCRAP)
            .duration(400)),

    HG_RUTILE = create(Chemica.asResource("high_grade_rutile_crystal"), b -> b
            .require(ChemicaItems.HIGH_GRADE_RUTILE_CRYSTAL)
            .output(ChemicaItems.RUTILE_DUST, 3)
            .output(.25f, ChemicaItems.RUTILE_DUST)
            .output(.35f, experienceNugget())
            .duration(100)),

    MG_RUTILE = create(Chemica.asResource("medium_grade_rutile_crystal"), b -> b
            .require(ChemicaItems.MEDIUM_GRADE_RUTILE_CRYSTAL)
            .output(ChemicaItems.RUTILE_DUST, 2)
            .output(.25f, ChemicaItems.RUTILE_DUST)
            .output(.2f, experienceNugget())
            .duration(100)),

    RUTILE = create(Chemica.asResource("rutile_crystal"), b -> b
            .require(ChemicaItems.RUTILE_CRYSTAL)
            .output(ChemicaItems.RUTILE_DUST)
            .output(.1f, experienceNugget())
            .duration(100)),

    NYLON_SALT = create(Chemica.asResource("nylon_salt_crystals"), b -> b
            .require(ChemicaItems.NYLON_SALT_CRYSTALS)
            .output(ChemicaItems.NYLON_SALT, 2)
            .duration(100)),

    RAW_PLATINUM_BLOCK = create(Chemica.asResource("raw_platinum_block"), b -> b
            .require(ChemicaBlocks.RAW_PLATINUM_BLOCK)
            .output(AllItems.CRUSHED_PLATINUM, 9)
            .output(.75f, experienceNugget(), 9)
            .duration(400));

    GeneratedRecipe

    COPPER_ORE = create(Chemica.asResource("copper_ore"), b -> b
            .require(Items.COPPER_ORE)
            .duration(250)
            .output(AllItems.CRUSHED_COPPER, 5)
            .output(0.25f, AllItems.CRUSHED_COPPER)
            .output(0.75f, AllItems.EXP_NUGGET)
            .output(0.125f, Items.COBBLESTONE)
            .output(0.125f, ChemicaItems.ARSENIC_DUST)),

    DEEPSLATE_COPPER_ORE = create(Chemica.asResource("deepslate_copper_ore"), b -> b
            .require(Items.DEEPSLATE_COPPER_ORE)
            .duration(350)
            .output(AllItems.CRUSHED_COPPER, 7)
            .output(0.25f, AllItems.CRUSHED_COPPER)
            .output(0.75f, AllItems.EXP_NUGGET)
            .output(0.125f, Items.COBBLED_DEEPSLATE)
            .output(0.125f, ChemicaItems.ARSENIC_DUST)),

    IRON_ORE = create(Chemica.asResource("iron_ore"), b -> b
            .require(Items.IRON_ORE)
            .duration(250)
            .output(AllItems.CRUSHED_IRON)
            .output(0.25f, AllItems.CRUSHED_IRON)
            .output(0.75f, AllItems.EXP_NUGGET)
            .output(0.125f, Items.COBBLESTONE)
            .output(0.08f, ChemicaItems.VANADIUM_DUST)),

    DEEPSLATE_IRON_ORE = create(Chemica.asResource("deepslate_iron_ore"), b -> b
            .require(Items.DEEPSLATE_IRON_ORE)
            .duration(350)
            .output(AllItems.CRUSHED_IRON, 2)
            .output(0.25f, AllItems.CRUSHED_IRON)
            .output(0.75f, AllItems.EXP_NUGGET)
            .output(0.125f, Items.COBBLED_DEEPSLATE)
            .output(0.08f, ChemicaItems.VANADIUM_DUST)),

    GOLD_ORE = create(Chemica.asResource("gold_ore"), b -> b
            .require(Items.GOLD_ORE)
            .duration(250)
            .output(AllItems.CRUSHED_GOLD)
            .output(0.25f, AllItems.CRUSHED_GOLD)
            .output(0.75f, AllItems.EXP_NUGGET, 2)
            .output(0.125f, Items.COBBLESTONE)
            .output(0.125f, ChemicaItems.ARSENIC_DUST)),

    DEEPSLATE_GOLD_ORE = create(Chemica.asResource("deepslate_gold_ore"), b -> b
            .require(Items.DEEPSLATE_GOLD_ORE)
            .duration(350)
            .output(AllItems.CRUSHED_GOLD, 2)
            .output(0.25f, AllItems.CRUSHED_GOLD)
            .output(0.75f, AllItems.EXP_NUGGET, 2)
            .output(0.125f, Items.COBBLED_DEEPSLATE)
            .output(0.125f, ChemicaItems.ARSENIC_DUST)),

    EMERALD_ORE = create(Chemica.asResource("emerald_ore"), b -> b
            .require(Items.EMERALD_ORE)
            .duration(350)
            .output(Items.EMERALD)
            .output(0.25f, Items.EMERALD)
            .output(0.75f, AllItems.EXP_NUGGET)
            .output(0.125f, Items.COBBLESTONE)
            .output(0.2f, ChemicaItems.CHROMIUM_DUST)),

    DEEPSLATE_EMERALD_ORE = create(Chemica.asResource("deepslate_emerald_ore"), b -> b
            .require(Items.DEEPSLATE_EMERALD_ORE)
            .duration(450)
            .output(Items.EMERALD, 2)
            .output(0.25f, Items.EMERALD)
            .output(0.75f, AllItems.EXP_NUGGET)
            .output(0.125f, Items.COBBLED_DEEPSLATE)
            .output(0.2f, ChemicaItems.CHROMIUM_DUST)),

    REDSTONE_ORE = create(Chemica.asResource("redstone_ore"), b -> b
            .require(Items.REDSTONE_ORE)
            .duration(250)
            .output(Items.REDSTONE, 6)
            .output(0.5f, Items.REDSTONE)
            .output(0.75f, AllItems.EXP_NUGGET)
            .output(0.125f, Items.COBBLESTONE)
            .output(0.5f, TFMGItems.SULFUR_DUST)),

    DEEPSLATE_REDSTONE_ORE = create(Chemica.asResource("deepslate_redstone_ore"), b -> b
            .require(Items.DEEPSLATE_REDSTONE_ORE)
            .duration(350)
            .output(Items.REDSTONE, 7)
            .output(0.5f, Items.REDSTONE)
            .output(0.75f, AllItems.EXP_NUGGET)
            .output(0.125f, Items.COBBLED_DEEPSLATE)
            .output(0.5f, TFMGItems.SULFUR_DUST)),

    LEAD_ORE = create(TFMG.asResource("lead_ore"), b -> b
            .require(TFMGBlocks.LEAD_ORE)
            .duration(400)
            .output(AllItems.CRUSHED_LEAD)
            .output(0.25f, AllItems.CRUSHED_LEAD)
            .output(0.75f, experienceNugget())
            .output(0.125f, Items.COBBLESTONE)
            .output(0.075f, ChemicaItems.SILVER_DUST)),

    DEEPSLATE_LEAD_ORE = create(TFMG.asResource("deepslate_lead_ore"), b -> b
            .require(TFMGBlocks.DEEPSLATE_LEAD_ORE)
            .output(AllItems.CRUSHED_LEAD, 2)
            .output(0.25f, AllItems.CRUSHED_LEAD)
            .output(0.75f, experienceNugget())
            .output(0.12f, Items.COBBLED_DEEPSLATE)
            .output(0.075f, ChemicaItems.SILVER_DUST)),

    NICKEL_ORE = create(TFMG.asResource("nickel_ore"), b -> b
            .require(TFMGBlocks.NICKEL_ORE)
            .output(AllItems.CRUSHED_NICKEL)
            .output(0.25f, AllItems.CRUSHED_NICKEL)
            .output(0.75f, experienceNugget())
            .output(0.12f,Items.COBBLESTONE)
            .output(0.11f, ChemicaItems.COBALT_DUST)),

    DEEPSLATE_NICKEL_ORE = create(TFMG.asResource("deepslate_nickel_ore"), b -> b
            .require(TFMGBlocks.DEEPSLATE_NICKEL_ORE)
            .output(AllItems.CRUSHED_NICKEL, 2)
            .output(0.25f, AllItems.CRUSHED_NICKEL)
            .output(0.75f, experienceNugget())
            .output(0.12f, Items.COBBLED_DEEPSLATE)
            .output(0.11f, ChemicaItems.COBALT_DUST));

    //Overriding recipes
    GeneratedRecipe
            C_COPPER_ORE = overrideOther(Create.asResource("copper_ore")),
            C_IRON_ORE = overrideOther(Create.asResource("iron_ore")),
            C_GOLD_ORE = overrideOther(Create.asResource("gold_ore")),
            C_EMERALD_ORE = overrideOther(Create.asResource("emerald_ore")),
            C_REDSTONE_ORE = overrideOther(Create.asResource("redstone_ore")),
            C_DEEP_COPPER_ORE = overrideOther(Create.asResource("deepslate_copper_ore")),
            C_DEEP_IRON_ORE = overrideOther(Create.asResource("deepslate_iron_ore")),
            C_DEEP_GOLD_ORE = overrideOther(Create.asResource("deepslate_gold_ore")),
            C_DEEP_EMERALD_ORE = overrideOther(Create.asResource("deepslate_emerald_ore")),
            C_DEEP_REDSTONE_ORE = overrideOther(Create.asResource("deepslate_redstone_ore"));


    public ChemicaCrushingRecipeGen(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, Chemica.MOD_ID);
    }

    private GeneratedRecipe overrideOther(ResourceLocation name) {
        return create(name, b -> b.withCondition(FalseCondition.INSTANCE));
    }

    public GeneratedRecipe crushIngot(ItemLike dust, ChemMaterial material) {
        return create(Chemica.asResource(material.name + "_ingot"), b -> b
                .require(material.ingots)
                .output(dust)
                .duration(100));
    }

    @Override
    protected AllRecipeTypes getRecipeType() {
        return AllRecipeTypes.CRUSHING;
    }
}
