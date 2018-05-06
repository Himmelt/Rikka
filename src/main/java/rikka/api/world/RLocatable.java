package rikka.api.world;

@FunctionalInterface
public interface RLocatable {
    Location getLocation();

    default IWorld getWorld() {
        return getLocation().getWorld();
    }
}
