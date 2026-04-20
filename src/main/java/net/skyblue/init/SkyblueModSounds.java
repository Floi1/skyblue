/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skyblue.init;

import net.skyblue.SkyblueMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.ResourceLocation;

public class SkyblueModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SkyblueMod.MODID);
	public static final RegistryObject<SoundEvent> ASOUND = REGISTRY.register("asound", () -> new SoundEvent(new ResourceLocation("skyblue", "asound")));
	public static final RegistryObject<SoundEvent> WHITE = REGISTRY.register("white", () -> new SoundEvent(new ResourceLocation("skyblue", "white")));
	public static final RegistryObject<SoundEvent> SNOW = REGISTRY.register("snow", () -> new SoundEvent(new ResourceLocation("skyblue", "snow")));
}