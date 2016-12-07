package org.rikka.script.data;

import org.rikka.data.Data;

import java.util.HashMap;

public class TempData implements Data {

    private HashMap<String, Object> tempDataMap = new HashMap<>();

    @Override
    public void put(String key, Object value) {
        tempDataMap.put(key, value);
    }

    @Override
    public Object get(String key) {
        return tempDataMap.get(key);
    }

    @Override
    public void remove(String key) {
        tempDataMap.remove(key);
    }

    @Override
    public boolean has(String key) {
        return tempDataMap.containsKey(key);
    }

    @Override
    public void clear() {
        tempDataMap.clear();
    }
}
