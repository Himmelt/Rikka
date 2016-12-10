package org.rikka.event;

public abstract class Event<T> extends net.minecraftforge.fml.common.eventhandler.Event {

    private final T object;

    public Event(T object) {
        super();
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
