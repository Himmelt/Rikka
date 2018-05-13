package rikka.api.entity.living.player.tab;

import rikka.api.entity.living.player.IPlayer;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

public interface TabList {

    IPlayer getPlayer();

    String getHeader();

    TabList setHeader(@Nullable String header);

    String getFooter();

    TabList setFooter(@Nullable String footer);

    default TabList setHeaderAndFooter(@Nullable String header, @Nullable String footer) {
        this.setHeader(header);
        this.setFooter(footer);
        return this;
    }

    Collection<TabListEntry> getEntries();

    Optional<TabListEntry> getEntry(UUID uniqueId);

    TabList addEntry(TabListEntry entry) throws IllegalArgumentException;

    Optional<TabListEntry> removeEntry(UUID uniqueId);

}
