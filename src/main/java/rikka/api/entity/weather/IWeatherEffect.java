package rikka.api.entity.weather;

import rikka.api.entity.IEntity;

public interface IWeatherEffect extends IEntity {
    boolean isEffect();

    void setEffect(boolean effect);
}
