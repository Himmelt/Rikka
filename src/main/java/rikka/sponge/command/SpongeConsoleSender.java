package rikka.sponge.command;

import org.spongepowered.api.command.source.ConsoleSource;
import rikka.api.command.IConsoleSender;

public final class SpongeConsoleSender extends SpongeSender<ConsoleSource> implements IConsoleSender {
    public SpongeConsoleSender(ConsoleSource source) {
        super(source);
    }
}
