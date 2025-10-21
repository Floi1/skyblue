
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
public class BlockGreen4 extends ElementsSkyblueMod.ModElement {
	@GameRegistry.ObjectHolder("skyblue:green_4")
	public static final Block block = null;
	public BlockGreen4(ElementsSkyblueMod instance) {
		super(instance, 192);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("green_4"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("skyblue:green_4", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("green_4");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 1);
			setHardness(11F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabSkyblue.tab);
		}
	}
}
