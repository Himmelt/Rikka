package org.soraworld.rikka.entity.living.player;

import org.soraworld.rikka.command.CommandSource;
import org.soraworld.rikka.data.key.Keys;
import org.soraworld.rikka.data.manipulator.mutable.DisplayNameData;
import org.soraworld.rikka.data.manipulator.mutable.entity.GameModeData;
import org.soraworld.rikka.data.manipulator.mutable.entity.JoinData;
import org.soraworld.rikka.data.type.SkinPart;
import org.soraworld.rikka.data.value.mutable.Value;
import org.soraworld.rikka.entity.Entity;
import org.soraworld.rikka.entity.living.Humanoid;
import org.soraworld.rikka.entity.living.player.gamemode.GameMode;
import org.soraworld.rikka.entity.living.player.tab.TabList;
import org.soraworld.rikka.event.cause.Cause;
import org.soraworld.rikka.event.message.MessageChannelEvent;
import org.soraworld.rikka.item.inventory.Container;
import org.soraworld.rikka.item.inventory.Inventory;
import org.soraworld.rikka.scoreboard.Scoreboard;
import org.soraworld.rikka.text.Text;
import org.soraworld.rikka.text.channel.ChatTypeMessageReceiver;
import org.soraworld.rikka.text.chat.ChatVisibility;
import org.soraworld.rikka.world.WorldBorder;

import javax.annotation.Nullable;
import java.time.Instant;
import java.util.Optional;
import java.util.Set;

public interface Player extends Humanoid, User, CommandSource, ChatTypeMessageReceiver {

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

    Set<SkinPart> getDisplayedSkinParts();

    TabList getTabList();

    void kick();

    void kick(Text reason);

    Scoreboard getScoreboard();

    void setScoreboard(Scoreboard scoreboard);

    default JoinData getJoinData() {
        return get(JoinData.class).get();
    }

    default Value<Instant> firstPlayed() {
        return getValue(Keys.FIRST_DATE_PLAYED).get();
    }

    default Value<Instant> lastPlayed() {
        return getValue(Keys.LAST_DATE_PLAYED).get();
    }

    default boolean hasPlayedBefore() {
        return !firstPlayed().equals(lastPlayed());
    }

    default DisplayNameData getDisplayNameData() {
        return get(DisplayNameData.class).get();
    }

    default GameModeData getGameModeData() {
        return get(GameModeData.class).get();
    }

    default Value<GameMode> gameMode() {
        return getValue(Keys.GAME_MODE).get();
    }

    boolean isSleepingIgnored();

    void setSleepingIgnored(boolean sleepingIgnored);

    Inventory getEnderChestInventory();

    boolean respawnPlayer();

    Optional<Entity> getSpectatorTarget();

    void setSpectatorTarget(@Nullable Entity entity);

    Optional<WorldBorder> getWorldBorder();

    void setWorldBorder(@Nullable WorldBorder border, Cause cause);

    CooldownTracker getCooldownTracker();

}
