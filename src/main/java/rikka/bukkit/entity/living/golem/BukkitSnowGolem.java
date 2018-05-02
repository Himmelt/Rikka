package rikka.bukkit.entity.living.golem;

import org.bukkit.entity.Snowman;
import rikka.api.entity.living.golem.ISnowGolem;

public abstract class BukkitSnowGolem<T extends Snowman> extends BukkitGolem<T> implements ISnowGolem {
    public BukkitSnowGolem(T source) {
        super(source);
    }
}
