package org.rikka.script.tile;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.eventhandler.Event;
import org.rikka.block.Block;
import org.rikka.craft.block.CraftBlock;
import org.rikka.data.Data;
import org.rikka.script.EventHooks;
import org.rikka.script.ScriptManager;
import org.rikka.script.ScriptType;
import org.rikka.script.Scriptable;
import org.rikka.script.data.StoredData;
import org.rikka.script.data.TempData;

import java.util.ArrayList;
import java.util.List;

public class TileScript extends TileEntity implements ITickable, Scriptable<Block> {

    private List<String> scripts = new ArrayList<>();
    private String language = "ECMAScript";
    private boolean inited = false;
    private boolean enabled = false;
    private Block block;
    private final Data tempData = new TempData();
    private final Data storedData = new StoredData(this.getTileData());

    @Override
    public void update() {

    }

    @Override
    public void runScript(ScriptType type, Event event) {
        if (enabled && ScriptManager.isStarted() && !this.worldObj.isRemote) {
            if (!inited) {
                inited = true;
                EventHooks.onBlockScriptInit(this);
            }
        }
    }

    @Override
    public boolean isClient() {
        return this.getWorld().isRemote;
    }

    @Override
    public boolean getEnabled() {
        return enabled;
    }

    @Override
    public Data getTData() {
        return tempData;
    }

    @Override
    public Data getSData() {
        return storedData;
    }

    @Override
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public String getLanguage() {
        return language;
    }

    @Override
    public void setLanguage(String lang) {
        this.language = lang;
    }

    @Override
    public List<String> getScripts() {
        return scripts;
    }

    @Override
    public String noticeString() {
        BlockPos pos = this.getPos();
        return String.format("%s(%d,%d,%d)", this, pos.getX(), pos.getY(), pos.getZ());
    }

    @Override
    public Block getObject() {
        if (block == null) {
            block = new CraftBlock(this.getWorld(), this.getBlockType(), this.getPos());
        }
        return block;
    }
}
