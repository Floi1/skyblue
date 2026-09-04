package net.skyblue.world.structures.configurations;

import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.util.math.MathHelper;

import java.util.Random;
import java.util.Optional;

import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.Codec;

public class StructureConfiguration implements IFeatureConfig {
	private final int maxDepth;
	private final StructureConfiguration.Height startHeight;
	private final Optional<Heightmap.Type> projectStartToHeightmap;
	private final int maxDistanceFromCenter;

	public StructureConfiguration(int maxDepth, StructureConfiguration.Height startHeight, Optional<Heightmap.Type> projectStartToHeightmap, int maxDistanceFromCenter) {
		this.maxDepth = maxDepth;
		this.startHeight = startHeight;
		this.projectStartToHeightmap = projectStartToHeightmap;
		this.maxDistanceFromCenter = maxDistanceFromCenter;
	}

	public int maxDepth() {
		return maxDepth;
	}

	public StructureConfiguration.Height startHeight() {
		return startHeight;
	}

	public Optional<Heightmap.Type> projectStartToHeightmap() {
		return projectStartToHeightmap;
	}

	public int maxDistanceFromCenter() {
		return maxDistanceFromCenter;
	}

	public static final Codec<StructureConfiguration> CODEC = RecordCodecBuilder.create(builder -> {
		return builder.group(Codec.intRange(0, 7).fieldOf("size").forGetter(config -> {
			return config.maxDepth();
		}), StructureConfiguration.Height.CODEC.fieldOf("start_height").forGetter(config -> {
			return config.startHeight();
		}), Heightmap.Type.CODEC.optionalFieldOf("project_start_to_heightmap").forGetter(config -> {
			return config.projectStartToHeightmap();
		}), Codec.intRange(1, 128).fieldOf("max_distance_from_center").forGetter(config -> {
			return config.maxDistanceFromCenter();
		})).apply(builder, StructureConfiguration::new);
	});

	public static class Height {
		protected final int min;
		protected final int max;

		protected Height(int min, int max) {
			this.min = min;
			this.max = max;
		}

		public static final Codec<Height> CODEC = RecordCodecBuilder
				.create(instance -> instance.group(Codec.INT.fieldOf("min_inclusive").forGetter(height -> height.min), Codec.INT.fieldOf("max_inclusive").forGetter(height -> height.max)).apply(instance, Height::new));

		public int sample(Random random) {
			return 0;
		}
	}

	public static class UniformHeight extends Height {
		public static UniformHeight of(int min, int max) {
			return new UniformHeight(min, max);
		}

		private UniformHeight(int min, int max) {
			super(min, max);
		}

		public int sample(Random random) {
			if (min > max) {
				return min;
			} else {
				return random.nextInt(max - min + 1) + min;
			}
		}
	}

	public static class BiasedToBottomHeight extends Height {
		public static BiasedToBottomHeight of(int min, int max) {
			return new BiasedToBottomHeight(min, max);
		}

		private BiasedToBottomHeight(int min, int max) {
			super(min, max);
		}

		public int sample(Random random) {
			if (max - min <= 0) {
				return min;
			} else {
				int random1 = random.nextInt(max - min);
				return random.nextInt(random1 + 1) + min;
			}
		}
	}

	public static class VeryBiasedToBottomHeight extends Height {
		public static VeryBiasedToBottomHeight of(int min, int max) {
			return new VeryBiasedToBottomHeight(min, max);
		}

		private VeryBiasedToBottomHeight(int min, int max) {
			super(min, max);
		}

		public int sample(Random random) {
			if (max - min <= 0) {
				return min;
			} else {
				int random1 = MathHelper.nextInt(random, min + 1, max);
				int random2 = MathHelper.nextInt(random, min, random1 - 1);
				return MathHelper.nextInt(random, min, random2);
			}
		}
	}

	public static class TrapezoidHeight extends Height {
		public static TrapezoidHeight of(int min, int max) {
			return new TrapezoidHeight(min, max);
		}

		private TrapezoidHeight(int min, int max) {
			super(min, max);
		}

		public int sample(Random random) {
			if (min > max) {
				return min;
			} else {
				int mid = max - min;
				if (0 >= mid) {
					return random.nextInt(max - min + 1) + min;
				} else {
					int random1 = mid / 2;
					int random2 = mid - random1;
					return min + (random.nextInt(random2 + 1)) + (random.nextInt(random1 + 1));
				}
			}
		}
	}

	public static class ConstantHeight extends Height {
		public static ConstantHeight of(int height) {
			return new ConstantHeight(height);
		}

		private ConstantHeight(int height) {
			super(height, height);
		}

		public int sample(Random random) {
			return min;
		}
	}
}