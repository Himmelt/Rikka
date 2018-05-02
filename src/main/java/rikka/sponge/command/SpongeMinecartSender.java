package rikka.sponge.command;

import org.spongepowered.api.entity.vehicle.minecart.CommandBlockMinecart;
import rikka.api.command.source.IMinecartSender;

public abstract class SpongeMinecartSender<T extends CommandBlockMinecart> extends SpongeSender<T> implements IMinecartSender {
    public SpongeMinecartSender(T source) {
        super(source);
    }
}
