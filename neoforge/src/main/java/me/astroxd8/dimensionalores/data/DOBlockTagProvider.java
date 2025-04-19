package me.astroxd8.dimensionalores.data;

import me.astroxd8.dimensionalores.Constants;
import static me.astroxd8.dimensionalores.registry.DOBlocks.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DOBlockTagProvider extends BlockTagsProvider {
    public DOBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, Constants.MOD_ID);
    }

    @Override
    protected void addTags(@Nullable HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(DEEPSLATE_QUARTZ_ORE.get())
                .add(END_COAL_ORE.get())
                .add(END_COPPER_ORE.get())
                .add(END_DIAMOND_ORE.get())
                .add(END_EMERALD_ORE.get())
                .add(END_GOLD_ORE.get())
                .add(END_IRON_ORE.get())
                .add(END_LAPIS_ORE.get())
                .add(END_QUARTZ_ORE.get())
                .add(END_REDSTONE_ORE.get())
                .add(NETHER_COAL_ORE.get())
                .add(NETHER_COPPER_ORE.get())
                .add(NETHER_DIAMOND_ORE.get())
                .add(NETHER_EMERALD_ORE.get())
                .add(NETHER_IRON_ORE.get())
                .add(NETHER_LAPIS_ORE.get())
                .add(NETHER_REDSTONE_ORE.get())
                .add(QUARTZ_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(END_COPPER_ORE.get())
                .add(END_IRON_ORE.get())
                .add(END_LAPIS_ORE.get())
                .add(NETHER_COPPER_ORE.get())
                .add(NETHER_IRON_ORE.get())
                .add(NETHER_LAPIS_ORE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(END_DIAMOND_ORE.get())
                .add(END_EMERALD_ORE.get())
                .add(END_GOLD_ORE.get())
                .add(END_REDSTONE_ORE.get())
                .add(NETHER_DIAMOND_ORE.get())
                .add(NETHER_EMERALD_ORE.get())
                .add(NETHER_REDSTONE_ORE.get());
    }
}
