package com.nateuplays.rockcrystals;

import com.nateuplays.rockcrystals.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
public class Main {
	
	public static final String MODID = "rockcrystals";
	public static final String MODNAME = "Rock Crystals";
	public static final String VERSION = "1.0.0";

	public static final CreativeTabs tabRockCrystalMod = new CreativeTabs(CreativeTabs.getNextID(), "rock_crystal_tab") {
		@SideOnly(Side.CLIENT)
	    public Item getTabIconItem() {
	        return ModItems.rockCrystal;
	    }
	};

	@Instance
	public static Main instance = new Main();
	
	@SidedProxy(
			clientSide="com.nateuplays.rockcrystals.ClientProxy", 
			serverSide="com.nateuplays.rockcrystals.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		this.proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		this.proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		this.proxy.postInit(e);
	}
}