package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.Squid;
import rikka.api.entity.living.ISquid;

public final class SpongeSquid extends SpongeLiving<Squid> implements ISquid {
    public SpongeSquid(Squid source) {
        super(source);
    }
}
