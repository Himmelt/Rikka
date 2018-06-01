package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.carrier.Furnace;
import rikka.api.tileentity.carrier.IFurnace;

public final class SpongeFurnace extends SpongeTileCarrier<Furnace> implements IFurnace {
    public SpongeFurnace(Furnace source) {
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
