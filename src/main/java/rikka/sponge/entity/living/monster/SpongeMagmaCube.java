package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.MagmaCube;
import rikka.api.entity.living.monster.IMagmaCube;

public final class SpongeMagmaCube<T extends MagmaCube> extends SpongeSlime<T> implements IMagmaCube {
    public SpongeMagmaCube(T source) {
        super(source);
    }
}
