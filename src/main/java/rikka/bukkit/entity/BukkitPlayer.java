package rikka.bukkit.entity;

import org.bukkit.entity.Player;
import rikka.api.entity.living.player.IPlayer;

public class BukkitPlayer<T extends Player> extends BukkitEntity<T> implements IPlayer {

    public BukkitPlayer(T source) {
        super(source);
    }

}
