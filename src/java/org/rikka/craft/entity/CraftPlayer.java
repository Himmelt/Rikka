package org.rikka.craft.entity;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.WorldSettings;
import org.rikka.entity.IPlayer;

public class CraftPlayer extends CraftEntity<EntityPlayerMP> implements IPlayer {

    public CraftPlayer(EntityPlayerMP player) {
        super(player);
    }

    @Override
    public String getName() {
        return origin.getName();
    }

    @Override
    public String getDisplayName() {
        return origin.getDisplayNameString();
    }

    @Override
    public void message(String message) {
        // 需要进一步处理
        origin.addChatMessage(new TextComponentTranslation(String.format(message, origin)));
    }

    @Override
    public int getGamemode() {
        return origin.interactionManager.getGameType().getID();
    }

    @Override
    public void setGamemode(int mode) {
        origin.setGameType(WorldSettings.getGameTypeById(mode));
    }

    @Override
    public int getExpLevel() {
        return origin.experienceLevel;
    }

    @Override
    public void setExpLevel(int level) {
        origin.experienceLevel = level;
        origin.addExperienceLevel(0);
    }

}
