package rikka.api.entity.living.monster;

import rikka.api.entity.living.IAquatic;
import rikka.api.entity.living.ILiving;

import java.util.Optional;

public interface IGuardian extends IAquatic, IMonster {

    Optional<ILiving> getBeamTarget();

    void setBeamTarget(ILiving entity);
}
