package net.skyblue.block;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IWorldReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.potion.Effects;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractBlock;

public class LwBlock extends FlowerBlock {
	public LwBlock() {
		super(Effects.SPEED, 100, AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.SLIME).hardnessAndResistance(3f).setLightLevel(s -> 1).notSolid().variableOpacity());
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		RenderTypeLookup.setRenderLayer(SkyblueModBlocks.LW.get(), RenderType.getCutout());
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
		Vector3d offset = state.getOffset(world, pos);
		return VoxelShapes.or(makeCuboidShape(7, 12, 7, 9, 24, 9), makeCuboidShape(7, 0, 7, 9, 12, 9)).withOffset(offset.x, offset.y, offset.z);
	}

	@Override
	public int getStewEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public boolean isValidGround(BlockState groundState, IBlockReader worldIn, BlockPos pos) {
		return groundState.isIn(SkyblueModBlocks.LL_1SNOW.get());
	}

	@Override
	public boolean isValidPosition(BlockState blockstate, IWorldReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.down();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.isValidGround(groundState, worldIn, blockpos);
	}
}