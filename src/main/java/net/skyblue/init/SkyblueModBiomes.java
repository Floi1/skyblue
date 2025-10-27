package net.skyblue.init;

import net.skyblue.world.biome.Rd1Biome;
import net.skyblue.world.biome.PlainBiome;
import net.skyblue.world.biome.Jr1Biome;
import net.skyblue.world.biome.IR1Biome;
import net.skyblue.world.biome.Hr1Biome;
import net.skyblue.world.biome.Gr3Biome;
import net.skyblue.world.biome.Gr2Biome;
import net.skyblue.world.biome.Gr1Biome;
import net.skyblue.world.biome.GR5Biome;
import net.skyblue.world.biome.GR4Biome;
import net.skyblue.world.biome.Fr1Biome;
import net.skyblue.world.biome.ER1Biome;
import net.skyblue.world.biome.DR1Biome;
import net.skyblue.world.biome.Cr1Biome;
import net.skyblue.world.biome.BR1Biome;
import net.skyblue.world.biome.Ar1Biome;
import net.skyblue.SkyblueMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.world.biome.Biome;

/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
public class SkyblueModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, SkyblueMod.MODID);
	public static final RegistryObject<Biome> PLAIN = REGISTRY.register("plain", PlainBiome::createBiome);
	public static final RegistryObject<Biome> RD_1 = REGISTRY.register("rd_1", Rd1Biome::createBiome);
	public static final RegistryObject<Biome> BR_1 = REGISTRY.register("br_1", BR1Biome::createBiome);
	public static final RegistryObject<Biome> CR_1 = REGISTRY.register("cr_1", Cr1Biome::createBiome);
	public static final RegistryObject<Biome> AR_1 = REGISTRY.register("ar_1", Ar1Biome::createBiome);
	public static final RegistryObject<Biome> DR_1 = REGISTRY.register("dr_1", DR1Biome::createBiome);
	public static final RegistryObject<Biome> ER_1 = REGISTRY.register("er_1", ER1Biome::createBiome);
	public static final RegistryObject<Biome> FR_1 = REGISTRY.register("fr_1", Fr1Biome::createBiome);
	public static final RegistryObject<Biome> GR_1 = REGISTRY.register("gr_1", Gr1Biome::createBiome);
	public static final RegistryObject<Biome> GR_2 = REGISTRY.register("gr_2", Gr2Biome::createBiome);
	public static final RegistryObject<Biome> GR_3 = REGISTRY.register("gr_3", Gr3Biome::createBiome);
	public static final RegistryObject<Biome> GR_4 = REGISTRY.register("gr_4", GR4Biome::createBiome);
	public static final RegistryObject<Biome> GR_5 = REGISTRY.register("gr_5", GR5Biome::createBiome);
	public static final RegistryObject<Biome> HR_1 = REGISTRY.register("hr_1", Hr1Biome::createBiome);
	public static final RegistryObject<Biome> IR_1 = REGISTRY.register("ir_1", IR1Biome::createBiome);
	public static final RegistryObject<Biome> JR_1 = REGISTRY.register("jr_1", Jr1Biome::createBiome);
}