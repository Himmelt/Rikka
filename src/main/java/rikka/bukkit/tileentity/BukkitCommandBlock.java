package rikka.bukkit.tileentity;

import org.bukkit.block.CommandBlock;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import rikka.api.tileentity.ICommandBlock;

import javax.annotation.Nonnull;

public final class BukkitCommandBlock extends BukkitTileEntity<CommandBlock> implements ICommandBlock {
    public BukkitCommandBlock(CommandBlock source) {
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
