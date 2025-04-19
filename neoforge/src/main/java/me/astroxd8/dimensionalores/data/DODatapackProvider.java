package me.astroxd8.dimensionalores.data;

import me.astroxd8.dimensionalores.Constants;
import me.astroxd8.dimensionalores.registry.worldgen.DOBiomeModifiers;
import me.astroxd8.dimensionalores.registry.worldgen.DOConfiguredFeatures;
import me.astroxd8.dimensionalores.registry.worldgen.DOPlacedFeatures;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class DODatapackProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(NeoForgeRegistries.Keys.BIOME_MODIFIERS, DOBiomeModifiers::bootstrap)
            .add(Registries.CONFIGURED_FEATURE, DOConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, DOPlacedFeatures::bootstrap);

    public DODatapackProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(Constants.MOD_ID));
    }
}
