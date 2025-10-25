/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skyblue.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

public class SkyblueModTabs {
	public static ItemGroup TAB_SKYBLUE;

	public static void load() {
		TAB_SKYBLUE = new ItemGroup("skyblue.skyblue") {
			@Override
			@OnlyIn(Dist.CLIENT)
			public ItemStack createIcon() {
				return new ItemStack(SkyblueModBlocks.SIXTHREE.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}