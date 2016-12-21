package org.rikka;

import org.rikka.world.IWorld;

/**
 * The interface Rikka.
 */
public interface Rikka<T> {

    /**
     * 获取Rikka包装类型.
     *
     * @return 包装类型
     */
    RikkaType getType();

    /**
     * 获取所在方块 x 坐标.
     * 世界则获取出生点 x 坐标.
     *
     * @return x 坐标.
     */
    int getX();

    /**
     * 获取所在方块 y 坐标.
     * 世界则获取出生点 y 坐标.
     *
     * @return y 坐标.
     */
    int getY();

    /**
     * 获取所在方块 z 坐标.
     * 世界则获取出生点 z 坐标.
     *
     * @return z 坐标.
     */
    int getZ();

    IWorld getWorld();

    T getOriginal();

}
