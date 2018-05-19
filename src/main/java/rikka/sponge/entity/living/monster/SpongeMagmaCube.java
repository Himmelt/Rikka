package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.MagmaCube;
import rikka.api.entity.living.monster.IMagmaCube;

public final class SpongeMagmaCube extends SpongeSlime<MagmaCube> implements IMagmaCube {
    public SpongeMagmaCube(MagmaCube source) {
        super(source);
    }
}
