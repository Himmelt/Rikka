package rikka.api.tileentity;

public interface IMobSpawner extends ITileEntity {
    void spawnEntityBatchImmediately(boolean force);
}
