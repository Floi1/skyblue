/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.skyblue.init;

import net.skyblue.world.inventory.Face1Menu;
import net.skyblue.network.MenuStateUpdateMessage;
import net.skyblue.SkyblueMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.network.PacketDistributor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.common.extensions.IForgeContainerType;

import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.Minecraft;

import java.util.Map;

public class SkyblueModMenus {
	public static final DeferredRegister<ContainerType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.CONTAINERS, SkyblueMod.MODID);
	public static final RegistryObject<ContainerType<Face1Menu>> FACE_1 = REGISTRY.register("face_1", () -> IForgeContainerType.create(Face1Menu::new));

	public interface MenuAccessor {
		Map<String, Object> getMenuState();

		Map<Integer, Slot> getSlots();

		default void sendMenuStateUpdate(PlayerEntity player, int elementType, String name, Object elementState, boolean needClientUpdate) {
			getMenuState().put(elementType + ":" + name, elementState);
			if (player instanceof ServerPlayerEntity) {
				SkyblueMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayerEntity) player), new MenuStateUpdateMessage(elementType, name, elementState));
			} else if (player.world.isRemote) {
				if (Minecraft.getInstance().currentScreen instanceof SkyblueModScreens.ScreenAccessor && needClientUpdate)
					((SkyblueModScreens.ScreenAccessor) Minecraft.getInstance().currentScreen).updateMenuState(elementType, name, elementState);
				SkyblueMod.PACKET_HANDLER.sendToServer(new MenuStateUpdateMessage(elementType, name, elementState));
			}
		}

		default <T> T getMenuState(int elementType, String name, T defaultValue) {
			try {
				return (T) getMenuState().getOrDefault(elementType + ":" + name, defaultValue);
			} catch (ClassCastException e) {
				return defaultValue;
			}
		}
	}
}