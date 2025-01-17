package net.evilnotch.neomusic.datagen;

import net.evilnotch.neomusic.block.ModBlocks;
import net.evilnotch.neomusic.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.loottable.vanilla.VanillaChestLootTableGenerator;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_ORE, multipleOreDrops(ModBlocks.RUBY_ORE, ModItems.RAW_RUBY,1, 3));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RAW_RUBY, 2, 5));

        addDrop(ModBlocks.RUBY_SLAB, slabDrops(ModBlocks.RUBY_SLAB));
        addDrop(ModBlocks.NETHERITE_SLAB, slabDrops(ModBlocks.NETHERITE_SLAB));
        addDrop(ModBlocks.EMERALD_SLAB, slabDrops(ModBlocks.EMERALD_SLAB));

        addDrop(ModBlocks.RUBY_STAIRS);
        addDrop(ModBlocks.NETHERITE_STAIRS);
        addDrop(ModBlocks.EMERALD_STAIRS);

        addDrop(ModBlocks.RUBY_BUTTON);

        addDrop(ModBlocks.RUBY_TRAPDOOR);
        addDrop(ModBlocks.RUBY_PRESSURE_PLATE);
        addDrop(ModBlocks.RUBY_LADDER);

        addDrop(ModBlocks.WHITE_CONCRETE_STAIRS);
        addDrop(ModBlocks.WHITE_CONCRETE_SLAB, slabDrops(ModBlocks.WHITE_CONCRETE_SLAB));
        addDrop(ModBlocks.ORANGE_CONCRETE_STAIRS);
        addDrop(ModBlocks.ORANGE_CONCRETE_SLAB, slabDrops(ModBlocks.ORANGE_CONCRETE_SLAB));
        addDrop(ModBlocks.MAGENTA_CONCRETE_STAIRS);
        addDrop(ModBlocks.MAGENTA_CONCRETE_SLAB, slabDrops(ModBlocks.MAGENTA_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.YELLOW_CONCRETE_STAIRS);
        addDrop(ModBlocks.YELLOW_CONCRETE_SLAB, slabDrops(ModBlocks.YELLOW_CONCRETE_SLAB));
        addDrop(ModBlocks.LIME_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIME_CONCRETE_SLAB, slabDrops(ModBlocks.LIME_CONCRETE_SLAB));
        addDrop(ModBlocks.PINK_CONCRETE_STAIRS);
        addDrop(ModBlocks.PINK_CONCRETE_SLAB, slabDrops(ModBlocks.PINK_CONCRETE_SLAB));
        addDrop(ModBlocks.GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_CONCRETE_SLAB));
        addDrop(ModBlocks.CYAN_CONCRETE_STAIRS);
        addDrop(ModBlocks.CYAN_CONCRETE_SLAB, slabDrops(ModBlocks.CYAN_CONCRETE_SLAB));
        addDrop(ModBlocks.PURPLE_CONCRETE_STAIRS);
        addDrop(ModBlocks.PURPLE_CONCRETE_SLAB, slabDrops(ModBlocks.PURPLE_CONCRETE_SLAB));
        addDrop(ModBlocks.BLUE_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLUE_CONCRETE_SLAB, slabDrops(ModBlocks.BLUE_CONCRETE_SLAB));
        addDrop(ModBlocks.BROWN_CONCRETE_STAIRS);
        addDrop(ModBlocks.BROWN_CONCRETE_SLAB, slabDrops(ModBlocks.BROWN_CONCRETE_SLAB));
        addDrop(ModBlocks.GREEN_CONCRETE_STAIRS);
        addDrop(ModBlocks.GREEN_CONCRETE_SLAB, slabDrops(ModBlocks.GREEN_CONCRETE_SLAB));
        addDrop(ModBlocks.RED_CONCRETE_STAIRS);
        addDrop(ModBlocks.RED_CONCRETE_SLAB, slabDrops(ModBlocks.RED_CONCRETE_SLAB));
        addDrop(ModBlocks.BLACK_CONCRETE_STAIRS);
        addDrop(ModBlocks.BLACK_CONCRETE_SLAB, slabDrops(ModBlocks.BLACK_CONCRETE_SLAB));
    }
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
