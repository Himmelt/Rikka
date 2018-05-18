package rikka.api.entity.living.player;

import org.spongepowered.api.event.cause.Cause;
import rikka.api.command.ICommandSender;
import rikka.api.entity.IEntity;
import rikka.api.entity.api.User;
import rikka.api.entity.living.IHumanoid;
import rikka.api.entity.living.player.gamemode.GameMode;
import rikka.api.entity.living.player.tab.TabList;
import rikka.api.item.inventory.IContainer;
import rikka.api.item.inventory.IInventory;
import rikka.api.scoreboard.IScoreboard;
import rikka.api.world.IWorldBorder;

public interface IPlayer extends IHumanoid, User, ICommandSender {

    default boolean isViewingInventory() {
        return getOpenInventory() != null;
    }

    IContainer getOpenInventory();

    IContainer openInventory(IInventory inventory);

    boolean closeInventory();

    boolean isChatColorsEnabled();

    TabList getTabList();

    void kick();

    void kick(String reason);

    IScoreboard getScoreboard();

    void setScoreboard(IScoreboard scoreboard);

    long firstPlayed();

    long lastPlayed();

    default boolean hasPlayedBefore() {
        return firstPlayed() != lastPlayed();
    }

    // TODO Text
    String getDisplayName();

    GameMode gameMode();

    boolean isSleepingIgnored();

    void setSleepingIgnored(boolean sleepingIgnored);

    IInventory getEnderChestInventory();

    void respawn();

    IEntity getSpectatorTarget();

    void setSpectatorTarget(IEntity entity);

    IWorldBorder getWorldBorder();

    void setWorldBorder(IWorldBorder border, Cause cause);

    CooldownTracker getCooldownTracker();

}
