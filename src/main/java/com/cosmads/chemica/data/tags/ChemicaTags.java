package com.cosmads.chemica.data.tags;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.common.ChemicaLang;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

import static com.cosmads.chemica.data.tags.ChemicaTags.NameSpace.COMMON;
import static com.cosmads.chemica.data.tags.ChemicaTags.NameSpace.MOD;

public class ChemicaTags {

    public enum NameSpace {
        MOD(Chemica.MOD_ID),
        COMMON("c")
        ;

        public final String id;
        NameSpace(String id) {
            this.id = id;
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
