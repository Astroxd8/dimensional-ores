package me.astroxd8.dimensionalores.registry.worldgen;

import me.astroxd8.dimensionalores.Constants;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;

import java.util.List;

public class DOPlacedFeatures {
    public static final ResourceKey<PlacedFeature> QUARTZ_ORE = registerKey("quartz_ore");

    public static final ResourceKey<PlacedFeature> NETHER_COAL_ORE = registerKey("nether_coal_ore");
    public static final ResourceKey<PlacedFeature> NETHER_COPPER_ORE = registerKey("nether_copper_ore");
    public static final ResourceKey<PlacedFeature> NETHER_DIAMOND_ORE = registerKey("nether_diamond_ore");
    public static final ResourceKey<PlacedFeature> NETHER_EMERALD_ORE = registerKey("nether_emerald_ore");
    public static final ResourceKey<PlacedFeature> NETHER_IRON_ORE = registerKey("nether_iron_ore");
    public static final ResourceKey<PlacedFeature> NETHER_LAPIS_ORE = registerKey("nether_lapis_ore");
    public static final ResourceKey<PlacedFeature> NETHER_REDSTONE_ORE = registerKey("nether_redstone_ore");

    public static final ResourceKey<PlacedFeature> END_COAL_ORE = registerKey("end_coal_ore");
    public static final ResourceKey<PlacedFeature> END_COPPER_ORE = registerKey("end_copper_ore");
    public static final ResourceKey<PlacedFeature> END_DIAMOND_ORE = registerKey("end_diamond_ore");
    public static final ResourceKey<PlacedFeature> END_EMERALD_ORE = registerKey("end_emerald_ore");
    public static final ResourceKey<PlacedFeature> END_GOLD_ORE = registerKey("end_gold_ore");
    public static final ResourceKey<PlacedFeature> END_IRON_ORE = registerKey("end_iron_ore");
    public static final ResourceKey<PlacedFeature> END_LAPIS_ORE = registerKey("end_lapis_ore");
    public static final ResourceKey<PlacedFeature> END_QUARTZ_ORE = registerKey("end_quartz_ore");
    public static final ResourceKey<PlacedFeature> END_REDSTONE_ORE = registerKey("end_redstone_ore");
    
    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, QUARTZ_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.QUARTZ_ORE), DOOrePlacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.absolute(63))));

        register(context, NETHER_COAL_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.NETHER_COAL_ORE), DOOrePlacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(10))));
        register(context, NETHER_COPPER_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.NETHER_COPPER_ORE), DOOrePlacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.belowTop(10))));
        register(context, NETHER_DIAMOND_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.NETHER_DIAMOND_ORE), DOOrePlacement.commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(8), VerticalAnchor.belowTop(24))));
        register(context, NETHER_EMERALD_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.NETHER_EMERALD_ORE), DOOrePlacement.commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(8), VerticalAnchor.absolute(8))));
        register(context, NETHER_IRON_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.NETHER_IRON_ORE), DOOrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(10), VerticalAnchor.absolute(10))));
        register(context, NETHER_LAPIS_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.NETHER_LAPIS_ORE), DOOrePlacement.commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(8), VerticalAnchor.absolute(24))));
        register(context, NETHER_REDSTONE_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.NETHER_REDSTONE_ORE), DOOrePlacement.commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(8), VerticalAnchor.absolute(24))));

        register(context, END_COAL_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.END_COAL_ORE), DOOrePlacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0))));
        register(context, END_COPPER_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.END_COPPER_ORE), DOOrePlacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0))));
        register(context, END_DIAMOND_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.END_DIAMOND_ORE), DOOrePlacement.commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0))));
        register(context, END_EMERALD_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.END_EMERALD_ORE), DOOrePlacement.commonOrePlacement(100, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0))));
        register(context, END_GOLD_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.END_GOLD_ORE), DOOrePlacement.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0))));
        register(context, END_IRON_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.END_IRON_ORE), DOOrePlacement.commonOrePlacement(10, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0))));
        register(context, END_LAPIS_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.END_LAPIS_ORE), DOOrePlacement.commonOrePlacement(3, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0))));
        register(context, END_QUARTZ_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.END_QUARTZ_ORE), DOOrePlacement.commonOrePlacement(16, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0))));
        register(context, END_REDSTONE_ORE, configuredFeatures.getOrThrow(DOConfiguredFeatures.END_REDSTONE_ORE), DOOrePlacement.commonOrePlacement(6, HeightRangePlacement.uniform(VerticalAnchor.aboveBottom(0), VerticalAnchor.belowTop(0))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, Constants.id(name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
