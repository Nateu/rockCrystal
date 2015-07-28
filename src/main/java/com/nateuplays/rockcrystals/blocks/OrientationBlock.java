package com.nateuplays.rockcrystals.blocks;

import com.nateuplays.rockcrystals.items.ModItems;
import com.nateuplays.rockcrystals.tunnel.creation.GenerateCrystallineTunnel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OrientationBlock extends Block {

    public static final PropertyDirection FACING = PropertyDirection.create("facing");

    // constructor
    public OrientationBlock(
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

    // constructor with default material (rock)
    public OrientationBlock(
    		String unlocalizedName, 
    		float hardness, 
    		float resistance
    ) {
        this(unlocalizedName, Material.rock, hardness, resistance);
    }

    // constructor with default material (rock) and default hardness (2.0f) and resistance (10.0f)
    public OrientationBlock(String unlocalizedName) {
        this(unlocalizedName, 2.0f, 10.0f);
    }

    // Check is hit with power crystal
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
    {
    	/* The side that is hit: side.ordinal()
    	 * 
    	 *   0 = down
    	 *   1 = up
    	 *   2 = south
    	 *   3 = North
    	 *   4 = east
    	 *   5 = West
    	 *   
    	 */

    	EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);
    	
    	if(playerIn.getCurrentEquippedItem() != null && playerIn.getCurrentEquippedItem().getItem() == ModItems.rockCrystalRod)
    	{
    		int growDirection = side.getOpposite().ordinal();

        	// check if the block is place facing up or down
        	if (2 <= enumfacing.ordinal() && enumfacing.ordinal() <= 5) {

        		/* Optional
        		 * TODO: Remove neighborBlock
					if (neighborBlock == Blocks.stone_button || neighborBlock == Blocks.wooden_button || neighborBlock == Blocks.lever) {}
        		 */

        		if (2 <= growDirection && growDirection <= 5) {
        			
    	            switch(this.getUnlocalizedName().substring(5)) {
    	            case "crystalline_tunnel_corner":
    	                GenerateCrystallineTunnel.generateTunnelCorner(worldIn, pos, state, enumfacing.ordinal(), ModBlocks.crystallineBlock, growDirection);
    	            	break;
    	            case "crystalline_tunnel_ending":
    	                GenerateCrystallineTunnel.generateTunnelEnding(worldIn, pos, state, enumfacing.ordinal(), ModBlocks.crystallineBlock, growDirection);
    	            	break;
    	            case "crystalline_tunnel_junction":
    	                GenerateCrystallineTunnel.generateTunnelJunction(worldIn, pos, state, enumfacing.ordinal(), ModBlocks.crystallineBlock, growDirection);
    	            	break;
    	            case "crystalline_tunnel_section":
    	                GenerateCrystallineTunnel.generateTunnelSection(worldIn, pos, state, enumfacing.ordinal(), ModBlocks.crystallineBlock, growDirection);
    	            	break;
    	            case "crystalline_tunnel_three_way":
    	                GenerateCrystallineTunnel.generateTunnelThreeWay(worldIn, pos, state, enumfacing.ordinal(), ModBlocks.crystallineBlock, growDirection);
    	            	break;
    	            }
        		}
        	}
        	
    	}
        return false;
    }
    
    // check how the block is placed and set block state accordingly
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {
        worldIn.setBlockState(pos, state.withProperty(FACING, getFacingFromEntity(worldIn, pos, placer)), 2);
    }

    // not sure what this does... ?
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return this.getDefaultState().withProperty(FACING, getFacingFromEntity(worldIn, pos, placer));
    }

    // not sure if this needs to be done?!
    // what are the defaults?
    public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos)
    {
    	this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }

    // not sure if this needs to be done?!
    // what are the defaults?
    public void setBlockBoundsForItemRender()
    {
        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }    

    // helper function to determine the facing of a block placement in reference to an Entity position
    public static EnumFacing getFacingFromEntity(World worldIn, BlockPos clickedBlock, EntityLivingBase entityIn)
    {
        if (MathHelper.abs((float)entityIn.posX - (float)clickedBlock.getX()) < 2.0F && MathHelper.abs((float)entityIn.posZ - (float)clickedBlock.getZ()) < 2.0F)
        {
            double d0 = entityIn.posY + (double)entityIn.getEyeHeight();

            if (d0 - (double)clickedBlock.getY() > 2.0D)
            {
                return EnumFacing.UP;
            }

            if ((double)clickedBlock.getY() - d0 > 0.0D)
            {
                return EnumFacing.DOWN;
            }
        }
        return entityIn.getHorizontalFacing();
    } 

    // not sure what this does... ?
    @SideOnly(Side.CLIENT)
    public IBlockState getStateForEntityRender(IBlockState state)
    {
        return this.getDefaultState().withProperty(FACING, EnumFacing.UP);
    }

    // create the needed FACING block state property of the block
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {FACING});
    }

    // not sure what this does... ?
    public int getMetaFromState(IBlockState state)
    {
        byte b0 = 0;
        int i = b0 | ((EnumFacing)state.getValue(FACING)).getIndex();
        return i;
    }
}