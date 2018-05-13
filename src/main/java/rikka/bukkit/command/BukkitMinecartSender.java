package rikka.bukkit.command;

import org.bukkit.entity.minecart.CommandMinecart;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import rikka.api.command.IMinecartSender;

import javax.annotation.Nonnull;

public class BukkitMinecartSender<T extends CommandMinecart> extends BukkitSender<T> implements IMinecartSender {
    public BukkitMinecartSender(T source) {
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
}
