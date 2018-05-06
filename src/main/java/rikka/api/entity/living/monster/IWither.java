package rikka.api.entity.living.monster;

import rikka.api.entity.explosive.IFusedExplosive;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.living.RAerial;
import rikka.api.entity.living.RRanger;

import java.util.List;

public interface IWither extends IMonster, RRanger, RBoss, RAerial, IFusedExplosive {
    List<ILiving> getTargets();

    void setTargets(List<ILiving> targets);
}
