package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Spider;
import rikka.api.entity.living.monster.ISpider;
import rikka.sponge.entity.living.SpongeLiving;

public class SpongeSpider<T extends Spider> extends SpongeLiving<T> implements ISpider {
    public SpongeSpider(T source) {
        super(source);
    }

    public boolean isClimbing() {
        return false;
    }
}
