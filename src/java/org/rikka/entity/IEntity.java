package org.rikka.entity;

import net.minecraft.entity.Entity;
import org.rikka.Rikka;
import org.rikka.handler.IPosHandler;
import org.rikka.world.IWorld;

/**
 * 实体(IEntity)接口.
 *
 * @param <R> 泛型实体类.
 */
public interface IEntity<R extends Entity> extends Rikka<R>, IPosHandler {

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
     * 设置实体 x 坐标.
     *
     * @param x x 坐标.
     */
    void setX(int x);

    /**
     * 设置实体 y 坐标.
     *
     * @param y y 坐标.
     */
    void setY(int y);

    /**
     * 设置实体 z 坐标.
     *
     * @param z z 坐标.
     */
    void setZ(int z);

    /**
     * 设置实体到指定坐标.
     *
     * @param x x 坐标.
     * @param y y 坐标.
     * @param z z 坐标.
     */
    void setPosition(double x, double y, double z);

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

    IWorld getWorld();

}
