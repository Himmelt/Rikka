package org.rikka.event.block;

import org.rikka.block.IBlock;
import org.rikka.event.EventType;
import org.rikka.event.REvent;

public class BlockEvent extends REvent<IBlock> {

    BlockEvent(IBlock block, EventType type) {
        super(block, type);
    }
}
