package rikka.sponge.world;

import org.spongepowered.api.world.WorldBorder;
import rikka.api.util.math.Vector3d;
import rikka.api.world.IWorldBorder;
import rikka.sponge.SpongeRikka;

public class SpongeWorldBorder extends SpongeRikka<WorldBorder> implements IWorldBorder {

    public SpongeWorldBorder(WorldBorder border) {
        super(border);
    }

    public WorldBorder getSource() {
        return source;
    }

    public double getNewDiameter() {
        return source.getNewDiameter();
    }

    public double getDiameter() {
        return source.getDiameter();
    }

    public void setDiameter(double diameter) {
        source.setDiameter(diameter);
    }

    public void setDiameter(double diameter, long time) {
        source.setDiameter(diameter, time);
    }

    public void setDiameter(double startDiameter, double endDiameter, long time) {
        source.setDiameter(startDiameter, endDiameter, time);
    }

    public long getTimeRemaining() {
        return source.getTimeRemaining();
    }

    public void setCenter(double x, double z) {
        source.setCenter(x, z);
    }

    public Vector3d getCenter() {
        return new Vector3d(source.getCenter());
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
        return source.getDamageThreshold();
    }

    public void setDamageThreshold(double distance) {
        source.setDamageThreshold(distance);
    }

    public double getDamageAmount() {
        return source.getDamageAmount();
    }

    public void setDamageAmount(double damage) {
        source.setDamageAmount(damage);
    }
}
