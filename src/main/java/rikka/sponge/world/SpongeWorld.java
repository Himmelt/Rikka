package rikka.sponge.world;

import org.spongepowered.api.world.World;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.world.IWorld;
import rikka.sponge.SpongeRikka;

import java.util.Collection;
import java.util.UUID;

public class SpongeWorld extends SpongeRikka<World> implements IWorld {

    public SpongeWorld(World source) {
        super(source);
    }


    public Collection<IPlayer> getPlayers() {
        return null;
    }

    public IEntity getEntity(UUID uuid) {
        return null;
    }

}
