package rikka.sponge.entity;

import org.spongepowered.api.entity.Entity;
import rikka.api.entity.EntityType;
import rikka.api.entity.IEntity;
import rikka.api.util.math.Vector3d;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.sponge.SpongeRikka;
import rikka.sponge.world.SpongeWorld;

import java.util.Collection;

public abstract class SpongeEntity<T extends Entity> extends SpongeRikka<T> implements IEntity {

    public SpongeEntity(T source) {
        super(source);
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

}
