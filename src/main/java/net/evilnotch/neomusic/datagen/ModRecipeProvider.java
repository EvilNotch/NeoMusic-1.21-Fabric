package net.evilnotch.neomusic.datagen;

import net.evilnotch.neomusic.NeoMusic;
import net.evilnotch.neomusic.block.ModBlocks;
import net.evilnotch.neomusic.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
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

    }
}
