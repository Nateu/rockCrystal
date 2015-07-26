package com.nateuplays.rockcrystals.recipe;

import com.nateuplays.rockcrystals.blocks.ModBlocks;
import com.nateuplays.rockcrystals.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;


public final class ModRecipe {
	
	public static void createRecipes() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.rockCrystalBlock)			, "ccc", "ccc", "ccc", 'c', ModItems.rockCrystal);
		GameRegistry.addRecipe(new ItemStack(ModItems.powerCrystal)					, "ccc", "crc", "ccc", 'c', ModItems.rockCrystal, 'r', Blocks.redstone_block);
//		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineRoom)				, "bbb", "bpb", "bbb", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelSection)	, "b b", "bpb", "b b", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelSection)	, "bbb", " p ", "bbb", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelCorner)		, "b b", "bp ", "bbb", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelCorner)		, "bbb", " pb", "b b", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelCorner)		, "b b", " pb", "bbb", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelCorner)		, "bbb", "bp ", "b b", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelJunction)	, "b b", " p ", "b b", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
//		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelThreeWay)	, "b b", " p ", "bbb", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
//		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelThreeWay)	, "bbb", " p ", "b b", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
//		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelThreeWay)	, "b b", "bp ", "b b", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
//		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelThreeWay)	, "b b", " pb", "b b", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelEnding)		, "bbb", "bpb", "b b", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelEnding)		, "b b", "bpb", "bbb", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelEnding)		, "bbb", "bp ", "bbb", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.crystallineTunnelEnding)		, "bbb", " pb", "bbb", 'b', ModBlocks.rockCrystalBlock, 'p', ModItems.powerCrystal);
	}

}
