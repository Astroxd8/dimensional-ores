package me.astroxd8.dimensionalores.registry.worldgen;

import me.astroxd8.dimensionalores.Constants;
import me.astroxd8.dimensionalores.registry.DOBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

import java.util.List;

public class DOConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> QUARTZ_ORE = registerKey("quartz_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COAL_ORE = registerKey("nether_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_COPPER_ORE = registerKey("nether_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_DIAMOND_ORE = registerKey("nether_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_EMERALD_ORE = registerKey("nether_emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_IRON_ORE = registerKey("nether_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_LAPIS_ORE = registerKey("nether_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> NETHER_REDSTONE_ORE = registerKey("nether_redstone_ore");

    public static final ResourceKey<ConfiguredFeature<?, ?>> END_COAL_ORE = registerKey("end_coal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_COPPER_ORE = registerKey("end_copper_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_DIAMOND_ORE = registerKey("end_diamond_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_EMERALD_ORE = registerKey("end_emerald_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_GOLD_ORE = registerKey("end_gold_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_IRON_ORE = registerKey("end_iron_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_LAPIS_ORE = registerKey("end_lapis_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_QUARTZ_ORE = registerKey("end_quartz_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_REDSTONE_ORE = registerKey("end_redstone_ore");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherrackReplaceables = new BlockMatchTest(Blocks.NETHERRACK);
        RuleTest endstoneReplaceables = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> quartzOres = List.of(
                OreConfiguration.target(stoneReplaceables, DOBlocks.QUARTZ_ORE.defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, DOBlocks.DEEPSLATE_QUARTZ_ORE.defaultBlockState())
        );

        register(context, QUARTZ_ORE, Feature.ORE, new OreConfiguration(quartzOres, 14));

        register(context, NETHER_COAL_ORE, Feature.ORE, new OreConfiguration(netherrackReplaceables, DOBlocks.NETHER_COAL_ORE.defaultBlockState(), 17));
        register(context, NETHER_COPPER_ORE, Feature.ORE, new OreConfiguration(netherrackReplaceables, DOBlocks.NETHER_COPPER_ORE.defaultBlockState(), 15));
        register(context, NETHER_DIAMOND_ORE, Feature.ORE, new OreConfiguration(netherrackReplaceables, DOBlocks.NETHER_DIAMOND_ORE.defaultBlockState(), 8));
        register(context, NETHER_EMERALD_ORE, Feature.ORE, new OreConfiguration(netherrackReplaceables, DOBlocks.NETHER_EMERALD_ORE.defaultBlockState(), 3));
        register(context, NETHER_IRON_ORE, Feature.ORE, new OreConfiguration(netherrackReplaceables, DOBlocks.NETHER_IRON_ORE.defaultBlockState(), 7));
        register(context, NETHER_LAPIS_ORE, Feature.ORE, new OreConfiguration(netherrackReplaceables, DOBlocks.NETHER_LAPIS_ORE.defaultBlockState(), 7));
        register(context, NETHER_REDSTONE_ORE, Feature.ORE, new OreConfiguration(netherrackReplaceables, DOBlocks.NETHER_REDSTONE_ORE.defaultBlockState(), 8));

        register(context, END_COAL_ORE, Feature.ORE, new OreConfiguration(endstoneReplaceables, DOBlocks.END_COAL_ORE.defaultBlockState(), 17));
        register(context, END_COPPER_ORE, Feature.ORE, new OreConfiguration(endstoneReplaceables, DOBlocks.END_COPPER_ORE.defaultBlockState(), 15));
        register(context, END_DIAMOND_ORE, Feature.ORE, new OreConfiguration(endstoneReplaceables, DOBlocks.END_DIAMOND_ORE.defaultBlockState(), 8));
        register(context, END_EMERALD_ORE, Feature.ORE, new OreConfiguration(endstoneReplaceables, DOBlocks.END_EMERALD_ORE.defaultBlockState(), 3));
        register(context, END_GOLD_ORE, Feature.ORE, new OreConfiguration(endstoneReplaceables, DOBlocks.END_GOLD_ORE.defaultBlockState(), 9));
        register(context, END_IRON_ORE, Feature.ORE, new OreConfiguration(endstoneReplaceables, DOBlocks.END_IRON_ORE.defaultBlockState(), 7));
        register(context, END_LAPIS_ORE, Feature.ORE, new OreConfiguration(endstoneReplaceables, DOBlocks.END_LAPIS_ORE.defaultBlockState(), 7));
        register(context, END_QUARTZ_ORE, Feature.ORE, new OreConfiguration(endstoneReplaceables, DOBlocks.END_QUARTZ_ORE.defaultBlockState(), 14));
        register(context, END_REDSTONE_ORE, Feature.ORE, new OreConfiguration(endstoneReplaceables, DOBlocks.END_REDSTONE_ORE.defaultBlockState(), 8));
    }

    private static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, Constants.id(name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
