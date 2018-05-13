package rikka.api.entity.living.player.tab;

import rikka.api.entity.living.player.gamemode.GameMode;
import rikka.api.profile.GameProfile;

import javax.annotation.Nullable;

public interface TabListEntry {

    TabList getList();

    GameProfile getProfile();

    String getDisplayName();

    TabListEntry setDisplayName(@Nullable String displayName);

    int getLatency();

    TabListEntry setLatency(int latency);

    GameMode getGameMode();

    TabListEntry setGameMode(GameMode gameMode);

}
