package rikka.api.entity.living.complex;

import rikka.api.entity.IEnderCrystal;
import rikka.api.entity.living.IAerial;
import rikka.api.entity.living.monster.IBoss;
import rikka.api.entity.projectile.IProjectileLauncher;

import java.util.Optional;
import java.util.Set;

public interface EnderDragon extends ComplexLiving, IBoss, IAerial, IProjectileLauncher {

    @Override
    Set<EnderDragonPart> getParts();

    Optional<IEnderCrystal> getHealingCrystal();

}
