package org.soraworld.rikka.event.block;

import org.rikka.block.IBlock;
import org.rikka.entity.IPlayer;
import org.soraworld.rikka.event.EventType;

public class ActivatedEvent extends BlockPlayerEvent {

    private final float hitX, hitY, hitZ;
    private final int side;

    public ActivatedEvent(IBlock block, IPlayer player, int side, float hitX, float hitY, float hitZ) {
        super(block, EventType.BLOCK_ACTIVE, player);
        this.hitX = hitX;
        this.hitY = hitY;
        this.hitZ = hitZ;
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public float getHitX() {
        return hitX;
    }

    public float getHitY() {
        return hitY;
    }

    public float getHitZ() {
        return hitZ;
    }

}
