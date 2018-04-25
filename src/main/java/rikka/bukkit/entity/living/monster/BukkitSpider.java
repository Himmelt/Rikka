package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Spider;
import rikka.api.entity.living.monster.ISpider;
import rikka.bukkit.entity.BukkitLiving;

public abstract class BukkitSpider<T extends Spider> extends BukkitLiving<T> implements ISpider {
    public BukkitSpider(T source) {
        super(source);
    }
}
