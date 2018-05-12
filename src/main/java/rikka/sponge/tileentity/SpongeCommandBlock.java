package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.CommandBlock;
import rikka.api.text.Text;
import rikka.api.text.channel.MessageChannel;
import rikka.api.tileentity.ICommandBlock;

import javax.annotation.Nonnull;

public class SpongeCommandBlock<T extends CommandBlock> extends SpongeTileEntity<T> implements ICommandBlock {
    public SpongeCommandBlock(T source) {
        super(source);
    }

    public void execute() {

    }

    public String getName() {
        return null;
    }

    public boolean hasPermission(@Nonnull String permission) {
        return false;
    }

    public void sendMessage(Text message) {

    }

    public MessageChannel getMessageChannel() {
        return null;
    }

    public void setMessageChannel(MessageChannel channel) {

    }
}
