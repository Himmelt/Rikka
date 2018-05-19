package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Guardian;
import rikka.api.entity.living.monster.IGuardian;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeGuardian extends SpongeLiving<Guardian> implements IGuardian {
    public SpongeGuardian(Guardian source) {
        super(source);
    }
}
