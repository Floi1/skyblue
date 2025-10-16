
package net.skyblue.util;

import net.skyblue.block.BlockAglass;
import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

@ElementsSkyblueMod.ModElement.Tag
public class OreDictGlass extends ElementsSkyblueMod.ModElement {
	public OreDictGlass(ElementsSkyblueMod instance) {
		super(instance, 94);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		OreDictionary.registerOre("glass", new ItemStack(BlockAglass.block, (int) (1)));
	}
}
