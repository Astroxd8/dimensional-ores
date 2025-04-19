package me.astroxd8.dimensionalores.data;

import static me.astroxd8.dimensionalores.registry.DOBlocks.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import static net.minecraft.world.item.Items.*;

import java.util.concurrent.CompletableFuture;

public class DOBlockLootTableProvider extends FabricBlockLootTableProvider {
    protected DOBlockLootTableProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    public void generate() {
        add(QUARTZ_ORE, block -> createOreDrop(block, QUARTZ));

        add(DEEPSLATE_QUARTZ_ORE, block -> createOreDrop(block, QUARTZ));

        add(NETHER_COAL_ORE, block -> createOreDrop(block, COAL));
        add(NETHER_COPPER_ORE, block -> createMultipleOreDrops(block, RAW_COPPER, 2, 5));
        add(NETHER_DIAMOND_ORE, block -> createOreDrop(block, DIAMOND));
        add(NETHER_EMERALD_ORE, block -> createOreDrop(block, EMERALD));
        add(NETHER_IRON_ORE, block -> createOreDrop(block, RAW_IRON));
        add(NETHER_LAPIS_ORE, block -> createMultipleOreDrops(block, LAPIS_LAZULI, 4, 9));
        add(NETHER_REDSTONE_ORE, block -> createMultipleOreDrops(block, REDSTONE, 4, 5));

        add(END_COAL_ORE, block -> createOreDrop(block, COAL));
        add(END_COPPER_ORE, block -> createMultipleOreDrops(block, RAW_COPPER, 2, 5));
        add(END_DIAMOND_ORE, block -> createOreDrop(block, DIAMOND));
        add(END_EMERALD_ORE, block -> createOreDrop(block, EMERALD));
        add(END_GOLD_ORE, block -> createOreDrop(block, RAW_GOLD));
        add(END_IRON_ORE, block -> createOreDrop(block, RAW_IRON));
        add(END_LAPIS_ORE, block -> createMultipleOreDrops(block, LAPIS_LAZULI, 4, 9));
        add(END_QUARTZ_ORE, block -> createOreDrop(block, QUARTZ));
        add(END_REDSTONE_ORE, block -> createMultipleOreDrops(block, REDSTONE, 4, 5));
    }

    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }
}
