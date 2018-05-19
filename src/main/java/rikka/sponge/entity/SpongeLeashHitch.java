package rikka.sponge.entity;

import org.spongepowered.api.entity.hanging.LeashHitch;
import rikka.api.entity.IEntity;
import rikka.api.entity.ILeashHitch;

public final class SpongeLeashHitch extends SpongeEntity<LeashHitch> implements ILeashHitch {
    public SpongeLeashHitch(LeashHitch source) {
        super(source);
    }

    /* TODO not impl in minecraft & sponge */
    public IEntity getLeashedEntity() {
        return getEntity(source.getLeashedEntity());
    }
}
