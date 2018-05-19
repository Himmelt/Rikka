package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.CaveSpider;
import rikka.api.entity.living.monster.ICaveSpider;

public final class SpongeCaveSpider extends SpongeSpider<CaveSpider> implements ICaveSpider {
    public SpongeCaveSpider(CaveSpider source) {
        super(source);
    }
}
