package me.astroxd8.dimensionalores.registry.worldgen;

import me.astroxd8.dimensionalores.Constants;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public class DOBiomeModifiers {
    public static final ResourceKey<BiomeModifier> QUARTZ_ORE = registerKey("quartz_ore");

    public static final ResourceKey<BiomeModifier> NETHER_COAL_ORE = registerKey("nether_coal_ore");
    public static final ResourceKey<BiomeModifier> NETHER_COPPER_ORE = registerKey("nether_copper_ore");
    public static final ResourceKey<BiomeModifier> NETHER_DIAMOND_ORE = registerKey("nether_diamond_ore");
    public static final ResourceKey<BiomeModifier> NETHER_EMERALD_ORE = registerKey("nether_emerald_ore");
    public static final ResourceKey<BiomeModifier> NETHER_IRON_ORE = registerKey("nether_iron_ore");
    public static final ResourceKey<BiomeModifier> NETHER_LAPIS_ORE = registerKey("nether_lapis_ore");
    public static final ResourceKey<BiomeModifier> NETHER_REDSTONE_ORE = registerKey("nether_redstone_ore");

    public static final ResourceKey<BiomeModifier> END_COAL_ORE = registerKey("end_coal_ore");
    public static final ResourceKey<BiomeModifier> END_COPPER_ORE = registerKey("end_copper_ore");
    public static final ResourceKey<BiomeModifier> END_DIAMOND_ORE = registerKey("end_diamond_ore");
    public static final ResourceKey<BiomeModifier> END_EMERALD_ORE = registerKey("end_emerald_ore");
    public static final ResourceKey<BiomeModifier> END_GOLD_ORE = registerKey("end_gold_ore");
    public static final ResourceKey<BiomeModifier> END_IRON_ORE = registerKey("end_iron_ore");
    public static final ResourceKey<BiomeModifier> END_LAPIS_ORE = registerKey("end_lapis_ore");
    public static final ResourceKey<BiomeModifier> END_QUARTZ_ORE = registerKey("end_quartz_ore");
    public static final ResourceKey<BiomeModifier> END_REDSTONE_ORE = registerKey("end_redstone_ore");

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        overworld(context, QUARTZ_ORE, DOPlacedFeatures.QUARTZ_ORE);
        
        nether(context, NETHER_COAL_ORE, DOPlacedFeatures.NETHER_COAL_ORE);
        nether(context, NETHER_COPPER_ORE, DOPlacedFeatures.NETHER_COPPER_ORE);
        nether(context, NETHER_DIAMOND_ORE, DOPlacedFeatures.NETHER_DIAMOND_ORE);
        nether(context, NETHER_EMERALD_ORE, DOPlacedFeatures.NETHER_EMERALD_ORE);
        nether(context, NETHER_IRON_ORE, DOPlacedFeatures.NETHER_IRON_ORE);
        nether(context, NETHER_LAPIS_ORE, DOPlacedFeatures.NETHER_LAPIS_ORE);
        nether(context, NETHER_REDSTONE_ORE, DOPlacedFeatures.NETHER_REDSTONE_ORE);

        end(context, END_COAL_ORE, DOPlacedFeatures.END_COAL_ORE);
        end(context, END_COPPER_ORE, DOPlacedFeatures.END_COPPER_ORE);
        end(context, END_DIAMOND_ORE, DOPlacedFeatures.END_DIAMOND_ORE);
        end(context, END_EMERALD_ORE, DOPlacedFeatures.END_EMERALD_ORE);
        end(context, END_GOLD_ORE, DOPlacedFeatures.END_GOLD_ORE);
        end(context, END_IRON_ORE, DOPlacedFeatures.END_IRON_ORE);
        end(context, END_LAPIS_ORE, DOPlacedFeatures.END_LAPIS_ORE);
        end(context, END_QUARTZ_ORE, DOPlacedFeatures.END_QUARTZ_ORE);
        end(context, END_REDSTONE_ORE, DOPlacedFeatures.END_REDSTONE_ORE);
    }

    private static void overworld(BootstrapContext<BiomeModifier> context, ResourceKey<BiomeModifier> biomeModifierKey, ResourceKey<PlacedFeature> placedFeatureKey) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(biomeModifierKey, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_OVERWORLD),
                HolderSet.direct(placedFeatures.getOrThrow(placedFeatureKey)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static void nether(BootstrapContext<BiomeModifier> context, ResourceKey<BiomeModifier> biomeModifierKey, ResourceKey<PlacedFeature> placedFeatureKey) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(biomeModifierKey, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_NETHER),
                HolderSet.direct(placedFeatures.getOrThrow(placedFeatureKey)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static void end(BootstrapContext<BiomeModifier> context, ResourceKey<BiomeModifier> biomeModifierKey, ResourceKey<PlacedFeature> placedFeatureKey) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        context.register(biomeModifierKey, new BiomeModifiers.AddFeaturesBiomeModifier(
                biomes.getOrThrow(BiomeTags.IS_END),
                HolderSet.direct(placedFeatures.getOrThrow(placedFeatureKey)),
                GenerationStep.Decoration.UNDERGROUND_ORES));
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, Constants.id(name));
    }
}
