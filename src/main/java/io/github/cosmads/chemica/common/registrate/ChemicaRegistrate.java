package io.github.cosmads.chemica.common.registrate;

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
import io.github.cosmads.chemica.Chemica;
import io.github.cosmads.chemica.common.fluids.TransparentTintedFluidType;
import net.createmod.catnip.lang.FontHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

public class ChemicaRegistrate extends CreateRegistrate {

    protected ChemicaRegistrate() {
        super(Chemica.ID);
    }

    public static ChemicaRegistrate create() {
        return (ChemicaRegistrate)(new ChemicaRegistrate()).setTooltipModifierFactory((item) -> (new ItemDescription.Modifier(item, FontHelper.Palette.STANDARD_CREATE)).andThen(TooltipModifier.mapNull(KineticStats.create(item))));
    }

    public FluidBuilder<VirtualFluid, CreateRegistrate> gasFluid(String name, int color) {
        return this.entry(name, (c) -> new VirtualFluidBuilder<>(this.self(),this.self(), name, c, TFMGFluids.getGasTexture(), TFMGFluids.getGasTexture(), GasFluidType.create(color), VirtualFluid::createSource, VirtualFluid::createFlowing));
    }

    public static Block getBlock(String name) {
        return Chemica.registrate.get(name, ForgeRegistries.BLOCKS.getRegistryKey()).get();
    }

    public static Item getItem(String name) {
        return Chemica.registrate.get(name, ForgeRegistries.ITEMS.getRegistryKey()).get();
    }

    public static Item getBucket(String name) {
        return Chemica.registrate.get(name + "_bucket", ForgeRegistries.ITEMS.getRegistryKey()).get();
    }



    public FluidBuilder<VirtualFluid, CreateRegistrate> tintedVirtualFluid(String name, int color) {
        return tintedVirtualFluid(name, color, Chemica.asResource("fluid/thin_fluid_still"), Chemica.asResource("fluid/thin_fluid_flow"));
    }

    public FluidBuilder<VirtualFluid, CreateRegistrate> tintedVirtualFluid(String name, int color, String textureType) {
        return tintedVirtualFluid(name, color, Chemica.asResource("fluid/"+textureType+"_still"), Chemica.asResource("fluid/"+textureType+"_flow"));
    }

    public FluidBuilder<VirtualFluid, CreateRegistrate> tintedVirtualFluid(String name, int color, ResourceLocation still, ResourceLocation flow) {
        return virtualFluid(name, still, flow, TransparentTintedFluidType.create(color), VirtualFluid::createSource, VirtualFluid::createFlowing);
    }

    // TFMG Registries

    public <T extends CableType> CableTypeBuilder<T, CreateRegistrate> cableType(NonNullFunction<CableType.Properties, T> factory) {
        return this.cableType(this.self(), factory);
    }

    public <T extends CableType> CableTypeBuilder<T, CreateRegistrate> cableType(String name, NonNullFunction<CableType.Properties, T> factory) {
        return this.cableType(this.self(), name, factory);
    }

    public <T extends CableType, P> CableTypeBuilder<T, P> cableType(P parent, NonNullFunction<CableType.Properties, T> factory) {
        return this.cableType(parent, this.currentName(), factory);
    }

    public <T extends CableType, P> CableTypeBuilder<T, P> cableType(P parent, String name, NonNullFunction<CableType.Properties, T> factory) {
        return this.entry(name, (callback) -> CableTypeBuilder.create(this, parent, name, callback, factory));
    }

    public <T extends Electrode> ElectrodeBuilder<T, CreateRegistrate> electrode(NonNullFunction<Electrode.Properties, T> factory) {
        return this.electrode(this.self(), factory);
    }

    public <T extends Electrode> ElectrodeBuilder<T, CreateRegistrate> electrode(String name, NonNullFunction<Electrode.Properties, T> factory) {
        return this.electrode(this.self(), name, factory);
    }

    public <T extends Electrode, P> ElectrodeBuilder<T, P> electrode(P parent, NonNullFunction<Electrode.Properties, T> factory) {
        return this.electrode(parent, this.currentName(), factory);
    }

    public <T extends Electrode, P> ElectrodeBuilder<T, P> electrode(P parent, String name, NonNullFunction<Electrode.Properties, T> factory) {
        return this.entry(name, (callback) -> ElectrodeBuilder.create(this, parent, name, callback, factory));
    }
}
