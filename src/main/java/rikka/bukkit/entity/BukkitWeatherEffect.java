package rikka.bukkit.entity;

import org.bukkit.entity.Weather;
import rikka.api.entity.weather.IWeatherEffect;

public class BukkitWeatherEffect<T extends Weather> extends BukkitEntity<T> implements IWeatherEffect {
    public BukkitWeatherEffect(T source) {
        super(source);
    }

    public boolean isEffect() {
        return false;
    }

    public void setEffect(boolean effect) {

    }
}
