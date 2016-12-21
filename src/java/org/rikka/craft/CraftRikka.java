package org.rikka.craft;

import org.rikka.Rikka;
import org.rikka.craft.script.IScriptHandler;
import org.rikka.craft.script.ScriptHandler;
import org.rikka.data.IData;
import org.rikka.world.IWorld;

public abstract class CraftRikka<T> implements Rikka<T> {

    protected final T original;
    protected IWorld world;
    private final IScriptHandler handler;

    protected CraftRikka(T original) {
        this.original = original;
        handler = new ScriptHandler(this);
    }

    @Override
    public IScriptHandler getHandler() {
        return handler;
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
    public T getOriginal() {
        return original;
    }

}
