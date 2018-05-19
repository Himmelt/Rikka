package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Evoker;
import rikka.api.entity.living.monster.IEvoker;
import rikka.bukkit.entity.living.BukkitLiving;

public final class BukkitEvoker extends BukkitLiving<Evoker> implements IEvoker {
    public BukkitEvoker(Evoker source) {
        super(source);
    }
}
