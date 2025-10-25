package net.skyblue.client.particle;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.particles.BasicParticleType;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.particle.SpriteTexturedParticle;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.IParticleRenderType;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.IAnimatedSprite;

@OnlyIn(Dist.CLIENT)
public class Ap1Particle extends SpriteTexturedParticle {
	public static Ap1IParticleFactory factory(IAnimatedSprite spriteSet) {
		return new Ap1IParticleFactory(spriteSet);
	}

	@OnlyIn(Dist.CLIENT)
	public static class Ap1IParticleFactory implements IParticleFactory<BasicParticleType> {
		private final IAnimatedSprite spriteSet;

		public Ap1IParticleFactory(IAnimatedSprite spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle makeParticle(BasicParticleType typeIn, ClientWorld worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new Ap1Particle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final IAnimatedSprite spriteSet;

	protected Ap1Particle(ClientWorld world, double x, double y, double z, double vx, double vy, double vz, IAnimatedSprite spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.maxAge = 20;
		this.particleGravity = 0f;
		this.canCollide = true;
		this.motionX = vx * 1;
		this.motionY = vy * 1;
		this.motionZ = vz * 1;
		this.selectSpriteWithAge(spriteSet);
	}

	@Override
	public IParticleRenderType getRenderType() {
		return IParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.isExpired) {
			this.setSprite(this.spriteSet.get((this.age / 1) % 10 + 1, 10));
		}
	}
}