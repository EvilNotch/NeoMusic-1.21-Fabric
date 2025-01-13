package net.evilnotch.neomusic.datagen;

import net.evilnotch.neomusic.block.ModBlocks;
import net.evilnotch.neomusic.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        BlockStateModelGenerator.BlockTexturePool RubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);

        RubyPool.slab(ModBlocks.RUBY_SLAB);
        RubyPool.stairs(ModBlocks.RUBY_STAIRS);
        RubyPool.button(ModBlocks.RUBY_BUTTON);


        blockStateModelGenerator.registerTrapdoor(ModBlocks.RUBY_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool NetheritePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.NETHERITE_BLOCK);

        NetheritePool.stairs(ModBlocks.NETHERITE_STAIRS);
        NetheritePool.slab(ModBlocks.NETHERITE_SLAB);

        BlockStateModelGenerator.BlockTexturePool WhiteConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.WHITE_CONCRETE);

        WhiteConcretePool.stairs(ModBlocks.WHITE_CONCRETE_STAIRS);
        WhiteConcretePool.slab(ModBlocks.WHITE_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool OrangeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.ORANGE_CONCRETE);

        OrangeConcretePool.stairs(ModBlocks.ORANGE_CONCRETE_STAIRS);
        OrangeConcretePool.slab(ModBlocks.ORANGE_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool MagentaConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.MAGENTA_CONCRETE);

        MagentaConcretePool.stairs(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        MagentaConcretePool.slab(ModBlocks.MAGENTA_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool LightBlueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_BLUE_CONCRETE);

        LightBlueConcretePool.stairs(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        LightBlueConcretePool.slab(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool YellowConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.YELLOW_CONCRETE);

        YellowConcretePool.stairs(ModBlocks.YELLOW_CONCRETE_STAIRS);
        YellowConcretePool.slab(ModBlocks.YELLOW_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool LimeConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIME_CONCRETE);

        LimeConcretePool.stairs(ModBlocks.LIME_CONCRETE_STAIRS);
        LimeConcretePool.slab(ModBlocks.LIME_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool PinkConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PINK_CONCRETE);

        PinkConcretePool.stairs(ModBlocks.PINK_CONCRETE_STAIRS);
        PinkConcretePool.slab(ModBlocks.PINK_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool GrayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GRAY_CONCRETE);

        GrayConcretePool.stairs(ModBlocks.GRAY_CONCRETE_STAIRS);
        GrayConcretePool.slab(ModBlocks.GRAY_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool LightGrayConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.LIGHT_GRAY_CONCRETE);

        LightGrayConcretePool.stairs(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        LightGrayConcretePool.slab(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool CyanConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.CYAN_CONCRETE);

        CyanConcretePool.stairs(ModBlocks.CYAN_CONCRETE_STAIRS);
        CyanConcretePool.slab(ModBlocks.CYAN_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool PurpleConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.PURPLE_CONCRETE);

        PurpleConcretePool.stairs(ModBlocks.PURPLE_CONCRETE_STAIRS);
        PurpleConcretePool.slab(ModBlocks.PURPLE_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool BlueConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLUE_CONCRETE);

        BlueConcretePool.stairs(ModBlocks.BLUE_CONCRETE_STAIRS);
        BlueConcretePool.slab(ModBlocks.BLUE_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool BrownConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BROWN_CONCRETE);

        BrownConcretePool.stairs(ModBlocks.BROWN_CONCRETE_STAIRS);
        BrownConcretePool.slab(ModBlocks.BROWN_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool GreenConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.GREEN_CONCRETE);

        GreenConcretePool.stairs(ModBlocks.GREEN_CONCRETE_STAIRS);
        GreenConcretePool.slab(ModBlocks.GREEN_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool RedConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.RED_CONCRETE);

        RedConcretePool.stairs(ModBlocks.RED_CONCRETE_STAIRS);
        RedConcretePool.slab(ModBlocks.RED_CONCRETE_SLAB);

        BlockStateModelGenerator.BlockTexturePool BlackConcretePool = blockStateModelGenerator.registerCubeAllModelTexturePool(Blocks.BLACK_CONCRETE);

        BlackConcretePool.stairs(ModBlocks.BLACK_CONCRETE_STAIRS);
        BlackConcretePool.slab(ModBlocks.BLACK_CONCRETE_SLAB);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.Ruby, Models.GENERATED);
        itemModelGenerator.register(ModItems.CRYSTALLIZED_HONEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MEND_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.SPARK_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.register(ModItems.FOG_MUSIC_DISC, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.HELLFIRE_ALLIANCE_CHESTPLATE));
    }
}
