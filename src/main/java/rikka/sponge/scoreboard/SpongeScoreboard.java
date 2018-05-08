package rikka.sponge.scoreboard;

import org.spongepowered.api.scoreboard.Scoreboard;
import rikka.api.Rikka;
import rikka.api.scoreboard.IScoreboard;
import rikka.sponge.SpongeRikka;

public class SpongeScoreboard extends SpongeRikka<Scoreboard> implements IScoreboard, Rikka<Scoreboard> {

    public SpongeScoreboard(Scoreboard source) {
        super(source);
    }

    public Scoreboard getSource() {
        return source;
    }

}
