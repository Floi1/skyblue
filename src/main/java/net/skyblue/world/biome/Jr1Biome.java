package net.skyblue.world.biome;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;

public class Jr1Biome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.func_242929_a(new SurfaceBuilderConfig(SkyblueModBlocks.JB_1.get().getDefaultState(), SkyblueModBlocks.JB_1.get().getDefaultState(), SkyblueModBlocks.JB_1.get().getDefaultState()));

	public static Biome createBiome() {
		BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(12638463).setWaterColor(4159204).setWaterFogColor(329011).withSkyColor(7972607).withFoliageColor(10387789).withGrassColor(9470285).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().withSurfaceBuilder(SURFACE_BUILDER);
		DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
		MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
		return new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE).depth(0.1f).scale(2f).temperature(0.5f).downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
				.withGenerationSettings(biomeGenerationSettings.build()).build();
	}
}