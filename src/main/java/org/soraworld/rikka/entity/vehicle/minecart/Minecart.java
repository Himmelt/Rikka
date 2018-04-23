package org.soraworld.rikka.entity.vehicle.minecart;

import org.soraworld.rikka.entity.Entity;
import org.soraworld.rikka.util.math.Vector3d;

public interface Minecart extends Entity {

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
