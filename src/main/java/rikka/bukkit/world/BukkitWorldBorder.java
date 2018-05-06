package rikka.bukkit.world;

import org.bukkit.World;
import org.bukkit.WorldBorder;
import rikka.api.util.math.Vector3d;
import rikka.api.world.IWorldBorder;
import rikka.bukkit.BukkitRikka;

public class BukkitWorldBorder extends BukkitRikka<WorldBorder> implements IWorldBorder {

    public BukkitWorldBorder(WorldBorder source) {
        super(source);
    }

    public double getNewDiameter() {
        World world = source.getCenter().getWorld();
        try {
            if (world instanceof org.bukkit.craftbukkit.v1_12_R1.CraftWorld) {
                ((org.bukkit.craftbukkit.v1_12_R1.CraftWorld) world).getHandle().getWorldBorder().j();
            } else if (world instanceof org.bukkit.craftbukkit.v1_7_R4.CraftWorld) {
                // TODO not support
            }
        } catch (Throwable ignored) {
        }
        return 0;
    }

    public double getDiameter() {
        return source.getSize();
    }

    public void setDiameter(double diameter) {
        // TODO diameter ?= size or size/2
        source.setSize(diameter);
    }

    public void setDiameter(double diameter, long time) {
        // TODO diameter ?= size or size/2
        source.setSize(diameter, time);
    }

    public void setDiameter(double startDiameter, double endDiameter, long time) {
        World world = source.getCenter().getWorld();
        try {
            if (world instanceof org.bukkit.craftbukkit.v1_12_R1.CraftWorld) {
                ((org.bukkit.craftbukkit.v1_12_R1.CraftWorld) world).getHandle().getWorldBorder().transitionSizeBetween(startDiameter, endDiameter, time);
            } else if (world instanceof org.bukkit.craftbukkit.v1_7_R4.CraftWorld) {
                // TODO not support
            }
        } catch (Throwable ignored) {
        }
    }

    public long getTimeRemaining() {
        // TODO bukkit no such method
        return 0;
    }

    public void setCenter(double x, double z) {
        source.setCenter(x, z);
    }

    public Vector3d getCenter() {
        return new Vector3d(source.getCenter().toVector());
    }

    public int getWarningTime() {
        return source.getWarningTime();
    }

    public void setWarningTime(int time) {
        source.setWarningTime(time);
    }

    public int getWarningDistance() {
        return source.getWarningDistance();
    }

    public void setWarningDistance(int distance) {
        source.setWarningDistance(distance);
    }

    public double getDamageThreshold() {
        return source.getDamageBuffer();
    }

    public void setDamageThreshold(double distance) {
        source.setDamageBuffer(distance);
    }

    public double getDamageAmount() {
        return source.getDamageAmount();
    }

    public void setDamageAmount(double damage) {
        source.setDamageAmount(damage);
    }
}
