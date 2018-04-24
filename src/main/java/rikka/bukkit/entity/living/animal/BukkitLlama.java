package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Llama;
import org.soraworld.rikka.entity.living.animal.ILlama;

public abstract class BukkitLlama<T extends Llama> extends BukkitHorse<T> implements ILlama {

    public BukkitLlama(T source) {
        super(source);
    }

}
