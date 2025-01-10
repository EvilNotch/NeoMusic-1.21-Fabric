package net.evilnotch.neomusic;

import net.evilnotch.neomusic.datagen.ModBlockTagProvider;
import net.evilnotch.neomusic.datagen.ModLootTableProvider;
import net.evilnotch.neomusic.datagen.ModModelProvider;
import net.evilnotch.neomusic.datagen.ModRecipeProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class NeoMusicDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModBlockTagProvider::new);
		pack.addProvider(ModLootTableProvider::new);
		pack.addProvider(ModModelProvider::new);
		pack.addProvider(ModRecipeProvider::new);
	}
}
