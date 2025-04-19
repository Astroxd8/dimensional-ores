package me.astroxd8.dimensionalores.data;

import static me.astroxd8.dimensionalores.registry.DOBlocks.*;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class DOModelProvider extends FabricModelProvider {
    public DOModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators block) {
        block.createTrivialCube(QUARTZ_ORE);

        block.createTrivialCube(DEEPSLATE_QUARTZ_ORE);

        block.createTrivialCube(NETHER_COAL_ORE);
        block.createTrivialCube(NETHER_COPPER_ORE);
        block.createTrivialCube(NETHER_DIAMOND_ORE);
        block.createTrivialCube(NETHER_EMERALD_ORE);
        block.createTrivialCube(NETHER_IRON_ORE);
        block.createTrivialCube(NETHER_LAPIS_ORE);
        block.createTrivialCube(NETHER_REDSTONE_ORE);

        block.createTrivialCube(END_COAL_ORE);
        block.createTrivialCube(END_COPPER_ORE);
        block.createTrivialCube(END_DIAMOND_ORE);
        block.createTrivialCube(END_EMERALD_ORE);
        block.createTrivialCube(END_GOLD_ORE);
        block.createTrivialCube(END_IRON_ORE);
        block.createTrivialCube(END_LAPIS_ORE);
        block.createTrivialCube(END_QUARTZ_ORE);
        block.createTrivialCube(END_REDSTONE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerators item) {
    }
}
