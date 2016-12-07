package org.rikka.event.block;

import org.rikka.block.Block;
import org.rikka.event.Event;

public abstract class BlockEvent extends Event {

    private Block block;

    BlockEvent(final Block block) {
        this.block = block;
    }

    /**
     * Get event block.
     *
     * @return the block
     */
    public final Block getBlock() {
        return block;
    }

}
