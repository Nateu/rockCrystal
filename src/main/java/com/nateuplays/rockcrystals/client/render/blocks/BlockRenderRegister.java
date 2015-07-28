package com.nateuplays.rockcrystals.client.render.blocks;

import com.nateuplays.rockcrystals.Main;
import com.nateuplays.rockcrystals.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	public static String modid = Main.MODID;

	public static void registerBlockRenderer() {
	    reg(ModBlocks.rockCrystalOre);
	    reg(ModBlocks.rockCrystalBlock);
//	    reg(ModBlocks.crystallineRoom);
		reg(ModBlocks.crystallineTunnelSection);
		reg(ModBlocks.crystallineTunnelCorner);
		reg(ModBlocks.crystallineTunnelJunction);
		reg(ModBlocks.crystallineTunnelThreeWay);
		reg(ModBlocks.crystallineTunnelEnding);
		reg(ModBlocks.crystallineBlock);
	}

	public static void reg(Block block) {
	    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
	}
}
