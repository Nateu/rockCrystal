package com.nateuplays.rockcrystals.tunnel.creation;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public final class GenerateCrystallineTunnel {

	private final static int NORTH = 2;
	private final static int SOUTH = 3;
	private final static int WEST = 4;
	private final static int EAST = 5;
	
	// Helpers
	private static void generateTunnelBlindWall (World worldIn, BlockPos pos, Block tunnelBlock, int growDirection) {
		if (growDirection == 2 || growDirection == 3) {
/*
			worldIn.setBlockState(pos.up(3), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).east(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).west(), tunnelBlock.getDefaultState());
*/
			worldIn.setBlockState(pos.up(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).east(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).east(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).west(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).west(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().east(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().east(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().west(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().west(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos, tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.east(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.east(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.west(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.west(2), tunnelBlock.getDefaultState());
/*
			worldIn.setBlockState(pos.down(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().east(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().west(), tunnelBlock.getDefaultState());
*/
		}
		else {
/*
			worldIn.setBlockState(pos.up(3), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).north(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).south(), tunnelBlock.getDefaultState());
*/
			worldIn.setBlockState(pos.up(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).north(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).north(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).south(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).south(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().north(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().north(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().south(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().south(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos, tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.north(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.north(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.south(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.south(2), tunnelBlock.getDefaultState());
/*
			worldIn.setBlockState(pos.down(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().north(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().south(), tunnelBlock.getDefaultState());
*/
		}
	}
	private static void generateTunnelSliceWithSideWalls (World worldIn, BlockPos pos, Block tunnelBlock, int growDirection){
		if (growDirection == 2 || growDirection == 3) {
			// exterior
			worldIn.setBlockState(pos.up(3), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).east(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).west(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).east(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).west(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().east(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().west(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.east(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.west(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().east(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().west(), tunnelBlock.getDefaultState());
			// interior
			worldIn.setBlockToAir(pos.up(2));
			worldIn.setBlockToAir(pos.up(2).east());
			worldIn.setBlockToAir(pos.up(2).west());
			worldIn.setBlockToAir(pos.up());
			worldIn.setBlockToAir(pos.up().east());
			worldIn.setBlockToAir(pos.up().west());
			worldIn.setBlockToAir(pos);
			worldIn.setBlockToAir(pos.east());
			worldIn.setBlockToAir(pos.west());
		}
		else {
			// exterior
			worldIn.setBlockState(pos.up(3), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).north(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).south(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).north(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(2).south(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().north(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up().south(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.north(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.south(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().north(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().south(), tunnelBlock.getDefaultState());
			// interior
			worldIn.setBlockToAir(pos.up(2));
			worldIn.setBlockToAir(pos.up(2).south());
			worldIn.setBlockToAir(pos.up(2).north());
			worldIn.setBlockToAir(pos.up());
			worldIn.setBlockToAir(pos.up().south());
			worldIn.setBlockToAir(pos.up().north());
			worldIn.setBlockToAir(pos);
			worldIn.setBlockToAir(pos.south());
			worldIn.setBlockToAir(pos.north());
		}
	}
	private static void generateTunnelSliceWithoutWall (World worldIn, BlockPos pos, Block tunnelBlock, int growDirection){
		if (2 == growDirection || growDirection == 3) {
			// exterior part 1
			worldIn.setBlockState(pos.up(3), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).east(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).east(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).west(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).west(2), tunnelBlock.getDefaultState());
	
			// interior
			worldIn.setBlockToAir(pos.up(2));
			worldIn.setBlockToAir(pos.up(2).west());
			worldIn.setBlockToAir(pos.up(2).west(2));
			worldIn.setBlockToAir(pos.up(2).east());
			worldIn.setBlockToAir(pos.up(2).east(2));
			worldIn.setBlockToAir(pos.up());
			worldIn.setBlockToAir(pos.up().west());
			worldIn.setBlockToAir(pos.up().west(2));
			worldIn.setBlockToAir(pos.up().east());
			worldIn.setBlockToAir(pos.up().east(2));
			worldIn.setBlockToAir(pos);
			worldIn.setBlockToAir(pos.west());
			worldIn.setBlockToAir(pos.west(2));
			worldIn.setBlockToAir(pos.east());
			worldIn.setBlockToAir(pos.east(2));
	
			// exterior part 2
			worldIn.setBlockState(pos.down(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().east(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().east(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().west(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().west(2), tunnelBlock.getDefaultState());
		}
		else {
			// exterior part 1
			worldIn.setBlockState(pos.up(3), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).north(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).north(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).south(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.up(3).south(2), tunnelBlock.getDefaultState());
	
			// interior
			worldIn.setBlockToAir(pos.up(2));
			worldIn.setBlockToAir(pos.up(2).south());
			worldIn.setBlockToAir(pos.up(2).south(2));
			worldIn.setBlockToAir(pos.up(2).north());
			worldIn.setBlockToAir(pos.up(2).north(2));
			worldIn.setBlockToAir(pos.up());
			worldIn.setBlockToAir(pos.up().south());
			worldIn.setBlockToAir(pos.up().south(2));
			worldIn.setBlockToAir(pos.up().north());
			worldIn.setBlockToAir(pos.up().north(2));
			worldIn.setBlockToAir(pos);
			worldIn.setBlockToAir(pos.south());
			worldIn.setBlockToAir(pos.south(2));
			worldIn.setBlockToAir(pos.north());
			worldIn.setBlockToAir(pos.north(2));
	
			// exterior part 2
			worldIn.setBlockState(pos.down(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().north(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().north(2), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().south(), tunnelBlock.getDefaultState());
			worldIn.setBlockState(pos.down().south(2), tunnelBlock.getDefaultState());
		}
	}
	private static void generateTunnelSlice (World worldIn, BlockPos pos, int enumFacingOrdinal, Block tunnelBlock, int distance, int growDirection) {
		BlockPos nextPos = null;

		switch(growDirection) {
			case 2:
				nextPos = pos.north();
				break;
			case 3:
				nextPos = pos.south();
				break;
			case 4:
				nextPos = pos.west();
				break;
			case 5:
				nextPos = pos.east();
				break;
		}

		generateTunnelSliceWithSideWalls(worldIn, pos, tunnelBlock, growDirection);

		if (distance-- > 1) {
			generateTunnelSlice(worldIn, nextPos, enumFacingOrdinal, tunnelBlock, distance, growDirection);
		}
	}
	private static void generateTunnelJunctionBySlice (World worldIn, BlockPos pos, int enumFacingOrdinal, Block tunnelBlock, int distance, int growDirection) {
		BlockPos nextPos = null;

		switch(growDirection) {
			case 2:
				nextPos = pos.north();
				break;
			case 3:
				nextPos = pos.south();
				break;
			case 4:
				nextPos = pos.west();
				break;
			case 5:
				nextPos = pos.east();
				break;
		}

		switch(distance) {
		case 1:
		case 5:
			generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 1, growDirection);
			break;
		case 2:
		case 3:
		case 4:
			generateTunnelSliceWithoutWall(worldIn, pos, tunnelBlock, growDirection);
			break;
		}

		if (distance-- > 1) {
			generateTunnelJunctionBySlice(worldIn, nextPos, enumFacingOrdinal, tunnelBlock, distance, growDirection);
		}
	}

	// Actual tunnel creators
	public static void generateTunnelCorner (World worldIn, BlockPos pos, IBlockState state, int enumFacingOrdinal, Block tunnelBlock, int growDirection) {
		int tmpDirection = 0;
		BlockPos tmpPos = null;

		generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 6, growDirection);

		switch(growDirection) {
		case 2:
			generateTunnelBlindWall(worldIn, pos.north(6), tunnelBlock, growDirection);
			if (enumFacingOrdinal == 2) { // make a corner to the east
				tmpDirection = 5;
				tmpPos = pos.north(4).east(2);
			} else if (enumFacingOrdinal == 5) { // make a corner to the west
				tmpDirection = 4;
				tmpPos = pos.north(4).west(2);
			}
			break;
		case 3:
			generateTunnelBlindWall(worldIn, pos.south(6), tunnelBlock, growDirection);
			if (enumFacingOrdinal == 3) { // make a corner to the west
				tmpDirection = 4;
				tmpPos = pos.south(4).west(2);
			} else if (enumFacingOrdinal == 4) { // make a corner to the east
				tmpDirection = 5;
				tmpPos = pos.south(4).east(2);
			}
			break;
		case 4:
			generateTunnelBlindWall(worldIn, pos.west(6), tunnelBlock, growDirection);
			if (enumFacingOrdinal == 4) { // make a corner to the north
				tmpDirection = 2;
				tmpPos = pos.west(4).north(2);
			} else if (enumFacingOrdinal == 2) { // make a corner to the south
				tmpDirection = 3;
				tmpPos = pos.west(4).south(2);
			} 
			break;
		case 5:
			generateTunnelBlindWall(worldIn, pos.east(6), tunnelBlock, growDirection);
			if (enumFacingOrdinal == 5) { // make a corner to the south
				tmpDirection = 3;
				tmpPos = pos.east(4).south(2);
			} else if (enumFacingOrdinal == 3) { // make a corner to the north
				tmpDirection = 2;
				tmpPos = pos.east(4).north(2);
			}
			break;
		}

		generateTunnelSlice(worldIn, tmpPos, tmpDirection, tunnelBlock, 3, tmpDirection);
	}
	public static void generateTunnelEnding (World worldIn, BlockPos pos, IBlockState state, int enumFacingOrdinal, Block tunnelBlock, int growDirection) {
		if (enumFacingOrdinal == growDirection) {
			switch(growDirection) {
			case 2:
				generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 8, growDirection);
				generateTunnelBlindWall(worldIn, pos.north(8), tunnelBlock, growDirection);
				break;
			case 3:
				generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 8, growDirection);
				generateTunnelBlindWall(worldIn, pos.south(8), tunnelBlock, growDirection);
				break;
			case 4:
				generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 8, growDirection);
				generateTunnelBlindWall(worldIn, pos.west(8), tunnelBlock, growDirection);
				break;
			case 5:
				generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 8, growDirection);
				generateTunnelBlindWall(worldIn, pos.east(8), tunnelBlock, growDirection);
				break;
			}
		}
	}
	public static void generateTunnelJunction (World worldIn, BlockPos pos, IBlockState state, int enumFacingOrdinal, Block tunnelBlock, int growDirection) {
		generateTunnelJunctionBySlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 5, growDirection);
	}
	public static void generateTunnelSection (World worldIn, BlockPos pos, IBlockState state, int enumFacingOrdinal, Block tunnelBlock, int growDirection) {
		switch (growDirection) {
		case 2:
			if (enumFacingOrdinal == 2 || enumFacingOrdinal == 3) {
				generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 9, growDirection);
			}
			break;
		case 3:
			if (enumFacingOrdinal == 2 || enumFacingOrdinal == 3) {
				generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 9, growDirection);
			}
			break;
		case 4:
			if (enumFacingOrdinal == 4 || enumFacingOrdinal == 5) {
				generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 9, growDirection);
			}
			break;
		case 5:
			if (enumFacingOrdinal == 4 || enumFacingOrdinal == 5) {
				generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 9, growDirection);
			}
			break;
		}
	}
	public static void generateTunnelThreeWay (World worldIn, BlockPos pos, IBlockState state, int enumFacingOrdinal, Block tunnelBlock, int growDirection) {
		
		System.out.print("Facing: ");
		System.out.println(enumFacingOrdinal);
		
		System.out.print("Grow: ");
		System.out.println(growDirection);
		int tmpDirectionOne = 0;
		int tmpDirectionTwo = 0;
		BlockPos tmpPosOne = null;
		BlockPos tmpPosTwo = null;

		generateTunnelSlice(worldIn, pos, enumFacingOrdinal, tunnelBlock, 3, growDirection);

		switch(growDirection) {
		case NORTH:
			generateTunnelJunctionBySlice(worldIn, pos.north(2), enumFacingOrdinal, tunnelBlock, 5, growDirection);
			if (enumFacingOrdinal == NORTH) {
				// made the intersection and now then close north side
				generateTunnelBlindWall(worldIn, pos.north(6), tunnelBlock, growDirection);
				// make corners to the east and west
				tmpDirectionOne = EAST;
				tmpPosOne = pos.north(4).east(2);
				tmpDirectionTwo = WEST;
				tmpPosTwo = pos.north(4).west(2);
			} else if (enumFacingOrdinal == WEST) {
				// made the intersection and now then close west side
				generateTunnelBlindWall(worldIn, pos.north(4).west(2), tunnelBlock, EAST);
				// continue north and make a corner to the east
				tmpDirectionOne = NORTH;
				tmpPosOne = pos.north(6);
				tmpDirectionTwo = EAST;
				tmpPosTwo = pos.north(4).east(2);
			} else if (enumFacingOrdinal == EAST) {
				// made the intersection and now then close east side
				generateTunnelBlindWall(worldIn, pos.north(4).east(2), tunnelBlock, WEST);
				// continue north and make a corner to the west
				tmpDirectionOne = NORTH;
				tmpPosOne = pos.north(6);
				tmpDirectionTwo = WEST;
				tmpPosTwo = pos.north(4).west(2);
			}
			break;
		case SOUTH:
			generateTunnelJunctionBySlice(worldIn, pos.south(2), enumFacingOrdinal, tunnelBlock, 5, growDirection);
			if (enumFacingOrdinal == SOUTH) {
				// made the intersection and now then close north side
				generateTunnelBlindWall(worldIn, pos.south(6), tunnelBlock, growDirection);
				// make corners to the east and west
				tmpDirectionOne = EAST;
				tmpPosOne = pos.south(4).east(2);
				tmpDirectionTwo = WEST;
				tmpPosTwo = pos.south(4).west(2);
			} else if (enumFacingOrdinal == WEST) {
				// made the intersection and now then close east side
				generateTunnelBlindWall(worldIn, pos.south(4).west(2), tunnelBlock, EAST);
				// continue south and make a corner to the west
				tmpDirectionOne = SOUTH;
				tmpPosOne = pos.south(6);
				tmpDirectionTwo = EAST;
				tmpPosTwo = pos.south(4).east(2);
			} else if (enumFacingOrdinal == EAST) {
				// made the intersection and now then close west side
				generateTunnelBlindWall(worldIn, pos.south(4).east(2), tunnelBlock, WEST);
				// continue south and make a corner to the east
				tmpDirectionOne = SOUTH;
				tmpPosOne = pos.south(6);
				tmpDirectionTwo = WEST;
				tmpPosTwo = pos.south(4).west(2);
			}
			break;
		case WEST:
			generateTunnelJunctionBySlice(worldIn, pos.west(2), enumFacingOrdinal, tunnelBlock, 5, growDirection);
			if (enumFacingOrdinal == WEST) {
				// made the intersection and now then close east side
				generateTunnelBlindWall(worldIn, pos.west(6), tunnelBlock, growDirection);
				// make corners to the north and south
				tmpDirectionOne = NORTH;
				tmpPosOne = pos.west(4).north(2);
				tmpDirectionTwo = SOUTH;
				tmpPosTwo = pos.west(4).south(2);
			} else if (enumFacingOrdinal == NORTH) {
				// made the intersection and now then close north side
				generateTunnelBlindWall(worldIn, pos.west(4).north(2), tunnelBlock, SOUTH);
				// continue west and make a corner to the south
				tmpDirectionOne = WEST;
				tmpPosOne = pos.west(6);
				tmpDirectionTwo = SOUTH;
				tmpPosTwo = pos.west(4).south(2);
			} else if (enumFacingOrdinal == SOUTH) {
				// made the intersection and now then close south side
				generateTunnelBlindWall(worldIn, pos.west(4).south(2), tunnelBlock, NORTH);
				// continue west and make a corner to the north
				tmpDirectionOne = WEST;
				tmpPosOne = pos.west(6);
				tmpDirectionTwo = NORTH;
				tmpPosTwo = pos.west(4).north(2);
			}
			break;
		case EAST:
			generateTunnelJunctionBySlice(worldIn, pos.east(2), enumFacingOrdinal, tunnelBlock, 5, growDirection);
			if (enumFacingOrdinal == EAST) {
				// made the intersection and now then close west side
				generateTunnelBlindWall(worldIn, pos.east(6), tunnelBlock, growDirection);
				// make corners to the north and south
				tmpDirectionOne = NORTH;
				tmpPosOne = pos.east(4).north(2);
				tmpDirectionTwo = SOUTH;
				tmpPosTwo = pos.east(4).south(2);
			} else if (enumFacingOrdinal == NORTH) {
				// made the intersection and now then close north side
				generateTunnelBlindWall(worldIn, pos.east(4).north(2), tunnelBlock, SOUTH);
				// continue east and make a corner to the south
				tmpDirectionOne = EAST;
				tmpPosOne = pos.east(6);
				tmpDirectionTwo = SOUTH;
				tmpPosTwo = pos.east(4).south(2);
			} else if (enumFacingOrdinal == SOUTH) {
				// made the intersection and now then close south side
				generateTunnelBlindWall(worldIn, pos.east(4).south(2), tunnelBlock, NORTH);
				// continue east and make a corner to the north
				tmpDirectionOne = EAST;
				tmpPosOne = pos.east(6);
				tmpDirectionTwo = NORTH;
				tmpPosTwo = pos.east(4).north(2);
			}
			break;
		}

		generateTunnelSlice(worldIn, tmpPosOne, tmpDirectionOne, tunnelBlock, 3, tmpDirectionOne);
		generateTunnelSlice(worldIn, tmpPosTwo, tmpDirectionTwo, tunnelBlock, 3, tmpDirectionTwo);
	
	}
}
