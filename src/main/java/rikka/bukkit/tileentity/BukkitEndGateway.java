package rikka.bukkit.tileentity;

import org.bukkit.block.EndGateway;
import rikka.api.tileentity.IEndGateway;

public final class BukkitEndGateway extends BukkitTileEntity<EndGateway> implements IEndGateway {
    public BukkitEndGateway(EndGateway source) {
        super(source);
    }
}
