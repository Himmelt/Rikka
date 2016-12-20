package org.rikka.craft.entity;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.WorldSettings;
import org.rikka.RikkaType;
import org.rikka.entity.IPlayer;

public class CraftPlayer<T extends EntityPlayerMP> extends CraftEntity<T> implements IPlayer {

    public CraftPlayer(T entity) {
        super(entity);
    }

    @Override
    public String getName() {
        return original.getName();
    }

    @Override
    public String getDisplayName() {
        return original.getDisplayNameString();
    }

    @Override
    public T getMCEntity() {
        return original;
    }

    @Override
    public RikkaType type() {
        return RikkaType.PLAYER;
    }

    @Override
    public void message(String message) {
        // 需要进一步处理
        original.addChatMessage(new TextComponentTranslation(String.format(message, original)));
    }

    @Override
    public int getGamemode() {
        return original.interactionManager.getGameType().getID();
    }

    @Override
    public void setGamemode(int mode) {
        original.setGameType(WorldSettings.getGameTypeById(mode));
    }

    @Override
    public int getExpLevel() {
        return original.experienceLevel;
    }

    @Override
    public void setExpLevel(int level) {
        original.experienceLevel = level;
        original.addExperienceLevel(0);
    }
}
