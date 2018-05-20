package rikka.bukkit.entity;

import org.bukkit.entity.ItemFrame;
import rikka.api.entity.IItemFrame;

public final class BukkitItemFrame extends BukkitEntity<ItemFrame> implements IItemFrame {
    public BukkitItemFrame(ItemFrame source) {
        super(source);
    }
}
