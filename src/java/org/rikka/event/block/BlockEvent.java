package org.rikka.event.block;

import org.rikka.block.Block;
import org.rikka.event.Event;

public abstract class BlockEvent extends Event {

    public BlockEvent(Block block) {
        super(block);
    }

}
