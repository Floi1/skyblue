
package net.skyblue.block;

import net.skyblue.procedure.ProcedureSevenzeroEntityWalksOnTheBlock;
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
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import java.util.Map;
import java.util.HashMap;

@ElementsSkyblueMod.ModElement.Tag
public class BlockSevenzero extends ElementsSkyblueMod.ModElement {
	@GameRegistry.ObjectHolder("skyblue:sevenzero")
	public static final Block block = null;
	public BlockSevenzero(ElementsSkyblueMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("sevenzero"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("skyblue:sevenzero", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("sevenzero");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 3);
			setHardness(111F);
			setResistance(110F);
			setLightLevel(0.466666666667F);
			setLightOpacity(0);
			setCreativeTab(TabSkyblue.tab);
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
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
				ProcedureSevenzeroEntityWalksOnTheBlock.executeProcedure($_dependencies);
			}
		}
	}
}
