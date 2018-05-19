package rikka.bukkit.entity.living;

import org.bukkit.entity.Bat;
import rikka.api.entity.living.IBat;

public final class BukkitBat extends BukkitLiving<Bat> implements IBat {
    public BukkitBat(Bat source) {
        super(source);
    }
}
