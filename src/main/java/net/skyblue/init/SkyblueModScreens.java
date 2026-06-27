/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.skyblue.init;

import org.lwjgl.glfw.GLFW;

import net.skyblue.client.gui.Face1Screen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.gui.widget.AbstractSlider;
import net.minecraft.client.gui.ScreenManager;

import java.text.DecimalFormat;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SkyblueModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ScreenManager.registerFactory(SkyblueModMenus.FACE_1.get(), Face1Screen::new);
		});
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}

	public static class ForgeSlider extends AbstractSlider {
		protected ITextComponent prefix;
		protected ITextComponent suffix;
		protected double minValue;
		protected double maxValue;
		protected double stepSize;
		protected boolean drawString;
		private final DecimalFormat format;

		public ForgeSlider(int x, int y, int width, int height, ITextComponent prefix, ITextComponent suffix, double minValue, double maxValue, double currentValue, double stepSize, int precision, boolean drawString) {
			super(x, y, width, height, StringTextComponent.EMPTY, 0D);
			this.prefix = prefix;
			this.suffix = suffix;
			this.minValue = minValue;
			this.maxValue = maxValue;
			this.stepSize = Math.abs(stepSize);
			this.sliderValue = this.snapToNearest((currentValue - minValue) / (maxValue - minValue));
			this.drawString = drawString;
			if (stepSize == 0D) {
				precision = Math.min(precision, 4);
				StringBuilder builder = new StringBuilder("0");
				if (precision > 0)
					builder.append('.');
				while (precision-- > 0)
					builder.append('0');
				this.format = new DecimalFormat(builder.toString());
			} else if (MathHelper.epsilonEquals(this.stepSize, Math.floor(this.stepSize))) {
				this.format = new DecimalFormat("0");
			} else {
				this.format = new DecimalFormat(Double.toString(this.stepSize).replaceAll("\\d", "0"));
			}
			this.func_230979_b_();
		}

		public ForgeSlider(int x, int y, int width, int height, ITextComponent prefix, ITextComponent suffix, double minValue, double maxValue, double currentValue, boolean drawString) {
			this(x, y, width, height, prefix, suffix, minValue, maxValue, currentValue, 1D, 0, drawString);
		}

		public double getValue() {
			return this.sliderValue * (maxValue - minValue) + minValue;
		}

		public long getValueLong() {
			return Math.round(this.getValue());
		}

		public int getValueInt() {
			return (int) this.getValueLong();
		}

		public void setValue(double value) {
			this.sliderValue = this.snapToNearest((value - this.minValue) / (this.maxValue - this.minValue));
			this.func_230979_b_();
		}

		public String getValueString() {
			return this.format.format(this.getValue());
		}

		@Override
		public void onClick(double mouseX, double mouseY) {
			this.setValueFromMouse(mouseX);
		}

		@Override
		protected void onDrag(double mouseX, double mouseY, double dragX, double dragY) {
			super.onDrag(mouseX, mouseY, dragX, dragY);
			this.setValueFromMouse(mouseX);
		}

		@Override
		public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
			boolean flag = keyCode == GLFW.GLFW_KEY_LEFT;
			if (flag || keyCode == GLFW.GLFW_KEY_RIGHT) {
				if (this.minValue > this.maxValue)
					flag = !flag;
				float f = flag ? -1F : 1F;
				if (stepSize <= 0D)
					this.setSliderValue(this.sliderValue + (f / (this.width - 8)));
				else
					this.setValue(this.getValue() + f * this.stepSize);
			}
			return false;
		}

		private void setValueFromMouse(double mouseX) {
			this.setSliderValue((mouseX - (this.x + 4)) / (this.width - 8));
		}

		private void setSliderValue(double value) {
			double oldValue = this.sliderValue;
			this.sliderValue = this.snapToNearest(value);
			if (!MathHelper.epsilonEquals(oldValue, this.sliderValue))
				this.func_230972_a_();
			this.func_230979_b_();
		}

		private double snapToNearest(double value) {
			if (stepSize <= 0D)
				return MathHelper.clamp(value, 0D, 1D);
			value = MathHelper.lerp(MathHelper.clamp(value, 0D, 1D), this.minValue, this.maxValue);
			value = (stepSize * Math.round(value / stepSize));
			if (this.minValue > this.maxValue) {
				value = MathHelper.clamp(value, this.maxValue, this.minValue);
			} else {
				value = MathHelper.clamp(value, this.minValue, this.maxValue);
			}
			return MathHelper.lerp(MathHelper.func_233020_c_(value, this.minValue, this.maxValue), 0D, 1D);
		}

		@Override
		protected void func_230979_b_() {
			if (this.drawString) {
				this.setMessage(new StringTextComponent("").append(prefix).appendString(this.getValueString()).append(suffix));
			} else {
				this.setMessage(StringTextComponent.EMPTY);
			}
		}

		@Override
		protected void func_230972_a_() {
		}
	}
}