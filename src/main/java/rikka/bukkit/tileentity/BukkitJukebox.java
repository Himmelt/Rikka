package rikka.bukkit.tileentity;

import org.bukkit.block.Jukebox;
import rikka.api.tileentity.IJukebox;

public abstract class BukkitJukebox<T extends Jukebox> extends BukkitTileEntity<T> implements IJukebox {
    public BukkitJukebox(T source) {
        super(source);
    }
}
