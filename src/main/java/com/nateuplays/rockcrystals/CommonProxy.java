package com.nateuplays.rockcrystals;

import com.nateuplays.rockcrystals.blocks.ModBlocks;
import com.nateuplays.rockcrystals.creative.tab.ModTab;
import com.nateuplays.rockcrystals.items.ModItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.createItems();
    	ModBlocks.createBlocks();
    	ModTab.createTabs();
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}