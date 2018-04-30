package rikka.api.world;

import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.util.math.Vector3d;
import rikka.api.util.math.Vector3i;

import java.util.Collection;
import java.util.UUID;

public interface IWorld {

    Collection<IPlayer> getPlayers();

    default Location getLocation(Vector3i block) {
        return new Location(this, block);
    }

    default Location getLocation(int x, int y, int z) {
        return new Location(this, x, y, z);
    }

    default Location getLocation(Vector3d pos) {
        return new Location(this, pos);
    }

    default Location getLocation(double x, double y, double z) {
        return new Location(this, x, y, z);
    }

    IEntity getEntity(UUID uuid);

    Collection<IEntity> getNearbyEntities(Vector3d position, double distance);

}
