package rikka.bukkit.entity.living.animal;

import org.bukkit.entity.Llama;
import rikka.api.entity.living.animal.ILlama;

public final class BukkitLlama extends BukkitHorse<Llama> implements ILlama {
    public BukkitLlama(Llama source) {
        super(source);
    }
}
