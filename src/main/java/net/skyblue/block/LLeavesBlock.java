package net.skyblue.block;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

public class LLeavesBlock extends Block {
	public LLeavesBlock() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).sound(SoundType.PLANT).hardnessAndResistance(0.4f).notSolid().setOpaque((bs, br, bp) -> false));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		RenderTypeLookup.setRenderLayer(SkyblueModBlocks.L_LEAVES.get(), RenderType.getCutout());
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 1;
	}

	@Override
	public VoxelShape getRaytraceShape(BlockState state, IBlockReader world, BlockPos pos) {
		return VoxelShapes.empty();
	}

	@Override
	public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
		return 60;
	}
}