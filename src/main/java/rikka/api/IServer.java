package rikka.api;

import rikka.api.command.IConsoleSender;
import rikka.api.entity.living.IPlayer;
import rikka.api.scoreboard.IScoreboard;
import rikka.api.world.IWorld;

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

    int getRunningTimeTicks();

    boolean hasWhitelist();

    void setHasWhitelist(boolean enabled);

    boolean getOnlineMode();

    String getMotd();

    void shutdown();

    void shutdown(String kickMessage);

    IConsoleSender getConsole();

    double getTicksPerSecond();

    int getPlayerIdleTimeout();

    void setPlayerIdleTimeout(int timeout);

    boolean isMainThread();

}
