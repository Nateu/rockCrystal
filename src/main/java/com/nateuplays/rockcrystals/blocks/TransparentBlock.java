package com.nateuplays.rockcrystals.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TransparentBlock extends Block {
	
    public TransparentBlock(
    		String unlocalizedName,
    		Material material,
    		float hardness,
    		float resistance
    ) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(hardness);
        this.setResistance(resistance);
    }

    public TransparentBlock(
    		String unlocalizedName, 
    		float hardness, 
    		float resistance
    ) {
        this(unlocalizedName, Material.rock, hardness, resistance);
    }

    public TransparentBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

	// used by the renderer to control lighting and visibility of other blocks.
	// set to false because this block doesn't fill the entire 1x1x1 space
	@Override
	public boolean isOpaqueCube() {
	    return false;
	}
	
	// used by the renderer to control lighting and visibility of other blocks, also by
	// (eg) wall or fence to control whether the fence joins itself to this block
	// set to false because this block doesn't fill the entire 1x1x1 space
	@Override
	public boolean isFullCube() {
	    return false;
	}

	// used to make the client render in the correct
    @SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
	    return EnumWorldBlockLayer.TRANSLUCENT;
	}

}