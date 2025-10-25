package net.skyblue.world.features;

import net.minecraft.state.IntegerProperty;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.BooleanProperty;
import net.minecraft.block.BlockState;

public final class SkyblueModFeatureUtils {
	protected static BlockState addProperty(BlockState block, String propr, boolean bool) {
		if (block.getBlock().getStateContainer().getProperty(propr) instanceof BooleanProperty)
			return block.with((BooleanProperty) block.getBlock().getStateContainer().getProperty(propr), bool);
		return block;
	}

	protected static BlockState addProperty(BlockState block, String propr, int num) {
		if (block.getBlock().getStateContainer().getProperty(propr) instanceof IntegerProperty && ((IntegerProperty) block.getBlock().getStateContainer().getProperty(propr)).getAllowedValues().contains(num))
			return block.with((IntegerProperty) block.getBlock().getStateContainer().getProperty(propr), num);
		return block;
	}

	protected static BlockState addProperty(BlockState block, String propr, String str) {
		if (block.getBlock().getStateContainer().getProperty(propr) instanceof EnumProperty && ((EnumProperty) block.getBlock().getStateContainer().getProperty(propr)).parseValue(str).isPresent())
			return block.with((EnumProperty) block.getBlock().getStateContainer().getProperty(propr), (Enum) ((EnumProperty) block.getBlock().getStateContainer().getProperty(propr)).parseValue(str).get());
		return block;
	}
}