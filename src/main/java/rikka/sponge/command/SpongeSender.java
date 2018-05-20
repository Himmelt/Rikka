package rikka.sponge.command;

import org.spongepowered.api.command.CommandSource;
import rikka.api.command.ICommandSender;
import rikka.sponge.SpongeRikka;

public abstract class SpongeSender<T extends CommandSource> extends SpongeRikka<T> implements ICommandSender {
    public SpongeSender(T source) {
        super(source);
    }
}
