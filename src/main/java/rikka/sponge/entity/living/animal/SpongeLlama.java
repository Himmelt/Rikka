package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Llama;
import rikka.api.entity.living.animal.ILlama;

public final class SpongeLlama extends SpongeHorse<Llama> implements ILlama {
    public SpongeLlama(Llama source) {
        super(source);
    }
}
