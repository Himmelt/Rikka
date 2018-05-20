package rikka.bukkit.entity;

import org.bukkit.entity.Entity;
import org.bukkit.event.player.PlayerTeleportEvent;
import rikka.api.entity.EntityType;
import rikka.api.entity.IEntity;
import rikka.api.util.math.Vector3d;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.bukkit.BukkitRikka;
import rikka.bukkit.world.BukkitWorld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class BukkitEntity<T extends Entity> extends BukkitRikka<T> implements IEntity {

    public BukkitEntity(T source) {
        super(source);
    }

    public T getSource() {
        return source;
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

    public final EntityType getType() {
        return EntityType.getType(source);
    }

    public final boolean setLocation(Location location) {
        IWorld world = location.getWorld();
        if (world instanceof BukkitWorld) {
            return source.teleport(
                    new org.bukkit.Location(((BukkitWorld) world).getSource(), location.getX(), location.getY(), location.getZ()),
                    PlayerTeleportEvent.TeleportCause.PLUGIN
            );
        } else return false;
    }

    public boolean setLocationSafely(Location location) {
        return false;
    }

    public Vector3d getRotation() {
        return new Vector3d(source.getLocation().getDirection());
    }

    public void setRotation(Vector3d rotation) {
        // TODO check is result correct ?
        source.getLocation().setDirection(new org.bukkit.util.Vector(rotation.x, rotation.y, rotation.z));
    }

    public Vector3d getScale() {
        // TODO
        return Vector3d.ONE;
    }

    public void setScale(Vector3d scale) {
        // TODO
    }

    public List<BukkitEntity> getPassengers() {
        List<BukkitEntity> entities = new ArrayList<>();
        for (Entity entity : source.getPassengers()) {
            entities.add(BukkitEntity.getEntity(entity));
        }
        return entities;
    }

    public boolean hasPassenger(IEntity entity) {
        if (entity instanceof BukkitEntity) {
            return source.getPassengers().contains(((BukkitEntity) entity).getSource());
        }
        return false;
    }

    public boolean addPassenger(IEntity entity) {
        if (entity instanceof BukkitEntity) {
            return source.addPassenger(((BukkitEntity) entity).getSource());
        }
        return false;
    }

    public boolean removePassenger(IEntity entity) {
        if (entity instanceof BukkitEntity) {
            return source.removePassenger(((BukkitEntity) entity).getSource());
        }
        return false;
    }

    public void clearPassengers() {
        for (Entity entity : source.getPassengers()) {
            source.removePassenger(entity);
        }
    }

    public IEntity getVehicle() {
        return BukkitRikka.getEntity(source.getVehicle());
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

    public UUID getUUID() {
        return source.getUniqueId();
    }

}
