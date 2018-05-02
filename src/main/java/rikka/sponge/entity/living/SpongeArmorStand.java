package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.ArmorStand;
import rikka.api.entity.living.IArmorStand;
import rikka.sponge.entity.SpongeLiving;

public abstract class SpongeArmorStand<T extends ArmorStand> extends SpongeLiving<T> implements IArmorStand {
    public SpongeArmorStand(T source) {
        super(source);
    }
}
