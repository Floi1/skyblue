
package net.skyblue.block;

import net.skyblue.procedure.ProcedureGreenEntityCollidesInTheBlock;
import net.skyblue.creativetab.TabSkyblue;
import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import java.util.Map;
import java.util.HashMap;

@ElementsSkyblueMod.ModElement.Tag
public class BlockGreen extends ElementsSkyblueMod.ModElement {
	@GameRegistry.ObjectHolder("skyblue:green")
	public static final Block block = null;
	public BlockGreen(ElementsSkyblueMod instance) {
		super(instance, 174);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("green"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("skyblue:green", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("green");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 1);
			setHardness(11F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabSkyblue.tab);
		}

		@Override
		public void onEntityWalk(World world, BlockPos pos, Entity entity) {
			super.onEntityWalk(world, pos, entity);
			int x = pos.getX();
			int y = pos.getY();
			int z = pos.getZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedureGreenEntityCollidesInTheBlock.executeProcedure($_dependencies);
			}
		}
	}
}
