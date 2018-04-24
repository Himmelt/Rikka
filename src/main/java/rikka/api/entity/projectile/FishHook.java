package rikka.api.entity.projectile;

import rikka.api.entity.IEntity;

import javax.annotation.Nullable;
import java.util.Optional;

public interface FishHook extends Projectile {

    Optional<IEntity> getHookedEntity();

    void setHookedEntity(@Nullable IEntity entity);

}
