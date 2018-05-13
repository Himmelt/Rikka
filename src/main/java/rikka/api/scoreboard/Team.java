package rikka.api.scoreboard;

import java.util.Optional;
import java.util.Set;

public interface Team {

    String getName();

    String getDisplayName();

    void setDisplayName(String displayName) throws IllegalArgumentException;

    //TextColor getColor();

    //void setColor(TextColor color);

    String getPrefix();

    void setPrefix(String prefix) throws IllegalArgumentException;

    String getSuffix();

    void setSuffix(String suffix) throws IllegalArgumentException;

    boolean allowFriendlyFire();

    void setAllowFriendlyFire(boolean enabled);

    boolean canSeeFriendlyInvisibles();

    void setCanSeeFriendlyInvisibles(boolean enabled);

    Visibility getNameTagVisibility();

    void setNameTagVisibility(Visibility visibility);

    Visibility getDeathMessageVisibility();

    void setDeathMessageVisibility(Visibility visibility);

    Set<String> getMembers();

    void addMember(String member);

    boolean removeMember(String member);

    Optional<IScoreboard> getScoreboard();

    boolean unregister();

}
