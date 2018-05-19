package rikka.bukkit.entity;

import org.bukkit.entity.AreaEffectCloud;
import rikka.api.entity.IAreaEffectCloud;

public final class BukkitEffectCloud extends BukkitEntity<AreaEffectCloud> implements IAreaEffectCloud {
    public BukkitEffectCloud(AreaEffectCloud source) {
        super(source);
    }
}
