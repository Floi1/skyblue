package net.skyblue.item;

import net.skyblue.procedures.NormalskyRightClickedInAirProcedure;
import net.skyblue.init.SkyblueModTabs;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResult;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;

public class NormalskyItem extends Item {
	public NormalskyItem() {
		super(new Item.Properties().group(SkyblueModTabs.TAB_SKYBLUE));
	}

	@Override
	public UseAction getUseAction(ItemStack itemstack) {
		return UseAction.EAT;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
		ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
		NormalskyRightClickedInAirProcedure.execute(entity);
		return ar;
	}
}