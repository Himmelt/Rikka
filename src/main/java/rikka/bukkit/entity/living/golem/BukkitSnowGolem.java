package rikka.bukkit.entity.living.golem;

import org.bukkit.entity.Snowman;
import rikka.api.entity.living.golem.ISnowGolem;

public final class BukkitSnowGolem extends BukkitGolem<Snowman> implements ISnowGolem {
    public BukkitSnowGolem(Snowman source) {
        super(source);
    }
}
