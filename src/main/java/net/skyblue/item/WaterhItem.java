package net.skyblue.item;

import net.skyblue.init.SkyblueModTabs;
import net.skyblue.init.SkyblueModFluids;

import net.minecraft.item.Items;
import net.minecraft.item.Item;
import net.minecraft.item.BucketItem;

public class WaterhItem extends BucketItem {
	public WaterhItem() {
		super(SkyblueModFluids.WATERH, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(SkyblueModTabs.TAB_SKYBLUE)

		);
	}
}