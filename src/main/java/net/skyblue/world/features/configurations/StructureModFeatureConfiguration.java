package net.skyblue.world.features.configurations;

import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.util.ResourceLocation;
import net.minecraft.block.BlockState;

import java.util.function.Function;
import java.util.List;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Codec;

public class StructureModFeatureConfiguration implements IFeatureConfig {
	public static final Codec<StructureModFeatureConfiguration> CODEC = RecordCodecBuilder.create(builder -> {
		return builder.group(ResourceLocation.CODEC.fieldOf("structure").forGetter(config -> {
			return config.structure;
		}), Codec.BOOL.fieldOf("random_rotation").orElse(false).forGetter(config -> {
			return config.randomRotation;
		}), Codec.BOOL.fieldOf("random_mirror").orElse(false).forGetter(config -> {
			return config.randomMirror;
		}), BlockState.CODEC.listOf().fieldOf("ignored_blocks").forGetter(config -> {
			return config.ignoredBlocks;
		}), Vector3i.CODEC.flatXmap(checkOffsetAxes(48), checkOffsetAxes(48)).optionalFieldOf("offset", Vector3i.NULL_VECTOR).forGetter(config -> {
			return config.offset;
		})).apply(builder, StructureModFeatureConfiguration::new);
	});
	public final ResourceLocation structure;
	public final boolean randomRotation;
	public final boolean randomMirror;
	public final List<BlockState> ignoredBlocks;
	public final Vector3i offset;

	public StructureModFeatureConfiguration(ResourceLocation structure, boolean randomRotation, boolean randomMirror, List<BlockState> ignoredBlocks, Vector3i offset) {
		this.structure = structure;
		this.randomRotation = randomRotation;
		this.randomMirror = randomMirror;
		this.ignoredBlocks = ignoredBlocks;
		this.offset = offset;
	}

	private static Function<Vector3i, DataResult<Vector3i>> checkOffsetAxes(int distance) {
		return vec3i -> Math.abs(vec3i.getX()) < distance && Math.abs(vec3i.getY()) < distance && Math.abs(vec3i.getZ()) < distance ? DataResult.success(vec3i) : DataResult.error("Position out of range, expected at most " + distance + ": " + vec3i);
	}
}