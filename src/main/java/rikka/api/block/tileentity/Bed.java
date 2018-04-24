package rikka.api.block.tileentity;

import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.DyeableData;
import rikka.api.data.manipulator.mutable.tileentity.BedData;
import rikka.api.data.type.DyeColor;
import rikka.api.data.value.mutable.Value;

public interface Bed extends TileEntity {
    @Deprecated
    default BedData getBedData() {
        return this.get(BedData.class).get();
    }

    default DyeableData getDyeableData() {
        return this.get(DyeableData.class).get();
    }

    default Value<DyeColor> color() {
        return this.getValue(Keys.DYE_COLOR).get();
    }
}
