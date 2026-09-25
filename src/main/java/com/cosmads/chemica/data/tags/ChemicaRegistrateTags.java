package com.cosmads.chemica.data.tags;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.common.registrate.ChemicaRegistrate;
import com.cosmads.chemica.registry.ChemicaItems;
import com.drmangotea.tfmg.registry.TFMGTags;
import com.simibubi.create.foundation.data.TagGen;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.providers.RegistrateTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;

public class ChemicaRegistrateTags {
    private static final ChemicaRegistrate REGISTRATE = Chemica.registrate();

    public static void addGenerators() {
        REGISTRATE.addDataGenerator(ProviderType.BLOCK_TAGS, ChemicaRegistrateTags::genBlockTags);
        REGISTRATE.addDataGenerator(ProviderType.ITEM_TAGS, ChemicaRegistrateTags::genItemTags);
    }

    private static void genItemTags(RegistrateTagsProvider<Item> provIn) {
        TagGen.CreateTagsProvider<Item> prov = new TagGen.CreateTagsProvider<>(provIn, Item::builtInRegistryHolder);

        prov.tag(Tags.Items.RODS)
                .add(Items.STICK);

        prov.tag(TFMGTags.Items.ENGINE_CYLINDER.tag)
                .add(ChemicaItems.BIODIESEL_CYLINDER.get(), ChemicaItems.ETHANOL_CYLINDER.get(), ChemicaItems.HIGH_CETANE_CYLINDER.get(), ChemicaItems.HIGH_OCTANE_CYLINDER.get());

        prov.tag(TFMGTags.Items.ENGINE_TURBINE.tag)
                .add(ChemicaItems.HYDROGEN_TURBINE_BLADE.get());
    }

    private static void genBlockTags(RegistrateTagsProvider<Block> provIn) {
        TagGen.CreateTagsProvider<Block> prov = new TagGen.CreateTagsProvider<>(provIn, Block::builtInRegistryHolder);

    }
}
