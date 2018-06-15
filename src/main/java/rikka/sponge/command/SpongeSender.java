package rikka.sponge.command;

import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.text.Text;
import rikka.api.command.ICommandSender;
import rikka.sponge.SpongeRikka;

public class SpongeSender<T extends CommandSource> extends SpongeRikka<T> implements ICommandSender {

    public SpongeSender(T source) {
        super(source);
    }

    public T getSource() {
        return source;
    }

    public String getName() {
        return source.getName();
    }

    public void sendMsg(String msg) {
        source.sendMessage(Text.of(msg));
    }

    public boolean hasPermission(String perm) {
        if (perm == null) return true;
        return source.hasPermission(perm);
    }
}
