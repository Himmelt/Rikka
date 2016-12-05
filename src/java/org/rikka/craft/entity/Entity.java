package org.rikka.craft.entity;

public interface Entity<T extends net.minecraft.entity.Entity> {

    double getX();

    void setX(double x);

    double getY();

    void setY(double y);

    double getZ();

    void setZ(double z);

    int getBlockX();

    int getBlockY();

    int getBlockZ();

    void setPosition(double x, double y, double z);

    EntityType getType();
}
