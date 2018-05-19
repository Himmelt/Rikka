package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.MagmaCube;
import rikka.api.entity.living.monster.IMagmaCube;

public final class BukkitMagmaCube extends BukkitSlime<MagmaCube> implements IMagmaCube {
    public BukkitMagmaCube(MagmaCube source) {
        super(source);
    }
}
