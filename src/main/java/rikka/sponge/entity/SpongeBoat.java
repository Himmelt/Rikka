package rikka.sponge.entity;

import org.spongepowered.api.entity.vehicle.Boat;
import rikka.api.entity.vehicle.IBoat;

public final class SpongeBoat extends SpongeEntity<Boat> implements IBoat {
    public SpongeBoat(Boat source) {
        super(source);
    }

    public boolean isInWater() {
        // TODO net.minecraft.entity.item.EntityBoat.checkInWater
        return source.isInWater();
    }

    public double getMaxSpeed() {
        return source.getMaxSpeed();
    }

    public void setMaxSpeed(double maxSpeed) {
        source.setMaxSpeed(maxSpeed);
    }

    public boolean canMoveOnLand() {
        return source.canMoveOnLand();
    }

    public void setMoveOnLand(boolean moveOnLand) {
        source.setMoveOnLand(moveOnLand);
    }

    public double getOccupiedDeceleration() {
        return source.getOccupiedDeceleration();
    }

    public void setOccupiedDeceleration(double occupiedDeceleration) {
        source.setOccupiedDeceleration(occupiedDeceleration);
    }

    public double getUnoccupiedDeceleration() {
        return source.getUnoccupiedDeceleration();
    }

    public void setUnoccupiedDeceleration(double unoccupiedDeceleration) {
        source.setUnoccupiedDeceleration(unoccupiedDeceleration);
    }
}
