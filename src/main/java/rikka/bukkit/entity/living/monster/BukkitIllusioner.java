package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Illusioner;
import rikka.api.entity.living.monster.IIllusioner;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitIllusioner extends BukkitLiving<Illusioner> implements IIllusioner {
    public BukkitIllusioner(Illusioner source) {
        super(source);
    }
}
