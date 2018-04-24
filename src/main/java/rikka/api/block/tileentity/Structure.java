package rikka.api.block.tileentity;

import rikka.api.data.manipulator.mutable.tileentity.StructureData;

public interface Structure extends TileEntity {
    default StructureData getStructureData() {
        return this.get(StructureData.class).get();
    }
}
