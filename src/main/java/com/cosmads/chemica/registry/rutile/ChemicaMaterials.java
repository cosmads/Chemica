package com.cosmads.chemica.registry.rutile;

import com.cosmads.chemica.Chemica;
import com.cosmads.chemica.registry.rutile.materials.CElementMaterials;
import com.simibubi.create.AllItems;
import dev.metallurgists.rutile.api.material.Material;
import dev.metallurgists.rutile.api.material.MaterialHelper;
import dev.metallurgists.rutile.api.material.stack.MaterialEntry;
import dev.metallurgists.rutile.api.registry.RutileRegistries;
import dev.metallurgists.rutile.api.tag.TagPrefix;
import dev.metallurgists.rutile.registry.RutileMaterials;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiConsumer;

import static com.cosmads.chemica.registry.rutile.ChemicaTagPrefixes.CrushedRaw;
import static dev.metallurgists.rutile.registry.RutileTagPrefixes.*;

public class ChemicaMaterials {



    public static void init() {
        CElementMaterials.register();

        Nugget.setIgnored(RutileMaterials.Copper, AllItems.COPPER_NUGGET.lazy());
        CrushedRaw.setIgnored(RutileMaterials.Copper, AllItems.CRUSHED_COPPER.lazy());
        Block.setIgnored(ChemicaMaterials.Antimony);
        Block.setIgnored(ChemicaMaterials.Chromium);
        RawOreBlock.setIgnored(ChemicaMaterials.Antimony);
        RawOreBlock.setIgnored(ChemicaMaterials.Chromium);
    }

    public static Material Antimony;
    public static Material Chromium;

    public static void toTab(BiConsumer<Collection<ItemStack>, CreativeModeTab.TabVisibility> consumer) {
        for (Material material : RutileRegistries.MATERIALS) {
            if (material.getModId().equals(Chemica.MOD_ID)) {
                List<ItemStack> items = new ArrayList<>();
                for (TagPrefix prefix : RutileRegistries.TAG_PREFIXES) {
                    MaterialEntry entry = new MaterialEntry(prefix, material);
                    if (entry.isIgnored()) continue;
                    items.addAll(MaterialHelper.getItems(entry).stream()
                            .filter(i -> BuiltInRegistries.ITEM.getKey(i.asItem()).getNamespace().equals(Chemica.MOD_ID))
                            .map(ItemStack::new).toList());
                }
                consumer.accept(items, CreativeModeTab.TabVisibility.PARENT_TAB_ONLY);
            }
        }
    }
}
