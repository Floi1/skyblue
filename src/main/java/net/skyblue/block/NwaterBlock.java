package net.skyblue.block;

import net.skyblue.init.SkyblueModFluids;

import net.minecraft.fluid.FlowingFluid;
import net.minecraft.block.material.Material;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.AbstractBlock;

public class NwaterBlock extends FlowingFluidBlock {
	public NwaterBlock() {
		super(() -> (FlowingFluid) SkyblueModFluids.NWATER.get(), AbstractBlock.Properties.create(Material.WATER).hardnessAndResistance(100f)

		);
	}
}