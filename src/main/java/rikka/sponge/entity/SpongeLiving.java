package rikka.sponge.entity;

import org.soraworld.rikka.entity.living.ILiving;
import org.spongepowered.api.entity.living.Living;

public abstract class SpongeLiving<T extends Living> extends SpongeEntity<T> implements ILiving {

    public SpongeLiving(T source) {
        super(source);
    }

}
