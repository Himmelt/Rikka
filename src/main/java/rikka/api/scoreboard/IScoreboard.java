package rikka.api.scoreboard;

import rikka.api.scoreboard.critieria.Criterion;
import rikka.api.scoreboard.displayslot.DisplaySlot;
import rikka.api.scoreboard.objective.Objective;
import rikka.api.text.Text;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Set;

public interface IScoreboard {

    Optional<Objective> getObjective(String name);

    Optional<Objective> getObjective(DisplaySlot slot);

    void addObjective(Objective objective) throws IllegalArgumentException;

    void updateDisplaySlot(@Nullable Objective objective, DisplaySlot displaySlot) throws IllegalStateException;

    default void clearSlot(DisplaySlot slot) {
        this.updateDisplaySlot(null, slot);
    }

    Set<Objective> getObjectivesByCriteria(Criterion criteria);

    Set<Objective> getObjectives();

    void removeObjective(Objective objective);

    Set<Score> getScores();

    Set<Score> getScores(Text name);

    void removeScores(Text name);

    Optional<Team> getTeam(String teamName);

    void registerTeam(Team team) throws IllegalArgumentException;

    Set<Team> getTeams();

    Optional<Team> getMemberTeam(Text member);

}
