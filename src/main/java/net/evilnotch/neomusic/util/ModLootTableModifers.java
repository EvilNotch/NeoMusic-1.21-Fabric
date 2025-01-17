package net.evilnotch.neomusic.util;

import net.evilnotch.neomusic.item.ModItems;
import net.fabricmc.fabric.api.loot.v3.FabricLootTableBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifers {
    private static Identifier STRONGHOLD_LIBRARY_ID = Identifier.of("minecraft", "chests/stronghold_library");
    private static Identifier END_CITY_TREASURE_ID = Identifier.of("minecraft", "chests/end_city_treasure");
    private static Identifier ABANDONED_MINESHAFT_ID = Identifier.of("minecraft", "chests/abandoned_mineshaft");

    public static void modifyLootTables() {

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (source.isBuiltin() && STRONGHOLD_LIBRARY_ID.equals(key.getValue())) {

                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))

                        .with(ItemEntry.builder(ModItems.MEND_MUSIC_DISC)

                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)))

                                .conditionally(RandomChanceLootCondition.builder(0.15f)));


                tableBuilder.pool(poolBuilder);

            }

        });

            LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
                if (source.isBuiltin() && END_CITY_TREASURE_ID.equals(key.getValue())) {

                    LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))

                            .with(ItemEntry.builder(ModItems.FOG_MUSIC_DISC)

                                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)))

                                    .conditionally(RandomChanceLootCondition.builder(0.01f)));


                    tableBuilder.pool(poolBuilder);

                }

            });

        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (source.isBuiltin() && ABANDONED_MINESHAFT_ID.equals(key.getValue())) {

                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F))

                        .with(ItemEntry.builder(ModItems.SPARK_MUSIC_DISC)

                                .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0F, 1.0F)))

                                .conditionally(RandomChanceLootCondition.builder(0.08f)));


                tableBuilder.pool(poolBuilder);

            }

        });

    }

}
