
package net.skyblue.world.biome;

import net.skyblue.block.BlockDD2;
import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;

import java.util.Random;

@ElementsSkyblueMod.ModElement.Tag
public class BiomeDR1 extends ElementsSkyblueMod.ModElement {
	@GameRegistry.ObjectHolder("skyblue:dr_1")
	public static final BiomeGenCustom biome = null;
	public BiomeDR1(ElementsSkyblueMod instance) {
		super(instance, 125);
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
			super(new Biome.BiomeProperties("DR 1").setRainfall(0.5F).setBaseHeight(-10F).setHeightVariation(0F).setTemperature(0.5F));
			setRegistryName("dr_1");
			topBlock = BlockDD2.block.getDefaultState();
			fillerBlock = BlockDD2.block.getDefaultState();
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
