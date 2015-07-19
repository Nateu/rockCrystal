package com.nateuplays.rockcrystals.creative.tab;

import net.minecraft.creativetab.CreativeTabs;

public final class ModTab {

    public static CreativeTabs tabRockCrystalMod;
    
    public static void createTabs () {
    	tabRockCrystalMod = new BasicTab(CreativeTabs.getNextID(), "rock_crystal_tab");
    }

}
