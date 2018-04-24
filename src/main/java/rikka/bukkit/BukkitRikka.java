package rikka.bukkit;

import org.bukkit.command.CommandSender;
import rikka.api.command.ICommandSender;
import rikka.bukkit.entity.BukkitPlayer;

import java.util.HashMap;

public class BukkitRikka {

    private static final HashMap<CommandSender, ICommandSender> senders = new HashMap<>();

    public static ICommandSender getCommandSource(CommandSender source) {
        if (source == null) return null;
        ICommandSender sender = senders.get(source);
        if (sender != null) return sender;
        if (source instanceof org.bukkit.entity.Player)
            sender = new BukkitPlayer<>((org.bukkit.entity.Player) source);
        else return null;
        senders.put(source, sender);
        return sender;
    }

}
