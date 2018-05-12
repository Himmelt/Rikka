package rikka.bukkit.tileentity;

import org.bukkit.block.CommandBlock;
import rikka.api.text.Text;
import rikka.api.text.channel.MessageChannel;
import rikka.api.tileentity.ICommandBlock;

import javax.annotation.Nonnull;

public class BukkitCommandBlock<T extends CommandBlock> extends BukkitTileEntity<T> implements ICommandBlock {
    public BukkitCommandBlock(T source) {
        super(source);
    }

    public void execute() {
        // TODO
    }

    public String getName() {
        return source.getName();
    }

    public boolean hasPermission(@Nonnull String permission) {
        // TODO
        return false;
    }

    public void sendMessage(Text message) {
        // TODO
    }

    public MessageChannel getMessageChannel() {
        // TODO
        return null;
    }

    public void setMessageChannel(MessageChannel channel) {
        //TODO
    }
}
