package net.skyblue.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.RegistryKey;
import net.minecraft.potion.EffectInstance;
import net.minecraft.network.play.server.SPlayerAbilitiesPacket;
import net.minecraft.network.play.server.SPlaySoundEventPacket;
import net.minecraft.network.play.server.SPlayEntityEffectPacket;
import net.minecraft.network.play.server.SChangeGameStatePacket;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

public class SkykeyRightClickedInAirProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
			RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:i_1"));
			if (((ServerPlayerEntity) entity).world.getDimensionKey() == destinationType)
				return;
			ServerWorld nextWorld = ((ServerPlayerEntity) entity).getServer().getWorld(destinationType);
			if (nextWorld != null) {
				((ServerPlayerEntity) entity).connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field_241768_e_, 0));
				((ServerPlayerEntity) entity).teleport(nextWorld, ((ServerPlayerEntity) entity).getPosX(), ((ServerPlayerEntity) entity).getPosY(), ((ServerPlayerEntity) entity).getPosZ(), ((ServerPlayerEntity) entity).rotationYaw,
						((ServerPlayerEntity) entity).rotationPitch);
				((ServerPlayerEntity) entity).connection.sendPacket(new SPlayerAbilitiesPacket(((ServerPlayerEntity) entity).abilities));
				for (EffectInstance effectinstance : ((ServerPlayerEntity) entity).getActivePotionEffects())
					((ServerPlayerEntity) entity).connection.sendPacket(new SPlayEntityEffectPacket(((ServerPlayerEntity) entity).getEntityId(), effectinstance));
				((ServerPlayerEntity) entity).connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
			}
		}
	}
}