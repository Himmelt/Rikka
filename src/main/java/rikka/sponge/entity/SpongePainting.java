package rikka.sponge.entity;

import org.spongepowered.api.entity.hanging.Painting;
import rikka.api.entity.IPainting;

public final class SpongePainting extends SpongeEntity<Painting> implements IPainting {
    public SpongePainting(Painting source) {
        super(source);
    }
}
