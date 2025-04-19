package me.astroxd8.dimensionalores.data;

import static me.astroxd8.dimensionalores.registry.DOBlocks.*;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import static net.minecraft.world.item.Items.*;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class DOBlockLootTableProvider extends BlockLootSubProvider {
    protected DOBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        add(QUARTZ_ORE.get(), block -> createOreDrop(block, QUARTZ));

        add(DEEPSLATE_QUARTZ_ORE.get(), block -> createOreDrop(block, QUARTZ));

        add(NETHER_COAL_ORE.get(), block -> createOreDrop(block, COAL));
        add(NETHER_COPPER_ORE.get(), block -> createMultipleOreDrops(block, RAW_COPPER, 2, 5));
        add(NETHER_DIAMOND_ORE.get(), block -> createOreDrop(block, DIAMOND));
        add(NETHER_EMERALD_ORE.get(), block -> createOreDrop(block, EMERALD));
        add(NETHER_IRON_ORE.get(), block -> createOreDrop(block, RAW_IRON));
        add(NETHER_LAPIS_ORE.get(), block -> createMultipleOreDrops(block, LAPIS_LAZULI, 4, 9));
        add(NETHER_REDSTONE_ORE.get(), block -> createMultipleOreDrops(block, REDSTONE, 4, 5));

        add(END_COAL_ORE.get(), block -> createOreDrop(block, COAL));
        add(END_COPPER_ORE.get(), block -> createMultipleOreDrops(block, RAW_COPPER, 2, 5));
        add(END_DIAMOND_ORE.get(), block -> createOreDrop(block, DIAMOND));
        add(END_EMERALD_ORE.get(), block -> createOreDrop(block, EMERALD));
        add(END_GOLD_ORE.get(), block -> createOreDrop(block, RAW_GOLD));
        add(END_IRON_ORE.get(), block -> createOreDrop(block, RAW_IRON));
        add(END_LAPIS_ORE.get(), block -> createMultipleOreDrops(block, LAPIS_LAZULI, 4, 9));
        add(END_QUARTZ_ORE.get(), block -> createOreDrop(block, QUARTZ));
        add(END_REDSTONE_ORE.get(), block -> createMultipleOreDrops(block, REDSTONE, 4, 5));
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }

    protected LootTable.Builder createMultipleOreDrops(Block block, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registryLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                        .apply(ApplyBonusCount.addOreBonusCount(registryLookup.getOrThrow(Enchantments.FORTUNE)))));
    }
}
