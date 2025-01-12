package net.evilnotch.neomusic.datagen;

import net.evilnotch.neomusic.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.HELLFIRE_ALLIANCE_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
                .add(ModItems.HELLFIRE_ALLIANCE_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.BEE_FOOD)
                .add(ModItems.CRYSTALLIZED_HONEY);
    }
}
