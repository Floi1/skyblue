package net.skyblue.block;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractBlock;

public class LStairsBlock extends StairsBlock {
	public LStairsBlock() {
		super(() -> Blocks.AIR.getDefaultState(), AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).sound(SoundType.WOOD).hardnessAndResistance(6f, 4f));
	}

	@Override
	public float getExplosionResistance() {
		return 4f;
	}

	@Override
	public boolean ticksRandomly(BlockState state) {
		return false;
	}

	@Override
	public boolean isFlammable(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
		return true;
	}

	@Override
	public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
		return 10;
	}
}