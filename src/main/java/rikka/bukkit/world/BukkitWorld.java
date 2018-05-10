package rikka.bukkit.world;

import org.bukkit.World;
import rikka.api.block.IBlockState;
import rikka.api.entity.EntityType;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.util.AABB;
import rikka.api.util.math.Vector3d;
import rikka.api.world.BlockChangeFlag;
import rikka.api.world.IWorld;
import rikka.bukkit.BukkitRikka;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;

public class BukkitWorld extends BukkitRikka<World> implements IWorld {

    public BukkitWorld(World source) {
        super(source);
    }

    public World getSource() {
        return source;
    }

    public Collection<IPlayer> getPlayers() {
        return null;
    }

    public IEntity getEntity(@Nonnull UUID uuid) {
        return null;
    }

    public Collection<IEntity> getEntities() {
        return null;
    }

    public Collection<IEntity> getEntities(Predicate<IEntity> filter) {
        return null;
    }

    public Collection<IEntity> getNearbyEntities(Vector3d position, double distance) {
        return null;
    }

    public IEntity createEntity(EntityType type, Vector3d position) throws IllegalArgumentException, IllegalStateException {
        return null;
    }

    public IEntity createEntityNaturally(EntityType type, Vector3d position) throws IllegalArgumentException, IllegalStateException {
        return null;
    }

    public boolean spawnEntity(IEntity entity) {
        return false;
    }

    public Collection<IEntity> spawnEntities(Iterable<? extends IEntity> entities) {
        return null;
    }

    public Set<IEntity> getIntersectingEntities(AABB box, Predicate<IEntity> filter) {
        return null;
    }

    public Set<EntityHit> getIntersectingEntities(Vector3d start, Vector3d end, Predicate<EntityHit> filter) {
        return null;
    }

    public Set<EntityHit> getIntersectingEntities(Vector3d start, Vector3d direction, double distance, Predicate<EntityHit> filter) {
        return null;
    }

    public boolean setBlock(int x, int y, int z, IBlockState blockState, BlockChangeFlag flag) {
        return false;
    }

}
