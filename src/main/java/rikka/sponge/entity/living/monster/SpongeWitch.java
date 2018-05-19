package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Witch;
import rikka.api.entity.living.monster.IWitch;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeWitch extends SpongeLiving<Witch> implements IWitch {
    public SpongeWitch(Witch source) {
        super(source);
    }
}
