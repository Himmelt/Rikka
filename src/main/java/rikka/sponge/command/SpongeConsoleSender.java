package rikka.sponge.command;

import org.spongepowered.api.command.source.ConsoleSource;
import rikka.api.command.source.IConsoleSender;

public abstract class SpongeConsoleSender<T extends ConsoleSource> extends SpongeSender<T> implements IConsoleSender {
    public SpongeConsoleSender(T source) {
        super(source);
    }
}
