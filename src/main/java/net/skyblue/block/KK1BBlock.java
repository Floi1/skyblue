package net.skyblue.block;

import net.skyblue.procedures.SkyPlayerEntersDimensionProcedure;

import net.minecraft.world.World;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

public class KK1BBlock extends Block {
	public KK1BBlock() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).hardnessAndResistance(111f, 10f));
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void onEntityWalk(World world, BlockPos pos, Entity entity) {
		super.onEntityWalk(world, pos, entity);
		SkyPlayerEntersDimensionProcedure.execute(entity);
	}
}