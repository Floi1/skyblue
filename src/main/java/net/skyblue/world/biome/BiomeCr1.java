
package net.skyblue.world.biome;

import net.skyblue.block.BlockTwofour;
import net.skyblue.block.BlockTwofivesix;
import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;

import java.util.Random;

@ElementsSkyblueMod.ModElement.Tag
public class BiomeCr1 extends ElementsSkyblueMod.ModElement {
	@GameRegistry.ObjectHolder("skyblue:cr_1")
	public static final BiomeGenCustom biome = null;
	public BiomeCr1(ElementsSkyblueMod instance) {
		super(instance, 32);
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
			super(new Biome.BiomeProperties("Cr 1").setRainfall(0.5F).setBaseHeight(-0.2F).setHeightVariation(0.1F).setTemperature(0.5F));
			setRegistryName("cr_1");
			topBlock = BlockTwofour.block.getDefaultState();
			fillerBlock = BlockTwofivesix.block.getDefaultState();
			decorator.treesPerChunk = 0;
			decorator.flowersPerChunk = 0;
			decorator.grassPerChunk = 0;
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
