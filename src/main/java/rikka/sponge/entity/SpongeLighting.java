package rikka.sponge.entity;

import org.spongepowered.api.entity.weather.Lightning;
import rikka.api.entity.weather.ILightning;

public final class SpongeLighting extends SpongeWeatherEffect<Lightning> implements ILightning {
    public SpongeLighting(Lightning source) {
        super(source);
    }
}
