package org.soraworld.rikka.event.block;

import org.rikka.block.IBlock;
import org.soraworld.rikka.event.EventType;

public class RedstoneEvent extends BlockEvent {

    private final int variation;

    RedstoneEvent(IBlock block, int variation) {
        super(block, EventType.BLOCK_REDSTONE);
        this.variation = variation;
    }

    public int getVariation() {
        return variation;
    }
}
