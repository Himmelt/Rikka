package rikka.api.entity.living.player;

import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.message.MessageChannelEvent;
import rikka.api.command.ICommandSender;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.IHumanoid;
import rikka.api.entity.living.player.gamemode.GameMode;
import rikka.api.entity.living.player.tab.TabList;
import rikka.api.item.inventory.Container;
import rikka.api.item.inventory.Inventory;
import rikka.api.scoreboard.Scoreboard;
import rikka.api.text.Text;
import rikka.api.text.channel.ChatTypeMessageReceiver;
import rikka.api.text.chat.ChatVisibility;
import rikka.api.world.IWorldBorder;

import javax.annotation.Nullable;
import java.util.Optional;

public interface IPlayer extends IHumanoid, IUser, ICommandSender, ChatTypeMessageReceiver {

    default boolean isViewingInventory() {
        return getOpenInventory() != null;
    }

    @Nullable
    Container getOpenInventory();

    @Nullable
    Container openInventory(Inventory inventory) throws IllegalArgumentException;

    boolean closeInventory() throws IllegalArgumentException;

    int getViewDistance();

    ChatVisibility getChatVisibility();

    boolean isChatColorsEnabled();

    MessageChannelEvent.Chat simulateChat(Text message, Cause cause);

    TabList getTabList();

    void kick();

    void kick(Text reason);

    Scoreboard getScoreboard();

    void setScoreboard(Scoreboard scoreboard);

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

    Inventory getEnderChestInventory();

    boolean respawnPlayer();

    Optional<IEntity> getSpectatorTarget();

    void setSpectatorTarget(@Nullable IEntity entity);

    Optional<IWorldBorder> getWorldBorder();

    void setWorldBorder(@Nullable IWorldBorder border, Cause cause);

    CooldownTracker getCooldownTracker();

}
