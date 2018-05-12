package rikka.sponge.entity.living.monster;

import org.spongepowered.api.entity.living.monster.Creeper;
import rikka.api.entity.living.monster.ICreeper;
import rikka.sponge.entity.SpongeLiving;

public class SpongeCreeper<T extends Creeper> extends SpongeLiving<T> implements ICreeper {
    public SpongeCreeper(T source) {
        super(source);
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
