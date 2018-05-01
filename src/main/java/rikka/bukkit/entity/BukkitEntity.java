package rikka.bukkit.entity;

import org.bukkit.entity.Entity;
import rikka.api.Rikka;
import rikka.api.entity.EntitySnapshot;
import rikka.api.entity.EntityType;
import rikka.api.entity.IEntity;
import rikka.api.text.translation.Translation;
import rikka.api.util.RelativePositions;
import rikka.api.util.math.Vector3d;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.bukkit.BukkitRikka;

import javax.annotation.Nullable;
import java.util.*;

public abstract class BukkitEntity<T extends Entity> extends BukkitRikka<T> implements IEntity, Rikka<T> {

    public BukkitEntity(T source) {
        super(source);
    }

    public Location getLocation() {
        return new Location(source.getLocation());
    }

    public IWorld getWorld() {
        return getWorld(source.getWorld());
    }

    public boolean hasGravity() {
        return source.hasGravity();
    }

    public void setGravity(boolean gravity) {
        source.setGravity(gravity);
    }

    public EntityType getType() {
        return null;
    }

    public EntitySnapshot createSnapshot() {
        return null;
    }

    public boolean setLocation(Location location) {
        return false;
    }

    public Vector3d getRotation() {
        return null;
    }

    public void setRotation(Vector3d rotation) {

    }

    public boolean setLocationAndRotation(Location location, Vector3d rotation) {
        return false;
    }

    public boolean setLocationAndRotation(Location location, Vector3d rotation, EnumSet<RelativePositions> relativePositions) {
        return false;
    }

    public Vector3d getScale() {
        return null;
    }

    public void setScale(Vector3d scale) {

    }

    public List<IEntity> getPassengers() {
        return null;
    }

    public boolean hasPassenger(IEntity entity) {
        return false;
    }

    public boolean addPassenger(IEntity entity) {
        return false;
    }

    public void removePassenger(IEntity entity) {

    }

    public void clearPassengers() {

    }

    public IEntity getVehicle() {
        return null;
    }

    public boolean setVehicle(@Nullable IEntity entity) {
        return false;
    }

    public IEntity getBaseVehicle() {
        return null;
    }

    public boolean isOnGround() {
        return false;
    }

    public boolean isRemoved() {
        return false;
    }

    public boolean isLoaded() {
        return false;
    }

    public void remove() {

    }

    public Collection<IEntity> getNearbyEntities(double distance) {
        List<Entity> list = source.getNearbyEntities(distance, distance, distance);
        List<IEntity> entities = new ArrayList<>();
        for (Entity entity : list) {
            if (entity.getLocation().distanceSquared(source.getLocation()) <= distance * distance) {
                entities.add(getEntity(entity));
            }
        }
        return entities;
    }

    public Translation getTranslation() {
        return null;
    }

    public UUID getUUID() {
        return source.getUniqueId();
    }

}
