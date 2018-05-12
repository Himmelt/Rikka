package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.Squid;
import rikka.api.entity.living.ISquid;
import rikka.sponge.entity.SpongeLiving;

public class SpongeSquid<T extends Squid> extends SpongeLiving<T> implements ISquid {
    public SpongeSquid(T source) {
        super(source);
    }
}
