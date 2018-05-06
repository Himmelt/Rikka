package rikka.bukkit.scoreboard;

import org.bukkit.scoreboard.Scoreboard;
import rikka.api.Rikka;
import rikka.api.scoreboard.IScoreboard;
import rikka.bukkit.BukkitRikka;

public class BukkitScoreboard extends BukkitRikka<Scoreboard> implements IScoreboard, Rikka<Scoreboard> {

    public BukkitScoreboard(Scoreboard source) {
        super(source);
    }

    public Scoreboard getSource() {
        return source;
    }

}
