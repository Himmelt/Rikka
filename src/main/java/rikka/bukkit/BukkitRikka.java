package rikka.bukkit;

import org.bukkit.World;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.RemoteConsoleCommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.minecart.CommandMinecart;
import rikka.api.Rikka;
import rikka.api.command.ICommandSender;
import rikka.api.entity.IEntity;
import rikka.api.entity.living.player.IPlayer;
import rikka.api.world.IWorld;
import rikka.bukkit.command.BukkitBlockSender;
import rikka.bukkit.command.BukkitConsoleSender;
import rikka.bukkit.command.BukkitMinecartSender;
import rikka.bukkit.command.BukkitRconSender;
import rikka.bukkit.entity.BukkitPlayer;
import rikka.bukkit.world.BukkitWorld;

import java.util.HashMap;
import java.util.UUID;

public class BukkitRikka<T> implements Rikka<T> {

    protected final T source;

    public BukkitRikka(T source) {
        this.source = source;
    }


    public final T getSource() {
        return source;
    }

    private static final HashMap<String, ICommandSender> senders = new HashMap<>();
    private static final HashMap<UUID, IPlayer> players = new HashMap<>();
    private static final HashMap<UUID, IWorld> worlds = new HashMap<>();

    public static ICommandSender getCommandSender(CommandSender source) {
        if (source == null) return null;
        ICommandSender sender;
        if (source instanceof Player) {
            sender = players.get(((Player) source).getUniqueId());
            if (sender != null) return sender;
        } else {
            sender = senders.get(source.getName());
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
        senders.put(source.getName(), sender);
        return sender;
    }

    public static IWorld getWorld(World world) {
        IWorld iWorld = worlds.get(world.getUID());
        if (iWorld == null) {
            iWorld = new BukkitWorld(world);
            worlds.put(world.getUID(), iWorld);
        }
        return iWorld;
    }

    public static IPlayer getPlayer(Player player) {
        IPlayer iPlayer = players.get(player.getUniqueId());
        if (iPlayer == null) {
            iPlayer = new BukkitPlayer<>(player);
            players.put(player.getUniqueId(), iPlayer);
        }
        return iPlayer;
    }

    public static IEntity getEntity(Entity entity) {
        if (entity instanceof Player) {
            return getPlayer((Player) entity);
        } else {
            // TODO entity
            return null;
        }
    }

}
