package rikka.sponge;

import org.spongepowered.api.Sponge;
import org.spongepowered.api.command.CommandSource;
import org.spongepowered.api.entity.Entity;
import org.spongepowered.api.entity.living.Living;
import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.entity.projectile.Projectile;
import org.spongepowered.api.world.World;
import rikka.api.command.ICommandSender;
import rikka.sponge.entity.SpongeEntity;
import rikka.sponge.entity.living.SpongeLiving;
import rikka.sponge.entity.living.SpongePlayer;
import rikka.sponge.entity.projectile.SpongeProjectile;
import rikka.sponge.world.SpongeWorld;

import java.util.HashMap;
import java.util.UUID;

public abstract class SpongeRikka<T> {

    protected final T source;

    public SpongeRikka(T source) {
        this.source = source;
    }

    public abstract T getSource();


    private static final HashMap<String, ICommandSender> senders = new HashMap<>();
    private static final HashMap<UUID, SpongePlayer> players = new HashMap<>();
    private static final HashMap<UUID, SpongeWorld> worlds = new HashMap<>();


    public static ICommandSender getCommandSender(CommandSource source) {
        if (source == null) return null;
        ICommandSender sender = senders.get(source.getName());
        if (sender != null) return sender;
        if (source instanceof Player)
            sender = new SpongePlayer((Player) source);
        else return null;
        senders.put(source.getName(), sender);
        return sender;
    }


    public static SpongeWorld getWorld(World world) {
        SpongeWorld iWorld = worlds.get(world.getUniqueId());
        if (iWorld == null) {
            iWorld = new SpongeWorld(world);
            worlds.put(world.getUniqueId(), iWorld);
        }
        return iWorld;
    }

    public static SpongeWorld getWorld(UUID worldId) {
        SpongeWorld iWorld = worlds.get(worldId);
        if (iWorld == null) {
            World world = Sponge.getServer().getWorld(worldId).orElse(null);
            if (world != null) {
                iWorld = new SpongeWorld(world);
                worlds.put(worldId, iWorld);
            }
        }
        return iWorld;
    }

    public static SpongePlayer getPlayer(Player player) {
        SpongePlayer iPlayer = players.get(player.getUniqueId());
        if (iPlayer == null) {
            iPlayer = new SpongePlayer(player);
            players.put(player.getUniqueId(), iPlayer);
        }
        return iPlayer;
    }

    public static SpongeEntity getEntity(Entity entity) {
        if (entity instanceof Living) {
            return getLiving((Living) entity);
        } else {
            // TODO entity
            return null;
        }
    }

    public static SpongeLiving getLiving(Living living) {
        if (living instanceof Player) {
            return getPlayer((Player) living);
        }
        return null;
    }

    public static SpongeProjectile getProjectile(Projectile projectile) {
        return null;
    }

}
