package net.skyblue.fluid;

import net.skyblue.init.SkyblueModItems;
import net.skyblue.init.SkyblueModFluids;
import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.state.StateContainer;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluid;
import net.minecraft.block.FlowingFluidBlock;

public abstract class NwaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(SkyblueModFluids.NWATER, SkyblueModFluids.FLOWING_NWATER,
			FluidAttributes.builder(new ResourceLocation("skyblue:block/nwater_still"), new ResourceLocation("skyblue:block/nwater_flow"))

	).explosionResistance(100f)

			.levelDecreasePerBlock(3)

			.bucket(SkyblueModItems.NWATER_BUCKET).block(() -> (FlowingFluidBlock) SkyblueModBlocks.NWATER.get());

	private NwaterFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vector3d getFlow(IBlockReader world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(5);
	}

	public static class Source extends NwaterFluid {
		public int getLevel(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NwaterFluid {
		protected void fillStateContainer(StateContainer.Builder<Fluid, FluidState> builder) {
			super.fillStateContainer(builder);
			builder.add(LEVEL_1_8);
		}

		public int getLevel(FluidState state) {
			return state.get(LEVEL_1_8);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}