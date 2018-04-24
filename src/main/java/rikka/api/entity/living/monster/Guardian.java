package rikka.api.entity.living.monster;

import rikka.api.entity.living.Aquatic;
import rikka.api.entity.living.ILiving;

import java.util.Optional;

public interface Guardian extends Aquatic, Monster {

    Optional<ILiving> getBeamTarget();

    void setBeamTarget(ILiving entity);
}
