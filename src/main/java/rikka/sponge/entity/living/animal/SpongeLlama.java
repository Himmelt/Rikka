package rikka.sponge.entity.living.animal;

import org.soraworld.rikka.entity.living.animal.ILlama;
import org.spongepowered.api.entity.living.animal.Llama;

public abstract class SpongeLlama<T extends Llama> extends SpongeHorse<T> implements ILlama {

    public SpongeLlama(T source) {
        super(source);
    }

}
