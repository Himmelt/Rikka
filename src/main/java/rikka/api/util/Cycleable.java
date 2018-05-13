package rikka.api.util;

public interface Cycleable<T extends Cycleable<T>> {
    T cycleNext();
}
