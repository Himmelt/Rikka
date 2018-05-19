package rikka.bukkit.tileentity;

import org.bukkit.block.Structure;
import rikka.api.tileentity.IStructure;

public final class BukkitStructure extends BukkitTileEntity<Structure> implements IStructure {
    public BukkitStructure(Structure source) {
        super(source);
    }
}
