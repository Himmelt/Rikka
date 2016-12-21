package org.rikka.world;

import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import org.rikka.Rikka;
import org.rikka.block.IBlock;
import org.rikka.entity.IPlayer;
import org.rikka.tile.ITileEntity;

public interface IWorld extends Rikka<WorldServer> {

    long getTime();

    void setTime(long time);

    IBlock getBlock(int x, int y, int z);

    ITileEntity getTile(int x, int y, int z);

    IBlock setBlock(int x, int y, int z, String name, int meta);

    IBlock setBlock(IBlock block);

    IPlayer getPlayer(String name);

    World getMCWorld();

}
