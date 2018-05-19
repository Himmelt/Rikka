package rikka.sponge.entity.living;

import org.spongepowered.api.entity.living.Bat;
import rikka.api.entity.living.IBat;

public final class SpongeBat extends SpongeLiving<Bat> implements IBat {
    public SpongeBat(Bat source) {
        super(source);
    }
}
