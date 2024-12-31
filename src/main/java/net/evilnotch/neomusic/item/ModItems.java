package net.evilnotch.neomusic.item;

import net.evilnotch.neomusic.NeoMusic;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    public static final Item Ruby = registerItem("ruby", new Item(new Item.Settings()));

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
