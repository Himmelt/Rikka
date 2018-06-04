package rikka.bukkit.command;

import org.bukkit.command.CommandSender;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import rikka.api.command.ICommandSender;
import rikka.bukkit.BukkitRikka;

import javax.annotation.Nonnull;

public class BukkitSender<T extends CommandSender> extends BukkitRikka<T> implements ICommandSender {
    public BukkitSender(T source) {
        super(source);
    }

    public T getSource() {
        return source;
    }

    public final String getName() {
        return source.getName();
    }

    public void sendMessage(Text message) {

    }

    public MessageChannel getMessageChannel() {
        return null;
    }

    public void setMessageChannel(MessageChannel channel) {

    }

    public final boolean hasPermission(@Nonnull String permission) {
        return source.hasPermission(permission);
    }

}
