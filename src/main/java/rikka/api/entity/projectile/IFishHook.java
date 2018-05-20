package rikka.api.entity.projectile;

import rikka.api.entity.IEntity;

public interface IFishHook extends IProjectile {
    IEntity getHookedEntity();
    /*void setHookedEntity(IEntity entity);*/
}
