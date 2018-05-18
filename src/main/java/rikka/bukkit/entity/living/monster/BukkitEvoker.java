package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Evoker;
import rikka.api.entity.living.monster.IEvoker;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitEvoker<T extends Evoker> extends BukkitLiving<T> implements IEvoker {
    public BukkitEvoker(T source) {
        super(source);
    }
}
