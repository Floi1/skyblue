package net.skyblue.block;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

public class Kk2Block extends Block {
	public Kk2Block() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).hardnessAndResistance(11f, 10f));
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 15;
	}
}