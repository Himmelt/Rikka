package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Wither;
import rikka.api.entity.living.ILiving;
import rikka.api.entity.living.monster.IWither;
import rikka.sponge.entity.living.SpongeLiving;

import java.util.List;

public final class SpongeWither extends SpongeLiving<Wither> implements IWither {
    public SpongeWither(Wither source) {
        super(source);
    }

    public List<ILiving> getTargets() {
        return null;
    }

    public void setTargets(List<ILiving> targets) {

    }

    public boolean isPrimed() {
        return false;
    }

    public void prime() {

    }

    public void defuse() {

    }

    public void detonate() {

    }
}
