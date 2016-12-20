package org.rikka.event.block;

import org.rikka.block.IBlock;
import org.rikka.entity.IEntity;
import org.rikka.event.EventType;

public class EntityFallenEvent extends BlockEvent {

    private final IEntity entity;
    private final float distance;

    public EntityFallenEvent(IBlock block, IEntity entity, float distance) {
        super(block, EventType.BLOCK_FALLEN);
        this.distance = distance;
        this.entity = entity;
    }

    public IEntity getEntity() {
        return entity;
    }

    public float getDistance() {
        return distance;
    }
}
