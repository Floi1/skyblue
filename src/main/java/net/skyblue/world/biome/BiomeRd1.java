
package net.skyblue.world.biome;

import net.skyblue.block.BlockNineeight;
import net.skyblue.block.BlockFourtwo;
import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;

import java.util.Random;

@ElementsSkyblueMod.ModElement.Tag
public class BiomeRd1 extends ElementsSkyblueMod.ModElement {
	@GameRegistry.ObjectHolder("skyblue:rd_1")
	public static final BiomeGenCustom biome = null;
	public BiomeRd1(ElementsSkyblueMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.biomes.add(() -> new BiomeGenCustom());
	}

	@Override
	public void init(FMLInitializationEvent event) {
	}
	static class BiomeGenCustom extends Biome {
		public BiomeGenCustom() {
			super(new Biome.BiomeProperties("Rd 1").setRainfall(0.5F).setBaseHeight(1F).setHeightVariation(0.3F).setTemperature(0.5F));
			setRegistryName("rd_1");
			topBlock = BlockFourtwo.block.getDefaultState();
			fillerBlock = BlockNineeight.block.getDefaultState();
			decorator.treesPerChunk = 1;
			decorator.flowersPerChunk = 4;
			decorator.grassPerChunk = 4;
			decorator.mushroomsPerChunk = 0;
			decorator.bigMushroomsPerChunk = 0;
			decorator.reedsPerChunk = 0;
			decorator.cactiPerChunk = 0;
			decorator.sandPatchesPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;
			this.spawnableMonsterList.clear();
			this.spawnableCreatureList.clear();
			this.spawnableWaterCreatureList.clear();
			this.spawnableCaveCreatureList.clear();
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return super.getRandomTreeFeature(rand);
		}
	}
}
