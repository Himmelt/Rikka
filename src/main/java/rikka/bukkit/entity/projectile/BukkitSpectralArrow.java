package rikka.bukkit.entity.projectile;

import org.bukkit.entity.SpectralArrow;
import rikka.api.entity.projectile.ISpectralArrow;

public final class BukkitSpectralArrow extends BukkitArrow<SpectralArrow> implements ISpectralArrow {
    public BukkitSpectralArrow(SpectralArrow source) {
        super(source);
    }
}
