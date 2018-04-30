package rikka.api.world.weather;

public interface WeatherUniverse {

    Weather getWeather();

    long getRemainingDuration();

    long getRunningDuration();

    void setWeather(Weather weather);

    void setWeather(Weather weather, long duration);
}
