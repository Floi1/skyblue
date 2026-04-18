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
import net.minecraft.client.audio.BackgroundMusicSelector;

public class Cr1Biome {
	private static final ConfiguredSurfaceBuilder<?> SURFACE_BUILDER = SurfaceBuilder.DEFAULT
			.func_242929_a(new SurfaceBuilderConfig(SkyblueModBlocks.TWOFOUR.get().getDefaultState(), SkyblueModBlocks.TWOFIVESIX.get().getDefaultState(), SkyblueModBlocks.TWOFIVESIX.get().getDefaultState()));

	public static Biome createBiome() {
		BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(12638463).setWaterColor(4159204).setWaterFogColor(329011).withSkyColor(7972607).withFoliageColor(10387789).withGrassColor(9470285)
				.setMusic(new BackgroundMusicSelector(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("skyblue:white")), 12000, 24000, true)).build();
		BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder().withSurfaceBuilder(SURFACE_BUILDER);
		MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
		return new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE).depth(-0.2f).scale(0.1f).temperature(0.5f).downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
				.withGenerationSettings(biomeGenerationSettings.build()).build();
	}
}