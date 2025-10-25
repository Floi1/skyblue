package net.skyblue.world.features;

import net.skyblue.world.features.configurations.StructureModFeatureConfiguration;
import net.skyblue.SkyblueMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.world.gen.feature.template.TemplateManager;
import net.minecraft.world.gen.feature.template.Template;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.BlockIgnoreStructureProcessor;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.ISeedReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Rotation;
import net.minecraft.util.Mirror;
import net.minecraft.block.BlockState;

import java.util.stream.Collectors;
import java.util.Random;

import com.mojang.serialization.Codec;

@Mod.EventBusSubscriber
public class StructureModFeature extends Feature<StructureModFeatureConfiguration> {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SkyblueMod.MODID);
	public static final RegistryObject<Feature<?>> STRUCTURE_FEATURE = REGISTRY.register("structure_feature", () -> new StructureModFeature(StructureModFeatureConfiguration.CODEC));

	public StructureModFeature(Codec<StructureModFeatureConfiguration> codec) {
		super(codec);
	}

	@Override
	public boolean generate(ISeedReader world, ChunkGenerator generator, Random random, BlockPos pos, StructureModFeatureConfiguration config) {
		Rotation rotation = config.randomRotation ? Rotation.randomRotation(random) : Rotation.NONE;
		Mirror mirror = config.randomMirror ? Mirror.values()[random.nextInt(2)] : Mirror.NONE;
		// Load the structure template
		TemplateManager structureManager = world.getWorld().getStructureTemplateManager();
		Template template = structureManager.getTemplateDefaulted(config.structure);
		PlacementSettings placeSettings = (new PlacementSettings()).setRotation(rotation).setMirror(mirror).setRandom(random).setIgnoreEntities(false)
				.addProcessor(new BlockIgnoreStructureProcessor(config.ignoredBlocks.stream().map(BlockState::getBlock).collect(Collectors.toList())));
		BlockPos placePos = pos.add(Template.transformedBlockPos(placeSettings, new BlockPos(config.offset)));
		template.func_237146_a_(world, placePos, placePos, placeSettings, random, 2);
		return true;
	}
}