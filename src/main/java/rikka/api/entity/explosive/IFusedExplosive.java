package rikka.api.entity.explosive;

public interface IFusedExplosive extends IExplosive {
    boolean isPrimed();

    void prime();

    void defuse();
}
