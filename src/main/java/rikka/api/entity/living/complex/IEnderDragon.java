package rikka.api.entity.living.complex;

import rikka.api.entity.IEnderCrystal;
import rikka.api.entity.api.Aerial;
import rikka.api.entity.api.Boss;
import rikka.api.entity.api.ProjectileLauncher;

import java.util.Optional;
import java.util.Set;

public interface IEnderDragon extends IComplexLiving, Boss, Aerial, ProjectileLauncher {

    @Override
    Set<EnderDragonPart> getParts();

    Optional<IEnderCrystal> getHealingCrystal();

}
