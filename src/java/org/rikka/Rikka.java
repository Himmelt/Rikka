package org.rikka;

import org.rikka.data.IData;
import org.rikka.world.IWorld;

/**
 * The interface Rikka.
 */
public interface Rikka {

    /**
     * 获取Rikka包装类型.
     *
     * @return 包装类型
     */
    RikkaType type();

    /**
     * 获取所在方块 x 坐标.
     * 世界则获取出生点 x 坐标.
     *
     * @return x 坐标.
     */
    int getBlockX();

    /**
     * 获取所在方块 y 坐标.
     * 世界则获取出生点 y 坐标.
     *
     * @return y 坐标.
     */
    int getBlockY();

    /**
     * 获取所在方块 z 坐标.
     * 世界则获取出生点 z 坐标.
     *
     * @return z 坐标.
     */
    int getBlockZ();

    /**
     * 获取缓存变量(TempData).
     *
     * @return 缓存变量.
     */
    IData getTData();

    /**
     * 获取存储变量(StoredData).
     *
     * @return 存储变量.
     */
    IData getSData();

    IWorld getWorld();

}
