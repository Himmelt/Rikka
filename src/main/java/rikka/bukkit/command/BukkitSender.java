package rikka.bukkit.command;

import org.bukkit.command.CommandSender;
import rikka.api.command.ICommandSender;
import rikka.bukkit.BukkitRikka;

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

    public void sendMsg(String msg) {
        source.sendMessage(msg);
    }

    public final boolean hasPermission(String perm) {
        if (perm == null) return true;
        return source.hasPermission(perm);
    }

}
