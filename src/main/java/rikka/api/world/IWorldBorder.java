package rikka.api.world;

import rikka.api.util.math.Vector3d;

public interface IWorldBorder {

    double getNewDiameter();

    double getDiameter();

    void setDiameter(double diameter);

    void setDiameter(double diameter, long time);

    void setDiameter(double startDiameter, double endDiameter, long time);

    long getTimeRemaining();

    void setCenter(double x, double z);

    Vector3d getCenter();

    int getWarningTime();

    void setWarningTime(int time);

    int getWarningDistance();

    void setWarningDistance(int distance);

    // TODO fix method name with spigot
    double getDamageThreshold();

    // TODO fix method name with spigot
    void setDamageThreshold(double distance);

    double getDamageAmount();

    void setDamageAmount(double damage);

}
