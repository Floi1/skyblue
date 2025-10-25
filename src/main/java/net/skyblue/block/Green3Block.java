package net.skyblue.block;

import net.skyblue.procedures.Green3EntityWalksOnTheBlockProcedure;

import net.minecraftforge.common.ToolType;

import net.minecraft.world.World;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

public class Green3Block extends Block {
	public Green3Block() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).sound(SoundType.METAL).hardnessAndResistance(11f, 10f).setRequiresTool().harvestLevel(1).harvestTool(ToolType.PICKAXE));
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void onEntityWalk(World world, BlockPos pos, Entity entity) {
		super.onEntityWalk(world, pos, entity);
		Green3EntityWalksOnTheBlockProcedure.execute(entity);
	}
}