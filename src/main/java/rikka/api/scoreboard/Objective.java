package rikka.api.scoreboard;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

public interface Objective {

    String getName();

    String getDisplayName();

    void setDisplayName(String displayName) throws IllegalArgumentException;

    ObjectiveDisplayMode getDisplayMode();

    void setDisplayMode(ObjectiveDisplayMode displayMode);

    Map<String, Score> getScores();

    boolean hasScore(String name);

    void addScore(Score score) throws IllegalArgumentException;

    default Optional<Score> getScore(String name) {
        if (!this.hasScore(name)) {
            return Optional.empty();
        }
        return Optional.of(this.getOrCreateScore(name));
    }

    Score getOrCreateScore(String name);

    boolean removeScore(Score score);

    boolean removeScore(String name);

    Set<IScoreboard> getScoreboards();

}
