package rikka.sponge.tileentity;

import org.spongepowered.api.block.tileentity.CommandBlock;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import rikka.api.tileentity.ICommandBlock;

import javax.annotation.Nonnull;

public final class SpongeCommandBlock extends SpongeTileEntity<CommandBlock> implements ICommandBlock {
    public SpongeCommandBlock(CommandBlock source) {
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
