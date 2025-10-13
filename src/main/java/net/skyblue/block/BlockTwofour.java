
package net.skyblue.block;

import net.skyblue.creativetab.TabSkyblue;
import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

@ElementsSkyblueMod.ModElement.Tag
public class BlockTwofour extends ElementsSkyblueMod.ModElement {
	@GameRegistry.ObjectHolder("skyblue:twofour")
	public static final Block block = null;
	public BlockTwofour(ElementsSkyblueMod instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("twofour"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("skyblue:twofour", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.ROCK);
			setUnlocalizedName("twofour");
			setSoundType(SoundType.STONE);
			setHarvestLevel("pickaxe", 3);
			setHardness(111F);
			setResistance(110F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabSkyblue.tab);
		}
	}
}
