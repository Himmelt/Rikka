package rikka.api.world;

import net.minecraft.world.WorldServer;
import org.rikka.Rikka;
import org.rikka.block.IBlock;
import org.rikka.entity.IPlayer;
import org.rikka.handler.IDataHandler;
import org.rikka.tileentity.ITileEntity;

public interface IWorld extends Rikka<WorldServer>, IDataHandler {

    long getTime();

    void setTime(long time);

    IBlock getBlock(int x, int y, int z);

    ITileEntity getTile(int x, int y, int z);

    IBlock setBlock(int x, int y, int z, String name, int meta);

    IBlock setBlock(IBlock block);

    IPlayer getPlayer(String name);

}
