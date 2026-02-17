package net.skyblue.world.dimension;

import net.skyblue.procedures.SpawnProcedure;
import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.gen.carver.WorldCarver;
import net.minecraft.world.World;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.entity.Entity;
import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraft.block.Block;

import java.util.Set;
import java.util.HashSet;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;

import com.google.common.collect.ImmutableSet;

@Mod.EventBusSubscriber
public class K1Dimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class K1SpecialEffectsHandler {
		@SubscribeEvent
		public static void registerDimensionSurfaceBuilder(FMLCommonSetupEvent event) {
			Set<Block> replaceableBlocks = new HashSet<>();
			replaceableBlocks.add(SkyblueModBlocks.KK_1.get());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("skyblue:kr_1")).getGenerationSettings().getSurfaceBuilder().get().getConfig().getTop().getBlock());
			replaceableBlocks.add(ForgeRegistries.BIOMES.getValue(new ResourceLocation("skyblue:kr_1")).getGenerationSettings().getSurfaceBuilder().get().getConfig().getUnder().getBlock());
			DeferredWorkQueue.runLater(() -> {
				try {
					ObfuscationReflectionHelper.setPrivateValue(WorldCarver.class, WorldCarver.CAVE,
							new ImmutableSet.Builder<Block>().addAll((Set<Block>) ObfuscationReflectionHelper.getPrivateValue(WorldCarver.class, WorldCarver.CAVE, "field_222718_j")).addAll(replaceableBlocks).build(), "field_222718_j");
					ObfuscationReflectionHelper.setPrivateValue(WorldCarver.class, WorldCarver.CANYON,
							new ImmutableSet.Builder<Block>().addAll((Set<Block>) ObfuscationReflectionHelper.getPrivateValue(WorldCarver.class, WorldCarver.CANYON, "field_222718_j")).addAll(replaceableBlocks).build(), "field_222718_j");
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}

		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(FMLClientSetupEvent event) {
			DimensionRenderInfo customEffect = new DimensionRenderInfo(192f, true, DimensionRenderInfo.FogType.NONE, false, false) {
				@Override
				public Vector3d func_230494_a_(Vector3d color, float sunHeight) {
					return color;
				}

				@Override
				public boolean func_230493_a_(int x, int y) {
					return false;
				}
			};
			DeferredWorkQueue.runLater(() -> {
				try {
					Object2ObjectMap<ResourceLocation, DimensionRenderInfo> effectsRegistry = (Object2ObjectMap<ResourceLocation, DimensionRenderInfo>) ObfuscationReflectionHelper.getPrivateValue(DimensionRenderInfo.class, null, "field_239208_a_");
					effectsRegistry.put(new ResourceLocation("skyblue:k_1"), customEffect);
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		}
	}

	@SubscribeEvent
	public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getPlayer();
		World world = entity.world;
		double x = entity.getPosX();
		double y = entity.getPosY();
		double z = entity.getPosZ();
		if (event.getTo() == RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:k_1"))) {
			SpawnProcedure.execute(world, x, y, z);
		}
	}
}