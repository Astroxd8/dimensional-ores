package me.astroxd8.dimensionalores.registry;

import me.astroxd8.dimensionalores.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;
import java.util.function.Supplier;

public class DOBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Constants.MOD_ID);

    public static final DeferredBlock<Block> QUARTZ_ORE = registerBlock("quartz_ore", props -> new DropExperienceBlock(UniformInt.of(2, 5), props), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE).mapColor(MapColor.STONE).sound(SoundType.STONE));

    public static final DeferredBlock<Block> DEEPSLATE_QUARTZ_ORE = registerBlock("deepslate_quartz_ore", props -> new DropExperienceBlock(UniformInt.of(2, 5), props), () -> BlockBehaviour.Properties.ofFullCopy(QUARTZ_ORE.get()).strength(4.5F, 3.0F).sound(SoundType.DEEPSLATE));

    public static final DeferredBlock<Block> NETHER_COAL_ORE = registerBlock("nether_coal_ore", props -> new DropExperienceBlock(UniformInt.of(0, 2), props), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE).mapColor(MapColor.NETHER));
    public static final DeferredBlock<Block> NETHER_COPPER_ORE = registerBlock("nether_copper_ore", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE).mapColor(MapColor.NETHER));
    public static final DeferredBlock<Block> NETHER_DIAMOND_ORE = registerBlock("nether_diamond_ore", props -> new DropExperienceBlock(UniformInt.of(3, 7), props), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).mapColor(MapColor.NETHER));
    public static final DeferredBlock<Block> NETHER_EMERALD_ORE = registerBlock("nether_emerald_ore", props -> new DropExperienceBlock(UniformInt.of(3, 7), props), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE).mapColor(MapColor.NETHER));
    public static final DeferredBlock<Block> NETHER_IRON_ORE = registerBlock("nether_iron_ore", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).mapColor(MapColor.NETHER));
    public static final DeferredBlock<Block> NETHER_LAPIS_ORE = registerBlock("nether_lapis_ore", props -> new DropExperienceBlock(UniformInt.of(2, 5), props), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE).mapColor(MapColor.NETHER));
    public static final DeferredBlock<Block> NETHER_REDSTONE_ORE = registerBlock("nether_redstone_ore", RedStoneOreBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).mapColor(MapColor.NETHER));

    public static final DeferredBlock<Block> END_COAL_ORE = registerBlock("end_coal_ore", props -> new DropExperienceBlock(UniformInt.of(0, 2), props), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COAL_ORE).mapColor(MapColor.SAND));
    public static final DeferredBlock<Block> END_COPPER_ORE = registerBlock("end_copper_ore", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.COPPER_ORE).mapColor(MapColor.SAND));
    public static final DeferredBlock<Block> END_DIAMOND_ORE = registerBlock("end_diamond_ore", props -> new DropExperienceBlock(UniformInt.of(3, 7), props), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.DIAMOND_ORE).mapColor(MapColor.SAND));
    public static final DeferredBlock<Block> END_EMERALD_ORE = registerBlock("end_emerald_ore", props -> new DropExperienceBlock(UniformInt.of(3, 7), props), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.EMERALD_ORE).mapColor(MapColor.SAND));
    public static final DeferredBlock<Block> END_GOLD_ORE = registerBlock("end_gold_ore", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.GOLD_ORE).mapColor(MapColor.SAND));
    public static final DeferredBlock<Block> END_IRON_ORE = registerBlock("end_iron_ore", Block::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_ORE).mapColor(MapColor.SAND));
    public static final DeferredBlock<Block> END_LAPIS_ORE = registerBlock("end_lapis_ore", props -> new DropExperienceBlock(UniformInt.of(2, 5), props), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.LAPIS_ORE).mapColor(MapColor.SAND));
    public static final DeferredBlock<Block> END_QUARTZ_ORE = registerBlock("end_quartz_ore", props -> new DropExperienceBlock(UniformInt.of(2, 5), props), () -> BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_QUARTZ_ORE).mapColor(MapColor.SAND));
    public static final DeferredBlock<Block> END_REDSTONE_ORE = registerBlock("end_redstone_ore", RedStoneOreBlock::new, () -> BlockBehaviour.Properties.ofFullCopy(Blocks.REDSTONE_ORE).mapColor(MapColor.SAND));

    protected static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> block, Supplier<BlockBehaviour.Properties> properties) {
        DeferredBlock<T> newBlock = BLOCKS.register(name, () -> block.apply(properties.get().setId(ResourceKey.create(Registries.BLOCK, Constants.id(name)))));
        DOItems.registerItem(name, props -> new BlockItem(newBlock.get(), props), new Item.Properties().useBlockDescriptionPrefix());
        return newBlock;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
