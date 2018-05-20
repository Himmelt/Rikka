package rikka.bukkit.entity;

import org.bukkit.entity.LightningStrike;
import rikka.api.entity.weather.ILightning;

public final class BukkitLighting extends BukkitWeatherEffect<LightningStrike> implements ILightning {
    public BukkitLighting(LightningStrike source) {
        super(source);
    }
}
