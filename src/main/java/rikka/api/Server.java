package rikka.api;

import org.soraworld.rikka.world.World;
import rikka.api.command.source.ConsoleSource;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.scoreboard.Scoreboard;
import rikka.api.text.Text;
import rikka.api.text.channel.MessageChannel;
import rikka.api.world.storage.ChunkLayout;

import java.util.Collection;
import java.util.UUID;

public interface Server {

    Collection<IPlayer> getOnlinePlayers();

    int getMaxPlayers();

    IPlayer getPlayer(UUID uuid);

    IPlayer getPlayer(String name);

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
