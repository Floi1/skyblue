package net.skyblue.world.features;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraft.world.gen.foliageplacer.SpruceFoliagePlacer;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.ISeedReader;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;

import java.util.Set;
import java.util.Random;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;

public class LtreeFeature extends TreeFeature {
	private static LtreeFeature FEATURE = null;
	private static ConfiguredFeature<?, ?> CONFIGURED_FEATURE = null;

	public LtreeFeature() {
		super(BaseTreeFeatureConfig.CODEC);
	}

	public static Feature<?> feature() {
		Random random = new Random();
		FEATURE = new LtreeFeature();
		CONFIGURED_FEATURE = FEATURE.withConfiguration(new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(SkyblueModBlocks.L_LOG.get().getDefaultState()), new SimpleBlockStateProvider(SkyblueModBlocks.L_LEAVES.get().getDefaultState()),
				new SpruceFoliagePlacer(FeatureSpread.func_242253_a(0, 2), FeatureSpread.func_242252_a((random.nextInt(3 - 2 + 1) + 2)), FeatureSpread.func_242252_a((random.nextInt(2 - 1 + 1) + 1))), new StraightTrunkPlacer(7, 2, 1),
				new TwoLayerFeature(2, 0, 2)).setMaxWaterDepth(0).setIgnoreVines().setDecorators(ImmutableList.of()).build()).func_242730_a(FeatureSpread.func_242252_a(256)).square();
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("skyblue:ltree"), CONFIGURED_FEATURE);
		return FEATURE;
	}

	public static ConfiguredFeature<?, ?> configuredFeature() {
		if (CONFIGURED_FEATURE == null)
			feature();
		return CONFIGURED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = ImmutableSet.of(new ResourceLocation("skyblue:lr_1"));

	@Override
	public boolean generate(ISeedReader world, ChunkGenerator generator, Random random, BlockPos pos, BaseTreeFeatureConfig config) {
		BlockPos origin = pos;
		world.setBlockState(new BlockPos(origin.getX(), origin.getY() - 1, origin.getZ()), SkyblueModBlocks.LL_1SNOW.get().getDefaultState(), 3);
		return super.generate(world, generator, random, origin, config);
	}
}