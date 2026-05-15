package net.skyblue.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;

public class Orock1OnBlockRightClickedProcedure {
	public static void execute(IWorld world, double x, double y, double z) {
		if (Math.random() <= 0.1) {
			if (world instanceof World) {
				if (!((World) world).isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("skyblue:o6")), SoundCategory.NEUTRAL, 1, 1);
				} else {
					((World) world).playSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("skyblue:o6")), SoundCategory.NEUTRAL, 1, 1, false);
				}
			}
		} else if (Math.random() <= 0.2) {
			if (world instanceof World) {
				if (!((World) world).isRemote()) {
					((World) world).playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("skyblue:o5")), SoundCategory.NEUTRAL, 1, 1);
				} else {
					((World) world).playSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("skyblue:o5")), SoundCategory.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}