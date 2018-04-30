package rikka.sponge.entity;

import org.spongepowered.api.entity.Entity;
import rikka.api.entity.IEntity;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.sponge.SpongeRikka;

import java.util.Collection;

public abstract class SpongeEntity<T extends Entity> extends SpongeRikka<T> implements IEntity {

    public SpongeEntity(T source) {
        super(source);
    }

    public Location getLocation() {
        return new Location(source.getLocation());
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
