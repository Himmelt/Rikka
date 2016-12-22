package org.rikka.block;

import net.minecraft.block.Block;
import org.rikka.Rikka;
import org.rikka.handler.IPosHandler;
import org.rikka.world.IWorld;

public interface IBlock extends Rikka<Block>, IPosHandler {

    int getmeta();

    void setmeta(int meta);

    void remove();

    IBlock replace(String name);

    IBlock replace(IBlock block);

    IWorld getWorld();

}
