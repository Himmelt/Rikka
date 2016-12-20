package org.rikka.block;

import org.rikka.Rikka;
import org.rikka.World;

public interface Block extends Rikka {

    int getX();

    int getY();

    int getZ();

    int getMetadata();

    void setMetadata(int meta);

    void remove();

    Block replace(String name);

    Block replace(Block block);

    World getWorld();

    net.minecraft.block.Block getMCBlock();

}
