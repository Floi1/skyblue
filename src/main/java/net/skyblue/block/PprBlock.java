package net.skyblue.block;

import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

public class PprBlock extends Block {
	public PprBlock() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT, MaterialColor.IRON).hardnessAndResistance(10f).harvestLevel(2).harvestTool(ToolType.PICKAXE));
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 15;
	}
}