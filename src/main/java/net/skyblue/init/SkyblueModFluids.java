/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.skyblue.init;

import net.skyblue.fluid.WaterhFluid;
import net.skyblue.fluid.NwaterFluid;
import net.skyblue.fluid.LwaterFluid;
import net.skyblue.fluid.EwaterFluid;
import net.skyblue.SkyblueMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;

public class SkyblueModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, SkyblueMod.MODID);
	public static final RegistryObject<FlowingFluid> EWATER = REGISTRY.register("ewater", EwaterFluid.Source::new);
	public static final RegistryObject<FlowingFluid> FLOWING_EWATER = REGISTRY.register("flowing_ewater", EwaterFluid.Flowing::new);
	public static final RegistryObject<FlowingFluid> WATERH = REGISTRY.register("waterh", WaterhFluid.Source::new);
	public static final RegistryObject<FlowingFluid> FLOWING_WATERH = REGISTRY.register("flowing_waterh", WaterhFluid.Flowing::new);
	public static final RegistryObject<FlowingFluid> LWATER = REGISTRY.register("lwater", LwaterFluid.Source::new);
	public static final RegistryObject<FlowingFluid> FLOWING_LWATER = REGISTRY.register("flowing_lwater", LwaterFluid.Flowing::new);
	public static final RegistryObject<FlowingFluid> NWATER = REGISTRY.register("nwater", NwaterFluid.Source::new);
	public static final RegistryObject<FlowingFluid> FLOWING_NWATER = REGISTRY.register("flowing_nwater", NwaterFluid.Flowing::new);

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			RenderTypeLookup.setRenderLayer(EWATER.get(), RenderType.getTranslucent());
			RenderTypeLookup.setRenderLayer(FLOWING_EWATER.get(), RenderType.getTranslucent());
			RenderTypeLookup.setRenderLayer(WATERH.get(), RenderType.getTranslucent());
			RenderTypeLookup.setRenderLayer(FLOWING_WATERH.get(), RenderType.getTranslucent());
			RenderTypeLookup.setRenderLayer(LWATER.get(), RenderType.getTranslucent());
			RenderTypeLookup.setRenderLayer(FLOWING_LWATER.get(), RenderType.getTranslucent());
			RenderTypeLookup.setRenderLayer(NWATER.get(), RenderType.getTranslucent());
			RenderTypeLookup.setRenderLayer(FLOWING_NWATER.get(), RenderType.getTranslucent());
		}
	}
}