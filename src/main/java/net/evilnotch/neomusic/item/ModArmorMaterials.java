package net.evilnotch.neomusic.item;

import net.evilnotch.neomusic.NeoMusic;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {
    public static final RegistryEntry<ArmorMaterial> HELLFIRE_ALLIANCE_ARMOR_MATERIAL = registerArmorMaterial("ruby",
            () -> new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), typeIntegerEnumMap -> {
                typeIntegerEnumMap.put(ArmorItem.Type.BOOTS, 4);
                typeIntegerEnumMap.put(ArmorItem.Type.LEGGINGS, 5);
                typeIntegerEnumMap.put(ArmorItem.Type.CHESTPLATE, 6);
                typeIntegerEnumMap.put(ArmorItem.Type.HELMET, 4);
                typeIntegerEnumMap.put(ArmorItem.Type.BODY, 4);
            }), 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, () -> Ingredient.ofItems(ModItems.Ruby),
                    List.of(new ArmorMaterial.Layer(Identifier.of(NeoMusic.MOD_ID, "hellfire_alliance"))), 1, 1));



    public static RegistryEntry<ArmorMaterial> registerArmorMaterial(String name, Supplier<ArmorMaterial> material) {
        return Registry.registerReference(Registries.ARMOR_MATERIAL, Identifier.of(NeoMusic.MOD_ID, name), material.get());
    }
}
