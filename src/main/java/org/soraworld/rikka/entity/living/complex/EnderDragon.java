package org.soraworld.rikka.entity.living.complex;

import org.soraworld.rikka.entity.EnderCrystal;
import org.soraworld.rikka.entity.living.Aerial;
import org.soraworld.rikka.entity.living.monster.Boss;
import org.soraworld.rikka.entity.projectile.ProjectileLauncher;

import java.util.Optional;
import java.util.Set;

public interface EnderDragon extends ComplexLiving, Boss, Aerial, ProjectileLauncher {

    @Override
    Set<EnderDragonPart> getParts();

    Optional<EnderCrystal> getHealingCrystal();

}
