package org.rikka.craft.data;

import org.rikka.data.IData;

import java.util.HashMap;
import java.util.Set;

public class CraftData implements IData {

    private final HashMap<String, Object> dataMap = new HashMap<>();

    @Override
    public void put(String key, Object value) {
        dataMap.put(key, value);
    }

    @Override
    public Object get(String key) {
        return dataMap.get(key);
    }

    @Override
    public void remove(String key) {
        dataMap.remove(key);
    }

    @Override
    public boolean has(String key) {
        return dataMap.containsKey(key);
    }

    @Override
    public void clear() {
        dataMap.clear();
    }

    @Override
    public Set<String> keySet() {
        return dataMap.keySet();
    }
}
