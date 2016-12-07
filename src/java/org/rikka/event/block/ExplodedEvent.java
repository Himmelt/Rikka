package org.rikka.event.block;

import org.rikka.block.Block;

@net.minecraftforge.fml.common.eventhandler.Cancelable
public class ExplodedEvent extends BlockEvent {
    ExplodedEvent(Block block) {
        super(block);
    }
}
