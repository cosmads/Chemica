package com.cosmads.chemica.data;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.registry.ChemicaBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.minecraft.world.level.block.Block;
import com.tterrag.registrate.util.entry.BlockEntry;

public class ChemicaBlockStateProvider extends net.neoforged.neoforge.client.model.generators.BlockStateProvider {

    public ChemicaBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Chemica.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        // Register all deepslate ores using the helper method
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_ANTIMONY_ORE, "antimony");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_CHROMITE_ORE, "chromite");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_COBALT_ORE, "cobalt");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_FLUORITE_ORE, "fluorite");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_GRAPHITE_ORE, "graphite");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_MOLYBDENUM_ORE, "molybdenum");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_PHOSPHORUS_ORE, "phosphorus");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_PLATINUM_ORE, "platinum");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_RUTILE_ORE, "rutile");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_SILVER_ORE, "silver");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_TIN_ORE, "tin");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_VANADIUM_ORE, "vanadium");
        registerDeepslateOre(ChemicaBlocks.DEEPSLATE_WOLFRAMITE_ORE, "wolframite");
    }

    // Helper method for deepslate ores
    private void registerDeepslateOre(BlockEntry<Block> oreBlock, String materialName) {
        String blockName = oreBlock.getId().getPath(); // "deepslate_" + materialName + "_ore"

        // Deepslate Ore Model Textures Setup
        BlockModelBuilder model = models().cube(
                blockName,
                modLoc("block/deepslate_" + materialName + "_ore"),      // West - ore side
                modLoc("block/deepslate_" + materialName + "_ore"),      // East - ore side
                modLoc("block/deepslate_" + materialName + "_ore_top"),  // Top - ore top
                modLoc("block/deepslate_" + materialName + "_ore_top"),  // Bottom - ore top
                modLoc("block/deepslate_" + materialName + "_ore"),      // North - ore side
                modLoc("block/deepslate_" + materialName + "_ore")       // South - ore side
        ).texture("particle", modLoc("block/deepslate_" + materialName + "_ore"));

        // Apply the model to the block
        simpleBlock(oreBlock.get(), model);
    }
}