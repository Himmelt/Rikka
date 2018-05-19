package rikka.bukkit.entity.living;

import org.bukkit.entity.EnderDragon;
import rikka.api.entity.IEnderCrystal;
import rikka.api.entity.living.complex.EnderDragonPart;
import rikka.api.entity.living.complex.IEnderDragon;

import java.util.Optional;
import java.util.Set;

public final class BukkitEnderDragon extends BukkitLiving<EnderDragon> implements IEnderDragon {

    public BukkitEnderDragon(EnderDragon source) {
        super(source);
    }

    public Set<EnderDragonPart> getParts() {
        return null;
    }

    public Optional<IEnderCrystal> getHealingCrystal() {
        return Optional.empty();
    }
}
