package me.astroxd8.dimensionalores;

import me.astroxd8.dimensionalores.registry.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class DimensionalOres {
    public DimensionalOres(IEventBus eventBus) {
        DOItems.register(eventBus);
        DOBlocks.register(eventBus);

        DOCreativeModeTabs.register(eventBus);
    }
}