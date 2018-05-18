package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Donkey;
import rikka.api.entity.living.animal.IDonkey;

public final class BukkitDonkey extends BukkitHorse<Donkey> implements IDonkey {
    public BukkitDonkey(Donkey source) {
        super(source);
    }
}
