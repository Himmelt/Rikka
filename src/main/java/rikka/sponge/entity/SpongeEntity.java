package rikka.sponge.entity;

import org.soraworld.rikka.entity.IEntity;
import org.spongepowered.api.entity.Entity;

public class SpongeEntity<T extends Entity> implements IEntity {

    protected final T source;

    public SpongeEntity(T source) {
        this.source = source;
    }

}
