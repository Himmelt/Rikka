package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Silverfish;
import rikka.api.entity.living.monster.ISilverfish;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeSilverfish extends SpongeLiving<Silverfish> implements ISilverfish {
    public SpongeSilverfish(Silverfish source) {
        super(source);
    }
}
