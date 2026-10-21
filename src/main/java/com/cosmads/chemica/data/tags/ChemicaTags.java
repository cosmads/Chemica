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
        HYDROGEN_FUEL(COMMON),

        ACETONE(COMMON),
        ACRYLONITRILE(COMMON),
        ADIPIC_ACID_SOLUTION(COMMON),
        AMINE_CATALYST(COMMON),
        AROMATIC_MIX(COMMON),
        BENZENE(COMMON),
        BRINE(COMMON),
        CAUSTIC_SODA(COMMON),
        CUMENE(COMMON),
        CYCLOHEXANE(COMMON),
        CYCLOHEXANOL(COMMON),
        DISTILLED_WATER(COMMON),
        EPOXY_PRECURSOR(COMMON),
        EPOXY_RESIN(COMMON),
        ETHYLBENZENE(COMMON),
        ETHYL_TERT_BUTYL_ETHER(COMMON),
        GASOLINE_ADDITIVE_MIX(COMMON),
        GLYCERIN(COMMON),
        HEXAMETHYLENEDIAMINE_SOLUTION(COMMON),
        LIQUID_HYDROGEN(COMMON),
        MERCURY(COMMON),
        NITROGLYCERIN(COMMON),
        PAN_PRECURSOR(COMMON),
        PHENOL(COMMON),
        PLATINUM_CATALYST_CARRIER(COMMON),
        POLYETHYLENE(COMMON),
        POLYVINYL_CHLORIDE(COMMON),
        SEED_OIL(COMMON),
        SUCROSE_SOLUTION(COMMON),
        SOLDER_SOLUTION(COMMON),
        TETRAETHYLLEAD(COMMON),
        TITANIUM_TETRACHLORIDE(COMMON),
        TOLUENE(COMMON),
        WASTE_SLURRY(COMMON),
        XYLENE(COMMON),

        ACIDS(COMMON),

        ACIDS_CHROMIC(COMMON, "acids/chromic"),
        CHROMIC_ACID(COMMON),
        ACIDS_HYDROCHLORIC(COMMON, "acids/hydrochloric"),
        HYDROCHLORIC_ACID(COMMON),
        ACIDS_HYDROFLUORIC(COMMON, "acids/hydrofluoric"),
        HYDROFLUORIC_ACID(COMMON),
        ACIDS_NITRIC(COMMON, "acids/nitric"),
        NITRIC_ACID(COMMON),
        ACIDS_PHOSPHORIC(COMMON, "acids/phosphoric"),
        PHOSPHORIC_ACID(COMMON),
        ACIDS_SULFURIC_NICKEL(COMMON, "acids/sulfuric_nickel"),
        SULFURIC_NICKEL_SOLUTION(COMMON),

        MOLTEN_GLASS(COMMON),
        MOLTEN_NYLON(COMMON),
        MOLTEN_TITANIUM(COMMON),
        MOLTEN_TUNGSTEN_CARBIDE(COMMON),

        AMMONIA(COMMON),
        ARGON(COMMON),
        BUTENE(COMMON),
        CARBON_MONOXIDE(COMMON),
        CHLORINE(COMMON),
        EPICHLOROHYDRIN(COMMON),
        ETHANE(COMMON),
        FLUORINE(COMMON),
        HELIUM(COMMON),
        LIGHT_HYDROCARBONS(COMMON),
        METHANE(COMMON),
        NITROGEN(COMMON),
        NITROGEN_DIOXIDE(COMMON),
        NITROUS_OXIDE(COMMON),
        OXYGEN(COMMON),
        PROPENE(COMMON),
        REFORMATE(COMMON),
        STEAM(COMMON),
        SYNGAS(COMMON),
        TUNGSTEN_HEXAFLUORIDE(COMMON),
        VINYL_CHLORIDE_MONOMER(COMMON),
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
