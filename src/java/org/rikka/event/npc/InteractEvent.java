package org.rikka.event.npc;

import org.rikka.entity.CNpc;
import org.rikka.entity.Player;

@net.minecraftforge.fml.common.eventhandler.Cancelable
public class InteractEvent extends NpcEvent {

    private final Player player;

    InteractEvent(CNpc npc, Player player) {
        super(npc);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}
