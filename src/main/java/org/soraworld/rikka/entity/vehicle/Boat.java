package org.soraworld.rikka.entity.vehicle;

import org.soraworld.rikka.entity.Entity;

public interface Boat extends Entity {

    boolean isInWater();

    double getMaxSpeed();

    void setMaxSpeed(double maxSpeed);

    boolean canMoveOnLand();

    void setMoveOnLand(boolean moveOnLand);

    double getOccupiedDeceleration();

    void setOccupiedDeceleration(double occupiedDeceleration);

    double getUnoccupiedDeceleration();

    void setUnoccupiedDeceleration(double unoccupiedDeceleration);

}
