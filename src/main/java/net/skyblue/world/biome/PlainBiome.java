package net.skyblue.world.biome;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.ResourceLocation;

public class PlainBiome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.func_242929_a(new SurfaceBuilderConfig(SkyblueModBlocks.SIXTHREE.get().getDefaultState(), SkyblueModBlocks.SIXTHREE.get().getDefaultState(), SkyblueModBlocks.SIXTHREE.get().getDefaultState()));

	public static Biome createBiome() {
		BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-10027162).setWaterColor(-10027162).setWaterFogColor(-10027162).withSkyColor(-10027162).withFoliageColor(-10027162).withGrassColor(-10027162)
				.setAmbientSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("skyblue:asound"))).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().withSurfaceBuilder(SURFACE_BUILDER);
		MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
		return new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE).depth(0f).scale(0f).temperature(0.5f).downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
				.withGenerationSettings(biomeGenerationSettings.build()).build();
	}
}