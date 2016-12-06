package org.rikka.event.block;

import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.block.Block;
import org.rikka.data.Data;
import org.rikka.script.ScriptManager;

public abstract class BlockEvent extends Event {

    private Block block;

    BlockEvent(final Block block) {
        this.block = block;
    }

    /**
     * Get event block.
     *
     * @return the block
     */
    public final Block getBlock() {
        return block;
    }


    /**
     * Get global temp data.
     *
     * @return the data
     */
    public Data getGTData(){
        return ScriptManager.INSTANCE.getTempData();
    }

    /**
     * Get global stored data.
     *
     * @return the data
     */
    public Data getGSData(){
        return ScriptManager.INSTANCE.getStoredData();
    }
}
