package rikka.bukkit.command;

import org.bukkit.command.ConsoleCommandSender;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import rikka.api.command.IConsoleSender;

import javax.annotation.Nonnull;

public class BukkitConsoleSender<T extends ConsoleCommandSender> extends BukkitSender<T> implements IConsoleSender {
    public BukkitConsoleSender(T source) {
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
