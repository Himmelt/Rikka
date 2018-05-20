package rikka.bukkit.entity;

import org.bukkit.entity.FallingBlock;
import rikka.api.entity.IFallingBlock;

public final class BukkitFallingBlock extends BukkitEntity<FallingBlock> implements IFallingBlock {
    public BukkitFallingBlock(FallingBlock source) {
        super(source);
    }
}
