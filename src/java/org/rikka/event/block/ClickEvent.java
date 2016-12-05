package org.rikka.event.block;

import org.rikka.block.Block;
import org.rikka.entity.Player;

public class ClickEvent extends BlockEvent {

    private final Player player;

    ClickEvent(Block block, Player player) {
        super(block);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
