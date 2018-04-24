package rikka.api.entity.living.player;

import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.message.MessageChannelEvent;
import rikka.api.command.ICommandSender;
import rikka.api.data.key.Keys;
import rikka.api.data.manipulator.mutable.DisplayNameData;
import rikka.api.data.manipulator.mutable.entity.GameModeData;
import rikka.api.data.manipulator.mutable.entity.JoinData;
import rikka.api.data.type.SkinPart;
import rikka.api.data.value.mutable.Value;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.Humanoid;
import rikka.api.entity.living.player.gamemode.GameMode;
import rikka.api.entity.living.player.tab.TabList;
import rikka.api.item.inventory.Container;
import rikka.api.item.inventory.Inventory;
import rikka.api.scoreboard.Scoreboard;
import rikka.api.text.Text;
import rikka.api.text.channel.ChatTypeMessageReceiver;
import rikka.api.text.chat.ChatVisibility;
import rikka.api.world.WorldBorder;

import javax.annotation.Nullable;
import java.time.Instant;
import java.util.Optional;
import java.util.Set;

public interface IPlayer extends Humanoid, User, ICommandSender, ChatTypeMessageReceiver {

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

    Optional<IEntity> getSpectatorTarget();

    void setSpectatorTarget(@Nullable IEntity entity);

    Optional<WorldBorder> getWorldBorder();

    void setWorldBorder(@Nullable WorldBorder border, Cause cause);

    CooldownTracker getCooldownTracker();

}
