package org.rikka.event.block;

import net.minecraft.entity.Entity;
import org.rikka.block.Block;

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
