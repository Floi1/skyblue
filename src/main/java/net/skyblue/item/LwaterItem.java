package net.skyblue.item;

import net.skyblue.init.SkyblueModTabs;
import net.skyblue.init.SkyblueModFluids;

import net.minecraftforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.minecraftforge.common.capabilities.ICapabilityProvider;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BucketItem;

import javax.annotation.Nullable;

public class LwaterItem extends BucketItem {
	public LwaterItem() {
		super(SkyblueModFluids.LWATER, new Item.Properties().containerItem(Items.BUCKET).maxStackSize(1).group(SkyblueModTabs.TAB_SKYBLUE)

		);
	}

	@Override
	public ICapabilityProvider initCapabilities(ItemStack stack, @Nullable CompoundNBT nbt) {
		return new FluidBucketWrapper(stack);
	}
}