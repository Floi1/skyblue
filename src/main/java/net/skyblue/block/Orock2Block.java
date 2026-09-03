package net.skyblue.block;

import net.skyblue.procedures.Orock2OnBlockRightClickedProcedure;
import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.Mirror;
import net.minecraft.util.Hand;
import net.minecraft.util.Direction;
import net.minecraft.util.ActionResultType;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.StateContainer;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.BooleanProperty;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.fluid.Fluids;
import net.minecraft.fluid.FluidState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.*;

public class Orock2Block extends Block implements IWaterLoggable {
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public Orock2Block() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).sound(SoundType.METAL).hardnessAndResistance(3f, 30f).harvestLevel(1).harvestTool(ToolType.PICKAXE).notSolid().setOpaque((bs, br, bp) -> false));
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(WATERLOGGED, false));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		RenderTypeLookup.setRenderLayer(SkyblueModBlocks.OROCK_2.get(), RenderType.getCutout());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
		return state.getFluidState().isEmpty();
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getRaytraceShape(BlockState state, IBlockReader world, BlockPos pos) {
		return VoxelShapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
		switch ((Direction) state.get(FACING)) {
			case SOUTH :
				return makeCuboidShape(4, 0, 3, 12, 8, 13);
			case NORTH :
				return makeCuboidShape(4, 0, 3, 12, 8, 13);
			case EAST :
				return makeCuboidShape(3, 0, 4, 13, 8, 12);
			default :
				return makeCuboidShape(3, 0, 4, 13, 8, 12);
		}
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		super.fillStateContainer(builder);
		builder.add(FACING, WATERLOGGED);
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		boolean flag = context.getWorld().getFluidState(context.getPos()).getFluid() == Fluids.WATER;
		return super.getStateForPlacement(context).with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(WATERLOGGED, flag);
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING, rot.rotate(state.get(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(FACING)));
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

	@Override
	public ActionResultType onBlockActivated(BlockState blockstate, World world, BlockPos pos, PlayerEntity entity, Hand hand, BlockRayTraceResult hit) {
		super.onBlockActivated(blockstate, world, pos, entity, hand, hit);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();
		double hitX = hit.getHitVec().x;
		double hitY = hit.getHitVec().y;
		double hitZ = hit.getHitVec().z;
		Direction direction = hit.getFace();
		Orock2OnBlockRightClickedProcedure.execute();
		return ActionResultType.SUCCESS;
	}
}