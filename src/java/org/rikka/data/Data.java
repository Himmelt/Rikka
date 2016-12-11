package org.rikka.data;

import java.util.Set;

/**
 * 脚本变量接口.
 */
public interface Data {

    /**
     * 存 变量({@link Data}).
     *
     * @param key   变量的键(key).
     * @param value 变量的值(value).
     */
    void put(String key, Object value);

    /**
     * 取 变量({@link Data}).
     *
     * @param key 变量的键(key).
     * @return 变量的值(value).
     */
    Object get(String key);

    /**
     * 移除指定键的变量({@link Data}).
     *
     * @param key 欲移除变量的键(key).
     */
    void remove(String key);

    /**
     * 是否含有指定键的变量({@link Data}).
     *
     * @param key 变量的键(key).
     * @return 是否含有该变量.
     */
    boolean has(String key);

    /**
     * 清除所有变量({@link Data}).
     */
    void clear();

    Set<String> keySet();

}
