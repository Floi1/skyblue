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

public class LwaterBlock extends FlowingFluidBlock {
	public LwaterBlock() {
		super(() -> (FlowingFluid) SkyblueModFluids.LWATER.get(), AbstractBlock.Properties.create(Material.WATER).hardnessAndResistance(100f)

				.setLightLevel(s -> 2));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public Vector3d getFogColor(BlockState state, IWorldReader world, BlockPos pos, Entity entity, Vector3d originalColor, float partialTicks) {
		return new Vector3d(0f, 1f, 1f);
	}
}