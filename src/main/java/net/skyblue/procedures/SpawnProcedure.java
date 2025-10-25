package net.skyblue.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

public class SpawnProcedure {
	public static void execute(IWorld world, double x, double y, double z) {
		for (int index0 = 0; index0 < 2; index0++) {
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 1, z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x + 1, y + 1, z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x - 1, y + 1, z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x + 1, y, z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x - 1, y, z), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 2, z + 1), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y + 1, z - 1), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y, z + 1), Blocks.AIR.getDefaultState(), 3);
			world.setBlockState(new BlockPos(x, y, z - 1), Blocks.AIR.getDefaultState(), 3);
		}
	}
}