package rikka.bukkit.scoreboard;

import org.bukkit.scoreboard.Scoreboard;
import rikka.api.Rikka;
import rikka.api.scoreboard.IScoreboard;
import rikka.api.scoreboard.Score;
import rikka.api.scoreboard.Team;
import rikka.api.scoreboard.critieria.Criterion;
import rikka.api.scoreboard.displayslot.DisplaySlot;
import rikka.api.scoreboard.objective.Objective;
import rikka.api.text.Text;
import rikka.bukkit.BukkitRikka;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Set;

public class BukkitScoreboard extends BukkitRikka<Scoreboard> implements IScoreboard, Rikka<Scoreboard> {

    public BukkitScoreboard(Scoreboard source) {
        super(source);
    }

    public Scoreboard getSource() {
        return source;
    }

    public Optional<Objective> getObjective(String name) {
        return Optional.empty();
    }

    public Optional<Objective> getObjective(DisplaySlot slot) {
        return Optional.empty();
    }

    public void addObjective(Objective objective) throws IllegalArgumentException {

    }

    public void updateDisplaySlot(@Nullable Objective objective, DisplaySlot displaySlot) throws IllegalStateException {

    }

    public Set<Objective> getObjectivesByCriteria(Criterion criteria) {
        return null;
    }

    public Set<Objective> getObjectives() {
        return null;
    }

    public void removeObjective(Objective objective) {

    }

    public Set<Score> getScores() {
        return null;
    }

    public Set<Score> getScores(Text name) {
        return null;
    }

    public void removeScores(Text name) {

    }

    public Optional<Team> getTeam(String teamName) {
        return Optional.empty();
    }

    public void registerTeam(Team team) throws IllegalArgumentException {

    }

    public Set<Team> getTeams() {
        return null;
    }

    public Optional<Team> getMemberTeam(Text member) {
        return Optional.empty();
    }
}
