package com.nateuplays.rockcrystals.blocks;

import com.nateuplays.rockcrystals.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block rockCrystalOre;
	public static Block rockCrystalBlock;
	
	public static void createBlocks() {
		GameRegistry.registerBlock(rockCrystalOre = new OreBlock("rock_crystal_ore", Material.rock, ModItems.rockCrystal, 2, 4).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "rock_crystal_ore");
		GameRegistry.registerBlock(rockCrystalOre = new BasicBlock("rock_crystal_block", Material.rock, 0.45f, 5.0f).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "rock_crystal_block");
	}
}