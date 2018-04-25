package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.CaveSpider;
import rikka.api.entity.living.monster.ICaveSpider;

public abstract class BukkitCaveSpider<T extends CaveSpider> extends BukkitSpider<T> implements ICaveSpider {
    public BukkitCaveSpider(T source) {
        super(source);
    }
}
