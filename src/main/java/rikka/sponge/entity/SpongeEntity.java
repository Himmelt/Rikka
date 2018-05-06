package rikka.sponge.entity;

import org.spongepowered.api.entity.Entity;
import rikka.api.entity.EntityType;
import rikka.api.entity.IEntity;
import rikka.api.util.math.Vector3d;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.sponge.SpongeRikka;
import rikka.sponge.world.SpongeWorld;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public abstract class SpongeEntity<T extends Entity> extends SpongeRikka<T> implements IEntity {

    public SpongeEntity(T source) {
        super(source);
    }

    public T getSource() {
        return source;
    }

    public final EntityType getType() {
        return EntityType.getType(source);
    }

    public Location getLocation() {
        return new Location(source.getLocation());
    }

    public final boolean setLocation(Location location) {
        IWorld world = location.getWorld();
        if (world instanceof SpongeWorld) {
            return source.setLocation(new org.spongepowered.api.world.Location<>(
                    ((SpongeWorld) world).getSource(), location.getX(), location.getY(), location.getZ())
            );
        } else return false;
    }

    public boolean setLocationSafely(Location location) {
        IWorld world = location.getWorld();
        if (world instanceof SpongeWorld) {
            return source.setLocationSafely(new org.spongepowered.api.world.Location<>(
                    ((SpongeWorld) world).getSource(), location.getX(), location.getY(), location.getZ())
            );
        } else return false;
    }

    public Vector3d getRotation() {
        return new Vector3d(source.getRotation());
    }

    public IWorld getWorld() {
        return getWorld(source.getWorld());
    }

    public boolean hasGravity() {
        return source.gravity().exists() && source.gravity().get();
    }

    public void setGravity(boolean gravity) {
        source.gravity().set(gravity);
    }

    public Collection<IEntity> getNearbyEntities(double distance) {
        return getWorld().getNearbyEntities(getLocation().getPosition(), distance);
    }

    public void setRotation(Vector3d rotation) {
        source.setRotation(new com.flowpowered.math.vector.Vector3d(rotation.x, rotation.y, rotation.z));
    }

    public Vector3d getScale() {
        return new Vector3d(source.getScale());
    }

    public void setScale(Vector3d scale) {
        source.setScale(new com.flowpowered.math.vector.Vector3d(scale.x, scale.y, scale.z));
    }

    public List<? extends IEntity> getPassengers() {
        List<SpongeEntity> entities = new ArrayList<>();
        for (Entity entity : source.getPassengers()) {
            entities.add(SpongeEntity.getEntity(entity));
        }
        return entities;
    }

    public boolean addPassenger(IEntity entity) {
        if (entity instanceof SpongeEntity) {
            return source.addPassenger(((SpongeEntity) entity).getSource());
        }
        return false;
    }

    public boolean removePassenger(IEntity entity) {
        if (entity instanceof SpongeEntity) {
            source.removePassenger(((SpongeEntity) entity).getSource());
            return true;
        }
        return false;
    }

    public void clearPassengers() {
        source.clearPassengers();
    }

    public IEntity getVehicle() {
        return SpongeRikka.getEntity(source.getVehicle().orElse(null));
    }

    public boolean setVehicle(@Nullable IEntity entity) {
        if (entity == null) {
            source.setVehicle(null);
            return true;
        }
        if (entity instanceof SpongeEntity) {
            source.setVehicle(((SpongeEntity) entity).getSource());
            return true;
        }
        return false;
    }

    public boolean isOnGround() {
        return source.isOnGround();
    }

    public int hashCode() {
        return source.hashCode();
    }


    public boolean hasPassenger(IEntity entity) {
        if (entity instanceof SpongeEntity) {
            return source.hasPassenger(((SpongeEntity) entity).getSource());
        }
        return false;
    }

    public boolean isRemoved() {
        return source.isRemoved();
    }

    public boolean isLoaded() {
        return source.isLoaded();
    }

    public void remove() {
        source.remove();
    }

    public UUID getUUID() {
        return source.getUniqueId();
    }

}
