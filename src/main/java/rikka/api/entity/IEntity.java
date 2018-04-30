package rikka.api.entity;

import rikka.api.data.DataHolder;
import rikka.api.data.key.Keys;
import rikka.api.text.translation.Translatable;
import rikka.api.util.Identifiable;
import rikka.api.util.RelativePositions;
import rikka.api.util.math.Vector3d;
import rikka.api.world.Locatable;
import rikka.api.world.Location;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;

public interface IEntity extends Identifiable, Locatable, DataHolder, Translatable {

    EntityType getType();

    EntitySnapshot createSnapshot();

    boolean setLocation(Location location);

    default boolean setLocationSafely(Location location) {
        return false;
        /*Sponge.getGame().getTeleportHelper()
                .getSafeLocation(location)
                .map(this::setLocation)
                .orElse(false);*/
    }

    Vector3d getRotation();

    void setRotation(Vector3d rotation);

    boolean setLocationAndRotation(Location location, Vector3d rotation);

    boolean setLocationAndRotation(Location location, Vector3d rotation, EnumSet<RelativePositions> relativePositions);

    default boolean setLocationAndRotationSafely(Location location, Vector3d rotation) {
        return false;
        /*Sponge.getGame().getTeleportHelper()
                .getSafeLocation(location)
                .map(safe -> this.setLocationAndRotation(safe, rotation))
                .orElse(false);*/
    }

    default boolean setLocationAndRotationSafely(Location location, Vector3d rotation, EnumSet<RelativePositions> relativePositions) {
        return false;
        /*Sponge.getGame().getTeleportHelper()
                .getSafeLocation(location)
                .map(safe -> this.setLocationAndRotation(safe, rotation, relativePositions))
                .orElse(false);*/
    }

    Vector3d getScale();

    void setScale(Vector3d scale);

    List<IEntity> getPassengers();

    boolean hasPassenger(IEntity entity);

    boolean addPassenger(IEntity entity);

    void removePassenger(IEntity entity);

    void clearPassengers();

    IEntity getVehicle();

    boolean setVehicle(@Nullable IEntity entity);

    IEntity getBaseVehicle();

    boolean isOnGround();

    boolean isRemoved();

    boolean isLoaded();

    void remove();

    Collection<IEntity> getNearbyEntities(double distance);

    default boolean canSee(IEntity entity) {
        Optional<Boolean> optional = entity.get(Keys.VANISH);
        return !optional.isPresent() || !optional.get();
    }

    boolean hasGravity();

    void setGravity(boolean gravity);

}
