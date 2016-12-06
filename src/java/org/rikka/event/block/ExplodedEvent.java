package org.rikka.event.block;

import net.minecraftforge.fml.common.eventhandler.Cancelable;
import org.rikka.block.Block;

@Cancelable
public class ExplodedEvent extends BlockEvent {
    ExplodedEvent(Block block) {
        super(block);
    }
}
