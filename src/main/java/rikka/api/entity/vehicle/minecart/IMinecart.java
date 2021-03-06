package rikka.api.entity.vehicle.minecart;

import rikka.api.entity.IEntity;
import rikka.api.util.math.Vector3d;

public interface IMinecart extends IEntity {

    boolean isOnRail();

    double getSwiftness();

    void setSwiftness(double swiftness);

    double getPotentialMaxSpeed();

    boolean doesSlowWhenEmpty();

    void setSlowWhenEmpty(boolean slowWhenEmpty);

    Vector3d getAirborneVelocityMod();

    void setAirborneVelocityMod(Vector3d airborneVelocityMod);

    Vector3d getDerailedVelocityMod();

    void setDerailedVelocityMod(Vector3d derailedVelocityMod);

}
