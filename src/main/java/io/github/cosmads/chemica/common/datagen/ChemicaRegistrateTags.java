package io.github.cosmads.chemica.common.datagen;

import com.drmangotea.tfmg.TFMG;
import com.drmangotea.tfmg.base.TFMGRegistrateTags;
import com.simibubi.create.foundation.data.TagGen;
import com.tterrag.registrate.providers.ProviderType;
import com.tterrag.registrate.providers.RegistrateTagsProvider;
import io.github.cosmads.chemica.Chemica;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ChemicaRegistrateTags {
    public static void addGenerators() {
        Chemica.registrate.addDataGenerator(ProviderType.BLOCK_TAGS, ChemicaRegistrateTags::genBlockTags);
        Chemica.registrate.addDataGenerator(ProviderType.ITEM_TAGS, ChemicaRegistrateTags::genItemTags);
    }

    private static void genItemTags(RegistrateTagsProvider<Item> provIn) {
        TagGen.CreateTagsProvider<Item> prov = new TagGen.CreateTagsProvider<>(provIn, Item::builtInRegistryHolder);
    }

    private static void genBlockTags(RegistrateTagsProvider<Block> provIn) {
        TagGen.CreateTagsProvider<Block> prov = new TagGen.CreateTagsProvider<>(provIn, Block::builtInRegistryHolder);
    }
}
