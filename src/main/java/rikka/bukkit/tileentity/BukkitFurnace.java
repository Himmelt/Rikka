package rikka.bukkit.tileentity;

import org.bukkit.block.Furnace;
import rikka.api.tileentity.carrier.IFurnace;

public final class BukkitFurnace extends BukkitTileCarrier<Furnace> implements IFurnace {
    public BukkitFurnace(Furnace source) {
        super(source);
    }

    public boolean smelt() {
        return false;
    }

    public int passedBurnTime() {
        return 0;
    }

    public int maxBurnTime() {
        return 0;
    }

    public int passedCookTime() {
        return 0;
    }

    public int maxCookTime() {
        return 0;
    }
}
