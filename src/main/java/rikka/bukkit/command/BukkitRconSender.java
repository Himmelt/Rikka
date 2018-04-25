package rikka.bukkit.command;

import org.bukkit.command.RemoteConsoleCommandSender;
import rikka.api.command.source.IRconSender;

public class BukkitRconSender<T extends RemoteConsoleCommandSender> extends BukkitSender<T> implements IRconSender {
    public BukkitRconSender(T source) {
        super(source);
    }
}
