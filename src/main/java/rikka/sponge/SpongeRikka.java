package rikka.sponge;

import him.violet.api.VioletAPI;
import org.soraworld.rikka.command.ICommandSender;
import org.spongepowered.api.command.CommandSource;
import rikka.bukkit.entity.BukkitPlayer;

import java.util.HashMap;

public class SpongeRikka {

    private static final HashMap<CommandSource, ICommandSender> senders = new HashMap<>();

    public static ICommandSender getCommandSource(CommandSource source) {
        if (source == null) return VioletAPI.invalid;
        ICommandSender sender = senders.get(source);
        if (sender != null) return sender;
        if (source instanceof org.bukkit.entity.Player)
            sender = new BukkitPlayer<>((org.bukkit.entity.Player) source);
        else return VioletAPI.invalid;
        senders.put(source, sender);
        return sender;
    }

}
