package org.soraworld.rikka.entity;

import net.minecraft.entity.player.EntityPlayerMP;

public interface IPlayer extends ILivingBase<EntityPlayerMP> {

    void message(String message);

    int getGamemode();

    void setGamemode(int mode);

    int getExpLevel();

    void setExpLevel(int level);

}
