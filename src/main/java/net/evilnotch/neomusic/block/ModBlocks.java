package net.evilnotch.neomusic.block;

import net.evilnotch.neomusic.NeoMusic;
import net.evilnotch.neomusic.item.ModItems;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.structure.StructureTemplate;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().strength(5f)
                    .requiresTool().hardness(25).resistance(250).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(25).resistance(250).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block EMERALD_STAIRS = registerBlock("emerald_stairs",
            new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(25).resistance(250).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block WHITE_CONCRETE_STAIRS = registerBlock("white_concrete_stairs",
            new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ORANGE_CONCRETE_STAIRS = registerBlock("orange_concrete_stairs",
            new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlock("magenta_concrete_stairs",
            new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlock("light_blue_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block YELLOW_CONCRETE_STAIRS = registerBlock("yellow_concrete_stairs",
            new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LIME_CONCRETE_STAIRS = registerBlock("lime_concrete_stairs",
            new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block PINK_CONCRETE_STAIRS = registerBlock("pink_concrete_stairs",
            new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block GRAY_CONCRETE_STAIRS = registerBlock("gray_concrete_stairs",
            new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlock("light_gray_concrete_stairs",
            new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CYAN_CONCRETE_STAIRS = registerBlock("cyan_concrete_stairs",
            new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block PURPLE_CONCRETE_STAIRS = registerBlock("purple_concrete_stairs",
            new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_CONCRETE_STAIRS = registerBlock("blue_concrete_stairs",
            new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_CONCRETE_STAIRS = registerBlock("brown_concrete_stairs",
            new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_CONCRETE_STAIRS = registerBlock("green_concrete_stairs",
            new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block RED_CONCRETE_STAIRS = registerBlock("red_concrete_stairs",
            new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block BLACK_CONCRETE_STAIRS = registerBlock("black_concrete_stairs",
            new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs",
            new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(8f).hardness(50).resistance(1200).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(25).resistance(250).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block EMERALD_SLAB = registerBlock("emerald_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(25).resistance(250).requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block WHITE_CONCRETE_SLAB = registerBlock("white_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block ORANGE_CONCRETE_SLAB = registerBlock("orange_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block MAGENTA_CONCRETE_SLAB = registerBlock("magenta_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlock("light_blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block YELLOW_CONCRETE_SLAB = registerBlock("yellow_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LIME_CONCRETE_SLAB = registerBlock("lime_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block PINK_CONCRETE_SLAB = registerBlock("pink_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block GRAY_CONCRETE_SLAB = registerBlock("gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlock("light_gray_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block CYAN_CONCRETE_SLAB = registerBlock("cyan_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block PURPLE_CONCRETE_SLAB = registerBlock("purple_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_CONCRETE_SLAB = registerBlock("blue_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block BROWN_CONCRETE_SLAB = registerBlock("brown_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block GREEN_CONCRETE_SLAB = registerBlock("green_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block RED_CONCRETE_SLAB = registerBlock("red_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block BLACK_CONCRETE_SLAB = registerBlock("black_concrete_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).hardness(15).resistance(100).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block NETHERITE_SLAB = registerBlock("netherite_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(8f).hardness(50).resistance(1200).requiresTool().sounds(BlockSoundGroup.NETHERITE)));

    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock(BlockSetType.IRON, 80, AbstractBlock.Settings.create().strength(2f).hardness(25).resistance(250).requiresTool().noCollision().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
            new TrapdoorBlock(BlockSetType.COPPER, AbstractBlock.Settings.create().nonOpaque().strength(4f).hardness(25).resistance(250).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

        public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
            new PressurePlateBlock(BlockSetType.COPPER, AbstractPressurePlateBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

        public static final Block RUBY_LADDER = registerBlock("ruby_ladder",
                new LadderBlock(AbstractBlock.Settings.create().nonOpaque().strength(3f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));


// public static final Block RUBY_CHEST = registerBlock("ruby_chest",
//            new  ChestBlock(BlockEntityType<ChestBlock>? extends ChestBlockEntity>> AbstractChestBlock.Settings.create.strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
//
//    public static final Block RUBY_DOOR = registerBlock("ruby_door",
//            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));
//

    private static Block registerBlock(String name, Block block){
        return Registry.register(Registries.BLOCK, Identifier.of(NeoMusic.MOD_ID, name), block);
    }

    private static void RegisterBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(NeoMusic.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        NeoMusic.LOGGER.info("Registering Mod blocks for " + NeoMusic.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.EMERALD_SLAB);
            fabricItemGroupEntries.add(ModBlocks.RUBY_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RUBY_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.RUBY_SLAB);
            fabricItemGroupEntries.add(ModBlocks.RUBY_TRAPDOOR);
            fabricItemGroupEntries.add(ModBlocks.NETHERITE_SLAB);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
            fabricItemGroupEntries.add(ModBlocks.RUBY_ORE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModItems.CRYSTALLIZED_HONEY);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.RUBY_BUTTON);
            fabricItemGroupEntries.add(ModBlocks.RUBY_PRESSURE_PLATE);
            fabricItemGroupEntries.add(ModBlocks.RUBY_TRAPDOOR);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.WHITE_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.WHITE_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.ORANGE_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.ORANGE_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.MAGENTA_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.MAGENTA_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.YELLOW_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.YELLOW_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.LIME_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.LIME_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.PINK_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.PINK_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.GRAY_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.GRAY_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.CYAN_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.CYAN_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.PURPLE_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.PURPLE_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.BLUE_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.BLUE_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.BROWN_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.BROWN_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.GREEN_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.RED_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.RED_CONCRETE_SLAB);
            fabricItemGroupEntries.add(ModBlocks.BLACK_CONCRETE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.BLACK_CONCRETE_SLAB);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.OPERATOR).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.NETHERITE_STAIRS);
            fabricItemGroupEntries.add(ModBlocks.EMERALD_STAIRS);
            fabricItemGroupEntries.add(Blocks.NETHER_PORTAL);
        });
    }
}

// Unknown error of inventory opening crashing the game; halting anymore progress.
// Removed  private static Block registerBlock(String name, Block block){
//-    registerBlock(name, block); **THIS RECURSIVE THANG!**
//     return Registry.register(Registries.BLOCK, Identifier.of(NeoMusic.MOD_ID, name), block);
//}
// Solved!

