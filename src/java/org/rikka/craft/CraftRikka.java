package org.rikka.craft;

import org.rikka.Rikka;

public abstract class CraftRikka<T> implements Rikka<T> {

    protected final T original;

    protected CraftRikka(T original) {
        this.original = original;
    }

    @Override
    public T getOriginal() {
        return original;
    }

}
