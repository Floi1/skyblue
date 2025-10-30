package net.skyblue.world.biome;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.feature.TwoLayerFeature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.FeatureSpread;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.block.Blocks;

public class Kr1Biome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.func_242929_a(new SurfaceBuilderConfig(SkyblueModBlocks.KK_1.get().getDefaultState(), SkyblueModBlocks.KK_2.get().getDefaultState(), SkyblueModBlocks.KK_3.get().getDefaultState()));

	public static Biome createBiome() {
		BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-16764058).setWaterColor(-16764058).setWaterFogColor(-16764058).withSkyColor(-16764058).withFoliageColor(-16764058).withGrassColor(-16764058).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().withSurfaceBuilder(SURFACE_BUILDER);
		biomeGenerationSettings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
				Feature.TREE
						.withConfiguration((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(Blocks.OAK_LOG.getDefaultState()), new SimpleBlockStateProvider(Blocks.OAK_LEAVES.getDefaultState()),
								new BlobFoliagePlacer(FeatureSpread.func_242252_a(2), FeatureSpread.func_242252_a(0), 3), new StraightTrunkPlacer(4, 2, 0), new TwoLayerFeature(1, 0, 1))).setIgnoreVines().build())
						.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(1, 0.1F, 1))));
		DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
		DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
		DefaultBiomeFeatures.withFrozenTopLayer(biomeGenerationSettings);
		MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
		return new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE).depth(0.1f).scale(0.3f).temperature(0.5f).downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
				.withGenerationSettings(biomeGenerationSettings.build()).build();
	}
}