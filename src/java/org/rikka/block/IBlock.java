package org.rikka.block;

import net.minecraft.block.Block;
import org.rikka.Rikka;

public interface IBlock extends Rikka {

    int getMetadata();

    void setMetadata(int meta);

    void remove();

    IBlock replace(String name);

    IBlock replace(IBlock block);

    Block getMCBlock();

}
