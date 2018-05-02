package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Guardian;
import rikka.api.entity.living.monster.IGuardian;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeGuardian<T extends Guardian> extends SpongeLiving<T> implements IGuardian {
    public SpongeGuardian(T source) {
        super(source);
    }
}
