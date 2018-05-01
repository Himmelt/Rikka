package rikka.sponge.entity.living.animal;

import org.spongepowered.api.entity.living.animal.Llama;
import rikka.api.entity.living.animal.ILlama;

public abstract class SpongeLlama<T extends Llama> extends SpongeHorse<T> implements ILlama {

    public SpongeLlama(T source) {
        super(source);
    }

}
