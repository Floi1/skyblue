package net.skyblue.world.structures;

import net.skyblue.world.structures.configurations.StructureConfiguration;
import net.skyblue.init.SkyblueModStructures;

import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.util.ResourceLocation;

import java.util.Set;
import java.util.Optional;

import com.google.common.collect.ImmutableSet;

public class BIGp1Structure extends SkyblueModStructureBase {
	private static final StructureConfiguration INSTANCE = new StructureConfiguration(1, StructureConfiguration.ConstantHeight.of(0), Optional.of(Heightmap.Type.WORLD_SURFACE_WG), 64);

	public BIGp1Structure() {
		super("bi_gp_1");
	}

	@Override
	public GenerationStage.Decoration getDecorationStage() {
		return GenerationStage.Decoration.SURFACE_STRUCTURES;
	}

	@Override
	public Set<ResourceLocation> getBiomes() {
		return ImmutableSet.of(new ResourceLocation("plains"));
	}

	@Override
	public StructureSeparationSettings getStructureFeatureConfiguration() {
		return new StructureSeparationSettings(5, 2, 450193573);
	}

	@Override
	public StructureFeature<?, ?> configuredFeature() {
		return SkyblueModStructures.BI_GP_1.get().withConfiguration(INSTANCE);
	}
}