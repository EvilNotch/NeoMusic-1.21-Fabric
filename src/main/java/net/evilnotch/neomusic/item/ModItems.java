package net.evilnotch.neomusic.item;

import net.evilnotch.neomusic.NeoMusic;
import net.evilnotch.neomusic.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    public static final Item Ruby = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RUBY_BLOCK = registerItem("ruby_block", new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings()));
    public static final Item DEEPSLATE_RUBY_ORE = registerItem("deepslate_ruby_ore", new BlockItem(ModBlocks.DEEPSLATE_RUBY_ORE, new Item.Settings()));
    public static final Item RUBY_ORE = registerItem("ruby_ore", new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings()));
    public static final Item CRYSTALLIZED_HONEY = registerItem("crystallized_honey", new Item(new Item.Settings().food(ModFoodComponents.CRYSTALLIZED_HONEY)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NeoMusic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NeoMusic.LOGGER.info("Registering Mod Items for " + NeoMusic.MOD_ID);


            ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
                fabricItemGroupEntries.add(RAW_RUBY);
                fabricItemGroupEntries.add(Ruby);
        });
    }
}