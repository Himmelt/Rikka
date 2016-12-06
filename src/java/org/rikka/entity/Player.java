package org.rikka.entity;

import net.minecraft.entity.player.EntityPlayerMP;

public interface Player<T extends EntityPlayerMP> extends Entity<T> {

    void message(String message);

    int getGamemode();

    void setGamemode(int mode);

    int getExpLevel();

    void setExpLevel(int level);

}
