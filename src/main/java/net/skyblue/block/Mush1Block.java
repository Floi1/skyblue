package net.skyblue.block;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.common.PlantType;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IWorldReader;
import net.minecraft.world.IBlockReader;
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

public class Mush1Block extends FlowerBlock {
	public Mush1Block() {
		super(Effects.GLOWING, 100, AbstractBlock.Properties.create(Material.PLANTS).sound(SoundType.GROUND).hardnessAndResistance(11f).setNeedsPostProcessing((bs, br, bp) -> true).setEmmisiveRendering((bs, br, bp) -> true).setLightLevel(s -> 15)
				.doesNotBlockMovement());
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
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, IBlockReader world, BlockPos pos, Direction face) {
		return 60;
	}

	@Override
	public boolean isValidGround(BlockState groundState, IBlockReader worldIn, BlockPos pos) {
		return groundState.isIn(SkyblueModBlocks.ONETWOFIVE.get());
	}

	@Override
	public boolean isValidPosition(BlockState blockstate, IWorldReader worldIn, BlockPos pos) {
		BlockPos blockpos = pos.down();
		BlockState groundState = worldIn.getBlockState(blockpos);
		return this.isValidGround(groundState, worldIn, blockpos);
	}

	@Override
	public PlantType getPlantType(IBlockReader world, BlockPos pos) {
		return PlantType.NETHER;
	}
}