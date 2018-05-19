package rikka.bukkit.entity;

import org.bukkit.entity.ExperienceOrb;
import rikka.api.entity.IExpOrb;

public final class BukkitExpOrb extends BukkitEntity<ExperienceOrb> implements IExpOrb {
    public BukkitExpOrb(ExperienceOrb source) {
        super(source);
    }
}
