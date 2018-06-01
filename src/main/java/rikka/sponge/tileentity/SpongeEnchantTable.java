package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.EnchantmentTable;
import rikka.api.tileentity.IEnchantTable;

public final class SpongeEnchantTable extends SpongeTileEntity<EnchantmentTable> implements IEnchantTable {
    public SpongeEnchantTable(EnchantmentTable source) {
        super(source);
    }
}
