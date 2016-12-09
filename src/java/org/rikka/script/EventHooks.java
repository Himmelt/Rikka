package org.rikka.script;

import org.rikka.event.block.InitEvent;
import org.rikka.script.tile.TileScript;

public class EventHooks {

    public static void onBlockScriptInit(TileScript tile) {
        if(!tile.isClient()){
            InitEvent event = new InitEvent(tile.getObject());
            tile.runScript(ScriptType.INIT, event);
            // EVENT_BUS.post(event);
        }
    }
}
