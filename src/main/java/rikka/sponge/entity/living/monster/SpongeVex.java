package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Vex;
import rikka.api.entity.living.monster.IVex;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeVex extends SpongeLiving<Vex> implements IVex {
    public SpongeVex(Vex source) {
        super(source);
    }
}
