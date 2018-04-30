package rikka.api.entity.vehicle.minecart;

import rikka.api.data.manipulator.mutable.MobSpawnerData;

public interface IMobSpawnerMinecart extends IMinecart {
    default MobSpawnerData getSpawnerData() {
        return get(MobSpawnerData.class).get();
    }
}
