package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Silverfish;
import rikka.api.entity.living.monster.ISilverfish;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeSilverfish<T extends Silverfish> extends SpongeLiving<T> implements ISilverfish {
    public SpongeSilverfish(T source) {
        super(source);
    }
}
