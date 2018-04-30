package rikka.api.entity.explosive;

import rikka.api.data.manipulator.mutable.entity.FuseData;

public interface IFusedExplosive extends IExplosive {

    default FuseData getFuseData() {
        return get(FuseData.class).get();
    }

    boolean isPrimed();

    void prime();

    void defuse();

}
