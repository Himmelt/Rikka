package org.rikka.craft;

import net.minecraftforge.common.capabilities.ICapabilityProvider;
import org.rikka.Rikka;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptManager;
import org.rikka.data.IData;
import org.rikka.world.IWorld;

public abstract class CraftRikka<T> implements Rikka {

    protected final T original;
    protected IWorld world;
    private IScriptHandler handler;

    protected CraftRikka(T original) {
        this.original = original;
    }

    private IScriptHandler getHandler() {
        if (original instanceof ICapabilityProvider) {
            if (handler == null && ((ICapabilityProvider) original).hasCapability(ScriptManager.capability, null)) {
                handler = ((ICapabilityProvider) original).getCapability(ScriptManager.capability, null);
            }
            return handler;
        }
        return null;
    }

    @Override
    public IData getTData() {
        if (handler == null) {
            handler = getHandler();
            if (handler == null) {
                return null;
            }
            return handler.getTData();
        }
        return handler.getTData();
    }

    @Override
    public IData getSData() {
        if (handler == null) {
            handler = getHandler();
            if (handler == null) {
                return null;
            }
            return handler.getSData();
        }
        return handler.getSData();
    }

}
