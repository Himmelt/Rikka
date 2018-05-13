package rikka.api.scoreboard;

import java.util.Set;

public interface Score {

    String getName();

    int getScore();

    void setScore(int score);

    Set<Objective> getObjectives();

}
