package rikka.bukkit.entity;

import org.bukkit.entity.ShulkerBullet;
import rikka.api.entity.IShulkerBullet;

public class BukkitShulkerBullet<T extends ShulkerBullet> extends BukkitEntity<T> implements IShulkerBullet {
    public BukkitShulkerBullet(T source) {
        super(source);
    }
}
