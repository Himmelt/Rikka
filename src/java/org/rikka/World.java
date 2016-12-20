package org.rikka;

import org.rikka.block.Block;
import org.rikka.entity.Player;

public interface World extends Rikka {

    long getTime();

    void setTime(long time);

    Block getBlock(int x, int y, int z);

    void setBlock(int x, int y, int z, String name, int meta);

    Player getPlayerByName(String name);

    net.minecraft.world.World getMCWorld();
}
