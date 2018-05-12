package rikka.api.world;

import rikka.api.block.BlockType;
import rikka.api.block.IBlockState;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.tileentity.ITileEntity;
import rikka.api.util.math.Vector3d;
import rikka.api.util.math.Vector3i;
import rikka.api.world.biome.BiomeType;
import rikka.api.world.extent.IEntityUniverse;

import java.util.Collection;
import java.util.UUID;

public interface IWorld extends IEntityUniverse {

    Collection<IPlayer> getPlayers();

    default Location getLocation(Vector3i block) {
        return new Location(this, block);
    }

    default Location getLocation(int x, int y, int z) {
        return new Location(this, x, y, z);
    }

    default Location getLocation(Vector3d pos) {
        return new Location(this, pos);
    }

    default Location getLocation(double x, double y, double z) {
        return new Location(this, x, y, z);
    }

    IEntity getEntity(UUID uuid);

    Collection<IEntity> getNearbyEntities(Vector3d position, double distance);

    default boolean setBlock(Vector3i position, IBlockState state, BlockChangeFlag flag) {
        return setBlock(position.x, position.y, position.z, state, flag);
    }

    boolean setBlock(double x, double y, double z, IBlockState blockState, BlockChangeFlag flag);

    default boolean setBlockType(Vector3i position, BlockType type, BlockChangeFlag flag) {
        return setBlock(position.x, position.y, position.z, type.getDefaultState(), flag);
    }

    default boolean setBlockType(int x, int y, int z, BlockType type, BlockChangeFlag flag) {
        return setBlock(x, y, z, type.getDefaultState(), flag);
    }

    BiomeType getBiome(int x, int y, int z);

    BiomeType getBiome(double x, double y, double z);

    BlockType getBlockType(double x, double y, double z);

    IBlockState getBlockState(double x, double y, double z);

    ITileEntity getTileEntity(double x, double y, double z);

}
