package me.astroxd8.dimensionalores.registry;

import me.astroxd8.dimensionalores.Constants;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class DOItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Constants.MOD_ID);

    protected static <T extends Item> DeferredItem<T> registerItem(String name, Function<Item.Properties, T> item, Item.Properties properties) {
        return ITEMS.register(name, () -> item.apply(properties.setId(ResourceKey.create(Registries.ITEM, Constants.id(name)))));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
