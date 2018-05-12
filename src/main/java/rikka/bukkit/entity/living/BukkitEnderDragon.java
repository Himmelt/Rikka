package rikka.bukkit.entity.living;

import org.bukkit.entity.EnderDragon;
import rikka.api.entity.IEnderCrystal;
import rikka.api.entity.living.complex.EnderDragonPart;
import rikka.api.entity.living.complex.IEnderDragon;
import rikka.bukkit.entity.BukkitLiving;

import java.util.Optional;
import java.util.Set;

public class BukkitEnderDragon<T extends EnderDragon> extends BukkitLiving<T> implements IEnderDragon {

    public BukkitEnderDragon(T source) {
        super(source);
    }

    public Set<EnderDragonPart> getParts() {
        return null;
    }

    public Optional<IEnderCrystal> getHealingCrystal() {
        return Optional.empty();
    }
}
