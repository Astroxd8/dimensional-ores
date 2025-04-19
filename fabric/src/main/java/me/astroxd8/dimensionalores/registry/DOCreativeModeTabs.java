package me.astroxd8.dimensionalores.registry;

import me.astroxd8.dimensionalores.Constants;
import static me.astroxd8.dimensionalores.registry.DOBlocks.*;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DOCreativeModeTabs {
    public static final CreativeModeTab CREATIVE_MODE_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, Constants.id("creative_mode_tab"),
            FabricItemGroup.builder().icon(() -> new ItemStack(DOBlocks.NETHER_DIAMOND_ORE))
            .title(Component.translatable("itemGroup." + Constants.MOD_ID))
            .displayItems((itemDisplayParameters, output) -> {
                output.accept(QUARTZ_ORE);

                output.accept(DEEPSLATE_QUARTZ_ORE);

                output.accept(NETHER_COAL_ORE);
                output.accept(NETHER_COPPER_ORE);
                output.accept(NETHER_DIAMOND_ORE);
                output.accept(NETHER_EMERALD_ORE);
                output.accept(NETHER_IRON_ORE);
                output.accept(NETHER_LAPIS_ORE);
                output.accept(NETHER_REDSTONE_ORE);

                output.accept(END_COAL_ORE);
                output.accept(END_COPPER_ORE);
                output.accept(END_DIAMOND_ORE);
                output.accept(END_EMERALD_ORE);
                output.accept(END_GOLD_ORE);
                output.accept(END_IRON_ORE);
                output.accept(END_LAPIS_ORE);
                output.accept(END_QUARTZ_ORE);
                output.accept(END_REDSTONE_ORE);
            }).build());

    public static void register() {
    }
}
