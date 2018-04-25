package rikka.sponge.entity;

import org.spongepowered.api.entity.Entity;
import rikka.api.entity.IEntity;
import rikka.sponge.SpongeRikka;

public abstract class SpongeEntity<T extends Entity> extends SpongeRikka<T> implements IEntity {

    public SpongeEntity(T source) {
        super(source);
    }

}
