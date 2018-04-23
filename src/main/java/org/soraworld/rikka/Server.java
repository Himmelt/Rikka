package org.soraworld.rikka;

import org.soraworld.rikka.command.source.ConsoleSource;
import org.soraworld.rikka.entity.living.player.Player;
import org.soraworld.rikka.scoreboard.Scoreboard;
import org.soraworld.rikka.text.Text;
import org.soraworld.rikka.text.channel.MessageChannel;
import org.soraworld.rikka.world.World;
import org.soraworld.rikka.world.storage.ChunkLayout;

import java.util.Collection;
import java.util.UUID;

public interface Server {

    Collection<Player> getOnlinePlayers();

    int getMaxPlayers();

    Player getPlayer(UUID uuid);

    Player getPlayer(String name);

    Collection<World> getWorlds();

    World getWorld(UUID uuid);

    World getWorld(String name);

    World loadWorld(String name);

    World loadWorld(UUID uuid);

    boolean unloadWorld(World world);

    Scoreboard getServerScoreboard();

    ChunkLayout getChunkLayout();

    int getRunningTimeTicks();

    MessageChannel getBroadcastChannel();

    void setBroadcastChannel(MessageChannel channel);

    boolean hasWhitelist();

    void setHasWhitelist(boolean enabled);

    boolean getOnlineMode();

    Text getMotd();

    void shutdown();

    void shutdown(Text kickMessage);

    ConsoleSource getConsole();

    double getTicksPerSecond();

    int getPlayerIdleTimeout();

    void setPlayerIdleTimeout(int timeout);

    boolean isMainThread();

}
