package me.astroxd8.dimensionalores.registry;

import me.astroxd8.dimensionalores.Constants;
import static me.astroxd8.dimensionalores.registry.DOBlocks.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DOCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Constants.MOD_ID);
    public static final Supplier<CreativeModeTab> TAB = CREATIVE_MODE_TAB.register("creative_mode_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(NETHER_DIAMOND_ORE))
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

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
