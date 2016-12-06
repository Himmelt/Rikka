package org.rikka.data;

public interface Data {

    void put(String key, Object value);

    Object get(String key);

    void remove(String key);

    boolean has(String key);

    void clear();

}
