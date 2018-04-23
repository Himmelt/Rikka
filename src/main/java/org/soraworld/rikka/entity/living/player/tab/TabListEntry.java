package org.soraworld.rikka.entity.living.player.tab;

import org.soraworld.rikka.entity.living.player.gamemode.GameMode;
import org.soraworld.rikka.profile.GameProfile;
import org.soraworld.rikka.text.Text;
import org.soraworld.rikka.util.ResettableBuilder;

import javax.annotation.Nullable;
import java.util.Optional;

public interface TabListEntry {

    static Builder builder() {
        //Sponge.getRegistry().createBuilder(Builder.class);
        return null;
    }

    TabList getList();

    GameProfile getProfile();

    Optional<Text> getDisplayName();

    TabListEntry setDisplayName(@Nullable Text displayName);

    int getLatency();

    TabListEntry setLatency(int latency);

    GameMode getGameMode();

    TabListEntry setGameMode(GameMode gameMode);

    interface Builder extends ResettableBuilder<TabListEntry, Builder> {

        /**
         * Sets the {@link TabList} this entry is owned by.
         *
         * @param list The tab list
         * @return The builder
         */
        Builder list(TabList list);

        /**
         * Sets the profile for entries created by this builder.
         *
         * @param profile The profile
         * @return The builder
         */
        Builder profile(GameProfile profile);

        /**
         * Sets the display name for entries created by this builder.
         *
         * @param displayName The display name
         * @return The builder
         * @see TabListEntry#setDisplayName(Text)
         */
        Builder displayName(@Nullable Text displayName);

        /**
         * Sets the latency for entries created by this builder.
         *
         * @param latency The latency, in milliseconds
         * @return The builder
         * @see TabListEntry#setLatency(int)
         */
        Builder latency(int latency);

        /**
         * Sets the gamemode for entries created by this builder.
         *
         * @param gameMode The gamemode
         * @return The builder
         * @see TabListEntry#setGameMode(GameMode)
         */
        Builder gameMode(GameMode gameMode);

        /**
         * Builds an entry based off the values of this builder.
         *
         * @return The entry
         */
        TabListEntry build();
    }

}
