package com.nateuplays.rockcrystals.creative.tab;

import com.nateuplays.rockcrystals.items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public final class BasicTab extends CreativeTabs {
	
	private Item tabIcon;

	public BasicTab(int id, String unlocalizedName, Item iconRef) {
		super(id, unlocalizedName);		
		this.tabIcon = iconRef;
	}

	public BasicTab(int id, String unlocalizedName) {
		this(id, unlocalizedName, ModItems.rockCrystal);
	}

	@SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return tabIcon;
    }
}
