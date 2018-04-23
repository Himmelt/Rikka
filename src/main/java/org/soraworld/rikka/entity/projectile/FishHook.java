package org.soraworld.rikka.entity.projectile;

import org.soraworld.rikka.entity.Entity;

import javax.annotation.Nullable;
import java.util.Optional;

public interface FishHook extends Projectile {

    Optional<Entity> getHookedEntity();

    void setHookedEntity(@Nullable Entity entity);

}
