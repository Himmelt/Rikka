package rikka.sponge.entity;

import org.spongepowered.api.entity.weather.WeatherEffect;
import rikka.api.entity.weather.IWeatherEffect;

public class SpongeWeatherEffect<T extends WeatherEffect> extends SpongeEntity<T> implements IWeatherEffect {
    public SpongeWeatherEffect(T source) {
        super(source);
    }

    public boolean isEffect() {
        return false;
    }

    public void setEffect(boolean effect) {

    }
}
