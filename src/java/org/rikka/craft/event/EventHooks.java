package org.rikka.craft.event;

import org.rikka.craft.script.ScriptType;
import org.rikka.craft.tile.TileScript;
import org.rikka.event.block.InitEvent;

public class EventHooks {

    public static void onBlockScriptInit(TileScript tile) {
        if (!tile.isClient()) {
            InitEvent event = new InitEvent(tile.getObject());
            tile.runScript(ScriptType.INIT, event);
            // EVENT_BUS.post(event);
        }
    }
}
