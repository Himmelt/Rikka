package org.rikka.event;

import org.rikka.Rikka;
import org.rikka.craft.script.ScriptManager;
import org.rikka.data.Data;

public abstract class Event extends net.minecraftforge.fml.common.eventhandler.Event {

    public final Rikka rikka;
    public final Data gtData = ScriptManager.getGTData();
    public final Data gsData = ScriptManager.getGSData();

    public Event(Rikka rikka) {
        super();
        this.rikka = rikka;
    }

    public boolean cancel() {
        if (this.isCancelable()) {
            this.setCanceled(true);
            return true;
        }
        return false;
    }

}
