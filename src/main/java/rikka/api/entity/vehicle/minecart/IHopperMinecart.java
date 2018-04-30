package rikka.api.entity.vehicle.minecart;

import rikka.api.data.manipulator.mutable.tileentity.CooldownData;

public interface IHopperMinecart extends IContainerMinecart<IHopperMinecart> {
    default CooldownData getCooldownData() {
        return get(CooldownData.class).get();
    }
}
