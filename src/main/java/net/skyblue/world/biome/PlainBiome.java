
package net.skyblue.world.biome;

import net.skyblue.block.SixthreeBlock;
import net.skyblue.SkyblueModElements;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.Biome;

@SkyblueModElements.ModElement.Tag
public class PlainBiome extends SkyblueModElements.ModElement {
	public static Biome biome;

	public PlainBiome(SkyblueModElements instance) {
		super(instance, 3);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}

	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-10027162).setWaterColor(-10027162).setWaterFogColor(-10027162)
						.withSkyColor(-10027162).withFoliageColor(-10027162).withGrassColor(-10027162).build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(SixthreeBlock.block.getDefaultState(),
								SixthreeBlock.block.getDefaultState(), SixthreeBlock.block.getDefaultState())));
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				biome = new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE).depth(0f).scale(0f).temperature(0.5f)
						.downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("skyblue:plain"));
			}
		}
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
