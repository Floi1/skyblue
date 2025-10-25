package net.skyblue.block;

import net.skyblue.init.SkyblueModFluids;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IWorldReader;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.BlockPos;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractBlock;

public class WaterhBlock extends FlowingFluidBlock {
	public WaterhBlock() {
		super(() -> (FlowingFluid) SkyblueModFluids.WATERH.get(), AbstractBlock.Properties.create(Material.WATER).hardnessAndResistance(100f)

				.setLightLevel(s -> 15));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public Vector3d getFogColor(BlockState state, IWorldReader world, BlockPos pos, Entity entity, Vector3d originalColor, float partialTicks) {
		return new Vector3d(0.0862745098f, 0.5529411765f, 0.2f);
	}
}