package org.rikka.event.entity.npc;

import net.minecraftforge.fml.common.eventhandler.Cancelable;
import org.rikka.entity.Player;
import org.rikka.event.Event;

@Cancelable
public class InteractEvent extends Event {

    public final Player player;

    InteractEvent(Object object, Player player) {
        super(object);
        this.player = player;
    }
}
