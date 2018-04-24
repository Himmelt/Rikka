package rikka.api.entity.living.complex;

import rikka.api.entity.EnderCrystal;
import rikka.api.entity.living.Aerial;
import rikka.api.entity.living.monster.Boss;
import rikka.api.entity.projectile.IProjectileLauncher;

import java.util.Optional;
import java.util.Set;

public interface EnderDragon extends ComplexLiving, Boss, Aerial, IProjectileLauncher {

    @Override
    Set<EnderDragonPart> getParts();

    Optional<EnderCrystal> getHealingCrystal();

}
