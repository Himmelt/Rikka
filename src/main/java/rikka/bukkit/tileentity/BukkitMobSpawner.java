package rikka.bukkit.tileentity;

import org.bukkit.block.CreatureSpawner;
import rikka.api.tileentity.IMobSpawner;

public final class BukkitMobSpawner extends BukkitTileEntity<CreatureSpawner> implements IMobSpawner {
    public BukkitMobSpawner(CreatureSpawner source) {
        super(source);
    }

    public void spawnEntityBatchImmediately(boolean force) {

    }
}
