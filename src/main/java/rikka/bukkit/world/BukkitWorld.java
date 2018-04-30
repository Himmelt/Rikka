package rikka.bukkit.world;

import org.bukkit.World;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.world.IWorld;
import rikka.bukkit.BukkitRikka;

import java.util.Collection;
import java.util.UUID;

public class BukkitWorld extends BukkitRikka<World> implements IWorld {

    public BukkitWorld(World source) {
        super(source);
    }

    public Collection<IPlayer> getPlayers() {
        return null;
    }

    public IEntity getEntity(UUID uuid) {
        return null;
    }

}
