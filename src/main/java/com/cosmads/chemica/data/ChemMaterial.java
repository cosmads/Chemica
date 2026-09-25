package com.cosmads.chemica.data;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.data.tags.ChemicaTags;
import net.createmod.catnip.lang.Lang;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

public enum ChemMaterial {
    // External Metals
    COPPER,
    GOLD,
    IRON,
    NICKEL,
    ZINC,
    CONSTANTAN(false),

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
    ELECTRUM(false),

    // External Misc
    SILICON(false),
    CHARCOAL(false),
    COAL,
    QUARTZ,

    // Chemica Misc
    AMMONIUM_PERSULFATE(false),
    ARSENIC,
    ASH,
    CAUSTIC_SODA,
    FLUORITE,
    PHOSPHORUS,
    RUTILE,
    SALT,
    SODA_ASH,
    SODIUM_BISULFATE,
    SODIUM_PERSULFATE,
    CARBON_FIBER,
    EPOXY_RESIN,
    GRAPHENE,
    POLYETHYLENE,
    PTFE,
    PVC,
    NYLON,
    NYLON_SALT,

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
    public final TagKey<Item> catalysts;
    public final TagKey<Item> crystals;
    public final Function<Grade, TagKey<Item>> gradedCrystals;

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
        this.catalysts = itemTag("chemica:catalysts/" + this.name);
        this.crystals = itemTag("chemica:crystals/" + this.name);
        this.gradedCrystals = grade -> grade.groupTag(this.name);
    }

    @Override
    public String toString() {
        return this.name;
    }

    private static TagKey<Item> itemTag(String path) {
        return TagKey.create(Registries.ITEM, Chemica.asCommon(path));
    }

    private static TagKey<Block> blockTag(String path) {
        return TagKey.create(Registries.BLOCK, Chemica.asCommon(path));
    }

    public record ItemLikeTag(TagKey<Item> items, TagKey<Block> blocks) {
        private ItemLikeTag(String path) {
            this(itemTag(path), blockTag(path));
        }
    }

    public enum Grade implements StringRepresentable {
        LOW(ChemicaTags.Items.LOW_GRADE_CRYSTALS.tag),
        MEDIUM(ChemicaTags.Items.MEDIUM_GRADE_CRYSTALS.tag),
        HIGH(ChemicaTags.Items.HIGH_GRADE_CRYSTALS.tag),
        ;

        public final TagKey<Item> tag;

        Grade(TagKey<Item> tag) {
            this.tag = tag;
        }

        public TagKey<Item> groupTag(String path) {
            return itemTag("chemica:" + this.name().toLowerCase() + "_grade_crystals/" + path);
        }

        public String prefix(String path) {
            if (this == LOW) return path;
            return this.name().toLowerCase() + "_grade_" + path;
        }

        @Override
        public String getSerializedName() {
            return this.name().toLowerCase();
        }
    }
}
