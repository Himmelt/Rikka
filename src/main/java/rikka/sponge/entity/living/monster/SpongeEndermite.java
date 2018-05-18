package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Endermite;
import rikka.api.entity.living.monster.IEndermite;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeEndermite<T extends Endermite> extends SpongeLiving<T> implements IEndermite {
    public SpongeEndermite(T source) {
        super(source);
    }
}
