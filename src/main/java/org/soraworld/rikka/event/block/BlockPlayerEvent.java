package org.soraworld.rikka.event.block;

import org.rikka.block.IBlock;
import org.rikka.entity.IPlayer;
import org.soraworld.rikka.event.EventType;

public class BlockPlayerEvent extends BlockEvent {

    private final IPlayer player;

    BlockPlayerEvent(IBlock block, EventType type, IPlayer player) {
        super(block, type);
        this.player = player;
    }

    public IPlayer getPlayer() {
        return player;
    }
}
