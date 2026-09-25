package com.cosmads.chemica.data.tags;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.common.ChemicaLang;
import net.createmod.catnip.lang.Lang;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.Fluid;
import org.jetbrains.annotations.Nullable;

import static com.cosmads.chemica.data.tags.ChemicaTags.NameSpace.COMMON;

public class ChemicaTags {

    public enum NameSpace {
        MOD(Chemica.MOD_ID),
        COMMON("c")
        ;

        public final String id;

        NameSpace(String id) {
            this.id = id;
        }

        public ResourceLocation id(String path) {
            return ResourceLocation.fromNamespaceAndPath(this.id, path);
        }

        public ResourceLocation id(Enum<?> entry, @Nullable String pathOverride) {
            return this.id(pathOverride != null ? pathOverride : Lang.asId(entry.name()));
        }
    }

    public enum Items {
        CATALYSTS,
        CRYSTALS,
        LOW_GRADE_CRYSTALS,
        MEDIUM_GRADE_CRYSTALS,
        HIGH_GRADE_CRYSTALS
        ;

        public final TagKey<Item> tag;

        Items() {
            this(NameSpace.MOD);
        }

        Items(NameSpace namespace) {
            this(namespace, null);
        }

        Items(NameSpace namespace, @Nullable String pathOverride) {
            this.tag = TagKey.create(Registries.ITEM, namespace.id(this, pathOverride));
        }

        @SuppressWarnings("deprecation")
        public boolean matches(Item item) {
            return item.builtInRegistryHolder()
                    .is(tag);
        }

        public boolean matches(ItemStack stack) {
            return stack.is(tag);
        }
    }

    public enum Fluids {
        BIODIESEL(COMMON),
        ETHANOL(COMMON),
        HIGH_CETANE_DIESEL(COMMON),
        HIGH_OCTANE_GASOLINE(COMMON),
        HYDROGEN_FUEL(COMMON)
        ;

        public final TagKey<Fluid> tag;

        Fluids() {
            this(NameSpace.MOD);
        }
        Fluids(NameSpace namespace) {
            this(namespace, null);
        }
        Fluids(NameSpace namespace, String path) {
            ResourceLocation id = ResourceLocation.fromNamespaceAndPath(namespace.id, path == null ? ChemicaLang.asId(name()) : path);
            this.tag = FluidTags.create(id);
        }
    }
}
