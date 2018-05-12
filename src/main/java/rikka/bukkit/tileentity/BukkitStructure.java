package rikka.bukkit.tileentity;

import org.bukkit.block.Structure;
import rikka.api.tileentity.IStructure;

public class BukkitStructure<T extends Structure> extends BukkitTileEntity<T> implements IStructure {
    public BukkitStructure(T source) {
        super(source);
    }
}
