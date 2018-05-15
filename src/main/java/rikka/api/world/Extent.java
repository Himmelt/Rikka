package rikka.api.world;

import com.flowpowered.math.vector.Vector2i;
import com.flowpowered.math.vector.Vector3d;
import com.flowpowered.math.vector.Vector3i;
import rikka.api.block.BlockType;
import rikka.api.block.IBlockState;
import rikka.api.entity.IEntity;
import rikka.api.util.AABB;
import rikka.api.util.Identifiable;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;

import static com.google.common.base.Preconditions.checkNotNull;

public interface Extent extends IEntityUniverse, Identifiable {

    Location getLocation(Vector3i position);

    default Location getLocation(int x, int y, int z) {
        return getLocation(new Vector3i(x, y, z));
    }

    Location getLocation(Vector3d position);

    default Location getLocation(double x, double y, double z) {
        return getLocation(new Vector3i(x, y, z));
    }

    int getHighestYAt(int x, int z);

    default int getHighestYAt(Vector2i column) {
        return this.getHighestYAt(column.getX(), column.getY());
    }

    default Vector3i getHighestPositionAt(Vector3i position) {
        return new Vector3i(position.getX(), getHighestYAt(position.getX(), position.getZ()), position.getZ());
    }

    int getPrecipitationLevelAt(int x, int z);

    default int getPrecipitationLevelAt(Vector2i column) {
        return this.getPrecipitationLevelAt(column.getX(), column.getY());
    }

    default Vector3i getPrecipitationLevelAt(Vector3i position) {
        return new Vector3i(position.getX(), this.getPrecipitationLevelAt(position.getX(), position.getZ()), position.getZ());
    }

    default boolean setBlock(Vector3i position, IBlockState blockState, BlockChangeFlag flag) {
        return setBlock(position.getX(), position.getY(), position.getZ(), blockState, flag);
    }

    boolean setBlock(int x, int y, int z, IBlockState blockState, BlockChangeFlag flag);

    boolean setBlockType(Vector3i position, BlockType type, BlockChangeFlag flag);

    boolean setBlockType(int x, int y, int z, BlockType type, BlockChangeFlag flag);

    boolean isLoaded();

    Extent getExtentView(Vector3i newMin, Vector3i newMax);

    default Optional<UUID> getCreator(Vector3i pos) {
        return getCreator(pos.getX(), pos.getY(), pos.getZ());
    }

    Optional<UUID> getCreator(int x, int y, int z);

    default Optional<UUID> getNotifier(Vector3i pos) {
        return getNotifier(pos.getX(), pos.getY(), pos.getZ());
    }

    Optional<UUID> getNotifier(int x, int y, int z);

    default void setCreator(Vector3i pos, @Nullable UUID uuid) {
        setCreator(pos.getX(), pos.getY(), pos.getZ(), uuid);
    }

    void setCreator(int x, int y, int z, @Nullable UUID uuid);

    default void setNotifier(Vector3i pos, @Nullable UUID uuid) {
        setNotifier(pos.getX(), pos.getY(), pos.getZ(), uuid);
    }

    void setNotifier(int x, int y, int z, @Nullable UUID uuid);

    default Optional<AABB> getBlockSelectionBox(Vector3i pos) {
        checkNotNull(pos, "pos");
        return getBlockSelectionBox(pos.getX(), pos.getY(), pos.getZ());
    }

    Optional<AABB> getBlockSelectionBox(int x, int y, int z);

    Set<AABB> getIntersectingBlockCollisionBoxes(AABB box);

    Set<AABB> getIntersectingCollisionBoxes(IEntity owner, AABB box);

}
