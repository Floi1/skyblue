
package net.skyblue.itemgroup;

import net.skyblue.block.SixthreeBlock;
import net.skyblue.SkyblueModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@SkyblueModElements.ModElement.Tag
public class SkyblueItemGroup extends SkyblueModElements.ModElement {
	public SkyblueItemGroup(SkyblueModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabskyblue") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(SixthreeBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
