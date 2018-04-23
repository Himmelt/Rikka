package org.soraworld.rikka.craft.event;

public class RikkaException extends RuntimeException {

    public RikkaException(String message, Object... objects) {
        super(String.format(message, objects));
    }
}
