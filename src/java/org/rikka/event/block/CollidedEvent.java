package org.rikka.event.block;

import org.rikka.block.IBlock;
import org.rikka.entity.IEntity;
import org.rikka.event.EventType;

public class CollidedEvent extends BlockEvent {

    private final IEntity entity;

    CollidedEvent(IBlock block, IEntity entity) {
        super(block, EventType.BLOCK_COLLIDE);
        this.entity = entity;
    }

    public IEntity getEntity() {
        return entity;
    }
}
