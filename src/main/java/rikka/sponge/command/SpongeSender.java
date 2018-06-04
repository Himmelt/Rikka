package rikka.sponge.command;

import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.text.Text;
import org.spongepowered.api.text.channel.MessageChannel;
import rikka.api.command.ICommandSender;
import rikka.sponge.SpongeRikka;

import javax.annotation.Nonnull;

public class SpongeSender<T extends CommandSource> extends SpongeRikka<T> implements ICommandSender {

    public SpongeSender(T source) {
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
