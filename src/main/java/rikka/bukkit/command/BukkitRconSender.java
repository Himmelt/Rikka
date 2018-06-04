package rikka.bukkit.command;

import org.bukkit.command.RemoteConsoleCommandSender;
import rikka.api.command.IRconSender;

public final class BukkitRconSender extends BukkitSender<RemoteConsoleCommandSender> implements IRconSender {
    public BukkitRconSender(RemoteConsoleCommandSender source) {
        super(source);
    }
}
