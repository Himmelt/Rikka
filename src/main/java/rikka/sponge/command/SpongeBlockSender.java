package rikka.sponge.command;

import org.spongepowered.api.command.source.CommandBlockSource;
import rikka.api.command.IBlockSender;
import rikka.api.world.IWorld;
import rikka.api.world.Location;

public final class SpongeBlockSender extends SpongeSender<CommandBlockSource> implements IBlockSender {
    public SpongeBlockSender(CommandBlockSource source) {
        super(source);
    }

    public Location getLocation() {
        return null;
    }

    public IWorld getWorld() {
        return null;
    }
}
