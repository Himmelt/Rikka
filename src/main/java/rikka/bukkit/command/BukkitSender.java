package rikka.bukkit.command;

import org.bukkit.command.CommandSender;
import rikka.api.Rikka;
import rikka.api.command.RCommandSender;
import rikka.bukkit.BukkitRikka;

public abstract class BukkitSender<T extends CommandSender> extends BukkitRikka<T> implements RCommandSender, Rikka<T> {
    public BukkitSender(T source) {
        super(source);
    }
}
