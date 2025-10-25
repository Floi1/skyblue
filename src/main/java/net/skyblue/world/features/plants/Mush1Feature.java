package net.skyblue.world.features.plants;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.DefaultFlowersFeature;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.ResourceLocation;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

public class Mush1Feature extends DefaultFlowersFeature {
	private static Mush1Feature INSTANCE = null;
	private static ConfiguredFeature<?, ?> CONFIGURED_FEATURE = null;

	public Mush1Feature() {
		super(BlockClusterFeatureConfig.field_236587_a_);
	}

	public static Feature<?> feature() {
		INSTANCE = new Mush1Feature();
		CONFIGURED_FEATURE = INSTANCE.withConfiguration(new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(SkyblueModBlocks.MUSH_1.get().getDefaultState()), SimpleBlockPlacer.PLACER)

				.tries(64).build()).func_242731_b(32).chance(32).square().range(128);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("skyblue:mush_1"), CONFIGURED_FEATURE);
		return INSTANCE;
	}

	public static ConfiguredFeature<?, ?> configuredFeature() {
		if (CONFIGURED_FEATURE == null)
			feature();
		return CONFIGURED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = ImmutableSet.of(new ResourceLocation("skyblue:hr_1"));
}