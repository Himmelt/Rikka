package rikka.api.entity.api;

public interface FusedExplosive extends Explosive {
    boolean isPrimed();

    void prime();

    void defuse();
}
