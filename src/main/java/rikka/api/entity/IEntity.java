package rikka.api.entity;

import rikka.api.data.DataHolder;
import rikka.api.data.DataTransactionResult;
import rikka.api.data.key.Keys;
import rikka.api.data.value.mutable.Value;
import rikka.api.event.cause.entity.damage.source.DamageSource;
import rikka.api.text.translation.Translatable;
import rikka.api.util.AABB;
import rikka.api.util.Identifiable;
import rikka.api.util.RelativePositions;
import rikka.api.util.math.Vector3d;
import rikka.api.world.Locatable;
import rikka.api.world.Location;
import rikka.api.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Predicate;

public interface IEntity extends Identifiable, Locatable, DataHolder, Translatable {

    EntityType getType();

    EntitySnapshot createSnapshot();

    Random getRandom();

    boolean setLocation(Location<World> location);

    default boolean setLocationSafely(Location<World> location) {
        return false;
        /*Sponge.getGame().getTeleportHelper()
                .getSafeLocation(location)
                .map(this::setLocation)
                .orElse(false);*/
    }

    Vector3d getRotation();

    void setRotation(Vector3d rotation);

    boolean setLocationAndRotation(Location<World> location, Vector3d rotation);

    boolean setLocationAndRotation(Location<World> location, Vector3d rotation, EnumSet<RelativePositions> relativePositions);

    default boolean setLocationAndRotationSafely(Location<World> location, Vector3d rotation) {
        return false;
        /*Sponge.getGame().getTeleportHelper()
                .getSafeLocation(location)
                .map(safe -> this.setLocationAndRotation(safe, rotation))
                .orElse(false);*/
    }

    default boolean setLocationAndRotationSafely(Location<World> location, Vector3d rotation, EnumSet<RelativePositions> relativePositions) {
        return false;
        /*Sponge.getGame().getTeleportHelper()
                .getSafeLocation(location)
                .map(safe -> this.setLocationAndRotation(safe, rotation, relativePositions))
                .orElse(false);*/
    }

    Vector3d getScale();

    void setScale(Vector3d scale);

    Transform<World> getTransform();

    boolean setTransform(Transform<World> transform);

    default boolean setTransformSafely(Transform<World> transform) {
        return setLocationAndRotationSafely(transform.getLocation(), transform.getRotation());
    }

    default boolean transferToWorld(World world) {
        return transferToWorld(world, world.getSpawnLocation().getPosition());
    }

    boolean transferToWorld(World world, Vector3d position);

    default boolean transferToWorld(String worldName, Vector3d position) {
        return false;
        /*Sponge.getServer().getWorld(worldName)
                .map(world -> transferToWorld(world, position))
                .orElse(false);*/
    }

    default boolean transferToWorld(UUID uuid, Vector3d position) {
        return false;
        /*Sponge.getServer().getWorld(uuid)
                .map(world -> transferToWorld(world, position))
                .orElse(false);*/
    }

    Optional<AABB> getBoundingBox();

    List<IEntity> getPassengers();

    boolean hasPassenger(IEntity entity);

    boolean addPassenger(IEntity entity);

    void removePassenger(IEntity entity);

    void clearPassengers();

    Optional<IEntity> getVehicle();

    boolean setVehicle(@Nullable IEntity entity);

    IEntity getBaseVehicle();

    default Vector3d getVelocity() {
        return get(Keys.VELOCITY).get();
    }

    default DataTransactionResult setVelocity(Vector3d vector3d) {
        return offer(Keys.VELOCITY, vector3d);
    }

    boolean isOnGround();

    boolean isRemoved();

    boolean isLoaded();

    void remove();

    boolean damage(double damage, DamageSource damageSource);

    default Collection<IEntity> getNearbyEntities(double distance) {
        return null;// this.getWorld().getNearbyEntities(this.getLocation().getPosition(), distance);
    }

    default Collection<IEntity> getNearbyEntities(@Nonnull Predicate<IEntity> predicate) {
        return getWorld().getEntities(predicate);
    }

    default boolean canSee(IEntity entity) {
        Optional<Boolean> optional = entity.get(Keys.VANISH);
        return !optional.isPresent() || !optional.get();
    }

    EntityArchetype createArchetype();

    default Value<Boolean> gravity() {
        return getValue(Keys.HAS_GRAVITY).get();
    }

}
