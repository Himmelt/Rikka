package org.soraworld.rikka.entity.living.monster;

import org.soraworld.rikka.entity.explosive.FusedExplosive;
import org.soraworld.rikka.entity.living.Aerial;
import org.soraworld.rikka.entity.living.Living;
import org.soraworld.rikka.entity.living.Ranger;

import java.util.List;

public interface Wither extends Monster, Ranger, Boss, Aerial, FusedExplosive {
    List<Living> getTargets();

    void setTargets(List<Living> targets);
}
