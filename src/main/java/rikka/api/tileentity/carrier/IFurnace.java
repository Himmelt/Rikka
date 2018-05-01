package rikka.api.tileentity.carrier;

public interface IFurnace extends ITileEntityCarrier {
    boolean smelt();

    int passedBurnTime();

    int maxBurnTime();

    int passedCookTime();

    int maxCookTime();
}
