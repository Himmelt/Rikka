package rikka.api.entity.explosive;

import rikka.api.entity.IEntity;

public interface IExplosive extends IEntity {
    default Integer explosionRadius() {
        return 0;
    }

    void detonate();
}
