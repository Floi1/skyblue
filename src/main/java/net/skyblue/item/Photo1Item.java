package net.skyblue.item;

import net.skyblue.procedures.Photo1RightClickedInAirProcedure;
import net.skyblue.init.SkyblueModTabs;

import net.minecraft.world.World;
import net.minecraft.util.Hand;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.ActionResult;
import net.minecraft.item.UseAction;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;

public class Photo1Item extends Item {
	public Photo1Item() {
		super(new Item.Properties().group(SkyblueModTabs.TAB_SKYBLUE));
	}

	@Override
	public UseAction getUseAction(ItemStack itemstack) {
		return UseAction.EAT;
	}

	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity entity, Hand hand) {
		ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
		Photo1RightClickedInAirProcedure.execute(world, entity.getPosX(), entity.getPosY(), entity.getPosZ(), entity);
		return ar;
	}

	@Override
	public ActionResultType onItemUseFirst(ItemStack itemstack, ItemUseContext context) {
		super.onItemUseFirst(itemstack, context);
		Photo1RightClickedInAirProcedure.execute(context.getWorld(), context.getPos().getX(), context.getPos().getY(), context.getPos().getZ(), context.getPlayer());
		return ActionResultType.SUCCESS;
	}

	@Override
	public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
		boolean retval = super.onEntitySwing(itemstack, entity);
		Photo1RightClickedInAirProcedure.execute(entity.world, entity.getPosX(), entity.getPosY(), entity.getPosZ(), entity);
		return retval;
	}
}