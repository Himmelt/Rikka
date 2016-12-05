package org.rikka.event.block;

import net.minecraftforge.fml.common.eventhandler.Cancelable;
import org.rikka.block.Block;
import org.rikka.entity.Entity;

@Cancelable
public class EntityFallenEvent extends BlockEvent {

    private final Entity entity;
    private final float distance;

    public EntityFallenEvent(Block block, Entity entity, float distance) {
        super(block);
        this.distance = distance;
        this.entity = entity;
    }

    public Entity getEntity() {
        return entity;
    }

    public float getDistance() {
        return distance;
    }
}
