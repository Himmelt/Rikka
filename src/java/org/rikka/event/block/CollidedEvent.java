package org.rikka.event.block;

import org.rikka.block.Block;
import org.rikka.entity.Entity;

public class CollidedEvent extends BlockEvent {

    private final Entity entity;

    CollidedEvent(Block block, Entity entity) {
        super(block);
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }
}
