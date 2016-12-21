package org.rikka.craft.tile;

import net.minecraft.tileentity.TileEntity;
import org.rikka.RikkaType;
import org.rikka.craft.CraftRikka;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptHandler;
import org.rikka.craft.script.ScriptManager;
import org.rikka.data.IData;
import org.rikka.tile.ITileEntity;
import org.rikka.world.IWorld;

public class CraftTileEntity extends CraftRikka<TileEntity> implements ITileEntity {

    private final IScriptHandler handler;

    public CraftTileEntity(TileEntity tile) {
        super(tile);
        handler = new ScriptHandler(this);
    }
    @Override
    public IData getTData() {
        return handler.getTData();
    }

    @Override
    public IData getSData() {
        return handler.getSData();
    }

    @Override
    public RikkaType getType() {
        return RikkaType.TILE;
    }

    @Override
    public int getX() {
        return original.getPos().getX();
    }

    @Override
    public int getY() {
        return original.getPos().getY();
    }

    @Override
    public int getZ() {
        return original.getPos().getZ();
    }

    @Override
    public IWorld getWorld() {
        return (IWorld) ScriptManager.worldHandlers.get(original.getWorld().hashCode()).getRikka();
    }

    public IScriptHandler getHandler() {
        return handler;
    }
}
