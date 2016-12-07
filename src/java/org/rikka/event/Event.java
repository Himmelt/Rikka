package org.rikka.event;

import org.rikka.data.Data;
import org.rikka.script.ScriptManager;

public abstract class Event extends net.minecraftforge.fml.common.eventhandler.Event {

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
}
