package rikka.api;

import rikka.api.command.source.IConsoleSender;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.scoreboard.IScoreboard;
import rikka.api.text.Text;
import rikka.api.text.channel.MessageChannel;
import rikka.api.world.IWorld;
import rikka.api.world.storage.ChunkLayout;

import java.util.Collection;
import java.util.UUID;

public interface IServer {

    Collection<IPlayer> getOnlinePlayers();

    int getMaxPlayers();

    IPlayer getPlayer(UUID uuid);

    IPlayer getPlayer(String name);

    Collection<IWorld> getWorlds();

    IWorld getWorld(UUID uuid);

    IWorld getWorld(String name);

    IWorld loadWorld(String name);

    IWorld loadWorld(UUID uuid);

    boolean unloadWorld(IWorld world);

    IScoreboard getServerScoreboard();

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

    IConsoleSender getConsole();

    double getTicksPerSecond();

    int getPlayerIdleTimeout();

    void setPlayerIdleTimeout(int timeout);

    boolean isMainThread();

}
