package org.rikka.event;

import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.Rikka;
import org.rikka.craft.script.ScriptManager;
import org.rikka.data.IData;

public abstract class REvent<R extends Rikka> extends Event {

    protected final R rikka;
    public final EventType type;
    public final IData gtData = ScriptManager.getGTData();
    public final IData gsData = ScriptManager.getGSData();

    public REvent(R rikka, EventType type) {
        super();
        this.rikka = rikka;
        this.type = type;
    }

    public boolean cancel() {
        if (type.cancel) {
            this.setCanceled(true);
            return true;
        }
        return false;
    }

}
