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
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(3f).requiresTool().sounds(BlockSoundGroup.STONE)));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 5),
                    AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block RUBY_STAIRS = registerBlock("ruby_stairs",
            new StairsBlock(ModBlocks.RUBY_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RUBY_SLAB = registerBlock("ruby_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RUBY_BUTTON = registerBlock("ruby_button",
            new ButtonBlock(BlockSetType.IRON, 40, AbstractBlock.Settings.create().strength(2f).requiresTool().noCollision()));



// public static final Block RUBY_CHEST = registerBlock("ruby_chest",
//            new  ChestBlock(BlockEntityType<ChestBlock>? extends ChestBlockEntity>> AbstractChestBlock.Settings.create.strength(4f).requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));
//
//    public static final Block RUBY_PRESSURE_PLATE = registerBlock("ruby_pressure_plate",
//            new PressurePlateBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(3f).requiresTool()));
//
//    public static final Block RUBY_DOOR = registerBlock("ruby_door",
//            new DoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));
//
//    public static final Block RUBY_TRAPDOOR = registerBlock("ruby_trapdoor",
//            new TrapdoorBlock(BlockSetType.IRON, AbstractBlock.Settings.create().strength(4f).requiresTool().nonOpaque()));

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
            fabricItemGroupEntries.add(ModBlocks.RUBY_BLOCK);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
            fabricItemGroupEntries.add(ModBlocks.RUBY_ORE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModItems.CRYSTALLIZED_HONEY);
        });
    }
}

// Unknown error of inventory opening crashing the game; halting anymore progress.
// Removed  private static Block registerBlock(String name, Block block){
//-    registerBlock(name, block); **THIS RECURSIVE THANG!**
//     return Registry.register(Registries.BLOCK, Identifier.of(NeoMusic.MOD_ID, name), block);
//}
// Solved!

