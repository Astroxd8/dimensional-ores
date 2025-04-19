package me.astroxd8.dimensionalores.data;

import static me.astroxd8.dimensionalores.registry.DOBlocks.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;

import java.util.concurrent.CompletableFuture;

public class DOBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public DOBlockTagProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        getOrCreateTagBuilder(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(DEEPSLATE_QUARTZ_ORE)
                .add(END_COAL_ORE)
                .add(END_COPPER_ORE)
                .add(END_DIAMOND_ORE)
                .add(END_EMERALD_ORE)
                .add(END_GOLD_ORE)
                .add(END_IRON_ORE)
                .add(END_LAPIS_ORE)
                .add(END_QUARTZ_ORE)
                .add(END_REDSTONE_ORE)
                .add(NETHER_COAL_ORE)
                .add(NETHER_COPPER_ORE)
                .add(NETHER_DIAMOND_ORE)
                .add(NETHER_EMERALD_ORE)
                .add(NETHER_IRON_ORE)
                .add(NETHER_LAPIS_ORE)
                .add(NETHER_REDSTONE_ORE)
                .add(QUARTZ_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(END_COPPER_ORE)
                .add(END_IRON_ORE)
                .add(END_LAPIS_ORE)
                .add(NETHER_COPPER_ORE)
                .add(NETHER_IRON_ORE)
                .add(NETHER_LAPIS_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(END_DIAMOND_ORE)
                .add(END_EMERALD_ORE)
                .add(END_GOLD_ORE)
                .add(END_REDSTONE_ORE)
                .add(NETHER_DIAMOND_ORE)
                .add(NETHER_EMERALD_ORE)
                .add(NETHER_REDSTONE_ORE);
    }
}
