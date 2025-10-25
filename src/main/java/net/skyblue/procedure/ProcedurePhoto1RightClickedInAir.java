package net.skyblue.procedure;

import net.skyblue.gui.GuiFace1;
import net.skyblue.SkyblueMod;
import net.skyblue.ElementsSkyblueMod;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsSkyblueMod.ModElement.Tag
public class ProcedurePhoto1RightClickedInAir extends ElementsSkyblueMod.ModElement {
	public ProcedurePhoto1RightClickedInAir(ElementsSkyblueMod instance) {
		super(instance, 220);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Photo1RightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure Photo1RightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure Photo1RightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure Photo1RightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure Photo1RightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(SkyblueMod.instance, GuiFace1.GUIID, world, x, y, z);
	}
}
