package org.rikka.entity;

import org.rikka.Rikka;
import org.rikka.RikkaType;
import org.rikka.World;
import org.rikka.data.Data;

/**
 * 实体(Entity)接口.
 *
 * @param <T> 泛型实体类.
 */
public interface Entity<T extends net.minecraft.entity.Entity> extends Rikka {

    /**
     * 获取实体注册名.
     *
     * @return 注册名.
     */
    String getName();

    /**
     * 获取实体显示名称.
     *
     * @return 显示名称.
     */
    String getDisplayName();

    /**
     * 获取实体 x 坐标.
     *
     * @return x 坐标.
     */
    double getX();

    /**
     * 设置实体 x 坐标.
     *
     * @param x x 坐标.
     */
    void setX(double x);

    /**
     * 获取实体 y 坐标.
     *
     * @return y 坐标.
     */
    double getY();

    /**
     * 设置实体 y 坐标.
     *
     * @param y y 坐标.
     */
    void setY(double y);

    /**
     * 获取实体 z 坐标.
     *
     * @return z 坐标.
     */
    double getZ();

    /**
     * 设置实体 z 坐标.
     *
     * @param z z 坐标.
     */
    void setZ(double z);

    /**
     * 获取实体所在方块 x 坐标.
     *
     * @return x 坐标.
     */
    int getBlockX();

    /**
     * 获取实体所在方块 y 坐标.
     *
     * @return y 坐标.
     */
    int getBlockY();

    /**
     * 获取实体所在方块 z 坐标.
     *
     * @return z 坐标.
     */
    int getBlockZ();

    /**
     * 设置实体到指定坐标.
     *
     * @param x x 坐标.
     * @param y y 坐标.
     * @param z z 坐标.
     */
    void setPosition(double x, double y, double z);

    /**
     * 获取缓存变量(TempData).
     *
     * @return 缓存变量.
     */
    Data getTData();

    /**
     * 获取存储变量(StoredData).
     *
     * @return 存储变量.
     */
    Data getSData();

    /**
     * 获取年龄(存活时长).
     *
     * @return 年龄.
     */
    long getAge();

    /**
     * 消亡.
     */
    void despawn();

    /**
     * 获取 MC 实体(高级用法,不清楚勿用).
     *
     * @return MC 实体.
     */
    T getMCEntity();

    /**
     * 获取实体所在世界.
     *
     * @return 世界.
     */
    World getWorld();

    /**
     * 获取实体类型.
     *
     * @return 类型.
     */
    RikkaType getType();
}
