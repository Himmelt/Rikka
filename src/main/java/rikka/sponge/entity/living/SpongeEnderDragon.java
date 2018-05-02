package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.complex.EnderDragon;
import rikka.api.entity.living.complex.IEnderDragon;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeEnderDragon<T extends EnderDragon> extends SpongeLiving<T> implements IEnderDragon {
    public SpongeEnderDragon(T source) {
        super(source);
    }
}
