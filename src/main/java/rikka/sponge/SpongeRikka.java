package rikka.sponge;

import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.world.World;
import rikka.api.Rikka;
import rikka.api.command.ICommandSender;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.world.IWorld;
import rikka.sponge.entity.SpongePlayer;
import rikka.sponge.world.SpongeWorld;

import java.util.HashMap;
import java.util.UUID;

public class SpongeRikka<T> implements Rikka<T> {

    protected final T source;

    public SpongeRikka(T source) {
        this.source = source;
    }

    public final T getSource() {
        return source;
    }


    private static final HashMap<String, ICommandSender> senders = new HashMap<>();
    private static final HashMap<UUID, IPlayer> players = new HashMap<>();
    private static final HashMap<UUID, IWorld> worlds = new HashMap<>();


    public static ICommandSender getCommandSender(CommandSource source) {
        if (source == null) return null;
        ICommandSender sender = senders.get(source.getName());
        if (sender != null) return sender;
        if (source instanceof Player)
            sender = new SpongePlayer<>((Player) source);
        else return null;
        senders.put(source.getName(), sender);
        return sender;
    }


    public static IWorld getWorld(World world) {
        IWorld iWorld = worlds.get(world.getUniqueId());
        if (iWorld == null) {
            iWorld = new SpongeWorld(world);
            worlds.put(world.getUniqueId(), iWorld);
        }
        return iWorld;
    }

}
