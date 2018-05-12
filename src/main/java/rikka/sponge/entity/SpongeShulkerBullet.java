package rikka.sponge.entity;

import org.spongepowered.api.entity.ShulkerBullet;
import rikka.api.entity.IShulkerBullet;

public class SpongeShulkerBullet<T extends ShulkerBullet> extends SpongeEntity<T> implements IShulkerBullet {
    public SpongeShulkerBullet(T source) {
        super(source);
    }
}
