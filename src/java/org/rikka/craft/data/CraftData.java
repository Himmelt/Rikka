package org.rikka.craft.data;

import org.rikka.data.Data;

import java.util.HashMap;

public class CraftData implements Data {

    private final HashMap<String, Object> dataMap;

    public CraftData(HashMap<String, Object> dataMap) {
        this.dataMap = dataMap;
    }

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
}
