package org.rikka.craft;

import org.rikka.craft.block.Block;

public interface World {

    long getTime();

    void setTime(long time);

    Block getBlock(int x, int y, int z);

    void setBlock(int x, int y, int z, String name, int meta);

    net.minecraft.world.World getMCWorld();
}
