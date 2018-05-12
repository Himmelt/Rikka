package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.complex.EnderDragon;
import rikka.api.entity.IEnderCrystal;
import rikka.api.entity.living.complex.EnderDragonPart;
import rikka.api.entity.living.complex.IEnderDragon;
import rikka.sponge.entity.SpongeLiving;

import java.util.Optional;
import java.util.Set;

public class SpongeEnderDragon<T extends EnderDragon> extends SpongeLiving<T> implements IEnderDragon {
    public SpongeEnderDragon(T source) {
        super(source);
    }

    public Set<EnderDragonPart> getParts() {
        return null;
    }

    public Optional<IEnderCrystal> getHealingCrystal() {
        return Optional.empty();
    }
}
