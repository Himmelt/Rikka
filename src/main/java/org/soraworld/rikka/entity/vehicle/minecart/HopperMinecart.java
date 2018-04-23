package org.soraworld.rikka.entity.vehicle.minecart;

import org.soraworld.rikka.data.manipulator.mutable.tileentity.CooldownData;

public interface HopperMinecart extends ContainerMinecart<HopperMinecart> {
    default CooldownData getCooldownData() {
        return get(CooldownData.class).get();
    }
}
