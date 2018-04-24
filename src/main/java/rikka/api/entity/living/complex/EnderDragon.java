package rikka.api.entity.living.complex;

import org.soraworld.rikka.entity.EnderCrystal;
import org.soraworld.rikka.entity.living.monster.Boss;
import rikka.api.entity.living.Aerial;
import rikka.api.entity.projectile.IProjectileLauncher;

import java.util.Optional;
import java.util.Set;

public interface EnderDragon extends ComplexLiving, Boss, Aerial, IProjectileLauncher {

    @Override
    Set<EnderDragonPart> getParts();

    Optional<EnderCrystal> getHealingCrystal();

}
