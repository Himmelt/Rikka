package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.MagmaCube;
import rikka.api.entity.living.monster.IMagmaCube;

public class BukkitMagmaCube<T extends MagmaCube> extends BukkitSlime<T> implements IMagmaCube {
    public BukkitMagmaCube(T source) {
        super(source);
    }
}
