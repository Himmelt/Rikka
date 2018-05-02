package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.MobSpawner;
import rikka.api.tileentity.IMobSpawner;

public abstract class SpongeMobSpawner<T extends MobSpawner> extends SpongeTileEntity<T> implements IMobSpawner {
    public SpongeMobSpawner(T source) {
        super(source);
    }
}
