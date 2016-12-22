package org.rikka.craft;

import org.rikka.Rikka;
import org.rikka.craft.entity.CraftPlayer;
import org.rikka.craft.world.CraftWorld;

import java.util.HashMap;
import java.util.Map;

public abstract class CraftRikka<T> implements Rikka<T> {

    protected final T origin;
    public static final Map<Integer, CraftWorld> worlds = new HashMap<>();
    public static final Map<Integer, CraftPlayer> players = new HashMap<>();

    protected CraftRikka(T origin) {
        this.origin = origin;
    }

    @Override
    public T getOrigin() {
        return origin;
    }

}
