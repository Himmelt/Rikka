package rikka.bukkit.command;

import org.bukkit.command.ConsoleCommandSender;
import rikka.api.command.source.IConsoleSender;

public class BukkitConsoleSender<T extends ConsoleCommandSender> extends BukkitSender<T> implements IConsoleSender {
    public BukkitConsoleSender(T source) {
        super(source);
    }
}
