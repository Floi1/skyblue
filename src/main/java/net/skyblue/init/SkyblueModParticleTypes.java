/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skyblue.init;

import net.skyblue.SkyblueMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.particles.ParticleType;
import net.minecraft.particles.BasicParticleType;

public class SkyblueModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, SkyblueMod.MODID);
	public static final RegistryObject<BasicParticleType> AP_1 = REGISTRY.register("ap_1", () -> new BasicParticleType(false));
}