package rikka.api.entity.living.monster;

import rikka.api.entity.explosive.FusedExplosive;
import rikka.api.entity.living.Aerial;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.living.Ranger;

import java.util.List;

public interface Wither extends Monster, Ranger, Boss, Aerial, FusedExplosive {
    List<ILiving> getTargets();

    void setTargets(List<ILiving> targets);
}
