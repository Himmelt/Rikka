package rikka.sponge;

import org.spongepowered.api.command.CommandSource;
import rikka.api.command.ICommandSender;
import rikka.sponge.entity.SpongePlayer;

import java.util.HashMap;

public class SpongeRikka {

    private static final HashMap<CommandSource, ICommandSender> senders = new HashMap<>();

    public static ICommandSender getCommandSource(CommandSource source) {
        if (source == null) return null;
        ICommandSender sender = senders.get(source);
        if (sender != null) return sender;
        if (source instanceof org.bukkit.entity.Player)
            sender = new SpongePlayer<>((org.spongepowered.api.entity.living.player.Player) source);
        else return null;
        senders.put(source, sender);
        return sender;
    }

}
