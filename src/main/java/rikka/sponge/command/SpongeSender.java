package rikka.sponge.command;

import org.spongepowered.api.command.CommandSource;
import rikka.api.Rikka;
import rikka.api.command.RCommandSender;
import rikka.sponge.SpongeRikka;

public abstract class SpongeSender<T extends CommandSource> extends SpongeRikka<T> implements RCommandSender, Rikka<T> {
    public SpongeSender(T source) {
        super(source);
    }
}
