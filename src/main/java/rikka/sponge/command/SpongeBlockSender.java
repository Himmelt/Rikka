package rikka.sponge.command;

import org.spongepowered.api.command.source.CommandBlockSource;
import rikka.api.command.IBlockSender;

public abstract class SpongeBlockSender<T extends CommandBlockSource> extends SpongeSender<T> implements IBlockSender {
    public SpongeBlockSender(T source) {
        super(source);
    }
}
