package rikka.api.entity.living.monster;

import rikka.api.entity.api.Aerial;
import rikka.api.entity.api.Boss;
import rikka.api.entity.api.FusedExplosive;
import rikka.api.entity.api.Ranger;
import rikka.api.entity.living.ILiving;

import java.util.List;

public interface IWither extends IMonster, Ranger, Boss, Aerial, FusedExplosive {
    List<ILiving> getTargets();

    void setTargets(List<ILiving> targets);
}
