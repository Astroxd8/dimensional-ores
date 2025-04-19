package me.astroxd8.dimensionalores.registry.worldgen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class DOBiomeModifiers {
    public static void bootstrap() {
        overworld(DOPlacedFeatures.QUARTZ_ORE);
        
        nether(DOPlacedFeatures.NETHER_COAL_ORE);
        nether(DOPlacedFeatures.NETHER_COPPER_ORE);
        nether(DOPlacedFeatures.NETHER_DIAMOND_ORE);
        nether(DOPlacedFeatures.NETHER_EMERALD_ORE);
        nether(DOPlacedFeatures.NETHER_IRON_ORE);
        nether(DOPlacedFeatures.NETHER_LAPIS_ORE);
        nether(DOPlacedFeatures.NETHER_REDSTONE_ORE);

        end(DOPlacedFeatures.END_COAL_ORE);
        end(DOPlacedFeatures.END_COPPER_ORE);
        end(DOPlacedFeatures.END_DIAMOND_ORE);
        end(DOPlacedFeatures.END_EMERALD_ORE);
        end(DOPlacedFeatures.END_GOLD_ORE);
        end(DOPlacedFeatures.END_IRON_ORE);
        end(DOPlacedFeatures.END_LAPIS_ORE);
        end(DOPlacedFeatures.END_QUARTZ_ORE);
        end(DOPlacedFeatures.END_REDSTONE_ORE);
    }

    private static void overworld(ResourceKey<PlacedFeature> key) {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, key);
    }

    private static void nether(ResourceKey<PlacedFeature> key) {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheNether(), GenerationStep.Decoration.UNDERGROUND_ORES, key);
    }

    private static void end(ResourceKey<PlacedFeature> key) {
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Decoration.UNDERGROUND_ORES, key);
    }
}
