package rikka.bukkit.command;

import org.bukkit.command.BlockCommandSender;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import rikka.api.command.IBlockSender;
import rikka.api.world.IWorld;
import rikka.api.world.Location;

import javax.annotation.Nonnull;

public class BukkitBlockSender<T extends BlockCommandSender> extends BukkitSender<T> implements IBlockSender {
    public BukkitBlockSender(T source) {
        super(source);
    }

    public T getSource() {
        return source;
    }

    public String getName() {
        return null;
    }

    public void sendMessage(Text message) {

    }

    public MessageChannel getMessageChannel() {
        return null;
    }

    public void setMessageChannel(MessageChannel channel) {

    }

    public boolean hasPermission(@Nonnull String permission) {
        return false;
    }

    public Location getLocation() {
        return null;
    }

    public IWorld getWorld() {
        return null;
    }
}
