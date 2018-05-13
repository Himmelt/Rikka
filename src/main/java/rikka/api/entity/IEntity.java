package rikka.api.entity;

import rikka.api.util.RIdentifiable;
import rikka.api.util.math.Vector3d;
import rikka.api.world.Locatable;
import rikka.api.world.Location;

import java.util.Collection;
import java.util.List;

public interface IEntity extends RIdentifiable, Locatable {

    EntityType getType();

    boolean setLocation(Location location);

    boolean setLocationSafely(Location location);

    Vector3d getRotation();

    void setRotation(Vector3d rotation);

    Vector3d getScale();

    void setScale(Vector3d scale);

    List<? extends IEntity> getPassengers();

    boolean hasPassenger(IEntity entity);

    boolean addPassenger(IEntity entity);

    boolean removePassenger(IEntity entity);

    void clearPassengers();

    IEntity getVehicle();

    boolean isOnGround();

    boolean isRemoved();

    boolean isLoaded();

    void remove();

    Collection<IEntity> getNearbyEntities(double distance);

    boolean hasGravity();

    void setGravity(boolean gravity);

}
