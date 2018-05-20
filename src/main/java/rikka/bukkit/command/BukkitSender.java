package rikka.bukkit.command;

import org.bukkit.command.CommandSender;
import rikka.api.command.ICommandSender;
import rikka.bukkit.BukkitRikka;

public abstract class BukkitSender<T extends CommandSender> extends BukkitRikka<T> implements ICommandSender {
    public BukkitSender(T source) {
        super(source);
    }
}
