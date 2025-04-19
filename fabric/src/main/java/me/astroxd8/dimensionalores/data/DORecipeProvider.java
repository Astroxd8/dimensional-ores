package me.astroxd8.dimensionalores.data;

import me.astroxd8.dimensionalores.Constants;
import static me.astroxd8.dimensionalores.registry.DOBlocks.*;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class DORecipeProvider extends FabricRecipeProvider {
    public DORecipeProvider(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput output) {
        return new RecipeProvider(provider, output) {
            @Override
            public void buildRecipes() {
                List<ItemLike> COAL_SMELTABLES = List.of(NETHER_COAL_ORE, END_COAL_ORE);
                List<ItemLike> COPPER_SMELTABLES = List.of(NETHER_COPPER_ORE, END_COPPER_ORE);
                List<ItemLike> DIAMOND_SMELTABLES = List.of(NETHER_DIAMOND_ORE, END_DIAMOND_ORE);
                List<ItemLike> EMERALD_SMELTABLES = List.of(NETHER_EMERALD_ORE, END_EMERALD_ORE);
                List<ItemLike> GOLD_SMELTABLES = List.of(END_GOLD_ORE);
                List<ItemLike> IRON_SMELTABLES = List.of(NETHER_IRON_ORE, END_IRON_ORE);
                List<ItemLike> LAPIS_SMELTABLES = List.of(NETHER_LAPIS_ORE, END_LAPIS_ORE);
                List<ItemLike> QUARTZ_SMELTABLES = List.of(QUARTZ_ORE, DEEPSLATE_QUARTZ_ORE, END_QUARTZ_ORE);
                List<ItemLike> REDSTONE_SMELTABLES = List.of(NETHER_REDSTONE_ORE, END_REDSTONE_ORE);

                oreSmelting(COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.1f, 200, "coal");
                oreSmelting(COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.7f, 200, "copper_ingot");
                oreSmelting(DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 1.0f, 200, "diamond");
                oreSmelting(EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 1.0f, 200, "emerald");
                oreSmelting(GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 1.0f, 200, "gold_ingot");
                oreSmelting(IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, 200, "iron_ingot");
                oreSmelting(LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, 200, "lapis_lazuli");
                oreSmelting(QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 0.2f, 200, "quartz");
                oreSmelting(REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.7f, 200, "redstone");

                oreBlasting(COAL_SMELTABLES, RecipeCategory.MISC, Items.COAL, 0.1f, 100, "coal");
                oreBlasting(COPPER_SMELTABLES, RecipeCategory.MISC, Items.COPPER_INGOT, 0.7f, 100, "copper_ingot");
                oreBlasting(DIAMOND_SMELTABLES, RecipeCategory.MISC, Items.DIAMOND, 1.0f, 100, "diamond");
                oreBlasting(EMERALD_SMELTABLES, RecipeCategory.MISC, Items.EMERALD, 1.0f, 100, "emerald");
                oreBlasting(GOLD_SMELTABLES, RecipeCategory.MISC, Items.GOLD_INGOT, 1.0f, 100, "gold_ingot");
                oreBlasting(IRON_SMELTABLES, RecipeCategory.MISC, Items.IRON_INGOT, 0.7f, 100, "iron_ingot");
                oreBlasting(LAPIS_SMELTABLES, RecipeCategory.MISC, Items.LAPIS_LAZULI, 0.2f, 100, "lapis_lazuli");
                oreBlasting(QUARTZ_SMELTABLES, RecipeCategory.MISC, Items.QUARTZ, 0.2f, 100, "quartz");
                oreBlasting(REDSTONE_SMELTABLES, RecipeCategory.MISC, Items.REDSTONE, 0.7f, 100, "redstone");
            }
        };
    }

    @Override
    public String getName() {
        return "Recipe";
    }
}
