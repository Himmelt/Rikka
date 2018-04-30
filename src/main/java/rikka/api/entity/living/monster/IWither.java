package rikka.api.entity.living.monster;

import rikka.api.entity.explosive.IFusedExplosive;
import rikka.api.entity.living.IAerial;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.living.IRanger;

import java.util.List;

public interface IWither extends IMonster, IRanger, IBoss, IAerial, IFusedExplosive {
    List<ILiving> getTargets();

    void setTargets(List<ILiving> targets);
}
