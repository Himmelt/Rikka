package org.soraworld.rikka.event;

import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.Rikka;
import org.rikka.data.IData;
import org.soraworld.rikka.craft.capability.DataHandler;

public abstract class REvent<R extends Rikka> extends Event {

    private final R rikka;
    private final EventType type;

    public REvent(R rikka, EventType type) {
        super();
        this.rikka = rikka;
        this.type = type;
    }

    public R getRikka() {
        return rikka;
    }

    public boolean cancel() {
        if (type.cancel) {
            this.setCanceled(true);
            return true;
        }
        return false;
    }

    public String hook() {
        return type.hook;
    }

    public IData getGTData() {
        return DataHandler.GTData;
    }

    public IData getGSData() {
        return DataHandler.GSData;
    }

}
