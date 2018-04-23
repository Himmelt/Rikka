package org.soraworld.rikka.entity.living.monster;

import org.soraworld.rikka.entity.living.Aquatic;
import org.soraworld.rikka.entity.living.Living;

import java.util.Optional;

public interface Guardian extends Aquatic, Monster {

    Optional<Living> getBeamTarget();

    void setBeamTarget(Living entity);
}
