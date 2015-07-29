package com.nateuplays.rockcrystals;

import com.nateuplays.rockcrystals.blocks.ModBlocks;
import com.nateuplays.rockcrystals.items.ModItems;
import com.nateuplays.rockcrystals.recipe.ModRecipe;
import com.nateuplays.rockcrystals.world.RockCrystalOreWorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {
	
    public void preInit(FMLPreInitializationEvent e) {
    	ModItems.createItems();
    	ModBlocks.createBlocks();
    }

    public void init(FMLInitializationEvent e) {
    	GameRegistry.registerWorldGenerator(new RockCrystalOreWorldGen(), 0);
    	ModRecipe.createRecipes();
    }

    public void postInit(FMLPostInitializationEvent e) {
    }
}