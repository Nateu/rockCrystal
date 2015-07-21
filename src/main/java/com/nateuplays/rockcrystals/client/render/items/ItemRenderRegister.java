package com.nateuplays.rockcrystals.client.render.items;

import com.nateuplays.rockcrystals.Main;
import com.nateuplays.rockcrystals.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {
	
	public static String modid = Main.MODID;
	
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerItemRenderer() {
		reg(ModItems.rockCrystal);
		reg(ModItems.powerCrystal);
	}

}
