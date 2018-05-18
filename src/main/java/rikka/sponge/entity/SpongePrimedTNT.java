package rikka.sponge.entity;

import org.spongepowered.api.entity.explosive.PrimedTNT;
import rikka.api.entity.IPrimedTNT;
import rikka.api.entity.living.ILiving;

public final class SpongePrimedTNT extends SpongeEntity<PrimedTNT> implements IPrimedTNT {

    public SpongePrimedTNT(PrimedTNT source) {
        super(source);
    }

    public ILiving getDetonator() {
        return null;
    }

    public boolean isPrimed() {
        return source.isPrimed();
    }

    public void prime() {
        source.prime();
    }

    public void defuse() {

    }

    public void detonate() {

    }
}
