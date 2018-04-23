package org.soraworld.rikka.entity.living.player.tab;

import org.soraworld.rikka.entity.living.player.Player;
import org.soraworld.rikka.text.Text;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface TabList {

    Player getPlayer();

    Optional<Text> getHeader();

    TabList setHeader(@Nullable Text header);

    Optional<Text> getFooter();

    TabList setFooter(@Nullable Text footer);

    default TabList setHeaderAndFooter(@Nullable Text header, @Nullable Text footer) {
        this.setHeader(header);
        this.setFooter(footer);
        return this;
    }

    Collection<TabListEntry> getEntries();

    Optional<TabListEntry> getEntry(UUID uniqueId);

    TabList addEntry(TabListEntry entry) throws IllegalArgumentException;

    Optional<TabListEntry> removeEntry(UUID uniqueId);

}
