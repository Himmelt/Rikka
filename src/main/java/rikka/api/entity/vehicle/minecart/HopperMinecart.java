package rikka.api.entity.vehicle.minecart;

import rikka.api.data.manipulator.mutable.tileentity.CooldownData;

public interface HopperMinecart extends ContainerMinecart<HopperMinecart> {
    default CooldownData getCooldownData() {
        return get(CooldownData.class).get();
    }
}
