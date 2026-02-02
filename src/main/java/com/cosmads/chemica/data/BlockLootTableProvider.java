package com.cosmads.chemica.data;

import com.cosmads.chemica.registry.ChemicaBlocks;
import com.cosmads.chemica.registry.ChemicaItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;

public class BlockLootTableProvider implements LootTableSubProvider {

    private final HolderLookup.Provider registries;

    public BlockLootTableProvider(HolderLookup.Provider registries) {
        this.registries = registries;
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer) {
        // Get fortune enchantment holder
        var fortuneHolder = registries.lookupOrThrow(net.minecraft.core.registries.Registries.ENCHANTMENT)
                .getOrThrow(net.minecraft.world.item.enchantment.Enchantments.FORTUNE);

        dropSelf(consumer, ChemicaBlocks.CURED_EPOXY_BLOCK);
        dropSelf(consumer, ChemicaBlocks.DEEPSLATE_GRAPHITE_ORE);
        dropSelf(consumer, ChemicaBlocks.DEEPSLATE_RUTILE_ORE);
        dropSelf(consumer, ChemicaBlocks.DEEPSLATE_WOLFRAMITE_ORE);
        dropSelf(consumer, ChemicaBlocks.FERVORITE);
        dropSelf(consumer, ChemicaBlocks.PLATINUM_BLOCK);
        dropSelf(consumer, ChemicaBlocks.RAW_PLATINUM_BLOCK);
        dropSelf(consumer, ChemicaBlocks.ZELOSITE);

        addOreWithFortune(consumer, ChemicaBlocks.DEEPSLATE_ANTIMONY_ORE, ChemicaItems.RAW_ANTIMONY.get(), fortuneHolder);
        addOreWithFortune(consumer, ChemicaBlocks.DEEPSLATE_CHROMITE_ORE, ChemicaItems.RAW_CHROMITE.get(), fortuneHolder);
        addOreWithFortune(consumer, ChemicaBlocks.DEEPSLATE_COBALT_ORE, ChemicaItems.RAW_COBALT.get(), fortuneHolder);
        addOreWithFortune(consumer, ChemicaBlocks.DEEPSLATE_MOLYBDENUM_ORE, ChemicaItems.RAW_MOLYBDENUM.get(), fortuneHolder);
        addOreWithFortune(consumer, ChemicaBlocks.DEEPSLATE_PLATINUM_ORE, ChemicaItems.RAW_PLATINUM.get(), fortuneHolder);
        addOreWithFortune(consumer, ChemicaBlocks.DEEPSLATE_SILVER_ORE, ChemicaItems.RAW_SILVER.get(), fortuneHolder);
        addOreWithFortune(consumer, ChemicaBlocks.DEEPSLATE_TIN_ORE, ChemicaItems.RAW_TIN.get(), fortuneHolder);
        addOreWithFortune(consumer, ChemicaBlocks.DEEPSLATE_VANADIUM_ORE, ChemicaItems.RAW_VANADIUM.get(), fortuneHolder);
        addOreWithFortune(consumer, ChemicaBlocks.TIN_ORE, ChemicaItems.RAW_TIN.get(), fortuneHolder);

        addDustWithFortune(consumer, ChemicaBlocks.DEEPSLATE_FLUORITE_ORE, ChemicaItems.FLUORITE_DUST.get(),
                2.0F, 4.0F, fortuneHolder);
        addDustWithFortune(consumer, ChemicaBlocks.DEEPSLATE_PHOSPHORUS_ORE, ChemicaItems.PHOSPHORUS_DUST.get(),
                2.0F, 4.0F, fortuneHolder);
        addDustWithFortune(consumer, ChemicaBlocks.PHOSPHORUS_ORE, ChemicaItems.PHOSPHORUS_DUST.get(),
                2.0F, 3.0F, fortuneHolder);
    }

    private void dropSelf(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer,
                          com.tterrag.registrate.util.entry.BlockEntry<?> blockEntry) {
        ResourceLocation blockId = blockEntry.getId();
        ResourceKey<LootTable> lootTableKey = ResourceKey.create(
                net.minecraft.core.registries.Registries.LOOT_TABLE,
                blockId.withPrefix("blocks/")
        );

        LootTable.Builder builder = LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .add(LootItem.lootTableItem(blockEntry.get()))
                        .when(ExplosionCondition.survivesExplosion())
                );

        consumer.accept(lootTableKey, builder);
    }

    private void addOreWithFortune(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer,
                                   com.tterrag.registrate.util.entry.BlockEntry<?> blockEntry,
                                   net.minecraft.world.item.Item item,
                                   net.minecraft.core.Holder<net.minecraft.world.item.enchantment.Enchantment> fortuneHolder) {
        ResourceLocation blockId = blockEntry.getId();
        ResourceKey<LootTable> lootTableKey = ResourceKey.create(
                net.minecraft.core.registries.Registries.LOOT_TABLE,
                blockId.withPrefix("blocks/")
        );

        // Standard ore drop with fortune bonus
        LootTable.Builder builder = LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .add(LootItem.lootTableItem(item)
                                .apply(ApplyBonusCount.addOreBonusCount(fortuneHolder))
                        )
                        .when(ExplosionCondition.survivesExplosion())
                );

        consumer.accept(lootTableKey, builder);
    }

    private void addDustWithFortune(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer,
                                    com.tterrag.registrate.util.entry.BlockEntry<?> blockEntry,
                                    net.minecraft.world.item.Item item,
                                    float min, float max,
                                    net.minecraft.core.Holder<net.minecraft.world.item.enchantment.Enchantment> fortuneHolder) {
        ResourceLocation blockId = blockEntry.getId();
        ResourceKey<LootTable> lootTableKey = ResourceKey.create(
                net.minecraft.core.registries.Registries.LOOT_TABLE,
                blockId.withPrefix("blocks/")
        );

        // Dust drop with base range AND fortune bonus
        LootTable.Builder builder = LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .add(LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                                .apply(ApplyBonusCount.addOreBonusCount(fortuneHolder))
                        )
                        .when(ExplosionCondition.survivesExplosion())
                );

        consumer.accept(lootTableKey, builder);
    }
}