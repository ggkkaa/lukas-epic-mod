package net.luka.lukamod;

import net.fabricmc.api.ModInitializer;

import net.luka.lukamod.item.ModItemGroups;
import net.luka.lukamod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LukasEpicMod implements ModInitializer {
	public static final String MOD_ID = "lukamod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
	}
}