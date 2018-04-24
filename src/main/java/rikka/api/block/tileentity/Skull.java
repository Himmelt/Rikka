package rikka.api.block.tileentity;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.SkullData;
import rikka.api.data.type.SkullType;
import rikka.api.data.value.mutable.Value;

public interface Skull extends TileEntity {
    default SkullData getSkullData() {
        return get(SkullData.class).get();
    }

    default Value<SkullType> skullType() {
        return getValue(Keys.SKULL_TYPE).get();
    }
}
