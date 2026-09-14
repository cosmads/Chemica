package com.cosmads.chemica.data;

import com.cosmads.chemica.registry.ChemicaBlocks;
import com.cosmads.chemica.registry.ChemicaItems;
import net.minecraft.advancements.critereon.EnchantmentPredicate;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.advancements.critereon.MinMaxBounds;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.AlternativesEntry;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.ExplosionCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.function.BiConsumer;
import java.util.List;

public class BlockLootTableProvider implements LootTableSubProvider {

    private final HolderLookup.Provider registries;

    public BlockLootTableProvider(HolderLookup.Provider registries) {
        this.registries = registries;
    }

    @Override
    public void generate(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer) {
        // Get fortune enchantment holder
        var fortuneHolder = registries.lookupOrThrow(net.minecraft.core.registries.Registries.ENCHANTMENT)
                .getOrThrow(Enchantments.FORTUNE);

        dropSelf(consumer, ChemicaBlocks.CURED_EPOXY_BLOCK);
        dropSelf(consumer, ChemicaBlocks.DEEPSLATE_GRAPHITE_ORE);
        dropSelf(consumer, ChemicaBlocks.DEEPSLATE_RUTILE_ORE);
        dropSelf(consumer, ChemicaBlocks.DEEPSLATE_WOLFRAMITE_ORE);
        dropSelf(consumer, ChemicaBlocks.FERVORITE);
        dropSelf(consumer, ChemicaBlocks.PLATINUM_BLOCK);
        dropSelf(consumer, ChemicaBlocks.RAW_PLATINUM_BLOCK);
        dropSelf(consumer, ChemicaBlocks.ZELOSITE);

        // Ore drops with silk touch (TFMG style)
        addOreWithSilkTouch(consumer, ChemicaBlocks.DEEPSLATE_ANTIMONY_ORE, ChemicaItems.RAW_ANTIMONY.get(), fortuneHolder);
        addOreWithSilkTouch(consumer, ChemicaBlocks.DEEPSLATE_CHROMITE_ORE, ChemicaItems.RAW_CHROMITE.get(), fortuneHolder);
        addOreWithSilkTouch(consumer, ChemicaBlocks.DEEPSLATE_COBALT_ORE, ChemicaItems.RAW_COBALT.get(), fortuneHolder);
        addOreWithSilkTouch(consumer, ChemicaBlocks.DEEPSLATE_MOLYBDENUM_ORE, ChemicaItems.RAW_MOLYBDENUM.get(), fortuneHolder);
        addOreWithSilkTouch(consumer, ChemicaBlocks.DEEPSLATE_PLATINUM_ORE, ChemicaItems.RAW_PLATINUM.get(), fortuneHolder);
        addOreWithSilkTouch(consumer, ChemicaBlocks.DEEPSLATE_SILVER_ORE, ChemicaItems.RAW_SILVER.get(), fortuneHolder);
        addOreWithSilkTouch(consumer, ChemicaBlocks.DEEPSLATE_TIN_ORE, ChemicaItems.RAW_TIN.get(), fortuneHolder);
        addOreWithSilkTouch(consumer, ChemicaBlocks.DEEPSLATE_VANADIUM_ORE, ChemicaItems.RAW_VANADIUM.get(), fortuneHolder);
        addOreWithSilkTouch(consumer, ChemicaBlocks.TIN_ORE, ChemicaItems.RAW_TIN.get(), fortuneHolder);

        addDustWithSilkTouch(consumer, ChemicaBlocks.DEEPSLATE_FLUORITE_ORE, ChemicaItems.FLUORITE_DUST.get(),
                2.0F, 4.0F, fortuneHolder);
        addDustWithSilkTouch(consumer, ChemicaBlocks.DEEPSLATE_PHOSPHORUS_ORE, ChemicaItems.PHOSPHORUS_DUST.get(),
                2.0F, 4.0F, fortuneHolder);
        addDustWithSilkTouch(consumer, ChemicaBlocks.PHOSPHORUS_ORE, ChemicaItems.PHOSPHORUS_DUST.get(),
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

    private void addOreWithSilkTouch(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer,
                                     com.tterrag.registrate.util.entry.BlockEntry<?> blockEntry,
                                     net.minecraft.world.item.Item item,
                                     net.minecraft.core.Holder<net.minecraft.world.item.enchantment.Enchantment> fortuneHolder) {
        ResourceLocation blockId = blockEntry.getId();
        ResourceKey<LootTable> lootTableKey = ResourceKey.create(
                net.minecraft.core.registries.Registries.LOOT_TABLE,
                blockId.withPrefix("blocks/")
        );

        // Get silk touch holder
        var silkTouchHolder = registries.lookupOrThrow(net.minecraft.core.registries.Registries.ENCHANTMENT)
                .getOrThrow(Enchantments.SILK_TOUCH);

        // Create enchantment predicate exactly like TFMG JSON
        EnchantmentPredicate silkTouchPredicate = new EnchantmentPredicate(silkTouchHolder, MinMaxBounds.Ints.atLeast(1));

        // Create item predicate builder with enchantments - SINGLE ARGUMENT
        ItemPredicate.Builder itemPredicateBuilder = ItemPredicate.Builder.item()
                .withSubPredicate(
                        net.minecraft.advancements.critereon.ItemSubPredicates.ENCHANTMENTS,
                        net.minecraft.advancements.critereon.ItemEnchantmentsPredicate.enchantments(
                                List.of(silkTouchPredicate)
                                // No second list for excluded enchantments
                        )
                );

        // Create the condition
        LootItemCondition.Builder hasSilkTouch = MatchTool.toolMatches(itemPredicateBuilder);

        // TFMG-style ore drop with silk touch
        LootTable.Builder builder = LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(AlternativesEntry.alternatives(
                                // Silk touch: drop the block
                                LootItem.lootTableItem(blockEntry.get())
                                        .when(hasSilkTouch),
                                // No silk touch: drop item with fortune
                                LootItem.lootTableItem(item)
                                        .apply(ApplyBonusCount.addOreBonusCount(fortuneHolder))
                                        .when(ExplosionCondition.survivesExplosion())
                        ))
                );

        consumer.accept(lootTableKey, builder);
    }

    private void addDustWithSilkTouch(BiConsumer<ResourceKey<LootTable>, LootTable.Builder> consumer,
                                      com.tterrag.registrate.util.entry.BlockEntry<?> blockEntry,
                                      net.minecraft.world.item.Item item,
                                      float min, float max,
                                      net.minecraft.core.Holder<net.minecraft.world.item.enchantment.Enchantment> fortuneHolder) {
        ResourceLocation blockId = blockEntry.getId();
        ResourceKey<LootTable> lootTableKey = ResourceKey.create(
                net.minecraft.core.registries.Registries.LOOT_TABLE,
                blockId.withPrefix("blocks/")
        );

        // Get silk touch holder
        var silkTouchHolder = registries.lookupOrThrow(net.minecraft.core.registries.Registries.ENCHANTMENT)
                .getOrThrow(Enchantments.SILK_TOUCH);

        // Create enchantment predicate
        EnchantmentPredicate silkTouchPredicate = new EnchantmentPredicate(silkTouchHolder, MinMaxBounds.Ints.atLeast(1));

        // Create item predicate builder with enchantments - SINGLE ARGUMENT
        ItemPredicate.Builder itemPredicateBuilder = ItemPredicate.Builder.item()
                .withSubPredicate(
                        net.minecraft.advancements.critereon.ItemSubPredicates.ENCHANTMENTS,
                        net.minecraft.advancements.critereon.ItemEnchantmentsPredicate.enchantments(
                                List.of(silkTouchPredicate)
                                // No second list
                        )
                );

        // Create the condition
        LootItemCondition.Builder hasSilkTouch = MatchTool.toolMatches(itemPredicateBuilder);

        // TFMG-style dust ore drop with silk touch
        LootTable.Builder builder = LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .setRolls(ConstantValue.exactly(1.0F))
                        .add(AlternativesEntry.alternatives(
                                // Silk touch: drop the block
                                LootItem.lootTableItem(blockEntry.get())
                                        .when(hasSilkTouch),
                                // No silk touch: drop dust with fortune and count
                                LootItem.lootTableItem(item)
                                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                                        .apply(ApplyBonusCount.addOreBonusCount(fortuneHolder))
                                        .when(ExplosionCondition.survivesExplosion())
                        ))
                );

        consumer.accept(lootTableKey, builder);
    }
}