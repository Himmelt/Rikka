package rikka.api.world;

@FunctionalInterface
public interface Locatable {
    Location getLocation();

    default IWorld getWorld() {
        return getLocation().getWorld();
    }
}
