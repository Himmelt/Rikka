package org.soraworld.rikka.entity.vehicle.minecart;

import org.soraworld.rikka.data.manipulator.mutable.MobSpawnerData;

public interface MobSpawnerMinecart extends Minecart {
    default MobSpawnerData getSpawnerData() {
        return get(MobSpawnerData.class).get();
    }
}
