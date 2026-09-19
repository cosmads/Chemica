package com.cosmads.chemica.data;

import net.createmod.catnip.lang.Lang;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public enum ChemMaterial {
    // External Metals
    COPPER,
    GOLD,
    IRON,
    NICKEL,
    ZINC,

    // Chemica Metals
    ANTIMONY,
    CHROMIUM,
    COBALT,
    GRAPHITE,
    IRIDIUM,
    MAGNESIUM,
    MOLYBDENUM,
    PLATINUM,
    REINFORCED_IRIDIUM(false),
    SILVER,
    SODIUM,
    TANTALUM(false),
    TIN,
    TITANIUM(false),
    TUNGSTEN,
    TUNGSTEN_CARBIDE(false),
    VANADIUM,
    COMPOSITE_ALLOY(false),
    HEAT_RESISTANT_ALLOY(false),
    LIGHTWEIGHT_ALLOY(false),
    STEEL_BASED_ALLOY(false),

    // External Misc
    SILICON(false)

    // Chemica Misc

    ;

    public final String name;

    /**
     * True is this metal generates naturally. If false, the following tags are nonsense:
     * <ul>
     *     <li>{@link #ores}</li>
     *     <li>{@link #rawOres}</li>
     *     <li>{@link #rawStorageBlocks}</li>
     * </ul>
     */
    public final boolean isNatural;

    public final ItemLikeTag ores;
    public final TagKey<Item> rawOres;
    public final ItemLikeTag rawStorageBlocks;
    public final TagKey<Item> ingots;
    public final ItemLikeTag storageBlocks;
    public final TagKey<Item> nuggets;
    public final TagKey<Item> plates;
    public final TagKey<Item> dusts;

    ChemMaterial() {
        this(true);
    }

    ChemMaterial(boolean natural) {
        this.name = Lang.asId(name());

        this.isNatural = natural;

        this.ores = new ItemLikeTag("ores/" + this.name);
        this.rawOres = itemTag("raw_materials/" + this.name);
        this.rawStorageBlocks = new ItemLikeTag("storage_blocks/raw_" + this.name);
        this.ingots = itemTag("ingots/" + this.name);
        this.storageBlocks = new ItemLikeTag("storage_blocks/" + this.name);
        this.nuggets = itemTag("nuggets/" + this.name);
        this.plates = itemTag("plates/" + this.name);
        this.dusts = itemTag("dusts/" + this.name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    private static TagKey<Item> itemTag(String path) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", path));
    }

    private static TagKey<Block> blockTag(String path) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", path));
    }

    public record ItemLikeTag(TagKey<Item> items, TagKey<Block> blocks) {
        private ItemLikeTag(String path) {
            this(itemTag(path), blockTag(path));
        }
    }
}
