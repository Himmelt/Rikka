package rikka.sponge;

import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.entity.living.player.Player;
import rikka.api.Rikka;
import rikka.api.command.ICommandSender;
import rikka.sponge.entity.SpongePlayer;

import java.util.HashMap;

public class SpongeRikka<T> implements Rikka<T> {

    protected final T source;

    private static final HashMap<CommandSource, ICommandSender> senders = new HashMap<>();

    public SpongeRikka(T source) {
        this.source = source;
    }

    public static ICommandSender getCommandSender(CommandSource source) {
        if (source == null) return null;
        ICommandSender sender = senders.get(source);
        if (sender != null) return sender;
        if (source instanceof org.bukkit.entity.Player)
            sender = new SpongePlayer<>((Player) source);
        else return null;
        senders.put(source, sender);
        return sender;
    }

    public T getSource() {
        return source;
    }

}
