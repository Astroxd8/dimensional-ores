package me.astroxd8.dimensionalores.data;

import me.astroxd8.dimensionalores.Constants;
import static me.astroxd8.dimensionalores.registry.DOBlocks.*;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.data.PackOutput;
import org.jetbrains.annotations.Nullable;

public class DOModelProvider extends ModelProvider {
    protected DOModelProvider(PackOutput output) {
        super(output, Constants.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators block, @Nullable ItemModelGenerators item) {
        block.createTrivialCube(QUARTZ_ORE.get());

        block.createTrivialCube(DEEPSLATE_QUARTZ_ORE.get());

        block.createTrivialCube(NETHER_COAL_ORE.get());
        block.createTrivialCube(NETHER_COPPER_ORE.get());
        block.createTrivialCube(NETHER_DIAMOND_ORE.get());
        block.createTrivialCube(NETHER_EMERALD_ORE.get());
        block.createTrivialCube(NETHER_IRON_ORE.get());
        block.createTrivialCube(NETHER_LAPIS_ORE.get());
        block.createTrivialCube(NETHER_REDSTONE_ORE.get());

        block.createTrivialCube(END_COAL_ORE.get());
        block.createTrivialCube(END_COPPER_ORE.get());
        block.createTrivialCube(END_DIAMOND_ORE.get());
        block.createTrivialCube(END_EMERALD_ORE.get());
        block.createTrivialCube(END_GOLD_ORE.get());
        block.createTrivialCube(END_IRON_ORE.get());
        block.createTrivialCube(END_LAPIS_ORE.get());
        block.createTrivialCube(END_QUARTZ_ORE.get());
        block.createTrivialCube(END_REDSTONE_ORE.get());
    }
}
