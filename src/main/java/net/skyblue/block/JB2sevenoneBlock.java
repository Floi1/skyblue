package net.skyblue.block;

import net.skyblue.procedures.JB2sevenoneEntityWalksOnTheBlockProcedure;
import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

public class JB2sevenoneBlock extends Block {
	public JB2sevenoneBlock() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).hardnessAndResistance(11f, 10f).harvestLevel(0).harvestTool(ToolType.PICKAXE).notSolid().setOpaque((bs, br, bp) -> false));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		RenderTypeLookup.setRenderLayer(SkyblueModBlocks.JB_2SEVENONE.get(), RenderType.getTranslucent());
	}

	@Override
	public boolean isSideInvisible(BlockState state, BlockState adjacentBlockState, Direction side) {
		return adjacentBlockState.getBlock() == this ? true : super.isSideInvisible(state, adjacentBlockState, side);
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public VoxelShape getRaytraceShape(BlockState state, IBlockReader world, BlockPos pos) {
		return VoxelShapes.empty();
	}

	@Override
	public void onEntityCollision(BlockState blockstate, World world, BlockPos pos, Entity entity) {
		super.onEntityCollision(blockstate, world, pos, entity);
		JB2sevenoneEntityWalksOnTheBlockProcedure.execute(world, entity);
	}

	@Override
	public void onEntityWalk(World world, BlockPos pos, Entity entity) {
		super.onEntityWalk(world, pos, entity);
		JB2sevenoneEntityWalksOnTheBlockProcedure.execute(world, entity);
	}
}