package net.skyblue.item;

import net.skyblue.procedures.Shard14EntitySwingsItemProcedure;
import net.skyblue.init.SkyblueModTabs;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.LivingEntity;

public class Shard14Item extends Item {
	public Shard14Item() {
		super(new Item.Properties().group(SkyblueModTabs.TAB_SKYBLUE).rarity(Rarity.UNCOMMON));
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		Shard14EntitySwingsItemProcedure.execute(entity.world, entity.getPosX(), entity.getPosY(), entity.getPosZ());
		return retval;
	}
}