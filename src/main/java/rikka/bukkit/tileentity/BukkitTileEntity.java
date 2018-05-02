package rikka.bukkit.tileentity;

import org.bukkit.block.BlockState;
import rikka.api.tileentity.ITileEntity;
import rikka.bukkit.BukkitRikka;

public abstract class BukkitTileEntity<T extends BlockState> extends BukkitRikka<T> implements ITileEntity {
    public BukkitTileEntity(T source) {
        super(source);
    }
}
