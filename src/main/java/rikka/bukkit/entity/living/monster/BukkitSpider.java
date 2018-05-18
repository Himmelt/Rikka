package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Spider;
import rikka.api.entity.living.monster.ISpider;
import rikka.bukkit.entity.living.BukkitLiving;

public class BukkitSpider<T extends Spider> extends BukkitLiving<T> implements ISpider {
    public BukkitSpider(T source) {
        super(source);
    }

    public boolean isClimbing() {
        return false;
    }
}
