package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Sheep;
import rikka.api.entity.living.animal.ISheep;
import rikka.sponge.entity.living.SpongeLiving;

public final class SpongeSheep extends SpongeLiving<Sheep> implements ISheep {
    public SpongeSheep(Sheep source) {
        super(source);
    }
}
