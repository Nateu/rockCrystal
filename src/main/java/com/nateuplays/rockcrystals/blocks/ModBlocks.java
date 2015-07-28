package com.nateuplays.rockcrystals.blocks;

import com.nateuplays.rockcrystals.items.ModItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModBlocks {
	
	public static Block rockCrystalOre;
	public static Block rockCrystalBlock;
//	public static Block crystallineRoom;
	public static Block crystallineTunnelSection;
	public static Block crystallineTunnelCorner;
	public static Block crystallineTunnelJunction;
	public static Block crystallineTunnelThreeWay;
	public static Block crystallineTunnelEnding;
	public static Block crystallineBlock;
	
	
	public static void createBlocks() {
		GameRegistry.registerBlock(rockCrystalOre = new OreBlock("rock_crystal_ore", Material.rock, ModItems.rockCrystal, 2, 4).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "rock_crystal_ore");
		GameRegistry.registerBlock(rockCrystalBlock = new BasicBlock("rock_crystal_block", Material.rock, 0.45f, 5.0f).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "rock_crystal_block");
//		GameRegistry.registerBlock(crystallineRoom = new BasicBlock("crystalline_room", Material.rock, 1.0f, 15.0f).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "crystalline_room");
		GameRegistry.registerBlock(crystallineTunnelSection = new OrientationBlock("crystalline_tunnel_section", Material.rock, 1.0f, 15.0f).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "crystalline_tunnel_section");
		GameRegistry.registerBlock(crystallineTunnelThreeWay = new OrientationBlock("crystalline_tunnel_three_way", Material.rock, 1.0f, 15.0f).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "crystalline_tunnel_three_way");
		GameRegistry.registerBlock(crystallineTunnelJunction = new OrientationBlock("crystalline_tunnel_junction", Material.rock, 1.0f, 15.0f).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "crystalline_tunnel_junction");
		GameRegistry.registerBlock(crystallineTunnelCorner = new OrientationBlock("crystalline_tunnel_corner", Material.rock, 1.0f, 15.0f).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "crystalline_tunnel_corner");
		GameRegistry.registerBlock(crystallineTunnelEnding = new OrientationBlock("crystalline_tunnel_ending", Material.rock, 1.0f, 15.0f).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod), "crystalline_tunnel_ending");
		GameRegistry.registerBlock(crystallineBlock = new BasicBlock("crystalline_block", Material.ice, 1.00f, 1.0f).setCreativeTab(com.nateuplays.rockcrystals.Main.tabRockCrystalMod).setLightLevel(1.0f), "crystalline_block");
	}
}