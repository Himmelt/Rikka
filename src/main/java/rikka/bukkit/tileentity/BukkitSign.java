package rikka.bukkit.tileentity;

import org.bukkit.block.Sign;
import rikka.api.tileentity.ISign;

public final class BukkitSign extends BukkitTileEntity<Sign> implements ISign {
    public BukkitSign(Sign source) {
        super(source);
    }
}
