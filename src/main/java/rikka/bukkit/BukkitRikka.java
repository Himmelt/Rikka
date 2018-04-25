package rikka.bukkit;

import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.minecart.CommandMinecart;
import rikka.api.Rikka;
import rikka.api.command.ICommandSender;
import rikka.api.entity.living.player.IPlayer;
import rikka.bukkit.command.BukkitBlockSender;
import rikka.bukkit.command.BukkitConsoleSender;
import rikka.bukkit.command.BukkitMinecartSender;
import rikka.bukkit.command.BukkitRconSender;
import rikka.bukkit.entity.BukkitPlayer;

import java.util.HashMap;

public class BukkitRikka<T> implements Rikka<T> {

    protected final T source;

    public BukkitRikka(T source) {
        this.source = source;
    }

    private static final HashMap<CommandSender, ICommandSender> senders = new HashMap<>();
    private static final HashMap<Player, IPlayer> players = new HashMap<>();

    public static ICommandSender getCommandSender(CommandSender source) {
        if (source == null) return null;
        ICommandSender sender;
        if (source instanceof Player) {
            sender = players.get(source);
            if (sender != null) return sender;
        } else {
            sender = senders.get(source);
            if (sender != null) return sender;
        }
        if (source instanceof Player)
            sender = new BukkitPlayer<>((Player) source);
        else if (source instanceof ConsoleCommandSender) {
            sender = new BukkitConsoleSender<>((ConsoleCommandSender) source);
        } else if (source instanceof BlockCommandSender) {
            sender = new BukkitBlockSender<>((BlockCommandSender) source);
        } else if (source instanceof CommandMinecart) {
            sender = new BukkitMinecartSender<>((CommandMinecart) source);
        } else if (source instanceof RemoteConsoleCommandSender) {
            sender = new BukkitRconSender<>((RemoteConsoleCommandSender) source);
        } else return null;
        senders.put(source, sender);
        return sender;
    }

    public T getSource() {
        return source;
    }

}
