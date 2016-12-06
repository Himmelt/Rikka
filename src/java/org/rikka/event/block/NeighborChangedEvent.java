package org.rikka.event.block;

import org.rikka.block.Block;

public class NeighborChangedEvent extends BlockEvent {
    NeighborChangedEvent(Block block) {
        super(block);
    }
}
