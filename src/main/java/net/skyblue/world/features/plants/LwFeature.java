package net.skyblue.world.features.plants;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraft.world.gen.feature.RandomPatchFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.ResourceLocation;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

public class LwFeature extends RandomPatchFeature {
	private static LwFeature INSTANCE = null;
	private static ConfiguredFeature<?, ?> CONFIGURED_FEATURE = null;

	public LwFeature() {
		super(BlockClusterFeatureConfig.field_236587_a_);
	}

	public static Feature<?> feature() {
		INSTANCE = new LwFeature();
		CONFIGURED_FEATURE = INSTANCE.withConfiguration(new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(SkyblueModBlocks.LW.get().getDefaultState()), SimpleBlockPlacer.PLACER)

				.tries(8).build()).func_242731_b(4).square().range(128);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("skyblue:lw"), CONFIGURED_FEATURE);
		return INSTANCE;
	}

	public static ConfiguredFeature<?, ?> configuredFeature() {
		if (CONFIGURED_FEATURE == null)
			feature();
		return CONFIGURED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = ImmutableSet.of(new ResourceLocation("skyblue:lr_1"));
}