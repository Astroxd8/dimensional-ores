package me.astroxd8.dimensionalores;

import me.astroxd8.dimensionalores.registry.*;
import me.astroxd8.dimensionalores.registry.worldgen.DOBiomeModifiers;
import net.fabricmc.api.ModInitializer;

public class DimensionalOres implements ModInitializer {
    @Override
    public void onInitialize() {
        DOItems.register();
        DOBlocks.register();

        DOCreativeModeTabs.register();

        DOBiomeModifiers.bootstrap();
    }
}
