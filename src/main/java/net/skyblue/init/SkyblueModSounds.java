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
	public static final RegistryObject<SoundEvent> O1 = REGISTRY.register("o1", () -> new SoundEvent(new ResourceLocation("skyblue", "o1")));
	public static final RegistryObject<SoundEvent> O2 = REGISTRY.register("o2", () -> new SoundEvent(new ResourceLocation("skyblue", "o2")));
	public static final RegistryObject<SoundEvent> O3 = REGISTRY.register("o3", () -> new SoundEvent(new ResourceLocation("skyblue", "o3")));
	public static final RegistryObject<SoundEvent> O4 = REGISTRY.register("o4", () -> new SoundEvent(new ResourceLocation("skyblue", "o4")));
	public static final RegistryObject<SoundEvent> O5 = REGISTRY.register("o5", () -> new SoundEvent(new ResourceLocation("skyblue", "o5")));
	public static final RegistryObject<SoundEvent> O6 = REGISTRY.register("o6", () -> new SoundEvent(new ResourceLocation("skyblue", "o6")));
}