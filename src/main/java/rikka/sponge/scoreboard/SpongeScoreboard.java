package rikka.sponge.scoreboard;

import org.spongepowered.api.scoreboard.Scoreboard;
import rikka.api.Rikka;
import rikka.api.scoreboard.*;
import rikka.sponge.SpongeRikka;

import javax.annotation.Nullable;
import java.util.Optional;
import java.util.Set;

public class SpongeScoreboard extends SpongeRikka<Scoreboard> implements IScoreboard, Rikka<Scoreboard> {

    public SpongeScoreboard(Scoreboard source) {
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

    public Set<Objective> getObjectives() {
        return null;
    }

    public void removeObjective(Objective objective) {

    }

    public Set<Score> getScores() {
        return null;
    }

    public Set<Score> getScores(String name) {
        return null;
    }

    public void removeScores(String name) {

    }

    public Optional<Team> getTeam(String teamName) {
        return Optional.empty();
    }

    public void registerTeam(Team team) throws IllegalArgumentException {

    }

    public Set<Team> getTeams() {
        return null;
    }

    public Optional<Team> getMemberTeam(String member) {
        return Optional.empty();
    }
}
