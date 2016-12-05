package org.rikka.event.block;

import org.rikka.block.Block;

public class RedstoneEvent extends BlockEvent {

    private final int variation;

    RedstoneEvent(Block block, int variation) {
        super(block);
        this.variation = variation;
    }

    public int getVariation() {
        return variation;
    }
}
