package rikka.sponge.command;

import org.spongepowered.api.command.source.RconSource;
import rikka.api.command.IRconSender;

public final class SpongeRconSender extends SpongeSender<RconSource> implements IRconSender {
    public SpongeRconSender(RconSource source) {
        super(source);
    }
}
