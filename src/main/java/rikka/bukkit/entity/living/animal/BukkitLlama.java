package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Llama;
import rikka.api.entity.living.animal.ILlama;

public class BukkitLlama<T extends Llama> extends BukkitHorse<T> implements ILlama {
    public BukkitLlama(T source) {
        super(source);
    }
}
