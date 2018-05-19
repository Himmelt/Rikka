package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Endermite;
import rikka.api.entity.living.monster.IEndermite;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeEndermite extends SpongeLiving<Endermite> implements IEndermite {
    public SpongeEndermite(Endermite source) {
        super(source);
    }
}
