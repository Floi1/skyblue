/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skyblue.init;

import net.skyblue.block.*;
import net.skyblue.SkyblueMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.NoteBlockEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.state.properties.NoteBlockInstrument;
import net.minecraft.block.Block;

@Mod.EventBusSubscriber
public class SkyblueModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SkyblueMod.MODID);
	public static final RegistryObject<Block> SIXTHREE;
	public static final RegistryObject<Block> SEVENZERO;
	public static final RegistryObject<Block> FOURTWO;
	public static final RegistryObject<Block> FOURTHREE;
	public static final RegistryObject<Block> NINEEIGHT;
	public static final RegistryObject<Block> NINE;
	public static final RegistryObject<Block> FOURNINE;
	public static final RegistryObject<Block> ONEZEROFIVE;
	public static final RegistryObject<Block> ONEFOURTWO;
	public static final RegistryObject<Block> ONETHREEFOUR;
	public static final RegistryObject<Block> ONETHREENOE;
	public static final RegistryObject<Block> ONEONETWO;
	public static final RegistryObject<Block> TWOFIVESIX;
	public static final RegistryObject<Block> TWOFOUR;
	public static final RegistryObject<Block> ONEZERONINE;
	public static final RegistryObject<Block> ONEFIVE;
	public static final RegistryObject<Block> AB_1;
	public static final RegistryObject<Block> AB_2;
	public static final RegistryObject<Block> AB_3;
	public static final RegistryObject<Block> AB_4;
	public static final RegistryObject<Block> AB_5;
	public static final RegistryObject<Block> AB_6;
	public static final RegistryObject<Block> AB_7;
	public static final RegistryObject<Block> AB_8;
	public static final RegistryObject<Block> AB_9;
	public static final RegistryObject<Block> AB_10;
	public static final RegistryObject<Block> AB_11;
	public static final RegistryObject<Block> AB_12;
	public static final RegistryObject<Block> AB_13;
	public static final RegistryObject<Block> AB_14;
	public static final RegistryObject<Block> AB_15;
	public static final RegistryObject<Block> AB_16;
	public static final RegistryObject<Block> AB_17;
	public static final RegistryObject<Block> AB_18;
	public static final RegistryObject<Block> AB_19;
	public static final RegistryObject<Block> AB_20;
	public static final RegistryObject<Block> AB_21;
	public static final RegistryObject<Block> AB_22;
	public static final RegistryObject<Block> AB_23;
	public static final RegistryObject<Block> AB_24;
	public static final RegistryObject<Block> ONETWONINE;
	public static final RegistryObject<Block> ABB;
	public static final RegistryObject<Block> DD_1;
	public static final RegistryObject<Block> DD_2;
	public static final RegistryObject<Block> D_1R;
	public static final RegistryObject<Block> EWATER;
	public static final RegistryObject<Block> EGRASS;
	public static final RegistryObject<Block> EDIRT;
	public static final RegistryObject<Block> ESTONE;
	public static final RegistryObject<Block> EE_1;
	public static final RegistryObject<Block> FT_1;
	public static final RegistryObject<Block> FRR_1;
	public static final RegistryObject<Block> FFR;
	public static final RegistryObject<Block> GREEN;
	public static final RegistryObject<Block> RED_1;
	public static final RegistryObject<Block> GG_1;
	public static final RegistryObject<Block> RED_2;
	public static final RegistryObject<Block> GREEN_2;
	public static final RegistryObject<Block> GG_2;
	public static final RegistryObject<Block> GREEN_3;
	public static final RegistryObject<Block> RED_3;
	public static final RegistryObject<Block> GG_3;
	public static final RegistryObject<Block> GREEN_4;
	public static final RegistryObject<Block> RED_4;
	public static final RegistryObject<Block> GG_4;
	public static final RegistryObject<Block> GG_5;
	public static final RegistryObject<Block> GREEN_5;
	public static final RegistryObject<Block> RED_5;
	public static final RegistryObject<Block> WATERH;
	public static final RegistryObject<Block> ONETWOFIVE;
	public static final RegistryObject<Block> MUSH_1;
	public static final RegistryObject<Block> BLUE_1;
	public static final RegistryObject<Block> BLUE_2;
	public static final RegistryObject<Block> BLUE_3;
	public static final RegistryObject<Block> BLUE_4;
	public static final RegistryObject<Block> BLUE_5;
	public static final RegistryObject<Block> TWOTHREETWO;
	public static final RegistryObject<Block> I_LOG;
	public static final RegistryObject<Block> I_WOOD;
	public static final RegistryObject<Block> I_PLANKS;
	public static final RegistryObject<Block> I_LEAVES;
	public static final RegistryObject<Block> I_STAIRS;
	public static final RegistryObject<Block> I_SLAB;
	public static final RegistryObject<Block> I_FENCE;
	public static final RegistryObject<Block> I_FENCE_GATE;
	public static final RegistryObject<Block> I_PRESSURE_PLATE;
	public static final RegistryObject<Block> I_BUTTON;
	public static final RegistryObject<Block> ICOBBLESTONE;
	public static final RegistryObject<Block> IDOORS;
	public static final RegistryObject<Block> ICOBBLESTONE_STAIRS;
	public static final RegistryObject<Block> IP;
	public static final RegistryObject<Block> JB_1;
	public static final RegistryObject<Block> JP;
	public static final RegistryObject<Block> JP_2;
	public static final RegistryObject<Block> JP_3;
	public static final RegistryObject<Block> JP_4;
	public static final RegistryObject<Block> JB_2SEVENONE;
	public static final RegistryObject<Block> KK_1;
	public static final RegistryObject<Block> KK_2;
	public static final RegistryObject<Block> KK_3;
	public static final RegistryObject<Block> KK_1_ONE_EIGHT_EIGHT;
	public static final RegistryObject<Block> K_KBRICK;
	public static final RegistryObject<Block> K_KFLOOR;
	public static final RegistryObject<Block> LL_1SNOW;
	public static final RegistryObject<Block> LL_1ROCK;
	public static final RegistryObject<Block> LWATER;
	public static final RegistryObject<Block> L_LOG;
	public static final RegistryObject<Block> L_WOOD;
	public static final RegistryObject<Block> L_PLANKS;
	public static final RegistryObject<Block> L_LEAVES;
	public static final RegistryObject<Block> L_STAIRS;
	public static final RegistryObject<Block> L_SLAB;
	public static final RegistryObject<Block> L_FENCE;
	public static final RegistryObject<Block> L_FENCE_GATE;
	public static final RegistryObject<Block> L_PRESSURE_PLATE;
	public static final RegistryObject<Block> L_BUTTON;
	public static final RegistryObject<Block> LSAP;
	public static final RegistryObject<Block> LW;
	public static final RegistryObject<Block> MMMMMMM;
	public static final RegistryObject<Block> MMP;
	public static final RegistryObject<Block> NNN;
	public static final RegistryObject<Block> NWATER;
	public static final RegistryObject<Block> NLOG;
	public static final RegistryObject<Block> NLOG_SLAB;
	public static final RegistryObject<Block> OC;
	public static final RegistryObject<Block> OPLATE_1;
	public static final RegistryObject<Block> OROCK_1;
	public static final RegistryObject<Block> OROCK_2;
	public static final RegistryObject<Block> OROCK_3;
	public static final RegistryObject<Block> OO;
	public static final RegistryObject<Block> O_CC;
	public static final RegistryObject<Block> PP;
	static {
		SIXTHREE = REGISTRY.register("sixthree", SixthreeBlock::new);
		SEVENZERO = REGISTRY.register("sevenzero", SevenzeroBlock::new);
		FOURTWO = REGISTRY.register("fourtwo", FourtwoBlock::new);
		FOURTHREE = REGISTRY.register("fourthree", FourthreeBlock::new);
		NINEEIGHT = REGISTRY.register("nineeight", NineeightBlock::new);
		NINE = REGISTRY.register("nine", NineBlock::new);
		FOURNINE = REGISTRY.register("fournine", FournineBlock::new);
		ONEZEROFIVE = REGISTRY.register("onezerofive", OnezerofiveBlock::new);
		ONEFOURTWO = REGISTRY.register("onefourtwo", OnefourtwoBlock::new);
		ONETHREEFOUR = REGISTRY.register("onethreefour", OnethreefourBlock::new);
		ONETHREENOE = REGISTRY.register("onethreenoe", OnethreenoeBlock::new);
		ONEONETWO = REGISTRY.register("oneonetwo", OneonetwoBlock::new);
		TWOFIVESIX = REGISTRY.register("twofivesix", TwofivesixBlock::new);
		TWOFOUR = REGISTRY.register("twofour", TwofourBlock::new);
		ONEZERONINE = REGISTRY.register("onezeronine", OnezeronineBlock::new);
		ONEFIVE = REGISTRY.register("onefive", OnefiveBlock::new);
		AB_1 = REGISTRY.register("ab_1", Ab1Block::new);
		AB_2 = REGISTRY.register("ab_2", Ab2Block::new);
		AB_3 = REGISTRY.register("ab_3", Ab3Block::new);
		AB_4 = REGISTRY.register("ab_4", Ab4Block::new);
		AB_5 = REGISTRY.register("ab_5", Ab5Block::new);
		AB_6 = REGISTRY.register("ab_6", Ab6Block::new);
		AB_7 = REGISTRY.register("ab_7", Ab7Block::new);
		AB_8 = REGISTRY.register("ab_8", Ab8Block::new);
		AB_9 = REGISTRY.register("ab_9", Ab9Block::new);
		AB_10 = REGISTRY.register("ab_10", Ab10Block::new);
		AB_11 = REGISTRY.register("ab_11", Ab11Block::new);
		AB_12 = REGISTRY.register("ab_12", Ab12Block::new);
		AB_13 = REGISTRY.register("ab_13", Ab13Block::new);
		AB_14 = REGISTRY.register("ab_14", Ab14Block::new);
		AB_15 = REGISTRY.register("ab_15", Ab15Block::new);
		AB_16 = REGISTRY.register("ab_16", Ab16Block::new);
		AB_17 = REGISTRY.register("ab_17", Ab17Block::new);
		AB_18 = REGISTRY.register("ab_18", Ab18Block::new);
		AB_19 = REGISTRY.register("ab_19", Ab19Block::new);
		AB_20 = REGISTRY.register("ab_20", Ab20Block::new);
		AB_21 = REGISTRY.register("ab_21", Ab21Block::new);
		AB_22 = REGISTRY.register("ab_22", Ab22Block::new);
		AB_23 = REGISTRY.register("ab_23", Ab23Block::new);
		AB_24 = REGISTRY.register("ab_24", Ab24Block::new);
		ONETWONINE = REGISTRY.register("onetwonine", OnetwonineBlock::new);
		ABB = REGISTRY.register("abb", AbbBlock::new);
		DD_1 = REGISTRY.register("dd_1", DD1Block::new);
		DD_2 = REGISTRY.register("dd_2", DD2Block::new);
		D_1R = REGISTRY.register("d_1r", D1rBlock::new);
		EWATER = REGISTRY.register("ewater", EwaterBlock::new);
		EGRASS = REGISTRY.register("egrass", EgrassBlock::new);
		EDIRT = REGISTRY.register("edirt", EdirtBlock::new);
		ESTONE = REGISTRY.register("estone", EstoneBlock::new);
		EE_1 = REGISTRY.register("ee_1", EE1Block::new);
		FT_1 = REGISTRY.register("ft_1", Ft1Block::new);
		FRR_1 = REGISTRY.register("frr_1", Frr1Block::new);
		FFR = REGISTRY.register("ffr", FfrBlock::new);
		GREEN = REGISTRY.register("green", GreenBlock::new);
		RED_1 = REGISTRY.register("red_1", Red1Block::new);
		GG_1 = REGISTRY.register("gg_1", GG1Block::new);
		RED_2 = REGISTRY.register("red_2", Red2Block::new);
		GREEN_2 = REGISTRY.register("green_2", Green2Block::new);
		GG_2 = REGISTRY.register("gg_2", GG2Block::new);
		GREEN_3 = REGISTRY.register("green_3", Green3Block::new);
		RED_3 = REGISTRY.register("red_3", Red3Block::new);
		GG_3 = REGISTRY.register("gg_3", GG3Block::new);
		GREEN_4 = REGISTRY.register("green_4", Green4Block::new);
		RED_4 = REGISTRY.register("red_4", Red4Block::new);
		GG_4 = REGISTRY.register("gg_4", GG4Block::new);
		GG_5 = REGISTRY.register("gg_5", GG5Block::new);
		GREEN_5 = REGISTRY.register("green_5", Green5Block::new);
		RED_5 = REGISTRY.register("red_5", Red5Block::new);
		WATERH = REGISTRY.register("waterh", WaterhBlock::new);
		ONETWOFIVE = REGISTRY.register("onetwofive", OnetwofiveBlock::new);
		MUSH_1 = REGISTRY.register("mush_1", Mush1Block::new);
		BLUE_1 = REGISTRY.register("blue_1", Blue1Block::new);
		BLUE_2 = REGISTRY.register("blue_2", Blue2Block::new);
		BLUE_3 = REGISTRY.register("blue_3", Blue3Block::new);
		BLUE_4 = REGISTRY.register("blue_4", Blue4Block::new);
		BLUE_5 = REGISTRY.register("blue_5", Blue5Block::new);
		TWOTHREETWO = REGISTRY.register("twothreetwo", TwothreetwoBlock::new);
		I_LOG = REGISTRY.register("i_log", ILogBlock::new);
		I_WOOD = REGISTRY.register("i_wood", IWoodBlock::new);
		I_PLANKS = REGISTRY.register("i_planks", IPlanksBlock::new);
		I_LEAVES = REGISTRY.register("i_leaves", ILeavesBlock::new);
		I_STAIRS = REGISTRY.register("i_stairs", IStairsBlock::new);
		I_SLAB = REGISTRY.register("i_slab", ISlabBlock::new);
		I_FENCE = REGISTRY.register("i_fence", IFenceBlock::new);
		I_FENCE_GATE = REGISTRY.register("i_fence_gate", IFenceGateBlock::new);
		I_PRESSURE_PLATE = REGISTRY.register("i_pressure_plate", IPressurePlateBlock::new);
		I_BUTTON = REGISTRY.register("i_button", IButtonBlock::new);
		ICOBBLESTONE = REGISTRY.register("icobblestone", IcobblestoneBlock::new);
		IDOORS = REGISTRY.register("idoors", IdoorsBlock::new);
		ICOBBLESTONE_STAIRS = REGISTRY.register("icobblestone_stairs", IcobblestoneStairsBlock::new);
		IP = REGISTRY.register("ip", IPBlock::new);
		JB_1 = REGISTRY.register("jb_1", Jb1Block::new);
		JP = REGISTRY.register("jp", JpBlock::new);
		JP_2 = REGISTRY.register("jp_2", Jp2Block::new);
		JP_3 = REGISTRY.register("jp_3", Jp3Block::new);
		JP_4 = REGISTRY.register("jp_4", Jp4Block::new);
		JB_2SEVENONE = REGISTRY.register("jb_2sevenone", JB2sevenoneBlock::new);
		KK_1 = REGISTRY.register("kk_1", Kk1Block::new);
		KK_2 = REGISTRY.register("kk_2", Kk2Block::new);
		KK_3 = REGISTRY.register("kk_3", Kk3Block::new);
		KK_1_ONE_EIGHT_EIGHT = REGISTRY.register("kk_1_one_eight_eight", KK1BBlock::new);
		K_KBRICK = REGISTRY.register("k_kbrick", KKbrickBlock::new);
		K_KFLOOR = REGISTRY.register("k_kfloor", KKfloorBlock::new);
		LL_1SNOW = REGISTRY.register("ll_1snow", LL1snowBlock::new);
		LL_1ROCK = REGISTRY.register("ll_1rock", LL1rockBlock::new);
		LWATER = REGISTRY.register("lwater", LwaterBlock::new);
		L_LOG = REGISTRY.register("l_log", LLogBlock::new);
		L_WOOD = REGISTRY.register("l_wood", LWoodBlock::new);
		L_PLANKS = REGISTRY.register("l_planks", LPlanksBlock::new);
		L_LEAVES = REGISTRY.register("l_leaves", LLeavesBlock::new);
		L_STAIRS = REGISTRY.register("l_stairs", LStairsBlock::new);
		L_SLAB = REGISTRY.register("l_slab", LSlabBlock::new);
		L_FENCE = REGISTRY.register("l_fence", LFenceBlock::new);
		L_FENCE_GATE = REGISTRY.register("l_fence_gate", LFenceGateBlock::new);
		L_PRESSURE_PLATE = REGISTRY.register("l_pressure_plate", LPressurePlateBlock::new);
		L_BUTTON = REGISTRY.register("l_button", LButtonBlock::new);
		LSAP = REGISTRY.register("lsap", LsapBlock::new);
		LW = REGISTRY.register("lw", LwBlock::new);
		MMMMMMM = REGISTRY.register("mmmmmmm", MmmmmmmBlock::new);
		MMP = REGISTRY.register("mmp", MmpBlock::new);
		NNN = REGISTRY.register("nnn", NnnBlock::new);
		NWATER = REGISTRY.register("nwater", NwaterBlock::new);
		NLOG = REGISTRY.register("nlog", NlogBlock::new);
		NLOG_SLAB = REGISTRY.register("nlog_slab", NlogsideBlock::new);
		OC = REGISTRY.register("oc", OCBlock::new);
		OPLATE_1 = REGISTRY.register("oplate_1", Oplate1Block::new);
		OROCK_1 = REGISTRY.register("orock_1", Orock1Block::new);
		OROCK_2 = REGISTRY.register("orock_2", Orock2Block::new);
		OROCK_3 = REGISTRY.register("orock_3", Orock3Block::new);
		OO = REGISTRY.register("oo", OoBlock::new);
		O_CC = REGISTRY.register("o_cc", OCcBlock::new);
		PP = REGISTRY.register("pp", PpBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SevenzeroBlock.registerRenderLayer();
			FourtwoBlock.registerRenderLayer();
			FourthreeBlock.registerRenderLayer();
			NineeightBlock.registerRenderLayer();
			OneonetwoBlock.registerRenderLayer();
			OnetwonineBlock.registerRenderLayer();
			AbbBlock.registerRenderLayer();
			D1rBlock.registerRenderLayer();
			FfrBlock.registerRenderLayer();
			Mush1Block.registerRenderLayer();
			TwothreetwoBlock.registerRenderLayer();
			ILeavesBlock.registerRenderLayer();
			IdoorsBlock.registerRenderLayer();
			IPBlock.registerRenderLayer();
			JpBlock.registerRenderLayer();
			Jp2Block.registerRenderLayer();
			Jp3Block.registerRenderLayer();
			Jp4Block.registerRenderLayer();
			JB2sevenoneBlock.registerRenderLayer();
			LLeavesBlock.registerRenderLayer();
			LwBlock.registerRenderLayer();
			NlogsideBlock.registerRenderLayer();
			Oplate1Block.registerRenderLayer();
			Orock1Block.registerRenderLayer();
			Orock2Block.registerRenderLayer();
			Orock3Block.registerRenderLayer();
			OoBlock.registerRenderLayer();
		}
	}

	@SubscribeEvent
	public static void onNoteBlockPlay(NoteBlockEvent.Play event) {
		Block below = event.getWorld().getBlockState(event.getPos().down()).getBlock();
		if (below == SkyblueModBlocks.SIXTHREE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.FOURTWO.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.NINEEIGHT.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.NINE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.FOURNINE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.ONEZEROFIVE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.ONEFOURTWO.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.ONETHREEFOUR.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.ONETHREENOE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.TWOFIVESIX.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.TWOFOUR.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.ONEZERONINE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.ONEFIVE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_1.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_2.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_3.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_4.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_5.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_6.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_7.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_8.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_9.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_10.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_11.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_12.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_13.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_14.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_15.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_16.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_17.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_18.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_19.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_20.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_21.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_22.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_23.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.AB_24.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.ABB.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.DD_1.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.DD_2.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.D_1R.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.ESTONE.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.EE_1.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.FRR_1.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.FFR.get()) {
			event.setInstrument(NoteBlockInstrument.BASEDRUM);
		} else if (below == SkyblueModBlocks.MMMMMMM.get()) {
			event.setInstrument(NoteBlockInstrument.SNARE);
		} else if (below == SkyblueModBlocks.MMP.get()) {
			event.setInstrument(NoteBlockInstrument.SNARE);
		}
	}
}