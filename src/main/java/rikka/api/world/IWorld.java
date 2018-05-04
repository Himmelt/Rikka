package rikka.api.world;

import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.util.math.Vector3d;
import rikka.api.util.math.Vector3i;
import rikka.api.world.extent.IEntityUniverse;

import javax.annotation.Nonnull;
import java.util.Collection;
import java.util.UUID;

public interface IWorld extends IEntityUniverse {

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

    IEntity getEntity(@Nonnull UUID uuid);

    Collection<IEntity> getNearbyEntities(Vector3d position, double distance);

    org.bukkit.World bukkitWorld();

    org.spongepowered.api.world.World spongeWorld();

}
