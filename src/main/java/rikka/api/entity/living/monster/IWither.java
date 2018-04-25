package rikka.api.entity.living.monster;

import rikka.api.entity.explosive.FusedExplosive;
import rikka.api.entity.living.IAerial;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.living.Ranger;

import java.util.List;

public interface IWither extends IMonster, Ranger, IBoss, IAerial, FusedExplosive {
    List<ILiving> getTargets();

    void setTargets(List<ILiving> targets);
}
