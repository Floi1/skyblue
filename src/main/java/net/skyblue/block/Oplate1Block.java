package net.skyblue.block;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.common.ToolType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.Mirror;
import net.minecraft.util.Direction;
import net.minecraft.state.StateContainer;
import net.minecraft.state.DirectionProperty;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;
import net.minecraft.block.AbstractBlock;

public class Oplate1Block extends Block {
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;

	public Oplate1Block() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).sound(SoundType.METAL).hardnessAndResistance(3f, 30f).harvestLevel(1).harvestTool(ToolType.PICKAXE).notSolid().setOpaque((bs, br, bp) -> false));
		this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		RenderTypeLookup.setRenderLayer(SkyblueModBlocks.OPLATE_1.get(), RenderType.getCutout());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
		return true;
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
				return makeCuboidShape(-16, 0, 0, 32, 32, 16);
			case NORTH :
				return makeCuboidShape(-16, 0, 0, 32, 32, 16);
			case EAST :
				return makeCuboidShape(0, 0, -16, 16, 32, 32);
			default :
				return makeCuboidShape(0, 0, -16, 16, 32, 32);
		}
	}

	@Override
	protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
		super.fillStateContainer(builder);
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return super.getStateForPlacement(context).with(FACING, context.getPlacementHorizontalFacing().getOpposite());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.with(FACING, rot.rotate(state.get(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.toRotation(state.get(FACING)));
	}
}