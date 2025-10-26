package net.skyblue.block;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.common.PlantType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.StateContainer;
import net.minecraft.state.BooleanProperty;
import net.minecraft.potion.Effects;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.FluidState;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.IWaterLoggable;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

public class Mush1Block extends FlowerBlock implements IWaterLoggable {
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public Mush1Block() {
		super(Effects.GLOWING, 100, AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.SWEET_BERRY_BUSH).hardnessAndResistance(11f).setNeedsPostProcessing((bs, br, bp) -> true).setEmmisiveRendering((bs, br, bp) -> true)
				.setLightLevel(s -> 15).doesNotBlockMovement());
		this.setDefaultState(this.stateContainer.getBaseState().with(WATERLOGGED, false));
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		super.fillStateContainer(builder);
		builder.add(WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		BlockState state = super.getStateForPlacement(context);
		return state == null ? null : state.with(WATERLOGGED, context.getWorld().getFluidState(context.getPos()).getFluid() == Fluids.WATER);
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
	}

	@Override
	public BlockState updatePostPlacement(BlockState state, Direction facing, BlockState facingState, IWorld world, BlockPos currentPos, BlockPos facingPos) {
		if (state.get(WATERLOGGED)) {
			world.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(world));
		}
		return super.updatePostPlacement(state, facing, facingState, world, currentPos, facingPos);
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		RenderTypeLookup.setRenderLayer(SkyblueModBlocks.MUSH_1.get(), RenderType.getCutout());
	}

	@Override
	public int getStewEffectDuration() {
		return 100;
	}

	@Override
	public int getFlammability(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
		return 1024;
	}

	@Override
	public Block.OffsetType getOffsetType() {
		return Block.OffsetType.NONE;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public PlantType getPlantType(IBlockReader world, BlockPos pos) {
		return PlantType.CAVE;
	}
}