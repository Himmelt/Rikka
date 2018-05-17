package rikka.api.entity;

import rikka.api.entity.api.FusedExplosive;
import rikka.api.entity.living.ILiving;

public interface IPrimedTNT extends IEntity, FusedExplosive {
    ILiving getDetonator();
}
