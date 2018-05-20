package rikka.bukkit.entity;

import org.bukkit.entity.Painting;
import rikka.api.entity.IPainting;

public final class BukkitPainting extends BukkitEntity<Painting> implements IPainting {
    public BukkitPainting(Painting source) {
        super(source);
    }
}
