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

public class Lr1Biome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.func_242929_a(new SurfaceBuilderConfig(SkyblueModBlocks.LL_1SNOW.get().getDefaultState(), SkyblueModBlocks.LL_1SNOW.get().getDefaultState(), SkyblueModBlocks.LL_1ROCK.get().getDefaultState()));

	public static Biome createBiome() {
		BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-1).setWaterColor(-16711681).setWaterFogColor(-16724788).withSkyColor(-1).withFoliageColor(-1).withGrassColor(-1).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().withSurfaceBuilder(SURFACE_BUILDER);
		DefaultBiomeFeatures.withCavesAndCanyons(biomeGenerationSettings);
		DefaultBiomeFeatures.withOverworldOres(biomeGenerationSettings);
		DefaultBiomeFeatures.withFrozenTopLayer(biomeGenerationSettings);
		MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
		return new Biome.Builder().precipitation(Biome.RainType.SNOW).category(Biome.Category.NONE).depth(0.1f).scale(0.2f).temperature(0.15f).downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
				.withGenerationSettings(biomeGenerationSettings.build()).build();
	}
}