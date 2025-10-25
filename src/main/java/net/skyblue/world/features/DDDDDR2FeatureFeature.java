package net.skyblue.world.features;

import net.skyblue.world.features.configurations.StructureModFeatureConfiguration;

import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.ISeedReader;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Blocks;

import java.util.Set;
import java.util.Random;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableList;

public class DDDDDR2FeatureFeature extends StructureModFeature {
	private static DDDDDR2FeatureFeature FEATURE = null;
	private static ConfiguredFeature<?, ?> CONFIGURED_FEATURE = null;

	public DDDDDR2FeatureFeature() {
		super(StructureModFeatureConfiguration.CODEC);
	}

	public static Feature<?> feature() {
		Random random = new Random();
		FEATURE = new DDDDDR2FeatureFeature();
		CONFIGURED_FEATURE = FEATURE.withConfiguration(new StructureModFeatureConfiguration(new ResourceLocation("skyblue:dddd2"), true, true, ImmutableList.of(Blocks.STRUCTURE_BLOCK.getDefaultState()), new Vector3i(0, -1, 0))).chance(100).square();
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("skyblue:dddddr_2_feature"), CONFIGURED_FEATURE);
		return FEATURE;
	}

	public static ConfiguredFeature<?, ?> configuredFeature() {
		if (CONFIGURED_FEATURE == null)
			feature();
		return CONFIGURED_FEATURE;
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = ImmutableSet.of(new ResourceLocation("skyblue:dr_1"));

	@Override
	public boolean generate(ISeedReader world, ChunkGenerator generator, Random random, BlockPos pos, StructureModFeatureConfiguration config) {
		BlockPos origin = pos;
		origin = new BlockPos(origin.getX(), world.getHeight(Heightmap.Type.OCEAN_FLOOR_WG, origin.getX(), origin.getZ()), origin.getZ());
		return super.generate(world, generator, random, origin, config);
	}
}