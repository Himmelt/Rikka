package rikka.bukkit.entity;

import org.bukkit.entity.Player;
import org.soraworld.rikka.entity.living.player.IPlayer;

public abstract class BukkitPlayer<T extends Player> extends BukkitEntity<T> implements IPlayer {

    public BukkitPlayer(T source) {
        super(source);
    }

}
