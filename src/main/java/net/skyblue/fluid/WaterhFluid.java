package net.skyblue.fluid;

import net.skyblue.init.SkyblueModItems;
import net.skyblue.init.SkyblueModFluids;
import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.util.ResourceLocation;
import net.minecraft.state.StateContainer;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluid;
import net.minecraft.block.FlowingFluidBlock;

public abstract class WaterhFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(SkyblueModFluids.WATERH, SkyblueModFluids.FLOWING_WATERH,
			FluidAttributes.builder(new ResourceLocation("skyblue:block/water_h"), new ResourceLocation("skyblue:block/water_flow_h"))

	).explosionResistance(100f)

			.bucket(SkyblueModItems.WATERH_BUCKET).block(() -> (FlowingFluidBlock) SkyblueModBlocks.WATERH.get());

	private WaterhFluid() {
		super(PROPERTIES);
	}

	public static class Source extends WaterhFluid {
		public int getLevel(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends WaterhFluid {
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