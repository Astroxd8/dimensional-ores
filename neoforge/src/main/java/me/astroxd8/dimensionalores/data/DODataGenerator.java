package me.astroxd8.dimensionalores.data;

import me.astroxd8.dimensionalores.Constants;
import me.astroxd8.dimensionalores.data.lang.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DODataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        PackOutput output = event.getGenerator().getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        event.addProvider(new LootTableProvider(output, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(DOBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        event.createProvider(DOBlockTagProvider::new);
        event.createProvider(DODatapackProvider::new);
        event.createProvider(DOModelProvider::new);
        event.createProvider(DORecipeProvider.Runner::new);

        event.createProvider(DOAmericanEnglish::new);
    }
}
