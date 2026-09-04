/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skyblue.init;

import net.skyblue.world.structures.SkyblueModStructureBase;
import net.skyblue.world.structures.BIGp1Structure;
import net.skyblue.SkyblueMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.FlatGenerationSettings;
import net.minecraft.world.gen.FlatChunkGenerator;
import net.minecraft.world.World;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;

@Mod.EventBusSubscriber
public class SkyblueModStructures {
	public static final DeferredRegister<Structure<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, SkyblueMod.MODID);
	private static final List<StructureRegistration> STRUCTURE_REGISTRATIONS = new ArrayList<>();
	public static final RegistryObject<SkyblueModStructureBase> BI_GP_1 = register("bi_gp_1", BIGp1Structure::new);

	private static RegistryObject<SkyblueModStructureBase> register(String registryname, Supplier<SkyblueModStructureBase> structure) {
		StructureRegistration structureRegistration = new StructureRegistration(REGISTRY.register(registryname, structure));
		STRUCTURE_REGISTRATIONS.add(structureRegistration);
		return structureRegistration.structure();
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	private static class InitClass {
		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			event.enqueueWork(() -> {
				for (StructureRegistration registration : STRUCTURE_REGISTRATIONS) {
					SkyblueModStructureBase structure = registration.structure().get();
					StructureSeparationSettings configuration = structure.getStructureFeatureConfiguration();
					String id = structure.getRegistryName().toString();
					Structure.NAME_STRUCTURE_BIMAP.put(id, structure);
					if (structure.isSurroundedByLand()) {
						Structure.field_236384_t_ = ImmutableList.<Structure<?>>builder().addAll(Structure.field_236384_t_).add(structure).build();
					}
					DimensionStructuresSettings.field_236191_b_ = ImmutableMap.<Structure<?>, StructureSeparationSettings>builder().putAll(DimensionStructuresSettings.field_236191_b_).put(structure, configuration).build();
					WorldGenRegistries.NOISE_SETTINGS.getEntries().forEach(settings -> {
						Map<Structure<?>, StructureSeparationSettings> structureMap = settings.getValue().getStructures().func_236195_a_();
						if (structureMap instanceof ImmutableMap) {
							Map<Structure<?>, StructureSeparationSettings> tempMap = new HashMap<>(structureMap);
							tempMap.put(structure, configuration);
							settings.getValue().getStructures().field_236193_d_ = tempMap;
						} else {
							structureMap.put(structure, configuration);
						}
					});
					Registry.register(WorldGenRegistries.CONFIGURED_STRUCTURE_FEATURE, id, structure.configuredFeature());
					FlatGenerationSettings.STRUCTURES.put(structure, structure.configuredFeature());
				}
			});
		}
	}

	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void addFeaturesToBiomes(BiomeLoadingEvent event) {
		for (StructureRegistration registration : STRUCTURE_REGISTRATIONS) {
			SkyblueModStructureBase structure = registration.structure().get();
			if (structure.getBiomes() == null || structure.getBiomes().contains(event.getName()))
				event.getGeneration().getStructures().add(() -> structure.configuredFeature());
		}
	}

	@SubscribeEvent
	public static void addDimensionalSpacing(WorldEvent.Load event) {
		if (event.getWorld() instanceof ServerWorld) {
			ServerWorld serverWorld = (ServerWorld) event.getWorld();
			if (serverWorld.getChunkProvider().getChunkGenerator() instanceof FlatChunkGenerator && serverWorld.getDimensionKey().equals(World.OVERWORLD)) {
				return;
			}
			Map<Structure<?>, StructureSeparationSettings> tempMap = new HashMap<>(serverWorld.getChunkProvider().generator.func_235957_b_().func_236195_a_());
			for (StructureRegistration registration : STRUCTURE_REGISTRATIONS) {
				SkyblueModStructureBase structure = registration.structure().get();
				if (structure.getDimensions() != null && !structure.getDimensions().contains(serverWorld.getDimensionKey())) {
					tempMap.remove(structure);
					continue;
				}
				tempMap.putIfAbsent(structure, DimensionStructuresSettings.field_236191_b_.get(structure));
			}
			serverWorld.getChunkProvider().generator.func_235957_b_().field_236193_d_ = tempMap;
		}
	}

	private static class StructureRegistration {
		private final RegistryObject<SkyblueModStructureBase> structure;

		public StructureRegistration(RegistryObject<SkyblueModStructureBase> structure) {
			this.structure = structure;
		}

		public RegistryObject<SkyblueModStructureBase> structure() {
			return structure;
		}
	}
}