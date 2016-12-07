package org.rikka.entity;

public interface Player<T extends net.minecraft.entity.player.EntityPlayerMP> extends EntityLivingBase<T> {

    void message(String message);

    int getGamemode();

    void setGamemode(int mode);

    int getExpLevel();

    void setExpLevel(int level);

}
