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

public class SkyPlayerEntersDimensionProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.01) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:rdr_1"));
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
		} else if (Math.random() <= 0.02) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:b_1"));
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
		} else if (Math.random() <= 0.03) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:c_1"));
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
		} else if (Math.random() <= 0.04) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:a_1"));
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
		} else if (Math.random() <= 0.05) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:d_1"));
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
		} else if (Math.random() <= 0.06) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:e_1"));
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
		} else if (Math.random() <= 0.06) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:f_1"));
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
		} else if (Math.random() <= 0.07) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:g_1"));
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
		} else if (Math.random() <= 0.08) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:g_2"));
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
		} else if (Math.random() <= 0.09) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:g_3"));
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
		} else if (Math.random() <= 0.1) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:g_4"));
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
		} else if (Math.random() <= 0.11) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:g_5"));
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
		} else if (Math.random() <= 0.12) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:h_1"));
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
		} else if (Math.random() <= 0.13) {
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
		} else if (Math.random() <= 0.14) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:j_1"));
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
		} else if (Math.random() <= 0.15) {
			if (entity instanceof ServerPlayerEntity && !((ServerPlayerEntity) entity).world.isRemote()) {
				RegistryKey<World> destinationType = RegistryKey.getOrCreateKey(Registry.WORLD_KEY, new ResourceLocation("skyblue:k_1"));
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
}