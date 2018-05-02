package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Donkey;
import rikka.api.entity.living.animal.IDonkey;

public abstract class BukkitDonkey<T extends Donkey> extends BukkitHorse<T> implements IDonkey {
    public BukkitDonkey(T source) {
        super(source);
    }
}
