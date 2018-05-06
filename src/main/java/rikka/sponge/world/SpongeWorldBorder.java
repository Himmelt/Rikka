package rikka.sponge.world;

import org.spongepowered.api.world.WorldBorder;
import rikka.api.util.math.Vector3d;
import rikka.api.world.IWorldBorder;

public class SpongeWorldBorder implements IWorldBorder {

    private final WorldBorder border;

    public SpongeWorldBorder(WorldBorder border) {
        this.border = border;
    }

    public double getNewDiameter() {
        return border.getNewDiameter();
    }

    public double getDiameter() {
        return border.getDiameter();
    }

    public void setDiameter(double diameter) {
        border.setDiameter(diameter);
    }

    public void setDiameter(double diameter, long time) {
        border.setDiameter(diameter, time);
    }

    public void setDiameter(double startDiameter, double endDiameter, long time) {
        border.setDiameter(startDiameter, endDiameter, time);
    }

    public long getTimeRemaining() {
        return border.getTimeRemaining();
    }

    public void setCenter(double x, double z) {
        border.setCenter(x, z);
    }

    public Vector3d getCenter() {
        return new Vector3d(border.getCenter());
    }

    public int getWarningTime() {
        return border.getWarningTime();
    }

    public void setWarningTime(int time) {
        border.setWarningTime(time);
    }

    public int getWarningDistance() {
        return border.getWarningDistance();
    }

    public void setWarningDistance(int distance) {
        border.setWarningDistance(distance);
    }

    public double getDamageThreshold() {
        return border.getDamageThreshold();
    }

    public void setDamageThreshold(double distance) {
        border.setDamageThreshold(distance);
    }

    public double getDamageAmount() {
        return border.getDamageAmount();
    }

    public void setDamageAmount(double damage) {
        border.setDamageAmount(damage);
    }
}
