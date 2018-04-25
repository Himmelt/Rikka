package rikka.sponge.entity;

import org.spongepowered.api.entity.living.Living;
import rikka.api.entity.living.ILiving;

public abstract class SpongeLiving<T extends Living> extends SpongeEntity<T> implements ILiving {

    public SpongeLiving(T source) {
        super(source);
    }

}
