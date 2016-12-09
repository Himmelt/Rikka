package org.rikka.event;

import org.rikka.data.Data;
import org.rikka.script.ScriptManager;
import org.rikka.script.Scriptable;

public abstract class Event<T> extends net.minecraftforge.fml.common.eventhandler.Event {

    private final T object;

    public Event(T object){
        super();
        this.object = object;
    }

    /**
     * Get global temp data.
     *
     * @return the data
     */
    public Data getGTData() {
        return ScriptManager.getTempData();
    }

    /**
     * Get global stored data.
     *
     * @return the data
     */
    public Data getGSData() {
        return ScriptManager.getStoredData();
    }

    public T getObject(){
        return object;
    }
}
