package net.evilnotch.neomusic;

import net.evilnotch.neomusic.block.ModBlocks;
import net.evilnotch.neomusic.item.ModItemGroups;
import net.evilnotch.neomusic.item.ModItems;
import net.evilnotch.neomusic.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Break from the matrix Neo
public class NeoMusic implements ModInitializer {
	public static final String MOD_ID = "neomusic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.RegisterItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}
}