package net.evilnotch.neomusic.datagen;

import net.evilnotch.neomusic.NeoMusic;
import net.evilnotch.neomusic.block.ModBlocks;
import net.evilnotch.neomusic.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY, ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);
        offerSmelting(recipeExporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.Ruby, 0.28f, 435, "ruby");
        offerBlasting(recipeExporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.Ruby, 0.32f, 322, "ruby");

        offerReversibleCompactingRecipes(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModItems.Ruby, RecipeCategory.MISC, ModBlocks.RUBY_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_BLOCK)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModItems.Ruby)
                .criterion(hasItem(ModItems.Ruby), conditionsFromItem(ModItems.Ruby))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "rubies_to_ruby_block_via_crafting"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.Ruby, 9)
                .input(ModBlocks.RUBY_BLOCK)
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "ruby_block_to_rubies_via_crafting"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.RUBY_BUTTON, 1)
                        .input(ModItems.Ruby)
                        .criterion(hasItem(ModItems.Ruby), conditionsFromItem(ModItems.Ruby))
                        .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "ruby_to_ruby_button"));

        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBY_SLAB, ModBlocks.RUBY_BLOCK);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.NETHERITE_SLAB, Blocks.NETHERITE_BLOCK);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.EMERALD_SLAB, Blocks.EMERALD_BLOCK);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);
        offerSlabRecipe(recipeExporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);

        createStairsRecipe(ModBlocks.RUBY_STAIRS, Ingredient.ofItems(ModBlocks.RUBY_BLOCK))
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "ruby_block_to_ruby_stairs"));

        createStairsRecipe(ModBlocks.NETHERITE_STAIRS, Ingredient.ofItems(Blocks.NETHERITE_BLOCK))
                .criterion(hasItem(Blocks.NETHERITE_BLOCK), conditionsFromItem(Blocks.NETHERITE_BLOCK))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "netherite_block_to_netherite_stairs"));

        createStairsRecipe(ModBlocks.EMERALD_STAIRS, Ingredient.ofItems(Blocks.EMERALD_BLOCK))
                .criterion(hasItem(Blocks.EMERALD_BLOCK), conditionsFromItem(Blocks.EMERALD_BLOCK))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "emerald_block_to_emerald_stairs"));

        createStairsRecipe(ModBlocks.WHITE_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.WHITE_CONCRETE))
                .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "white_concrete_to_white_concrete_stairs"));

        createStairsRecipe(ModBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.ORANGE_CONCRETE))
                .criterion(hasItem(Blocks.ORANGE_CONCRETE), conditionsFromItem(Blocks.ORANGE_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "orange_concrete_to_orange_concrete_stairs"));

        createStairsRecipe(ModBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.MAGENTA_CONCRETE))
                .criterion(hasItem(Blocks.MAGENTA_CONCRETE), conditionsFromItem(Blocks.MAGENTA_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "magenta_concrete_to_magenta_concrete_stairs"));

        createStairsRecipe(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(Blocks.LIGHT_BLUE_CONCRETE), conditionsFromItem(Blocks.LIGHT_BLUE_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "light_blue_concrete_to_light_blue_concrete_stairs"));

        createStairsRecipe(ModBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.YELLOW_CONCRETE))
                .criterion(hasItem(Blocks.YELLOW_CONCRETE), conditionsFromItem(Blocks.YELLOW_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "yellow_concrete_to_yellow_concrete_stairs"));

        createStairsRecipe(ModBlocks.LIME_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.LIME_CONCRETE))
                .criterion(hasItem(Blocks.LIME_CONCRETE), conditionsFromItem(Blocks.LIME_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "lime_concrete_to_lime_concrete_stairs"));

        createStairsRecipe(ModBlocks.PINK_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.PINK_CONCRETE))
                .criterion(hasItem(Blocks.PINK_CONCRETE), conditionsFromItem(Blocks.PINK_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "pink_concrete_to_pink_concrete_stairs"));

        createStairsRecipe(ModBlocks.GRAY_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.GRAY_CONCRETE))
                .criterion(hasItem(Blocks.GRAY_CONCRETE), conditionsFromItem(Blocks.GRAY_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "gray_concrete_to_gray_concrete_stairs"));

        createStairsRecipe(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(Blocks.LIGHT_GRAY_CONCRETE), conditionsFromItem(Blocks.LIGHT_GRAY_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "light_gray_concrete_to_light_gray_concrete_stairs"));

        createStairsRecipe(ModBlocks.CYAN_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.CYAN_CONCRETE))
                .criterion(hasItem(Blocks.CYAN_CONCRETE), conditionsFromItem(Blocks.CYAN_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "cyan_concrete_to_cyan_concrete_stairs"));

        createStairsRecipe(ModBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.PURPLE_CONCRETE))
                .criterion(hasItem(Blocks.PURPLE_CONCRETE), conditionsFromItem(Blocks.PURPLE_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "purple_concrete_to_purple_concrete_stairs"));

        createStairsRecipe(ModBlocks.BLUE_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.BLUE_CONCRETE))
                .criterion(hasItem(Blocks.BLUE_CONCRETE), conditionsFromItem(Blocks.BLUE_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "blue_concrete_to_blue_concrete_stairs"));

        createStairsRecipe(ModBlocks.BROWN_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.BROWN_CONCRETE))
                .criterion(hasItem(Blocks.BROWN_CONCRETE), conditionsFromItem(Blocks.BROWN_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "brown_concrete_to_brown_concrete_stairs"));

        createStairsRecipe(ModBlocks.GREEN_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.GREEN_CONCRETE))
                .criterion(hasItem(Blocks.GREEN_CONCRETE), conditionsFromItem(Blocks.GREEN_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "green_concrete_to_green_concrete_stairs"));

        createStairsRecipe(ModBlocks.RED_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.RED_CONCRETE))
                .criterion(hasItem(Blocks.RED_CONCRETE), conditionsFromItem(Blocks.RED_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "red_concrete_to_red_concrete_stairs"));

        createStairsRecipe(ModBlocks.BLACK_CONCRETE_STAIRS, Ingredient.ofItems(Blocks.BLACK_CONCRETE))
                .criterion(hasItem(Blocks.BLACK_CONCRETE), conditionsFromItem(Blocks.BLACK_CONCRETE))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "black_concrete_to_black_concrete_stairs"));

        createTrapdoorRecipe(ModBlocks.RUBY_TRAPDOOR, Ingredient.ofItems(ModBlocks.RUBY_BLOCK))
                .criterion(hasItem(ModBlocks.RUBY_BLOCK), conditionsFromItem(ModBlocks.RUBY_BLOCK))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "ruby_block_to_ruby_trapdoor"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.HELLFIRE_ALLIANCE_CHESTPLATE)
                .pattern("L L")
                .pattern("GRG")
                .pattern("RGR")
                .input('R', ModItems.Ruby)
                .input('G', Items.GOLD_INGOT)
                .input('L', Items.LAPIS_LAZULI)
                .criterion(hasItem(ModItems.Ruby), conditionsFromItem(ModItems.Ruby))
                .offerTo(recipeExporter, Identifier.of(NeoMusic.MOD_ID, "hellfire_alliance_chestplate_recipe"));

        offerPressurePlateRecipe(recipeExporter, ModBlocks.RUBY_PRESSURE_PLATE, ModBlocks.RUBY_BLOCK);


        List<ItemConvertible> HONEY_DEW = List.of(Items.HONEYCOMB);
        offerSmelting(recipeExporter, HONEY_DEW, RecipeCategory.FOOD, ModItems.CRYSTALLIZED_HONEY, 0.11f, 200, "honey");
    }
}
