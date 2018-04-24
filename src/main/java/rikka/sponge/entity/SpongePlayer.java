package rikka.sponge.entity;

import org.spongepowered.api.entity.living.player.Player;
import rikka.api.entity.living.player.IPlayer;

public abstract class SpongePlayer<T extends Player> extends SpongeEntity<T> implements IPlayer {

    public SpongePlayer(T source) {
        super(source);
    }

}
