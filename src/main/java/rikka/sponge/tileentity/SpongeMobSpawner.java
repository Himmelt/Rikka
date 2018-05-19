package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.MobSpawner;
import rikka.api.tileentity.IMobSpawner;

public final class SpongeMobSpawner extends SpongeTileEntity<MobSpawner> implements IMobSpawner {
    public SpongeMobSpawner(MobSpawner source) {
        super(source);
    }

    public void spawnEntityBatchImmediately(boolean force) {
    }
}
