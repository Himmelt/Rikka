package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Slime;
import rikka.api.entity.living.monster.ISlime;
import rikka.bukkit.entity.living.BukkitLiving;

public class BukkitSlime<T extends Slime> extends BukkitLiving<T> implements ISlime {
    public BukkitSlime(T source) {
        super(source);
    }
}
