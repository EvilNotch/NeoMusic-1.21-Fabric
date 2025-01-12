package net.evilnotch.neomusic.item;

import net.evilnotch.neomusic.NeoMusic;
import net.evilnotch.neomusic.block.ModBlocks;
import net.evilnotch.neomusic.sound.ModSounds;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.List;

public class ModItems {
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new Item.Settings()));
    public static final Item Ruby = registerItem("ruby", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.neomusic.ruby.tooltip"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item RUBY_BLOCK = registerItem("ruby_block", new BlockItem(ModBlocks.RUBY_BLOCK, new Item.Settings()));
    public static final Item DEEPSLATE_RUBY_ORE = registerItem("deepslate_ruby_ore", new BlockItem(ModBlocks.DEEPSLATE_RUBY_ORE, new Item.Settings()));
    public static final Item RUBY_ORE = registerItem("ruby_ore", new BlockItem(ModBlocks.RUBY_ORE, new Item.Settings()));
    public static final Item CRYSTALLIZED_HONEY = registerItem("crystallized_honey", new Item(new Item.Settings().food(ModFoodComponents.CRYSTALLIZED_HONEY)));
    public static final Item RUBY_SLAB = registerItem("ruby_slab", new BlockItem(ModBlocks.RUBY_SLAB, new Item.Settings()));
    public static final Item RUBY_STAIRS = registerItem("ruby_stairs", new BlockItem(ModBlocks.RUBY_STAIRS, new Item.Settings()));
    public static final Item RUBY_BUTTON = registerItem("ruby_button", new BlockItem(ModBlocks.RUBY_BUTTON, new Item.Settings()));
    public static final Item RUBY_TRAPDOOR = registerItem("ruby_trapdoor", new BlockItem(ModBlocks.RUBY_TRAPDOOR, new Item.Settings()));
    public static final Item MEND_MUSIC_DISC = registerItem("mend_music_disc", new Item(new Item.Settings().jukeboxPlayable(ModSounds.MEND_KEY).maxCount(1)));
    public static final Item SPARK_MUSIC_DISC = registerItem("spark_music_disc", new Item(new Item.Settings().jukeboxPlayable(ModSounds.SPARK_KEY).maxCount(1)));
    public static final Item FOG_MUSIC_DISC = registerItem("fog_music_disc", new Item(new Item.Settings().jukeboxPlayable(ModSounds.FOG_KEY).maxCount(1)));
    public static final Item HELLFIRE_ALLIANCE_CHESTPLATE = registerItem("hellfire_alliance_chestplate", new ArmorItem(ModArmorMaterials.HELLFIRE_ALLIANCE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(12))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(NeoMusic.MOD_ID, name), item);
    }

    public static void registerModItems() {
        NeoMusic.LOGGER.info("Registering Mod Items for " + NeoMusic.MOD_ID);


            ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
                fabricItemGroupEntries.add(RAW_RUBY);
                fabricItemGroupEntries.add(Ruby);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModItems.MEND_MUSIC_DISC);
            fabricItemGroupEntries.add(ModItems.SPARK_MUSIC_DISC);
            fabricItemGroupEntries.add(ModItems.FOG_MUSIC_DISC);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModItems.HELLFIRE_ALLIANCE_CHESTPLATE);
        });
    }
}