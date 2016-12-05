package org.rikka.event.block;

import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.block.Block;

public abstract class BlockEvent extends Event {

    private Block block;

    BlockEvent(final Block block) {
        this.block = block;
    }

    public final Block getBlock() {
        return block;
    }
}
