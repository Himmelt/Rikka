package rikka.api.entity;

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

public interface IEntity extends Identifiable, Locatable, Translatable {

    EntityType getType();

    boolean setLocation(Location location);

    boolean setLocationSafely(Location location);

    Vector3d getRotation();

    void setRotation(Vector3d rotation);

    boolean setLocationAndRotation(Location location, Vector3d rotation);

    boolean setLocationAndRotation(Location location, Vector3d rotation, EnumSet<RelativePositions> relativePositions);

    boolean setLocationAndRotationSafely(Location location, Vector3d rotation);

    boolean setLocationAndRotationSafely(Location location, Vector3d rotation, EnumSet<RelativePositions> relativePositions);

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

    boolean hasGravity();

    void setGravity(boolean gravity);

}
