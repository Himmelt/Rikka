package rikka.bukkit.command;

import org.bukkit.command.CommandSender;
import rikka.api.Rikka;
import rikka.api.command.ICommandSender;
import rikka.bukkit.BukkitRikka;

public abstract class BukkitSender<T extends CommandSender> extends BukkitRikka<T> implements ICommandSender, Rikka<T> {

    public BukkitSender(T source) {
        super(source);
    }

}
