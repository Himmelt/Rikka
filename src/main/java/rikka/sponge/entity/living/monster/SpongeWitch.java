package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Witch;
import rikka.api.entity.living.monster.IWitch;
import rikka.sponge.entity.SpongeLiving;

public class SpongeWitch<T extends Witch> extends SpongeLiving<T> implements IWitch {
    public SpongeWitch(T source) {
        super(source);
    }
}
