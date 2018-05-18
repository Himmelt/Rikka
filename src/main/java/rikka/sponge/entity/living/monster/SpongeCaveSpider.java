package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.CaveSpider;
import rikka.api.entity.living.monster.ICaveSpider;

public final class SpongeCaveSpider<T extends CaveSpider> extends SpongeSpider<T> implements ICaveSpider {
    public SpongeCaveSpider(T source) {
        super(source);
    }
}
