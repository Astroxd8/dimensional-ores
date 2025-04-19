package me.astroxd8.dimensionalores.registry;

import me.astroxd8.dimensionalores.Constants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

import java.util.function.Function;

public class DOItems {
    protected static <T extends Item> T registerItem(String name, Function<Item.Properties, T> item, Item.Properties properties) {
        return Registry.register(BuiltInRegistries.ITEM, Constants.id(name), item.apply(properties.setId(ResourceKey.create(Registries.ITEM, Constants.id(name)))));
    }

    public static void register() {
    }
}
