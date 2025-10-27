package net.skyblue.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

public class JB2sevenoneEntityWalksOnTheBlockProcedure {
	public static void execute(IWorld world, Entity entity) {
		if (entity == null)
			return;
		entity.attackEntityFrom(DamageSource.GENERIC, 1);
		entity.setMotionMultiplier(Blocks.AIR.getDefaultState(), new Vector3d(0.25, 0.05, 0.25));
	}
}