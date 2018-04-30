package rikka.api.entity.explosive;

import rikka.api.data.manipulator.mutable.entity.ExplosionRadiusData;
import rikka.api.entity.IEntity;

public interface IExplosive extends IEntity {

    default ExplosionRadiusData getExplosionRadiusData() {
        return get(ExplosionRadiusData.class).get();
    }

    default Integer explosionRadius() {
        return 0;
    }

    void detonate();

}
