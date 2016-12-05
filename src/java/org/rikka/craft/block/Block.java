package org.rikka.craft.block;

import org.rikka.craft.World;

public interface Block {

    int getX();

    int getY();

    int getZ();

    int getMetadata();
    void setMetadata(int meta);

    World getWorld();

    net.minecraft.block.Block getMCBlock();

}
