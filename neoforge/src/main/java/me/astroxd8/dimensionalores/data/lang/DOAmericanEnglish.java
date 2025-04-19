package me.astroxd8.dimensionalores.data.lang;

import me.astroxd8.dimensionalores.Constants;
import static me.astroxd8.dimensionalores.registry.DOBlocks.*;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class DOAmericanEnglish extends LanguageProvider {
    public DOAmericanEnglish(PackOutput output) {
        super(output, Constants.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(QUARTZ_ORE.get(), "Quartz Ore");

        add(DEEPSLATE_QUARTZ_ORE.get(), "Deepslate Quartz Ore");

        add(NETHER_COAL_ORE.get(), "Nether Coal Ore");
        add(NETHER_COPPER_ORE.get(), "Nether Copper Ore");
        add(NETHER_DIAMOND_ORE.get(), "Nether Diamond Ore");
        add(NETHER_EMERALD_ORE.get(), "Nether Emerald Ore");
        add(NETHER_IRON_ORE.get(), "Nether Iron Ore");
        add(NETHER_LAPIS_ORE.get(), "Nether Lapis Lazuli Ore");
        add(NETHER_REDSTONE_ORE.get(), "Nether Redstone Ore");

        add(END_COAL_ORE.get(), "End Coal Ore");
        add(END_COPPER_ORE.get(), "End Copper Ore");
        add(END_DIAMOND_ORE.get(), "End Diamond Ore");
        add(END_EMERALD_ORE.get(), "End Emerald Ore");
        add(END_GOLD_ORE.get(), "End Gold Ore");
        add(END_IRON_ORE.get(), "End Iron Ore");
        add(END_LAPIS_ORE.get(), "End Lapis Lazuli Ore");
        add(END_QUARTZ_ORE.get(), "End Quartz Ore");
        add(END_REDSTONE_ORE.get(), "End Redstone Ore");

        add("itemGroup.dimensionalores", "Dimensional Ores");
    }
}
