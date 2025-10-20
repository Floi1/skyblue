package net.skyblue.procedure;

import net.skyblue.world.WorldF1;
import net.skyblue.world.WorldE1;
import net.skyblue.world.WorldD1;
import net.skyblue.world.WorldC1;
import net.skyblue.world.WorldB1;
import net.skyblue.world.WorldA1;
import net.skyblue.ElementsSkyblueMod;

import net.minecraftforge.common.DimensionManager;

import net.minecraft.world.WorldServer;
import net.minecraft.world.Teleporter;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.Entity;

import java.util.Map;

@ElementsSkyblueMod.ModElement.Tag
public class ProcedureDim1telpert extends ElementsSkyblueMod.ModElement {
	public ProcedureDim1telpert(ElementsSkyblueMod instance) {
		super(instance, 114);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure Dim1telpert!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((Math.random() <= 0.3)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
					int dimensionID = WorldB1.DIMID;
					class TeleporterDirect extends Teleporter {
						public TeleporterDirect(WorldServer worldserver) {
							super(worldserver);
						}

						@Override
						public void placeInPortal(Entity entity, float yawrotation) {
						}

						@Override
						public boolean placeInExistingPortal(Entity entity, float yawrotation) {
							return true;
						}

						@Override
						public boolean makePortal(Entity entity) {
							return true;
						}
					}
					EntityPlayerMP _player = (EntityPlayerMP) _ent;
					_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
					_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
				}
			}
		} else if ((Math.random() <= 0.5)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
					int dimensionID = WorldC1.DIMID;
					class TeleporterDirect extends Teleporter {
						public TeleporterDirect(WorldServer worldserver) {
							super(worldserver);
						}

						@Override
						public void placeInPortal(Entity entity, float yawrotation) {
						}

						@Override
						public boolean placeInExistingPortal(Entity entity, float yawrotation) {
							return true;
						}

						@Override
						public boolean makePortal(Entity entity) {
							return true;
						}
					}
					EntityPlayerMP _player = (EntityPlayerMP) _ent;
					_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
					_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
				}
			}
		} else if ((Math.random() <= 0.7)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
					int dimensionID = WorldA1.DIMID;
					class TeleporterDirect extends Teleporter {
						public TeleporterDirect(WorldServer worldserver) {
							super(worldserver);
						}

						@Override
						public void placeInPortal(Entity entity, float yawrotation) {
						}

						@Override
						public boolean placeInExistingPortal(Entity entity, float yawrotation) {
							return true;
						}

						@Override
						public boolean makePortal(Entity entity) {
							return true;
						}
					}
					EntityPlayerMP _player = (EntityPlayerMP) _ent;
					_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
					_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
				}
			}
		} else if ((Math.random() <= 0.8)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
					int dimensionID = WorldD1.DIMID;
					class TeleporterDirect extends Teleporter {
						public TeleporterDirect(WorldServer worldserver) {
							super(worldserver);
						}

						@Override
						public void placeInPortal(Entity entity, float yawrotation) {
						}

						@Override
						public boolean placeInExistingPortal(Entity entity, float yawrotation) {
							return true;
						}

						@Override
						public boolean makePortal(Entity entity) {
							return true;
						}
					}
					EntityPlayerMP _player = (EntityPlayerMP) _ent;
					_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
					_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
				}
			}
		} else if ((Math.random() <= 0.9)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
					int dimensionID = WorldE1.DIMID;
					class TeleporterDirect extends Teleporter {
						public TeleporterDirect(WorldServer worldserver) {
							super(worldserver);
						}

						@Override
						public void placeInPortal(Entity entity, float yawrotation) {
						}

						@Override
						public boolean placeInExistingPortal(Entity entity, float yawrotation) {
							return true;
						}

						@Override
						public boolean makePortal(Entity entity) {
							return true;
						}
					}
					EntityPlayerMP _player = (EntityPlayerMP) _ent;
					_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
					_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
				}
			}
		} else if ((Math.random() <= 1)) {
			{
				Entity _ent = entity;
				if (!_ent.world.isRemote && !_ent.isRiding() && !_ent.isBeingRidden() && _ent instanceof EntityPlayerMP) {
					int dimensionID = WorldF1.DIMID;
					class TeleporterDirect extends Teleporter {
						public TeleporterDirect(WorldServer worldserver) {
							super(worldserver);
						}

						@Override
						public void placeInPortal(Entity entity, float yawrotation) {
						}

						@Override
						public boolean placeInExistingPortal(Entity entity, float yawrotation) {
							return true;
						}

						@Override
						public boolean makePortal(Entity entity) {
							return true;
						}
					}
					EntityPlayerMP _player = (EntityPlayerMP) _ent;
					_player.mcServer.getPlayerList().transferPlayerToDimension(_player, dimensionID, new TeleporterDirect(_player.getServerWorld()));
					_player.connection.setPlayerLocation(DimensionManager.getWorld(dimensionID).getSpawnPoint().getX(),
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getY() + 1,
							DimensionManager.getWorld(dimensionID).getSpawnPoint().getZ(), _player.rotationYaw, _player.rotationPitch);
				}
			}
		}
	}
}
