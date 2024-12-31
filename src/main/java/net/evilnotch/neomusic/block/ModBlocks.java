package net.evilnotch.neomusic.block;

import net.evilnotch.neomusic.NeoMusic;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PickaxeItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));



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
    }
}
// Unknown error of inventory opening crashing the game; halting anymore progress.
// Removed  private static Block registerBlock(String name, Block block){
//-    registerBlock(name, block); **THIS RECURSIVE THANG!**
//     return Registry.register(Registries.BLOCK, Identifier.of(NeoMusic.MOD_ID, name), block);
//}