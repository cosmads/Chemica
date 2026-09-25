package com.cosmads.chemica.common.registrate;

import com.drmangotea.tfmg.base.TFMGRegistrate;
import com.drmangotea.tfmg.base.fluid.GasFluidType;
import com.drmangotea.tfmg.content.electricity.connection.cable_type.CableType;
import com.drmangotea.tfmg.content.electricity.connection.cable_type.CableTypeBuilder;
import com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode.Electrode;
import com.drmangotea.tfmg.content.machinery.vat.electrode_holder.electrode.ElectrodeBuilder;
import com.drmangotea.tfmg.registry.TFMGFluids;
import com.simibubi.create.content.fluids.VirtualFluid;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.VirtualFluidBuilder;
import com.simibubi.create.foundation.item.ItemDescription;
import com.simibubi.create.foundation.item.KineticStats;
import com.simibubi.create.foundation.item.TooltipModifier;
import com.tterrag.registrate.builders.FluidBuilder;
import com.tterrag.registrate.util.nullness.NonNullFunction;
import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.common.TransparentTintedFluidType;
import net.createmod.catnip.lang.FontHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.Registries;

public class ChemicaRegistrate extends TFMGRegistrate {

    protected ChemicaRegistrate(String modid) {
        super(modid);
    }

    public static ChemicaRegistrate create(String modid) {
        return (ChemicaRegistrate) new ChemicaRegistrate(modid)
                .setTooltipModifierFactory((item) ->
                        new ItemDescription.Modifier(item, FontHelper.Palette.STANDARD_CREATE)
                                .andThen(TooltipModifier.mapNull(KineticStats.create(item))));
    }

    // Move your gasFluid method here from Chemica.java
    public FluidBuilder<VirtualFluid, CreateRegistrate> gasFluid(String name, int color) {
        return this.entry(name, c -> new VirtualFluidBuilder<>(
                this,           // registrate instance
                this,           // parent
                name,
                c,
                Chemica.asResource("block/fluid/base_still"),  // still texture
                Chemica.asResource("block/fluid/base_flow"),   // flow texture
                TransparentTintedFluidType.create(color),      // fluid type
                VirtualFluid::createSource,                    // source factory
                VirtualFluid::createFlowing                    // flowing factory
        ));
    }

    // Alternative: Use TFMG's gasFluid if you prefer
    public FluidBuilder<VirtualFluid, CreateRegistrate> gasFluidTFMG(String name, int color) {
        return this.entry(name, c -> new VirtualFluidBuilder<>(
                this,
                this,
                name,
                c,
                TFMGFluids.getGasTexture(),
                TFMGFluids.getGasTexture(),
                GasFluidType.create(color),
                VirtualFluid::createSource,
                VirtualFluid::createFlowing
        ));
    }

    public static Block getBlock(String name) {
        return Chemica.REGISTRATE.get(name, Registries.BLOCK).get();
    }

    public static Item getItem(String name) {
        return Chemica.REGISTRATE.get(name, Registries.ITEM).get();
    }

    public static Item getBucket(String name) {
        return Chemica.REGISTRATE.get(name + "_bucket", Registries.ITEM).get();
    }

    public FluidBuilder<VirtualFluid, CreateRegistrate> tintedVirtualFluid(String name, int color) {
        return tintedVirtualFluid(name, color,
                Chemica.asResource("fluid/thin_fluid_still"),
                Chemica.asResource("fluid/thin_fluid_flow"));
    }

    public FluidBuilder<VirtualFluid, CreateRegistrate> tintedVirtualFluid(String name, int color, String textureType) {
        return tintedVirtualFluid(name, color,
                Chemica.asResource("fluid/" + textureType + "_still"),
                Chemica.asResource("fluid/" + textureType + "_flow"));
    }

    public FluidBuilder<VirtualFluid, CreateRegistrate> tintedVirtualFluid(String name, int color, ResourceLocation still, ResourceLocation flow) {
        return virtualFluid(name, still, flow,
                TransparentTintedFluidType.create(color),
                VirtualFluid::createSource,
                VirtualFluid::createFlowing);
    }
}
