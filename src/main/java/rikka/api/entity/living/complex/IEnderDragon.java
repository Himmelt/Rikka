package rikka.api.entity.living.complex;

import rikka.api.entity.IEnderCrystal;
import rikka.api.entity.living.RAerial;
import rikka.api.entity.living.monster.RBoss;
import rikka.api.entity.projectile.RProjectileLauncher;

import java.util.Optional;
import java.util.Set;

public interface IEnderDragon extends IComplexLiving, RBoss, RAerial, RProjectileLauncher {

    @Override
    Set<EnderDragonPart> getParts();

    Optional<IEnderCrystal> getHealingCrystal();

}
