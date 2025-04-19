package me.astroxd8.dimensionalores.data.lang;

import static me.astroxd8.dimensionalores.registry.DOBlocks.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class DOAmericanEnglish extends FabricLanguageProvider {
    public DOAmericanEnglish(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(dataOutput, "en_us", lookupProvider);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider lookupProvider, TranslationBuilder builder) {
        builder.add(QUARTZ_ORE, "Quartz Ore");

        builder.add(DEEPSLATE_QUARTZ_ORE, "Deepslate Quartz Ore");

        builder.add(NETHER_COAL_ORE, "Nether Coal Ore");
        builder.add(NETHER_COPPER_ORE, "Nether Copper Ore");
        builder.add(NETHER_DIAMOND_ORE, "Nether Diamond Ore");
        builder.add(NETHER_EMERALD_ORE, "Nether Emerald Ore");
        builder.add(NETHER_IRON_ORE, "Nether Iron Ore");
        builder.add(NETHER_LAPIS_ORE, "Nether Lapis Lazuli Ore");
        builder.add(NETHER_REDSTONE_ORE, "Nether Redstone Ore");

        builder.add(END_COAL_ORE, "End Coal Ore");
        builder.add(END_COPPER_ORE, "End Copper Ore");
        builder.add(END_DIAMOND_ORE, "End Diamond Ore");
        builder.add(END_EMERALD_ORE, "End Emerald Ore");
        builder.add(END_GOLD_ORE, "End Gold Ore");
        builder.add(END_IRON_ORE, "End Iron Ore");
        builder.add(END_LAPIS_ORE, "End Lapis Lazuli Ore");
        builder.add(END_QUARTZ_ORE, "End Quartz Ore");
        builder.add(END_REDSTONE_ORE, "End Redstone Ore");

        builder.add("itemGroup.dimensionalores", "Dimensional Ores");
    }
}
