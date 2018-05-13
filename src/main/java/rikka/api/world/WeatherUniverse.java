package rikka.api.world;

import rikka.api.world.weather.Weather;

public interface WeatherUniverse {

    Weather getWeather();

    long getRemainingDuration();

    long getRunningDuration();

    void setWeather(Weather weather);

    void setWeather(Weather weather, long duration);
}
