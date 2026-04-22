package net.skyblue.block;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.AbstractBlock;

public class NlogsideBlock extends SlabBlock {
	public NlogsideBlock() {
		super(AbstractBlock.Properties.create(Material.REDSTONE_LIGHT).sound(SoundType.WOOD).hardnessAndResistance(5f, 55f));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		RenderTypeLookup.setRenderLayer(SkyblueModBlocks.NLOG_SLAB.get(), RenderType.getCutoutMipped());
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 15;
	}
}