package com.nateuplays.rockcrystals.items;

import com.nateuplays.rockcrystals.creative.tab.ModTab;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item rockCrystal;
	public static Item powerCrystal;
	
	public static void createItems() {
		GameRegistry.registerItem(rockCrystal = new BasicItem("rock_crystal").setCreativeTab(ModTab.tabRockCrystalMod), "rock_crystal");
		GameRegistry.registerItem(powerCrystal = new BasicItem("power_crystal").setCreativeTab(ModTab.tabRockCrystalMod), "power_crystal");
    }
}
