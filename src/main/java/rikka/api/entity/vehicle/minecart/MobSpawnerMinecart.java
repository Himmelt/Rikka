package rikka.api.entity.vehicle.minecart;

import rikka.api.data.manipulator.mutable.MobSpawnerData;

public interface MobSpawnerMinecart extends Minecart {
    default MobSpawnerData getSpawnerData() {
        return get(MobSpawnerData.class).get();
    }
}
