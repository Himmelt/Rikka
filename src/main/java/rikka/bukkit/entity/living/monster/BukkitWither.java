package rikka.bukkit.entity.living.monster;

import org.bukkit.entity.Wither;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.living.monster.IWither;
import rikka.bukkit.entity.living.BukkitLiving;

import java.util.List;

public final class BukkitWither<T extends Wither> extends BukkitLiving<T> implements IWither {
    public BukkitWither(T source) {
        super(source);
    }

    public List<ILiving> getTargets() {
        return null;
    }

    public void setTargets(List<ILiving> targets) {

    }

    public boolean isPrimed() {
        return false;
    }

    public void prime() {

    }

    public void defuse() {

    }

    public void detonate() {

    }
}
