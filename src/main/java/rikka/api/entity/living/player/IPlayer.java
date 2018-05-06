package rikka.api.entity.living.player;

import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.message.MessageChannelEvent;
import rikka.api.command.RCommandSender;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.IHumanoid;
import rikka.api.entity.living.player.gamemode.GameMode;
import rikka.api.entity.living.player.tab.TabList;
import rikka.api.item.inventory.IContainer;
import rikka.api.item.inventory.IInventory;
import rikka.api.scoreboard.IScoreboard;
import rikka.api.text.Text;
import rikka.api.text.channel.RChatTypeMessageReceiver;
import rikka.api.text.chat.ChatVisibility;
import rikka.api.world.IWorldBorder;

import javax.annotation.Nullable;
import java.util.Optional;

public interface IPlayer extends IHumanoid, RUser, RCommandSender, RChatTypeMessageReceiver {

    default boolean isViewingInventory() {
        return getOpenInventory() != null;
    }

    @Nullable
    IContainer getOpenInventory();

    @Nullable
    IContainer openInventory(IInventory inventory) throws IllegalArgumentException;

    boolean closeInventory() throws IllegalArgumentException;

    ChatVisibility getChatVisibility();

    boolean isChatColorsEnabled();

    MessageChannelEvent.Chat simulateChat(Text message, Cause cause);

    TabList getTabList();

    void kick();

    void kick(Text reason);

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

    Optional<IEntity> getSpectatorTarget();

    void setSpectatorTarget(@Nullable IEntity entity);

    IWorldBorder getWorldBorder();

    void setWorldBorder(@Nullable IWorldBorder border, Cause cause);

    CooldownTracker getCooldownTracker();

}
