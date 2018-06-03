package rikka.bukkit.tileentity;

import org.bukkit.block.EnchantingTable;
import rikka.api.tileentity.IEnchantTable;

public final class BukkitEnchantTable extends BukkitTileEntity<EnchantingTable> implements IEnchantTable {
    public BukkitEnchantTable(EnchantingTable source) {
        super(source);
    }
}
