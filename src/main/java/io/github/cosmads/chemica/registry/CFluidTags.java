package io.github.cosmads.chemica.registry;

import io.github.cosmads.chemica.Chemica;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class CFluidTags {
    public static final TagKey<Fluid> HIGH_OCTANE = create("high_octane");
    public static final TagKey<Fluid> HYDROGEN = create("hydrogen");
    public static final TagKey<Fluid> ETHANOL = create("ethanol");
    public static final TagKey<Fluid> BIODIESEL = create("biodiesel");

    private static TagKey<Fluid> create(String name) {
        return TagKey.create(net.minecraft.core.registries.Registries.FLUID,
                new ResourceLocation(Chemica.ID, name));
    }
}