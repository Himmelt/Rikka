package rikka.sponge.entity;

import org.soraworld.rikka.entity.living.player.IPlayer;
import org.spongepowered.api.entity.living.player.Player;

public abstract class SpongePlayer<T extends Player> extends SpongeEntity<T> implements IPlayer {

    public SpongePlayer(T source) {
        super(source);
    }

}
