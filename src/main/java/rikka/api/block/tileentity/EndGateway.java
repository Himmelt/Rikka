package rikka.api.block.tileentity;

import rikka.api.data.manipulator.mutable.tileentity.EndGatewayData;

public interface EndGateway extends TileEntity {
    default EndGatewayData getEndGatewayData() {
        return this.get(EndGatewayData.class).get();
    }
}
