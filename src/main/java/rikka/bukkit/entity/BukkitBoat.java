package rikka.bukkit.entity;

import org.bukkit.entity.Boat;
import rikka.api.entity.vehicle.IBoat;

import static rikka.bukkit.server.NMSVersion.*;

public final class BukkitBoat extends BukkitEntity<Boat> implements IBoat {
    public BukkitBoat(Boat source) {
        super(source);
    }

    public boolean isInWater() {
        // TODO net.minecraft.entity.item.EntityBoat.checkInWater
        return !source.isOnGround();
    }

    public double getMaxSpeed() {
        // TODO multi-version
        if (v1_12_R1 || v1_11_R1 || v1_10_R1) {
            return source.getMaxSpeed();
        } else if (v1_7_R4) {

        }
        return 0;
    }

    public void setMaxSpeed(double maxSpeed) {
        // TODO multi-version
        source.setMaxSpeed(maxSpeed);
    }

    public boolean canMoveOnLand() {
        // TODO multi-version
        return source.getWorkOnLand();
    }

    public void setMoveOnLand(boolean moveOnLand) {
        // TODO multi-version
        source.setWorkOnLand(moveOnLand);
    }

    public double getOccupiedDeceleration() {
        // TODO multi-version
        return source.getOccupiedDeceleration();
    }

    public void setOccupiedDeceleration(double occupiedDeceleration) {
        // TODO multi-version
        source.setOccupiedDeceleration(occupiedDeceleration);
    }

    public double getUnoccupiedDeceleration() {
        // TODO multi-version
        return source.getUnoccupiedDeceleration();
    }

    public void setUnoccupiedDeceleration(double unoccupiedDeceleration) {
        // TODO multi-version
        source.setUnoccupiedDeceleration(unoccupiedDeceleration);
    }
}
