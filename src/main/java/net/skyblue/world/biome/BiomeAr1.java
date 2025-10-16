
package net.skyblue.world.biome;

import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.init.Blocks;

import java.util.Random;

@ElementsSkyblueMod.ModElement.Tag
public class BiomeAr1 extends ElementsSkyblueMod.ModElement {
	@GameRegistry.ObjectHolder("skyblue:ar_1")
	public static final BiomeGenCustom biome = null;
	public BiomeAr1(ElementsSkyblueMod instance) {
		super(instance, 80);
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
			super(new Biome.BiomeProperties("Ar 1").setRainfall(0.5F).setBaseHeight(-0.2F).setHeightVariation(0.1F).setTemperature(0.5F));
			setRegistryName("ar_1");
			topBlock = Blocks.GLASS.getDefaultState();
			fillerBlock = Blocks.GLASS.getDefaultState();
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
