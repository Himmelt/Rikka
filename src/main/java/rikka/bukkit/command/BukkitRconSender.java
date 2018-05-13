package rikka.bukkit.command;

import org.bukkit.command.RemoteConsoleCommandSender;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import rikka.api.command.IRconSender;

import javax.annotation.Nonnull;

public class BukkitRconSender<T extends RemoteConsoleCommandSender> extends BukkitSender<T> implements IRconSender {
    public BukkitRconSender(T source) {
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
