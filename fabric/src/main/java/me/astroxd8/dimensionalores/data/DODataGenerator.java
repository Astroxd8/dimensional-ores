package me.astroxd8.dimensionalores.data;

import me.astroxd8.dimensionalores.data.lang.*;
import me.astroxd8.dimensionalores.registry.worldgen.DOConfiguredFeatures;
import me.astroxd8.dimensionalores.registry.worldgen.DOPlacedFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class DODataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        FabricDataGenerator.Pack pack = generator.createPack();

        pack.addProvider(DOBlockLootTableProvider::new);
        pack.addProvider(DOBlockTagProvider::new);
        pack.addProvider(DODynamicRegistryProvider::new);
        pack.addProvider(DOModelProvider::new);
        pack.addProvider(DORecipeProvider::new);

        pack.addProvider(DOAmericanEnglish::new);
    }

    @Override
    public void buildRegistry(RegistrySetBuilder builder) {
        builder.add(Registries.CONFIGURED_FEATURE, DOConfiguredFeatures::bootstrap);
        builder.add(Registries.PLACED_FEATURE, DOPlacedFeatures::bootstrap);
    }
}
