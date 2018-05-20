package rikka.sponge.entity.projectile;

import org.spongepowered.api.entity.projectile.FishHook;
import rikka.api.entity.IEntity;
import rikka.api.entity.projectile.IFishHook;
import rikka.sponge.entity.SpongeEntity;

public final class SpongeFishHook extends SpongeProjectile<FishHook> implements IFishHook {
    public SpongeFishHook(FishHook source) {
        super(source);
    }

    public IEntity getHookedEntity() {
        return getEntity(source.getHookedEntity().orElse(null));
    }

    public void setHookedEntity(IEntity entity) {
        if (entity instanceof SpongeEntity) {
            source.setHookedEntity(((SpongeEntity) entity).getSource());
        }
    }
}
