package org.rikka.block;

import org.rikka.World;

public interface Block {

    int getX();

    int getY();

    int getZ();

    int getMetadata();

    void setMetadata(int meta);

    World getWorld();

    net.minecraft.block.Block getMCBlock();

}
