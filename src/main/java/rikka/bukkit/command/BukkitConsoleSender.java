package rikka.bukkit.command;

import org.bukkit.command.ConsoleCommandSender;
import rikka.api.command.IConsoleSender;

public final class BukkitConsoleSender extends BukkitSender<ConsoleCommandSender> implements IConsoleSender {
    public BukkitConsoleSender(ConsoleCommandSender source) {
        super(source);
    }
}
