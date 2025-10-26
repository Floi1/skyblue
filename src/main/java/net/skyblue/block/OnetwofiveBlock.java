package net.skyblue.block;

import net.minecraftforge.common.ToolType;
import net.minecraftforge.common.IPlantable;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

public class OnetwofiveBlock extends Block {
	public OnetwofiveBlock() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).hardnessAndResistance(40f).harvestLevel(0).harvestTool(ToolType.PICKAXE));
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction direction, IPlantable plantable) {
		return true;
	}
}