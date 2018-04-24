package rikka.api.entity.vehicle;

import rikka.api.entity.IEntity;

public interface Boat extends IEntity {

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
