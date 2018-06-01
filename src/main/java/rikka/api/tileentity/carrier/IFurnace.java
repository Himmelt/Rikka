package rikka.api.tileentity.carrier;

public interface IFurnace extends ITileCarrier {
    boolean smelt();

    int passedBurnTime();

    int maxBurnTime();

    int passedCookTime();

    int maxCookTime();
}
