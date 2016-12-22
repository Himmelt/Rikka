package org.rikka.craft;

import org.rikka.Rikka;

public abstract class CraftRikka<T> implements Rikka<T> {

    protected final T origin;

    protected CraftRikka(T origin) {
        this.origin = origin;
    }

    @Override
    public T getOrigin() {
        return origin;
    }

}
