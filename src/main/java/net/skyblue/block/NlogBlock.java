package net.skyblue.block;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

public class NlogBlock extends Block {
	public NlogBlock() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).sound(SoundType.WOOD).hardnessAndResistance(5f, 55f).setLightLevel(s -> 1));
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 15;
	}
}