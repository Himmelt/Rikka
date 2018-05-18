package rikka.api.entity;

import rikka.api.entity.living.ILiving;

public interface IShulkerBullet extends IEntity {
    ILiving getShooter();

    void setShooter(ILiving shooter);

    IEntity getTarget();

    void setTarget(IEntity target);
}
