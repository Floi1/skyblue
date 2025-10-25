
package net.skyblue.world.biome;

import net.skyblue.block.OnezerofiveBlock;
import net.skyblue.block.OnethreenoeBlock;
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
public class BR1Biome extends SkyblueModElements.ModElement {
	public static Biome biome;

	public BR1Biome(SkyblueModElements instance) {
		super(instance, 19);
		FMLJavaModLoadingContext.get().getModEventBus().register(new BiomeRegisterHandler());
	}

	private static class BiomeRegisterHandler {
		@SubscribeEvent
		public void registerBiomes(RegistryEvent.Register<Biome> event) {
			if (biome == null) {
				BiomeAmbience effects = new BiomeAmbience.Builder().setFogColor(-3407668).setWaterColor(-3407668).setWaterFogColor(-3407668)
						.withSkyColor(-3407668).withFoliageColor(-3407668).withGrassColor(-3407668).build();
				BiomeGenerationSettings.Builder biomeGenerationSettings = new BiomeGenerationSettings.Builder()
						.withSurfaceBuilder(SurfaceBuilder.DEFAULT.func_242929_a(new SurfaceBuilderConfig(OnezerofiveBlock.block.getDefaultState(),
								OnethreenoeBlock.block.getDefaultState(), OnethreenoeBlock.block.getDefaultState())));
				MobSpawnInfo.Builder mobSpawnInfo = new MobSpawnInfo.Builder().isValidSpawnBiomeForPlayer();
				biome = new Biome.Builder().precipitation(Biome.RainType.RAIN).category(Biome.Category.NONE).depth(0f).scale(0.1f).temperature(0.5f)
						.downfall(0.5f).setEffects(effects).withMobSpawnSettings(mobSpawnInfo.copy())
						.withGenerationSettings(biomeGenerationSettings.build()).build();
				event.getRegistry().register(biome.setRegistryName("skyblue:br_1"));
			}
		}
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
	}
}
