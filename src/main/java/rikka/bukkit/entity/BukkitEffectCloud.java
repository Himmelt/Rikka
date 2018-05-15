package rikka.bukkit.entity;

import org.bukkit.entity.AreaEffectCloud;
import rikka.api.entity.IAreaEffectCloud;

public class BukkitEffectCloud<T extends AreaEffectCloud> extends BukkitEntity<T> implements IAreaEffectCloud {
    public BukkitEffectCloud(T source) {
        super(source);
    }
}
