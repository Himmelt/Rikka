package rikka.sponge.command;

import org.spongepowered.api.entity.vehicle.minecart.CommandBlockMinecart;
import rikka.api.command.IMinecartSender;

public final class SpongeMinecartSender extends SpongeSender<CommandBlockMinecart> implements IMinecartSender {
    public SpongeMinecartSender(CommandBlockMinecart source) {
        super(source);
    }
}
