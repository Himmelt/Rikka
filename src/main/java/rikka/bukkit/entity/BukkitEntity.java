package rikka.bukkit.entity;

import org.bukkit.entity.Entity;
import rikka.api.Rikka;
import rikka.api.entity.IEntity;
import rikka.api.world.IWorld;
import rikka.api.world.Location;
import rikka.bukkit.BukkitRikka;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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

}
