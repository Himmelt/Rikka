package rikka.bukkit.entity.projectile;

import org.bukkit.entity.TippedArrow;
import rikka.api.entity.projectile.ITippedArrow;

public final class BukkitTippedArrow extends BukkitArrow<TippedArrow> implements ITippedArrow {
    public BukkitTippedArrow(TippedArrow source) {
        super(source);
    }
}
