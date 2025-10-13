
package net.skyblue.world.biome;

import net.skyblue.block.BlockSixthree;
import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.biome.Biome;
import net.minecraft.util.math.BlockPos;

import java.util.Random;

@ElementsSkyblueMod.ModElement.Tag
public class BiomePlain extends ElementsSkyblueMod.ModElement {
	@GameRegistry.ObjectHolder("skyblue:plain")
	public static final BiomeGenCustom biome = null;
	public BiomePlain(ElementsSkyblueMod instance) {
		super(instance, 3);
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
			super(new Biome.BiomeProperties("Plain").setRainfall(0.5F).setBaseHeight(0F).setWaterColor(-10027162).setHeightVariation(0F)
					.setTemperature(0.5F));
			setRegistryName("plain");
			topBlock = BlockSixthree.block.getDefaultState();
			fillerBlock = BlockSixthree.block.getDefaultState();
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

		@SideOnly(Side.CLIENT)
		@Override
		public int getGrassColorAtPos(BlockPos pos) {
			return -10027162;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getFoliageColorAtPos(BlockPos pos) {
			return -10027162;
		}

		@SideOnly(Side.CLIENT)
		@Override
		public int getSkyColorByTemp(float currentTemperature) {
			return -10027162;
		}

		@Override
		public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
			return BIG_TREE_FEATURE;
		}
	}
}
