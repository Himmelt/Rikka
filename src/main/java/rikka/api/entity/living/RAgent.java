package rikka.api.entity.living;

import rikka.api.entity.IEntity;

import javax.annotation.Nullable;
import java.util.Optional;

public interface RAgent extends ILiving {
    Optional<IEntity> getTarget();

    void setTarget(@Nullable IEntity target);
}
