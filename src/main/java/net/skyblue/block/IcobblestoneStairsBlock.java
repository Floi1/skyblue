package net.skyblue.block;

import net.minecraftforge.common.ToolType;

import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractBlock;

public class IcobblestoneStairsBlock extends StairsBlock {
	public IcobblestoneStairsBlock() {
		super(() -> Blocks.AIR.getDefaultState(), AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).hardnessAndResistance(11f, 10f).harvestLevel(0).harvestTool(ToolType.PICKAXE));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}

	@Override
	public boolean ticksRandomly(BlockState state) {
		return false;
	}
}