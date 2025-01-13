package net.evilnotch.neomusic.datagen;

import net.evilnotch.neomusic.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_SLAB)
                .add(ModBlocks.RUBY_STAIRS)
                .add(ModBlocks.RUBY_BUTTON)
                .add(ModBlocks.RUBY_TRAPDOOR)
                .add(ModBlocks.NETHERITE_SLAB)
                .add(ModBlocks.NETHERITE_STAIRS)
                .add(ModBlocks.WHITE_CONCRETE_STAIRS)
                .add(ModBlocks.WHITE_CONCRETE_SLAB)
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS)
                .add(ModBlocks.ORANGE_CONCRETE_SLAB)
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS)
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS)
                .add(ModBlocks.YELLOW_CONCRETE_SLAB)
                .add(ModBlocks.LIME_CONCRETE_STAIRS)
                .add(ModBlocks.LIME_CONCRETE_SLAB)
                .add(ModBlocks.PINK_CONCRETE_STAIRS)
                .add(ModBlocks.PINK_CONCRETE_SLAB)
                .add(ModBlocks.GRAY_CONCRETE_STAIRS)
                .add(ModBlocks.GRAY_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
                .add(ModBlocks.CYAN_CONCRETE_STAIRS)
                .add(ModBlocks.CYAN_CONCRETE_SLAB)
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS)
                .add(ModBlocks.PURPLE_CONCRETE_SLAB)
                .add(ModBlocks.BLUE_CONCRETE_STAIRS)
                .add(ModBlocks.BLUE_CONCRETE_SLAB)
                .add(ModBlocks.BROWN_CONCRETE_STAIRS)
                .add(ModBlocks.BROWN_CONCRETE_SLAB)
                .add(ModBlocks.GREEN_CONCRETE_STAIRS)
                .add(ModBlocks.GREEN_CONCRETE_SLAB)
                .add(ModBlocks.RED_CONCRETE_STAIRS)
                .add(ModBlocks.RED_CONCRETE_SLAB)
                .add(ModBlocks.BLACK_CONCRETE_STAIRS)
                .add(ModBlocks.BLACK_CONCRETE_SLAB);


        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.RUBY_SLAB)
                .add(ModBlocks.RUBY_STAIRS)
                .add(ModBlocks.RUBY_BUTTON)
                .add(ModBlocks.RUBY_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.RUBY_BLOCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.NETHERITE_STAIRS)
                .add(ModBlocks.NETHERITE_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.WHITE_CONCRETE_STAIRS)
                .add(ModBlocks.WHITE_CONCRETE_SLAB)
                .add(ModBlocks.ORANGE_CONCRETE_STAIRS)
                .add(ModBlocks.ORANGE_CONCRETE_SLAB)
                .add(ModBlocks.MAGENTA_CONCRETE_STAIRS)
                .add(ModBlocks.MAGENTA_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB)
                .add(ModBlocks.YELLOW_CONCRETE_STAIRS)
                .add(ModBlocks.YELLOW_CONCRETE_SLAB)
                .add(ModBlocks.LIME_CONCRETE_STAIRS)
                .add(ModBlocks.LIME_CONCRETE_SLAB)
                .add(ModBlocks.PINK_CONCRETE_STAIRS)
                .add(ModBlocks.PINK_CONCRETE_SLAB)
                .add(ModBlocks.GRAY_CONCRETE_STAIRS)
                .add(ModBlocks.GRAY_CONCRETE_SLAB)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB)
                .add(ModBlocks.CYAN_CONCRETE_STAIRS)
                .add(ModBlocks.CYAN_CONCRETE_SLAB)
                .add(ModBlocks.PURPLE_CONCRETE_STAIRS)
                .add(ModBlocks.PURPLE_CONCRETE_SLAB)
                .add(ModBlocks.BLUE_CONCRETE_STAIRS)
                .add(ModBlocks.BLUE_CONCRETE_SLAB)
                .add(ModBlocks.BROWN_CONCRETE_STAIRS)
                .add(ModBlocks.BROWN_CONCRETE_SLAB)
                .add(ModBlocks.GREEN_CONCRETE_STAIRS)
                .add(ModBlocks.GREEN_CONCRETE_SLAB)
                .add(ModBlocks.RED_CONCRETE_STAIRS)
                .add(ModBlocks.RED_CONCRETE_SLAB)
                .add(ModBlocks.BLACK_CONCRETE_STAIRS)
                .add(ModBlocks.BLACK_CONCRETE_SLAB);
    }
}
