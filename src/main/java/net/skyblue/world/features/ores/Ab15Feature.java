package net.skyblue.world.features.ores;

import net.skyblue.init.SkyblueModBlocks;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.IRuleTestType;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.OreFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import java.util.Set;
import java.util.Random;
import java.util.Arrays;

import com.mojang.serialization.Codec;

import com.google.common.collect.ImmutableSet;

public class Ab15Feature extends OreFeature {
	private static Ab15Feature INSTANCE = null;
	private static ConfiguredFeature<?, ?> CONFIGURED_FEATURE = null;

	public Ab15Feature() {
		super(OreFeatureConfig.CODEC);
	}

	public static Feature<?> feature() {
		INSTANCE = new Ab15Feature();
		CONFIGURED_FEATURE = INSTANCE.withConfiguration(new OreFeatureConfig(Ab15FeatureRuleTest.INSTANCE, SkyblueModBlocks.AB_15.get().getDefaultState(), 11)).withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(3, 3, 74 + 1))).square()
				.func_242731_b(5);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation("skyblue:ab_15"), CONFIGURED_FEATURE);
		return INSTANCE;
	}

	public static ConfiguredFeature<?, ?> configuredFeature() {
		if (CONFIGURED_FEATURE == null)
			feature();
		return CONFIGURED_FEATURE;
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class Ab15FeatureRuleTest extends RuleTest {
		static final Ab15FeatureRuleTest INSTANCE = new Ab15FeatureRuleTest();
		private static final Codec<Ab15FeatureRuleTest> CODEC = Codec.unit(() -> INSTANCE);
		private static final IRuleTestType<Ab15FeatureRuleTest> CUSTOM_MATCH = () -> CODEC;

		@SubscribeEvent
		public static void init(FMLCommonSetupEvent event) {
			Registry.register(Registry.RULE_TEST, new ResourceLocation("skyblue:ab_15_match"), CUSTOM_MATCH);
		}

		@Override
		public boolean test(BlockState blockstate, Random random) {
			return Arrays.asList(Blocks.GLASS).contains(blockstate.getBlock());
		}

		@Override
		protected IRuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}

	public static final Set<ResourceLocation> GENERATE_BIOMES = ImmutableSet.of(new ResourceLocation("skyblue:ar_1"));
}