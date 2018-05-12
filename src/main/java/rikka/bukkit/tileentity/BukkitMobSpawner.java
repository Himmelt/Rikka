package rikka.bukkit.tileentity;

import org.bukkit.block.CreatureSpawner;
import rikka.api.tileentity.IMobSpawner;

public class BukkitMobSpawner<T extends CreatureSpawner> extends BukkitTileEntity<T> implements IMobSpawner {
    public BukkitMobSpawner(T source) {
        super(source);
    }

    public void spawnEntityBatchImmediately(boolean force) {

    }
}
