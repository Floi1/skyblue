
package net.skyblue.creativetab;

import net.skyblue.block.BlockSixthree;
import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@ElementsSkyblueMod.ModElement.Tag
public class TabSkyblue extends ElementsSkyblueMod.ModElement {
	public TabSkyblue(ElementsSkyblueMod instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabskyblue") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(BlockSixthree.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
