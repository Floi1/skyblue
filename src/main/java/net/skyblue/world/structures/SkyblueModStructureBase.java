package net.skyblue.world.structures;

import net.skyblue.world.structures.configurations.StructureConfiguration;

import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.gen.feature.structure.VillageConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.MarginedStructureStart;
import net.minecraft.world.gen.feature.structure.AbstractVillagePiece;
import net.minecraft.world.gen.feature.jigsaw.JigsawPiece;
import net.minecraft.world.gen.feature.jigsaw.JigsawPatternRegistry;
import net.minecraft.world.gen.feature.jigsaw.JigsawManager;
import net.minecraft.world.gen.feature.StructureFeature;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.World;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.DynamicRegistries;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;

import java.util.Set;
import java.util.List;

public class SkyblueModStructureBase extends Structure<StructureConfiguration> {
	private final String startPool;

	public SkyblueModStructureBase(String startPool) {
		super(StructureConfiguration.CODEC);
		this.startPool = startPool;
	}

	@Override
	public GenerationStage.Decoration getDecorationStage() {
		return null;
	}

	public Set<ResourceLocation> getBiomes() {
		return null;
	}

	public Set<RegistryKey<World>> getDimensions() {
		return null;
	}

	public StructureSeparationSettings getStructureFeatureConfiguration() {
		return null;
	}

	public boolean isSurroundedByLand() {
		return false;
	}

	public StructureFeature<?, ?> configuredFeature() {
		return null;
	}

	@Override
	public List<MobSpawnInfo.Spawners> getSpawnList() {
		return null;
	}

	@Override
	public List<MobSpawnInfo.Spawners> getCreatureSpawnList() {
		return null;
	}

	@Override
	public Structure.IStartFactory<StructureConfiguration> getStartFactory() {
		return (structure, chunkX, chunkZ, mutableBoundingBox, referenceIn, seedIn) -> {
			return new FeatureStart(this, chunkX, chunkZ, mutableBoundingBox, referenceIn, seedIn, startPool);
		};
	}

	protected static class FeatureStart extends MarginedStructureStart<StructureConfiguration> {
		private final String startPool;

		public FeatureStart(Structure<StructureConfiguration> structure, int chunkX, int chunkZ, MutableBoundingBox mutableBoundingBox, int referenceIn, long seedIn, String startPool) {
			super(structure, chunkX, chunkZ, mutableBoundingBox, referenceIn, seedIn);
			this.startPool = startPool;
		}

		@Override
		public void func_230364_a_(DynamicRegistries registryAccess, ChunkGenerator chunkGenerator, TemplateManager structureManager, int chunkX, int chunkZ, Biome biome, StructureConfiguration config) {
			int topLandY = config.startHeight().sample(rand);
			BlockPos blockpos = new BlockPos(chunkX * 16, topLandY, chunkZ * 16);
			VillageConfig jigsawConfig = new VillageConfig(() -> registryAccess.getRegistry(Registry.JIGSAW_POOL_KEY).getOrDefault(new ResourceLocation("skyblue:" + startPool)), config.maxDepth());
			JigsawPatternRegistry.func_244093_a();
			JigsawManager.IPieceFactory factory = AbstractVillagePiece::new;
			if (config.projectStartToHeightmap().isPresent()) {
				Rotation rotation = Rotation.randomRotation(rand);
				JigsawPiece element = jigsawConfig.func_242810_c().get().getRandomPiece(rand);
				MutableBoundingBox box = factory.create(structureManager, element, blockpos, element.getGroundLevelDelta(), rotation, element.getBoundingBox(structureManager, blockpos, rotation)).getBoundingBox();
				int i = (box.maxX + box.minX) / 2;
				int j = (box.maxZ + box.minZ) / 2;
				blockpos = new BlockPos(blockpos.getX(), blockpos.getY() + chunkGenerator.getNoiseHeight(i, j, config.projectStartToHeightmap().get()), blockpos.getZ());
			}
			JigsawManager.func_242837_a(registryAccess, jigsawConfig, factory, chunkGenerator, structureManager, blockpos, this.components, this.rand, false, false);
			this.recalculateStructureSize();
		}
	}
}