package rikka.sponge.command;

import org.spongepowered.api.command.source.RconSource;
import rikka.api.command.IRconSender;

public abstract class SpongeRconSender<T extends RconSource> extends SpongeSender<T> implements IRconSender {
    public SpongeRconSender(T source) {
        super(source);
    }
}
