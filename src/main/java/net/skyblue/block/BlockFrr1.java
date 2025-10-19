
package net.skyblue.block;

import net.skyblue.world.WorldF1;
import net.skyblue.creativetab.TabSkyblue;
import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import java.util.Random;

@ElementsSkyblueMod.ModElement.Tag
public class BlockFrr1 extends ElementsSkyblueMod.ModElement {
	@GameRegistry.ObjectHolder("skyblue:frr_1")
	public static final Block block = null;
	public BlockFrr1(ElementsSkyblueMod instance) {
		super(instance, 170);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("frr_1"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("skyblue:frr_1", "inventory"));
	}

	@Override
	public void generateWorld(Random random, int chunkX, int chunkZ, World world, int dimID, IChunkGenerator cg, IChunkProvider cp) {
		boolean dimensionCriteria = false;
		if (dimID == WorldF1.DIMID)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return;
		for (int i = 0; i < 32; i++) {
			int x = chunkX + random.nextInt(16);
			int y = random.nextInt(82) + 3;
			int z = chunkZ + random.nextInt(16);
			(new WorldGenMinable(block.getDefaultState(), 32, new com.google.common.base.Predicate<IBlockState>() {
				public boolean apply(IBlockState blockAt) {
					boolean blockCriteria = false;
					IBlockState require;
					if (blockAt.getBlock() == BlockFt1.block.getDefaultState().getBlock())
						blockCriteria = true;
					return blockCriteria;
				}
			})).generate(world, random, new BlockPos(x, y, z));
		}
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("frr_1");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 1);
			setHardness(111F);
			setResistance(110F);
			setLightLevel(0.8F);
			setLightOpacity(255);
			setCreativeTab(TabSkyblue.tab);
		}
	}
}
