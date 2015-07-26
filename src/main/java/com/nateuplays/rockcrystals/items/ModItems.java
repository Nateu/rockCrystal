package com.nateuplays.rockcrystals.items;

import akka.Main;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {
	
	public static Item rockCrystal;
	public static Item powerCrystal;
	public static Item rockCrystalRod;
	
	public static void createItems() {
		GameRegistry.registerItem(rockCrystal = new BasicItem("rock_crystal").setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "rock_crystal");
		GameRegistry.registerItem(powerCrystal = new BasicItem("power_crystal").setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "power_crystal");
		GameRegistry.registerItem(rockCrystalRod = new BasicItem("rock_crystal_rod").setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "rock_crystal_rod");
    }
}
