package org.rikka.craft.entity;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.WorldSettings;
import org.rikka.RikkaType;
import org.rikka.entity.Player;

public class CraftPlayer<T extends EntityPlayerMP> extends CraftEntity<T> implements Player {

    public CraftPlayer(T entity) {
        super(entity);
    }

    @Override
    public String getName() {
        return entity.getName();
    }

    @Override
    public String getDisplayName() {
        return entity.getDisplayNameString();
    }

    @Override
    public T getMCEntity() {
        return entity;
    }

    @Override
    public RikkaType type() {
        return RikkaType.PLAYER;
    }

    @Override
    public void message(String message) {
        // 需要进一步处理
        this.entity.addChatMessage(new TextComponentTranslation(String.format(message, this.entity)));
    }

    @Override
    public int getGamemode() {
        return this.entity.interactionManager.getGameType().getID();
    }

    @Override
    public void setGamemode(int mode) {
        this.entity.setGameType(WorldSettings.getGameTypeById(mode));
    }

    @Override
    public int getExpLevel() {
        return entity.experienceLevel;
    }

    @Override
    public void setExpLevel(int level) {
        entity.experienceLevel = level;
        entity.addExperienceLevel(0);
    }
}
