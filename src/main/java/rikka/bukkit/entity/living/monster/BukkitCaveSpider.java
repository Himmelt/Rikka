package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.CaveSpider;
import rikka.api.entity.living.monster.ICaveSpider;

public final class BukkitCaveSpider extends BukkitSpider<CaveSpider> implements ICaveSpider {
    public BukkitCaveSpider(CaveSpider source) {
        super(source);
    }
}
