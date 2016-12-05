package org.rikka.event.block;

import org.rikka.block.Block;

public class UpdateEvent extends BlockEvent {

    UpdateEvent(Block block) {
        super(block);
    }
}
