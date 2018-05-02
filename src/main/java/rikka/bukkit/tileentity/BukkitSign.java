package rikka.bukkit.tileentity;

import org.bukkit.block.Sign;
import rikka.api.tileentity.ISign;

public abstract class BukkitSign<T extends Sign> extends BukkitTileEntity<T> implements ISign {
    public BukkitSign(T source) {
        super(source);
    }
}
